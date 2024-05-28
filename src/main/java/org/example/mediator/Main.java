package org.example.mediator;

public class Main {
    public static void main(String[] args) {
        ChatMediator groupChat = new ChatMediatorImpl();
        User user1 = new UserImpl("Ionut", groupChat);
        User user2 = new UserImpl("Mario", groupChat);
        User user3 = new UserImpl("Gigi", groupChat);
        User user4 = new UserImpl("Cezar", groupChat);

        groupChat.addUser(user1);
        groupChat.addUser(user2);
        groupChat.addUser(user3);
        groupChat.addUser(user4);

        user1.sendMessage("Salut");
    }
}
