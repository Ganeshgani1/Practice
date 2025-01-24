package AssignmentOne;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class RateLimiter1 {
    private final int maxTransactionsPerSecond;
    private final ConcurrentHashMap<String, Integer> userLimits;
    private final ConcurrentHashMap<String, Integer> userTokens;
    private final ScheduledExecutorService scheduler;

    public RateLimiter1(int maxTransactionsPerSecond) {
        this.maxTransactionsPerSecond = maxTransactionsPerSecond;
        this.userLimits = new ConcurrentHashMap<>();
        this.userTokens = new ConcurrentHashMap<>();
        this.scheduler = Executors.newScheduledThreadPool(1);
        this.scheduler.scheduleAtFixedRate(this::refillTokens, 1, 1, TimeUnit.SECONDS);
    }

    public void addUser(String userId, int limit) {
        userLimits.put(userId, limit);
        userTokens.put(userId, limit);
    }

    public void allowTransaction(String userId) throws Exception {
        if (!userTokens.containsKey(userId)) {
            throw new IllegalArgumentException("User not found");
        }

        synchronized (userTokens) {
            int tokens = userTokens.get(userId);
            System.out.println(tokens +" the tokens of "+userId);
            if (tokens > 0) {
                userTokens.put(userId, tokens - 1);
            } else {
                throw new Exception("Rate limit exceeded for user: " + userId);
            }
        }
    }

    private void refillTokens() {
        int totalTokens = userTokens.values().stream().mapToInt(Integer::intValue).sum();
        if (totalTokens < maxTransactionsPerSecond) {
            userTokens.forEach((userId, tokens) -> {
                int limit = userLimits.get(userId);
                if (tokens < limit) {
                    userTokens.put(userId, tokens + 1);
                }
            });
        }
    }

    public static void main(String[] args) {
        RateLimiter1 rateLimiter = new RateLimiter1(500);
        rateLimiter.addUser("a", 100);
//        rateLimiter.addUser("b", 200);
//        rateLimiter.addUser("c", 300);

        // Example usage
        try {
            for (int i = 0; i < 101; i++) {
                rateLimiter.allowTransaction("a");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            for (int i = 0; i < 201; i++) {
                rateLimiter.allowTransaction("b");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            for (int i = 0; i < 301; i++) {
                rateLimiter.allowTransaction("c");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}