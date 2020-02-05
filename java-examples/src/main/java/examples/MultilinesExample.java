package examples;

public class MultilinesExample {

    public static void main(String[] args) {
        System.out.println(
                """
                        select *
                        from TCR_USERS u
                        where u.status = 'happy'
                             """
        );
    }
}
