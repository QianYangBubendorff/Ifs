package fh.campus02;

public class drinkDiscount {
    public static void main(String[] args) {
        int drink = 2;
        int alcoholic = 0;
        System.out.println("Do I get a discount: " + GetDiscount(drink, alcoholic));
    }

    public static boolean GetDiscount(int drink, int alcoholic) {
        boolean discount;
        if (drink > 0 && alcoholic == 0) {
            discount = true;
        } else
            discount = false;
        return discount;
    }

}
