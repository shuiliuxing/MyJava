package org.bing.learn.算法.数组.有效的数独;

public class Solution {
    public static void main(String[] args){
        char[][] nums={
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println(isValidSudoku(nums));
    }

    //简单暴力
    public static boolean isValidSudoku(char[][] board) {
        for (int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                char c=board[i][j];
                if(c!='.')
                {
                    //遍历同一行
                    for(int m=0;m<9;m++){
                        if(m!=j && c==board[i][m]){
                            return false;
                        }
                    }
                    //遍历同一列
                    for(int n=0;n<9;n++){
                        if(n!=i && c==board[n][j]){
                            return false;
                        }
                    }
                    //遍历3*3方格
                    int sx=i/3*3;
                    int sy=j/3*3;
                    for(int m=sx;m<sx+3;m++){
                        for(int n=sy;n<sy+3;n++){
                            if(m!=i && n!=j && c==board[m][n]){
                                return false;
                            }
                        }
                    }

                }
            }
        }
        return true;
    }

    //高效
    public static boolean isValidSudoku1(char[][] board) {
        boolean[][] row=new boolean[9][9];
        boolean[][] col=new boolean[9][9];
        boolean[][] block=new boolean[9][9];
        for (int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]!='.')
                {
                    int num=board[i][j]-'1';
                    int blockIndex=i/3*3+j/3;   //计算出当前遍历得到第某个box

                    if(row[i][num] || col[j][num] || block[blockIndex][num]){
                        return false;
                    }else{
                        row[i][num]=true;
                        col[j][num]=true;
                        block[blockIndex][num]=true;
                    }
                }
            }
        }
        return true;
    }

}
