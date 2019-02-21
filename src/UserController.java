
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

public class UserController {
    private List<User> registered_users = new ArrayList<>();
    private Set<String> registered_logins = new HashSet<>();

    public boolean addUser(String login, String password) {
        if (registered_logins.contains(login)) {
            System.out.println("Login" + login + "istnieje w bazie");
            return false;
        }

        User u = new User(login, password);
        registered_logins.add(login);
        registered_users.add(u);
        System.out.println("Zarejestrowano użytkownika");
        return true;
    }

    public boolean deleteUser(String login_delete) {
        for (int i = 0; i < registered_users.size(); i++) {
            if (registered_users.get(i).getLogin().equals(login_delete)) {
                registered_users.remove(registered_users.get(i));
                registered_logins.remove(login_delete);
                System.out.println("Usunięto uzytkownika: " + login_delete);
                return true;
            }
        }
        System.out.println("Nie ma takiego użytkownika: " + login_delete);
        return false;
    }
    public boolean passwordCheck(String newPassword) {
        // długość hasła co najmniej 6 znaków a maksymalnie 32 znaki
        String template = ".(6,32)";
        return Pattern.matches(template, newPassword);
    }
    public boolean changePassword(String login, String oldPassword, String newPassword1, String newPassword2) {
        for (int i = 0; i < registered_users.size(); i++) {
            // szukamy usera po loginie
            if (registered_users.get(i).getLogin().equals(login)) {
                // sprawdzamy podobienstwo hasel
                if (newPassword1.equals(newPassword2) && !newPassword1.equals(oldPassword)) {
                    // sprawdzamy poprawnosc nowego hasla
                    if(passwordCheck(newPassword1)) {
                    registered_users.get(i).setPassword((newPassword1));
                    System.out.println("Hasło zostało zmienione");
                    return true;
                }
                    System.out.println("Nowe hasła są błedne!");
                    return false;
                }
                System.out.println("Podane hasła są różne lub takie same jak stare hasło");
                return false;
            }
        }
        return  false;
    }
        public void showUsers(){
            registered_users.forEach(user -> System.out.println(user));
        }

    }
