package examples;

//
//
//class Record{
//
//
//    String literal = "Lorem ipsum dolor sit amet, consectetur adipiscing " +
//            "elit, sed do eiusmod tempor incididunt ut labore " +
//            "et dolore magna aliqua.";
//
//    String text = """
//                Lorem ipsum dolor sit amet, consectetur adipiscing \
//                elit, sed do eiusmod tempor incididunt ut labore \
//                et dolore magna aliqua.\
//                """;
//
//    record Point(float x, float y) { } ->
//
//    final class Point extends java.lang.Record { //final???
//        private final float x;
//        private final float y;
//
//        public Point(float, float);
//
//        public java.lang.String toString();
//
//        public final int hashCode();
//
//        public final boolean equals(java.lang.Object);
//
//        public float x();
//
//        public float y();
//
//        //copy нет
////  }
//
//        // SALED
//
//        sealed interface Expr { }
//
//        record ConstantExpr(int i) implements Expr { }
//        record PlusExpr(Expr a, Expr b) implements Expr { }
//        record TimesExpr(Expr a, Expr b) implements Expr { }
//        record NegExpr(Expr e) implements Expr { }
//
//        int eval(Expr e) {
//            return switch (e) {
//                case ConstantExpr(var i) -> i;
//                case PlusExpr(var a, var b) -> eval(a) + eval(b);
//                case TimesExpr(var a, var b) -> eval(a) * eval(b);
//                case NegExpr(var e) -> -eval(e);
//                // no default needed, Expr is sealed
//            }
//        }
//
//
//    }

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import examples.records.User;

class Record{

    private static ObjectMapper objectMapper = new ObjectMapper();

    public static void main(String[] args) throws JsonProcessingException {
        var user = new User("Vasya", "Pupkin");
        var user1 = new User("Vasya", "Pupkin");
        System.out.println(user.equals(user1));
        var result = objectMapper.writeValueAsString(user);
        System.out.println(result);
    }
}