package AssignmentOne;

public class RateLimiter {

    boolean rateLimt(String user) {
        int each=100;

        switch (user){
            case "a":{
                int count = 0;
                do{
                    if(count<each) {
                        System.out.println("a: " + count);
                        count++;
                    }else {
                        System.out.println("The Rate limite reached max..!!");
                    }
                    break;

                }while (true);
            }
            case "b":{
                int count = 0;
                do{
                    if(count<each) {
                        System.out.println("a: " + count);
                    }else
                        System.out.println("The Rate limite reached max..!!");
                    count++;
                }while (true);
            }
            case "c":{
                int count = 0;
                do{
                    if(count<each) {
                        System.out.println("a: " + count);
                    } else
                        System.out.println("The Rate limite reached max..!!");
                    count++;
                }while (true);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
RateLimiter rate= new RateLimiter();
rate.rateLimt("a");
    }
}
