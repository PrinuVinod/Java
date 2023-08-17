import java.util.*;
class dll
{
    public static void main(String args[])
    {
        int x;
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer>a = new LinkedList<Integer>();
        System.out.println("Enter The Number Of Elements: ");
        int n = sc.nextInt();
        System.out.println("Enter The Element To The List: ");
        for(int i=0; i<n; i++)
        {
            x = sc.nextInt();
            a.add(x);
        }
        System.out.println("LIST");
        Iterator<Integer>itr = a.iterator();
        while(itr.hasNext())
        {
            int element = itr.next();
            System.out.print(" " +element+ " ");
        }
        int opt = -1;
        do
        {
            System.out.println("");
            System.out.println("1. Delete From Front.");
            System.out.println("2. Delete From End.");
            System.out.println("3. Delete From a Position.");
            System.out.println("4. EXIT");
            System.out.println("Enter Your Choice: ");
            opt = sc.nextInt();
            switch(opt)
            {
                case 1:
                    a.removeFirst();
                    break;
                case 2:
                    a.removeLast();
                    break;
                case 3:
                    System.out.println("Enter The Position: ");
                    int pos = sc.nextInt();
                    if(pos <= n)
                    {
                        a.remove(pos-1);
                    }
                    else
                    {
                        System.out.println("Invalid Position.");
                    }
                    break;
                case 4:
                    break;
                default:
                System.out.println("Invalid Choice.");
            }
            if(opt != 0)
            {
                System.out.println("Updated List: ");
                itr = a.iterator();
                while(itr.hasNext())
                {
                    int el = itr.next();
                    System.out.println(" " +el+ " ");
                }
            }
        }
        while(opt != 0);
        System.out.println();
    }
}