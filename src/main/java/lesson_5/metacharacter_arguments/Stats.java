package lesson_5.metacharacter_arguments;

public class Stats<T extends Number> {

    T[] numbers;

    public Stats(T[] numbers) {
        this.numbers = numbers;
    }

    double average() {
        double sum = 0.0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i].doubleValue();
        }
        return sum / numbers.length;
    }

    boolean sameAvg(Stats<?> object) {
        if (average() == object.average()) {
            return true;
        }
        return false;
    }
}
