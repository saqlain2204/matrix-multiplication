import java.util.Scanner;

public class Project
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows in matrix 1");
        int row1=sc.nextInt();
        System.out.println("Enter the number of columns in matrix 1");
        int col1=sc.nextInt();
        System.out.println("Enter the elements of matrix 1. Press enter after each element.");
        int[][] a=new int[row1][col1];
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col1;j++)
            {
                a[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("enter the number of rows in matrix 2");
        int row2=sc.nextInt();
        System.out.println("Enter the number of columns in matrix 2");
        int col2=sc.nextInt();
        System.out.println("Enter the elements of matrix 2. Press enter after each element.");
        int[][] b=new int[row2][col2];
        for(int i=0;i<row2;i++)
        {
            for(int j=0;j<col2;j++)
            {
                b[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        int[][] c=new int[row1][col2];

        if(col1==row2)
        {
            multiply(a, b, row1, col1, row2, col2, c);
            System.out.println("Answer is");
            for(int i=0;i<row1;i++)
            {
                for(int j=0;j<col2;j++)
                {
                    System.out.print(c[i][j]+"|");
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println("The multiplication on the above data is not possible");
        }
        
    }
    public static int i=0, k=0, j=0;
    public static void multiply(int[][] a, int[][] b, int row1, int col1, int row2, int col2, int[][] c)
    {
        // base case
        if (i >= row1) return; 
        //-----------------------
    if (j < col2)
    {
        if (k < col1)
        {
            c[i][j] += a[i][k] * b[k][j];
            k++;
            //recursive call
            multiply(a, b, row1, col1, row2, col2, c);
        }
        k = 0;
        j++;
        //recursive call
        multiply(a, b, row1, col1, row2, col2, c);
    }
        j = 0;
        i++;
        k=0;
        //recursive call
        multiply(a, b, row1, col1, row2, col2, c);
    
}
}