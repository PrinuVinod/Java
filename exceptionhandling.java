import java.util.Scanner;
class exceptionhandling
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Divide Two Positive Numbers");
        try
        {
            System.out.println("Enter Two Positive Numbers: ");
            test obt = new test();
            obt.testadd();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Process Ended.");
        }
    }    
}
class test
{
    void testadd() throws ArithmeticException, NumberFormatException 
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();   
        if(b == 0)
        {
            throw new ArithmeticException("ArithmeticException :: Division by zero");
        }
        else if(a<0 && b<0)
        {
            throw new NumberFormatException(" NumberFormatExceptiom :: Not Positive Number");
        }
        else
        {
            System.out.println(a+ " / " +b+ " = " +a/b );
        }
    }
}