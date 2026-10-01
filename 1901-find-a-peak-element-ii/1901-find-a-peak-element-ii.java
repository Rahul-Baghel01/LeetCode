class Solution{
    public int[] findPeakGrid(int[][] mat){
        int top=0;
        int bottom=mat.length-1;
        while(top<=bottom){
            int row=top+(bottom-top)/2;
            int col=0;
            for(int j=1;j<mat[0].length;j++){
                if(mat[row][j]>mat[row][col]){
                    col=j;
                }
            }
            int up=row>0?mat[row-1][col]:-1;
            int down=row<mat.length-1?mat[row+1][col]:-1;
            if(mat[row][col]>up&&mat[row][col]>down){
                return new int[]{row,col};
            }
            if(up>mat[row][col]){
                bottom=row-1;
            }else{
                top=row+1;
            }
        }
        return new int[]{-1,-1};
    }
}