import java.util.ArrayList;
public class Demo029 {
    public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<>();
    names.add("Jashmika");
    names.add("Shruthi");
    names.add("Geethu");
    names.add("Sana");
    names.add("Pranavi");
    names.add("a");
    names.add("b");
    names.add("c");
    names.add("d");
    names.add("e");
    for (int i = 0; i < names.size(); i++) {
        System.out.println("Name: " + names.get(i));
    }
    }
}