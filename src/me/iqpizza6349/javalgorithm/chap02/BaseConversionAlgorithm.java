package me.iqpizza6349.javalgorithm.chap02;

public class BaseConversionAlgorithm {

    protected int cardConversion(int x, int r, char[] d) {
        int i = 0;
        String dChar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[i++] = dChar.charAt(x % r);
            x /= r;
        } while (x != 0);
        for (int j = 0; j < i / 2; j++) {
            char temp = d[j];
            d[j] = d[i - j - 1];
            d[i - j - 1] = temp;
        }

        return i;
    }

    public void conversion(int i, int number) {
        char[] cards = new char[32];
        int dno = cardConversion(i, number, cards);
        for (int j = 0; j < dno; j++) {
            System.out.print(cards[j]);
        }
    }

    public static void main(String[] args) {
        BaseConversionAlgorithm algorithm = new BaseConversionAlgorithm();
        algorithm.conversion(2, 2);
    }
}
