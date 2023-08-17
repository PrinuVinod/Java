import java.util.Scanner;
import java.util.StringTokenizer;
class tokenizer
{
    public static void main(String args[])
    {
        String temp;
        int sum=0, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Integers to Be Added: ");
        String integer = sc.nextLine();
        System.out.println("The Entered Integers Are: ");
        StringTokenizer st = new StringTokenizer(integer," ");
        while(st.hasMoreTokens())
        {
            temp = st.nextToken();
            System.out.println(temp);
            int val=0;
            for(i=0; i<temp.length(); i++)
            {
                val = val*10 + (temp.charAt(i) - 48);
            }
            sum = sum + val;
        }
        System.out.println("The Sum Of The Integer Is: " +sum);
    }
}