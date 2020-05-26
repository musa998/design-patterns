package com.fmi.design.patterns;

public class Main {

    public static void main(String[] args) {

        ChatUserFactory factory = new ChatUserFactory();

        ChatUser gosho = factory.getChatUser("User", "Gosho");
        ChatUser pesho = factory.getChatUser("User", "Pesho");
        ChatUser stamat = factory.getChatUser("User", "Stamat");

        ChatRoom chatRoom1 = new ChatRoom();
        gosho.enter(chatRoom1);
        pesho.enter(chatRoom1);
        stamat.enter(chatRoom1);

        gosho.send("Hello everyone");
        pesho.send("Welcome to the chatroom1 Gosho");
        stamat.send("Hello Gosho nice to meet you");

        gosho.send("addBot");
        stamat.send("cat");
        pesho.send("Then I wont use this word  ");
        pesho.send("addBot");

    }
}
