package fh.campus02;

public class Recursion {
    public static void main(String[] args) {
    countDown(10,0);
    }

    public static void countDown(int start, int stop) {
        System.out.println(start);
        start--;
        if (start >= stop) {
            countDown(start, stop);
        }
    }
}
