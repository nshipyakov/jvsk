

class Record{


    String literal = "Lorem ipsum dolor sit amet, consectetur adipiscing " +
            "elit, sed do eiusmod tempor incididunt ut labore " +
            "et dolore magna aliqua.";

    String text = """
                Lorem ipsum dolor sit amet, consectetur adipiscing \
                elit, sed do eiusmod tempor incididunt ut labore \
                et dolore magna aliqua.\
                """;

    record Point(float x, float y) { } ->

    final class Point extends java.lang.Record { //final???
        private final float x;
        private final float y;

        public Point(float, float);

        public java.lang.String toString();

        public final int hashCode();

        public final boolean equals(java.lang.Object);

        public float x();

        public float y();

        //copy нет
//  }

        // SALED

        sealed interface Expr { }

        record ConstantExpr(int i) implements Expr { }
        record PlusExpr(Expr a, Expr b) implements Expr { }
        record TimesExpr(Expr a, Expr b) implements Expr { }
        record NegExpr(Expr e) implements Expr { }

        int eval(Expr e) {
            return switch (e) {
                case ConstantExpr(var i) -> i;
                case PlusExpr(var a, var b) -> eval(a) + eval(b);
                case TimesExpr(var a, var b) -> eval(a) * eval(b);
                case NegExpr(var e) -> -eval(e);
                // no default needed, Expr is sealed
            }
        }


    }