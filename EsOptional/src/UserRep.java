import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRep {
    private List<User> users = new ArrayList<>();
    public UserRep() {
        users.add(new User(1, "Marco"));
        users.add(new User(2, "Simone"));
        users.add(new User(3, "Andrea"));
    }

    public Optional<User> findById(int id) {
        for (User u : users) {
            if (u.getId() == id) {
                return Optional.of(u);
            }
        }
        return Optional.empty();
    }
}
