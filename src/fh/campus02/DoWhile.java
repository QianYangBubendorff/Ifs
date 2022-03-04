package fh.campus02;

public class DoWhile {
    public static void main(String[] args) {
        countToAHundred(1);
    }

    public static void countToAHundred(int from) {
        do {
            System.out.println(from);
            from++;
        } while (from <= 100);


        }
    }

