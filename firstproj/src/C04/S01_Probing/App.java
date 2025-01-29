package C04.S01_Probing;

public class App {
    public static void main(String[] args) {
        testLinearProbing();
        testQuadProving();
        testRandProving();
        testDoubleHashing();
    }

    static void testLinearProbing() {
        LinearProbing t = new LinearProbing();
        t.put(71, "grape");
        t.put(23, "apple");
        t.put(73, "bananna");
        t.put(49, "cherry");
        t.put(54, "mango");
        t.put(89, "lime");
        t.put(39, "orange");

        System.out.println(t.get(54));
        t.print();
    }

    static void testQuadProving() {
        QuadProbing t = new QuadProbing();
        t.put(71, "grape");
        t.put(23, "apple");
        t.put(73, "bananna");
        t.put(49, "cherry");
        t.put(54, "mango");
        t.put(89, "lime");
        t.put(39, "orange");

        System.out.println(t.get(54));
        t.print();
    }

    static void testRandProving() {
        RandProbing t = new RandProbing();
        t.put(71, "grape");
        t.put(23, "apple");
        t.put(73, "bananna");
        t.put(49, "cherry");
        t.put(54, "mango");
        t.put(89, "lime");
        t.put(39, "orange");

        System.out.println(t.get(54));
        t.print();
    }

    static void testDoubleHashing() {
        DoubleHashing t = new DoubleHashing();
        t.put(71, "grape");
        t.put(23, "apple");
        t.put(73, "bananna");
        t.put(49, "cherry");
        t.put(54, "mango");
        t.put(89, "lime");
        t.put(39, "orange");

        System.out.println(t.get(54));
        t.print();
    }
}
