package fh.campus02;

public class MultidimensionalArray {
    public static void main(String[] args) {
        int[][] list = {{1,1,1}, {1,1,1}, {1,1,1}};
        for (int i=0; i< list.length; i++ ){
            for (int j=0; j < list[i].length; j++){
                System.out.print(list[i][j] + "");
            }
            System.out.println();
        }
        list[1][1]=9;
        list[0][0]=3;
        list[0][2]=3;
        list[2][0]=3;
        list[2][2]=3;


        for (int[] horizontalArray: list){
            for( int element: horizontalArray){
                System.out.print(element + "");
           }
            System.out.println();
        }


    }
}
