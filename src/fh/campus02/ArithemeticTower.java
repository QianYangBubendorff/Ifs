package fh.campus02;

public class ArithemeticTower {
    public static void main(String[] args) {
        int x = 2;
        makeTown(x);
    }
    public static void makeTown(int x){
     for (int i=2; i<9; i++){
         x= x * i;
         System.out.println(x + "*" + i);

     }

     for (int j=2; j<9; j++){
         x= x / j;
         System.out.println(x + "*" + j);

     }

    }
}
