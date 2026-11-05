import java.util.*;

class GenericArrayQ14 {
    static <T> void display(ArrayList<T> list) {
        for (T x : list) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();

        a.add(10);
        a.add(20);
        a.add(30);

        b.add("Aman");
        b.add("Riya");
        b.add("Pooja");

        display(a);
        display(b);
    }
}
