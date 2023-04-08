package lesson_5.generic_methods;

public class GenericMethod {

    public <T extends Comparable<T>, v extends T> boolean isIn(T x, v[] y) {
        for (int i = 0; i < y.length; i++) {
            if (x.equals(y[i])) {
                return true;
            }
        }
        return false;
    }
}
