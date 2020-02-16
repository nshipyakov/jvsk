package examples;

public class SwitchExample {

    public static void main(String[] args) {
        var obj1= "2";
        // Примерно как в Kotlin. То на то
        var res = switch (obj1) {
            case "1" -> "one";
            case "2" -> "two";
            default -> throw new IllegalStateException("Unexpected value: " + obj1);
        };
        System.out.println(res);


        Integer num = getValue();

        String result1 = switch (num) {
            case 1 -> "Один";
            case 2 -> "Два";
            default -> "Много";
        };


        Object obj = getObj();

        String result;
        if (obj instanceof String) {
            result = "Строчка";
        } else if (obj instanceof Integer) {
            result = "Чиселка";
        } else {
            result = "Что - то другое";
        }

        System.out.println(result);

    }

    private static Integer getValue() {
        return 1;
    }

    private static Object getObj() {
        return 1;
    }
}
