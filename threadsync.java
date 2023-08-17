import java.util.Scanner;
class threadsync
{
    public static void main(String args[])
    {
    }   
}
class callme
{
    void call(String msg)
    {
        System.out.println("[" +msg);
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}
class caller implements Runnable
{
    String msg;
    Callme target;
    Thread t;
    public caller(callme targs, String s)
    {
        target = targ;
        msg = s;
        t = new thread(this);

    }
}