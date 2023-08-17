import java.util.Scanner;
class strfrq
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        System.out.println("Enter a Character whose Which Frequency is to be Searched: ");
        char ch = sc.nextLine().charAt(0);
        int count = 0, l = str.length();
        for(int i=0; i<l; i++)
        {
            if(str.charAt(i) == ch)
            {
                count++;
            }
        }
        System.out.println("Frequency of The Character "+ch+" is "+count);
    }
}