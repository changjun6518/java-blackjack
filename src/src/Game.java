import java.util.Scanner;

public class Game {
    public void start() {

    }

    public User inputUser() {
        Scanner sc = new Scanner(System.in);
        User user = new User(sc.next());
        return user;
    }


}
