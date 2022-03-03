package fh.campus02;

public class bookDiscount {
    public static void main(String[] args) {
        int nonFiction = 3;
        int fiction = 0;
        boolean discount = getBookDiscount(nonFiction, fiction);
        System.out.println("Do I get a discount: " + discount);
    }

    public static boolean getBookDiscount(int nonFiction, int fiction) {
        boolean discount;
        if (nonFiction > 2 && fiction > 0) {
            discount = true;
        } else {
            discount = false;
        }
        return discount;
    }
}
