package examples;

public class PatMatExample1 {

    public static void main(String[] args) {
        Object obj = new SomeWrapper("pm");
        if(obj instanceof SomeWrapper sw){
            /*
               Причем sw введено не просто так. Ибо нет уверенности, что obj не будет изменен после проверки
               например из другого потока. В Kotlin же только тоже не всегда работает smart cast
             */
            sw.test();
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
    }
}
