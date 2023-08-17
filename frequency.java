import java.util.Scanner;
public class frequency
{
    public static void main(String args[])
    {
        int f=0, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String: ");
        String str = sc.nextLine();
        System.out.println("Enter The Character To Check Its Frequency: ");
        char ch = sc.next().charAt(0);
        int len = str.length();
        for(i=0; i<len; i++)
        {
            if(ch == str.charAt(i))
            {
                f++;
            }
        }
        System.out.println("Frequency of " +ch+ " is " +f);
    }
}