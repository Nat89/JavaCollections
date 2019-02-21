
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserController {
   private List<User> registered_users = new ArrayList<>();
    private Set<String> registered_logins = new HashSet<>();

    public boolean addUser (String login, String password) {
        if(registered_logins.contains(login)) {
            System.out.println("Login" +login+ "istnieje w bazie");
            return false;
        }

        User u = new User(login, password);
        registered_logins.add(login);
        registered_users.add(u);
        System.out.println("Zarejestrowano użytkownika");
        return true;

    }
    public void showUsers() {
        registered_users.forEach(user -> System.out.println(user));
    }
}
