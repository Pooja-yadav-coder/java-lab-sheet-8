class Container<T> {
    T value;

    void add(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }
}

class ContainerQ12 {
    public static void main(String[] args) {
        Container<Integer> c1 = new Container<>();
        Container<String> c2 = new Container<>();
        Container<Double> c3 = new Container<>();

        c1.add(10);
        c2.add("Hello");
        c3.add(25.5);

        System.out.println(c1.get());
        System.out.println(c2.get());
        System.out.println(c3.get());
    }
}
