package examples;

public class PatMatExample {

    public static void main(String[] args) {
        Object obj2 = new SomeWrapper("pm");
        if(obj2 instanceof SomeWrapper sw){
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
