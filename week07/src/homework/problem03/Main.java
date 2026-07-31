package homework.problem03;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();

        User u1 = new FreeUser("철수");
        User u2 = new PremiumUser("영희");
        User u3 = new FamilyUser("민수");

        users.add(u1);
        users.add(u2);
        users.add(u3);

        for (User user : users) {
            user.listen();
        }
    }
}
