package examples;

public class NpeExample {

    public static void main(String[] args) {
        final String s = null;
        // Когда-то должна появиться более полная ошибка
        // JEP 358
        System.out.println(s.length());
    }
}
