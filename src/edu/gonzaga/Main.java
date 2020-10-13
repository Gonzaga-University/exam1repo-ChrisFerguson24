package edu.gonzaga;

class Adder {
    int val1;
    int val2;

    public Adder(int new_val1, int new_val2) {
        val1 = new_val1;
        val2 = new_val2;
    }


}

public class Main {
    public static void main(String args[]) {
        System.out.println("Starting app");
        Adder adder = new Adder(10, 20);
        Adder adder2 = new Adder(30, 20);
        Adder correctAdder = new Adder(292, 420);

        System.out.println("App finished.");
        System.out.println("This app isn't finished. Needs more work. KEKW");
    }
}