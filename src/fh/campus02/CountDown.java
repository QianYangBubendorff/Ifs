package fh.campus02;

public class CountDown {
    public static void main(String[] args) {
        CountDown(20);
    }


    public static void CountDown(int i) {
        while (i >= 0) {
            System.out.println(i);
            i--;
        }
    }
}
