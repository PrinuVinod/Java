import java.util.Scanner;
public class palindrome
{
    public static void main(String args[])
    {
        int i, len, flag =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String name = sc.nextLine();
        len = name.length();
        String str = name.toLowerCase();
        for(i=0; i<len/2; i++)
        {
            if(str.charAt(i) != str.charAt(len-i-1))
            {
                flag = -1;
                break;
            }
        }
        if(flag == 0)
        {
            System.out.println(name+ " Is a Palindrome.");
        }
        else
        {
            System.out.println(name+ " Is Not a Palindrome.");
        } 
    }
}