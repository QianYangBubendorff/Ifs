package fh.campus02;

public class DevideBy3 {
    public static void main(String[] args) {
        int firstNumber = 11;
        int secondNumber = 3;
        int result = firstNumber % secondNumber;
        if (result == 0) {
            System.out.println("The number is divisible by 3");
        } else System.out.println("The number is not divisible by 3");
    }
}
