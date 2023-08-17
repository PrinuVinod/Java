import java.util.Scanner;
public class inheritance
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Details Of Manager: ");
        manager man = new manager();
        System.out.println("Name: ");
        man.name = sc.next();
        System.out.println("Age: ");
        man.age = sc.nextInt();
        System.out.println("Phone Number: ");
        man.pn = sc.next();
        System.out.println("Address: ");
        man.ad = sc.next();
        System.out.println("Salary: ");
        man.sal = sc.nextFloat();
        System.out.println("Department: ");
        man.dept = sc.next();

        System.out.println("Enter The Details Of Officers: ");
        officer off = new officer();
        System.out.println("Name: ");
        off.name = sc.next();
        System.out.println("Age: ");
        off.age = sc.nextInt();
        System.out.println("Phone Number: ");
        off.pn = sc.next();
        System.out.println("Address: ");
        off.ad = sc.next();
        System.out.println("Salary: ");
        off.sal = sc.nextFloat();
        System.out.println("Specialization: ");
        off.spec = sc.next();
        man.display();
        off.display();
    }
}
class employee
{
    String name;
    int age;
    String pn;
    String ad;
    float sal;
    void printsalary()
    {
        System.out.println("Salary: " +sal);
    }
    void display()
    {
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Phone Number: " +pn);
        System.out.println("Address: " +ad);
        System.out.println("Salary: " +sal);
    }
}
class manager extends employee
{
    String dept;
    void diaplay()
    {
        System.out.println("Details Of Manager: ");
        super.display();
        System.out.println("Department: " +dept);
    }
}
class officer extends employee
{
    String spec;
    void display()
    {
        System.out.println("Details Of The Officer: ");
        super.display();
        System.out.print("Specialization: " +spec);
    }
}