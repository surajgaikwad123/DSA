class Solution {
    public void rotate(int[][] matrix) {
        int temp = 0;
        for(int i =0 ; i< matrix.length; i++)
            {
                for(int j = i+1 ; j < matrix.length; j++)
                    {

                        temp = matrix[i][j];
                        matrix[i][j] = matrix[j][i];
                        matrix[j][i] = temp;       
                    }
            }

        for(int i =0 ; i< matrix.length; i++)
            {
                int left  = 0;
                int right = matrix[i].length-1;

                while(left<right)
                    {
                        temp = matrix[i][left];
                        matrix[i][left] = matrix[i][right];
                        matrix[i][right] = temp;
                        left++;
                        right--;
                    }
            }
            for(int i =0 ; i< matrix.length; i++)
            {
                for(int j = 0 ; j<matrix[i].length; j++)
                    {
                        System.out.print(" " + matrix[i][j] + "{" + i + "," + j + "}");
                    }
                System.out.println();
            }
        
    }
}