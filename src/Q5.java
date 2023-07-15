public class Q5 {
    public static void main(String[] args) {
        int dnumber[][] = {
                {1,2,3,4,5},
                {5,4,3,2,1},
                {7,8,9,1,5,7,7,}

        };

        for  (int i =0 ; i< dnumber.length;i++ ){
            for (int r = 0; r < dnumber[i].length; r++) {
                System.out.print(dnumber[i][r] +"\t");


            }
            System.out.println();

        }

    }
}
