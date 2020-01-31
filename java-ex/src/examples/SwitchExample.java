package examples;

public class SwitchExample {

    public static void main(String[] args) {
        var obj = "2";
        // Примерно как в Kotlin. То на то
        var res = switch (obj) {
            case "1" -> "one";
            case "2" -> "two";
            default -> throw new IllegalStateException("Unexpected value: " + obj);
        };
        System.out.println(res);
    }
}
