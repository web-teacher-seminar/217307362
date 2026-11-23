

public class Main {
    public static void main(String[] args) {
        Set set = new Set();
        set.add(23);
        set.add(25);
        set.add(22);
        set.add(24);
        System.out.println(set.find(23));
        System.out.println(set);
        System.out.println(set.find(20));
        set.add(50);
        System.out.println(set);
        set.Remove(25);
        System.out.println(set);
    }
}