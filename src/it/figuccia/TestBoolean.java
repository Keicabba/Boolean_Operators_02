package it.figuccia;

public class TestBoolean {
    public static void main(String[] args){
        System.out.println((55 != 55) && (false ^ true)); // should print false
        boolean a = true;
        boolean b = false;
        int c = 2;
        char d = '2';
        System.out.println((!a || !b) || c == d); // should print true
        System.out.println(false && true || false && !false); // should print false
        System.out.println((false && true) || (false || true)); // should print true
    }
}
