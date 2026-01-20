import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        UserRep repository = new UserRep();

        for (int i = 1; i <= 10; i++) {

            Optional<User> userOpt = repository.findById(i);

            userOpt.ifPresentOrElse(
                    u -> System.out.println("Utente trovato " + u.getName()),
                    () -> System.out.println("Utente non trovato")
            );
        }
    }
}
