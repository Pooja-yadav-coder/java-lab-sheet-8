class Student<T> {
    T id;

    Student(T id) {
        this.id = id;
    }

    void display() {
        System.out.println("Student ID: " + id);
    }
}

class StudentQ3 {
    public static void main(String[] args) {
        Student<Integer> s = new Student<>(101);
        s.display();
    }
}
