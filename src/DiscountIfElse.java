public class DiscountIfElse {
    public static void main(String[] args) {
//        on the bus you receive a discount if you are a senior citizen, a dog or a student.
        boolean isDog=false;
        boolean isStudent=true;
        boolean isSenior=true;
        double ticketPrice=2.5;
        double discount= getBusDiscount(ticketPrice, isDog, isSenior, isStudent);
        System.out.println("I saved"+discount+" euro for my "+ticketPrice+"euro ticket.");
      /*  if(isDog){
            discount=true;
        }else if (isSenior){
            discount=true;
        }else if (isStudent){
            discount=true;
        }else {
            discount=false;
        }
        System.out.println("I get a discount: " + discount);
    }*/
    }
    public static double getBusDiscount (double ticketPrice, boolean isDog, boolean isSenior, boolean isStudent){
        double discount;
        if (isDog){
            discount=ticketPrice*0.2;
        }else if (isSenior){
            discount=ticketPrice*0.15;
        }else if (isStudent){
            discount=ticketPrice*0.1;
        }else{
            discount=0;
        }
        return discount;
    }
}
