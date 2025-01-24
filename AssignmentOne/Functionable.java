package AssignmentOne;

@FunctionalInterface
public interface Functionable<T,R> {
    public R pass(T t);
}
