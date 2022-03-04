package fh.campus02;

public class SumsFor {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i<10; i++) {
            sum = sum +i;
        }
        System.out.println(sum);

        String sentence = " Weekend";
        for (int j=1; j<11; j++){
            System.out.println(j+ "." + sentence);
        }
    }
}
