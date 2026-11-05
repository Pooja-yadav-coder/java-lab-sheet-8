import java.util.*;

class StringListQ10 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Aman");
        names.add("Riya");
        names.add("Pooja");
        names.add("Rahul");
        names.add("Neha");

        System.out.println(names);
        System.out.println(names.get(0));

        names.set(1, "Anjali");
        names.remove("Rahul");

        System.out.println(names);
        System.out.println("Size: " + names.size());
    }
}
