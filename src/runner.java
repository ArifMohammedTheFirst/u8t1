public class runner {
    public static void main(String[] args) {
        /* --- PROBLEM 1 --- */
        System.out.println("PROBLEM 1:");

        int[][] testArr1 = {{1, 2}, {3, 4}, {5, 6}};
        // write code below that uses nested INDEX-BASED for loops
        // to print each element in testArr1 in ROW-MAJOR order; i.e. 1, 2, 3, 4, 5, 6

        /* WRITE CODE HERE! */
        for(int i = 0; i < testArr1.length; i++) {
            for(int c = 0; c < testArr1[0].length; c++) {
                System.out.println(testArr1[i][c]);
            }
        }

        System.out.println("---------");
        // now, write code below that uses nested ENHANCED for loops
        // to print each element in testArr1 in row-major order AGAIN; i.e. 1, 2, 3, 4, 5, 6

        /* WRITE CODE HERE! */
        for(int[] rows: testArr1) {
            for(int collums: rows) {
                System.out.println(collums);
            }
        }

        System.out.println("---------");
        // lastly, write code below that uses nested INDEX-BASED for loops
        // to print each element in testArr1 in COLUMN-MAJOR order; i.e. 1, 3, 5, 2, 4, 6

        /* WRITE CODE HERE! */
        for(int c = 0; c < testArr1[0].length; c++) {
            for(int i = 0; i < testArr1.length; i++){
                System.out.println(testArr1[i][c]);
            }
        }

        /* --- PROBLEM 2 --- */
        System.out.println("---------");
        System.out.println("PROBLEM 2:");

        String[][] testArr2 = {{"ant", "bird", "camel"}, {"dog", "elephant", "fish"}};
        // write code below using a nested ENHANCED for loop to print each element in
        // testArr2 in ROW-MAJOR order; i.e. ant, bird, camel, dog, elephant, fish
        for(int i = 0; i < testArr2.length; i++) {
            for(int r = 0; r < testArr2[0].length; r++) {
                System.out.println(testArr2[i][r]);
            }
        }
        /* WRITE CODE HERE! */

        System.out.println("---------");
        // write code below using an INDEX-BASED nested for loop to print each element in
        // testArr2 in COLUMN-MAJOR order; i.e. ant, dog, bird, elephant, camel, fish

        /* WRITE CODE HERE! */
        for(int c = 0; c < testArr2[0].length; c++) {
            for(int r = 0; r < testArr2.length; r++) {
                System.out.println(testArr2[r][c]);
            }
        }

    }
}
