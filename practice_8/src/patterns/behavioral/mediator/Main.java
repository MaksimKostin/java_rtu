package patterns.behavioral.mediator;

public class Main {

    public static void main(String[] args) {
        TextChat IKBO2419 = new TextChat();

        User admin = new Admin(IKBO2419, "Admin");
        User user1 = new SimpleUser(IKBO2419, "Lashkov");
        User user2 = new SimpleUser(IKBO2419, "Artemov");
        User user3 = new SimpleUser(IKBO2419, "Kalashnikov");

        IKBO2419.setAdmin(admin);
        IKBO2419.addUserToChat(user1);
        IKBO2419.addUserToChat(user2);
        IKBO2419.addUserToChat(user3);

        admin.sendMessage("Всем привет!) Завтра выходной ЧИЛЛИМ");
        System.out.println("=========");
        user1.sendMessage("Принял");
    }
}
