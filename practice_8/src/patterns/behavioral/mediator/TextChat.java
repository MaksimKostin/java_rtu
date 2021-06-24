package patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class TextChat implements Chat {
    User admin;
    List<User> users = new ArrayList();

    public void setAdmin(User admin) {
        this.admin = admin;
        this.users.add(admin);
    }

    public void addUserToChat(User user){
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u: users) {
            if (u != user) {
                u.getMessage(message);
            }
        }
    }
}
