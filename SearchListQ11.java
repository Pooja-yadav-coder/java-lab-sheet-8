import java.util.*;

class SearchListQ11 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            list.add(i * 10);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (list.contains(n))
            System.out.println("Number found");
        else
            System.out.println("Number not found");
    }
}
