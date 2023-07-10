public class Main {
    public static void main(String[] args) {
        int[][] test = new int[3][];
        test[0] = new int[3];
        test[1] = new int[4];
        test[2] = new int[9];
//        for (int[] teste1: test) {
//           for (int teste2 : teste1){
//               System.out.print(teste2 + " ");
//           }
//            System.out.println();
//        }

        int[][][] array2 = {{{1,1,1},{1,2,3,4,5,6},{1,2,3,4,5,6,7,8,9,}}};

        for (int[][] index1: array2) {
            for (int[] index2: index1
                 ) {
                for (int index3: index2
                     ) {
                    System.out.printf("%d " , array2[index3]);
                }
                System.out.println();
            }
        }

    }
}