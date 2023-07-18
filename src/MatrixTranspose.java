import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int array[][] = new int[row][column];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                array[i][j] = sc.nextInt();
            }
        }//input
        int[][]res = transpose(array,row,column);

        for(int[] element : res)
        {
            for(int x : element)
            {
                System.out.print(x +" ");
            }
            System.out.println();
        }
    }
    public static int[][] transpose(int[][] array,int row,int column)
    {
        int trans[][] = new int[column][row];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                trans[j][i] = array[i][j];
            }
        }
        return trans;
    }
}
/* Matrix Transpose
[ [1, 2],
  [1, 2],
  [1, 2] ]

Output
[ [1, 1, 1],
  [2, 2, 2] ]
 */