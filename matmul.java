import java.util.Scanner;
public class matmul
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int i, j, k;
        System.out.println("Enter the Row And Column Of 1st Matrix: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.println("Enter the Row And Column Of 2nd Matrix: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        if(c1 == r2)
        {
            int m1[][] = new int[r1][c1];
            System.out.println("Enter the Elements in the 1st Matrix: ");
            for(i=0; i<r1; i++)
            {
                for(j=0; j<c1; j++)
                {
                    m1[i][j] = sc.nextInt();
                }
            }
            int m2[][] = new int[r2][c2];
            System.out.println("Enter the Elements in the 2nd Matrix: ");
            for(i=0; i<r2; i++)
            {
                for(j=0; j<c2; j++)
                {
                    m2[i][j] = sc.nextInt();
                }
            }
            System.out.println("The 1st Matrix is: ");
            for(i=0; i<r1; i++)
            {
                for(j=0; j<c1; j++)
                {
                    System.out.print(m1[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("The 2nd Matrix is: ");
            for(i=0; i<r2; i++)
            {
                for(j=0; j<c2; j++)
                {
                    System.out.print(m2[i][j]+" ");
                }
                System.out.println();
            }
            int m3[][] = new int[r1][c1];
            for(i=0; i<r1; i++)
            {
                for(j=0; j<c2; j++)
                {
                    m3[i][j] = 0;
                    for(k=0; k<c1; k++)
                    {
                        m3[i][j] += m1[i][k] * m2[k][j];
                    }
                }
            }
            System.out.println("Multiplied Matrix is: ");
            for(i=0; i<r1; i++)
            {
                for(j=0; j<c2; j++)
                {
                    System.out.print(m3[i][j]+ " ");
                }
                System.out.println();
            }
        }
    }    
}