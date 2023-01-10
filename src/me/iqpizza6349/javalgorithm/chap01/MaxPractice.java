package me.iqpizza6349.javalgorithm.chap01;

public class MaxPractice implements MaxAlgorithm {

    @Override
    public <T extends Number> T max3(T t, T t1, T t2) {
        T max = t;
        if (t1.intValue() > max.intValue()) {
            max = t1;
        }

        if (t2.intValue() > max.intValue()) {
            max = t2;
        }

        return max;
    }

    @Override
    public <T extends Number> T max4(T t, T t1, T t2, T t3) {
        T max = max3(t, t1, t2);

        return (t3.intValue() > max.intValue()) ? t3 : max;
    }

    @Override
    public <T extends Number> T min3(T t, T t1, T t2) {
        T min = t;
        if (min.intValue() > t1.intValue()) {
            min = t1;
        }
        if (min.intValue() > t2.intValue()) {
            min = t2;
        }

        return min;
    }

    @Override
    public <T extends Number> T min4(T t, T t1, T t2, T t3) {
        T min = min3(t, t1, t2);

        return (min.intValue() > t3.intValue()) ? t3 : min;
    }

    public static void main(String[] args) {
        MaxAlgorithm maxAlgorithm = new MaxPractice();
        System.out.println(maxAlgorithm.max3(3, 2, 1));
        System.out.println(maxAlgorithm.max4(3, 2, 1, 5));
        System.out.println(maxAlgorithm.min3(3, 2, 1));
        System.out.println(maxAlgorithm.min4(3, 2, 1, -1));
    }
}
