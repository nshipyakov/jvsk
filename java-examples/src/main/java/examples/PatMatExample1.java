package examples;

import examples.beans.Printer;
import examples.beans.Xerox;

public class PatMatExample1 {

    public static void main(String[] args) {
        example9();
    }

    private static void example1() {
        Object obj = new SomeWrapper("pm");
        if (obj instanceof SomeWrapper sw) {
            /*
               Причем sw введено не просто так. Ибо нет уверенности, что obj не будет изменен после проверки
               например из другого потока. В Kotlin же только тоже не всегда работает smart cast
               Клевый пример еще https://habr.com/ru/post/477654/#comment_20936420 с переопределением и старым кодом
               Надо попробовать в котлин так же сделать
               // http://mail.openjdk.java.net/pipermail/amber-dev/2020-January/005462.html - хороший коммент
             */
            sw.test();
        }
    }

    private static void example2() {
        Object obj = new SomeWrapper("pm");
        if (!(obj instanceof SomeWrapper sw)) {
        } else {
            /*
               Логично, что с отрицанием тоже работает
             */
            sw.test();
        }
    }

    private static void example3() {

        Object obj = "value";
        if (obj instanceof String sw && sw.length() == 5) {
            System.out.println("Работает");
        }

    }

    private static void example4() {
        Object obj = "value";
        // Логично не работает
//        if(obj instanceof String sw || sw.length() == 5) {
//            System.out.println("Работает");
//        }
    }

    private static void example5() {
        Object obj = "value";
        // Странно, что не работает
        // TODO поискать объяснение
//        if(obj instanceof String sw || false) {
//            System.out.println(sw.length());
//        }
    }

    private static void example6() {
        Object obj = "value";
        if (obj instanceof String sw && true) {
            System.out.println(sw.length());
        }
    }

    private static void example7() {

        Object obj = "value";
        if (!(obj instanceof String str)) {
            throw new RuntimeException("incorrect type");
        }
        System.out.println(str.length());

    }

    private static void example8() {
        Object obj = "value";
        // Интересно но довольно логично
        if (obj instanceof String sw) {
            obj = "vv";
            System.out.println(sw.toUpperCase());
            System.out.println(obj);
        }
        System.out.println(obj);
//        VALUE
//        vv
//        vv
    }

    private static void example9() {
        // Еще одна причина почему используется доп переменная

        Printer printer = getPrinter();
        if(printer instanceof Xerox p) {
            p.print();
        }

        // Выводится Some wrapper. Если бы сделали приведение к OtherWrapper
        // то вдруг стал выводится Other wrapper
        // Это ломает обратную совметсиомть

    }

    private static Printer getPrinter() {
        return new Xerox();
    }

    private void example10() {
        if (getValue() instanceof String) {
            // Не можем сослаться на значение которое вернул getValue
        }
    }

    static class SomeWrapper {

        private String value;

        public SomeWrapper(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void test() {
            System.out.println("test " + value);
        }

        public static void showText() {
            System.out.println("Some wrapper ");
        }
    }

    static class OtherWrapper extends SomeWrapper {

        public OtherWrapper(String value) {
            super(value);
        }

        public static void showText() {
            System.out.println("Other wrapper");
        }
    }

    Object getValue(){
        return "some string";
    }
}
