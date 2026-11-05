import java.util.*;

class Student<T, U, V> {
    T id;
    U name;
    V marks;

    Student(T id, U name, V marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println(id + " " + name + " " + marks);
    }
}

class StudentManagementQ15 {
    public static void main(String[] args) {
        ArrayList<Student<Integer, String, Double>> list =
            new ArrayList<>();

        list.add(new Student<>(1, "Aman", 85.5));
        list.add(new Student<>(2, "Riya", 90.0));
        list.add(new Student<>(3, "Pooja", 88.5));
        list.add(new Student<>(4, "Rahul", 78.0));
        list.add(new Student<>(5, "Neha", 92.5));

        for (Student<Integer, String, Double> s : list) {
            s.display();
        }

        System.out.println("Total Students: " + list.size());
        System.out.println("First Student: " + list.get(0).name);

        int searchId = 3;
        boolean found = false;

        for (Student<Integer, String, Double> s : list) {
            if (s.id.equals(searchId)) {
                System.out.println("Student Found: " + s.name);
                found = true;
            }
        }

        System.out.println("Search Result: " + found);
    }
}
