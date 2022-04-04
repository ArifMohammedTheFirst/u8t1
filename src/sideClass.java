public class sideClass {
    public static double average(int[][] arr1) {
        int sum = 0;
        for(int[] stuff: arr1) {
            for(int goods: stuff) {
                sum += goods;
            }
        }
        return sum/(arr1.length * arr1[0].length);
    }

    public static int[] indexFound(String[][] arr2, String target) {
        int[] indexFound = new int[2];

        for(int i = 0; i < arr2.length; i++) {
            for( int c = 0; c < arr2[0].length; c++) {
                if(arr2[i][c].equals(target)) {
                    indexFound[0] = i;
                    indexFound[1] = c;
                }
            }
        }
        if(indexFound[0] == -1) {
            return "[-1,-1}"
        }
        return indexFound;
    }
}
