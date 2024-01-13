import java.util.Vector;

public class vectors {
    public static void main(String[] args) {
        Vector<String> mammals = new Vector<>();

        //using add method
        mammals.add("Dog");
        mammals.add("Horse");

        // using index number
        mammals.add(2, "Cat");
        System.out.println("Vector: " + mammals);

        //  using addAll
        Vector<String> animals = new Vector<>();
        animals.add("Crocodile");

        animals.addAll(mammals);
        System.out.println("New Vector: " + animals);
    }
}
