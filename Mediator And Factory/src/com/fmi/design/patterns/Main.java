package com.fmi.design.patterns;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ChatUserFactory factory = new ChatUserFactory();

        ChatUser gosho = factory.getChatUser("User", "Gosho");
        ChatUser pesho = factory.getChatUser("User", "Pesho");
        ChatUser petkan = factory.getChatUser("User", "Petkan");

        ChatRoom chatRoom1 = new ChatRoom();
        gosho.enter(chatRoom1);
        pesho.enter(chatRoom1);
        petkan.enter(chatRoom1);

        gosho.send("Hello everyone");
        pesho.send("Welcome to the chatroom1 Gosho");
        petkan.send("Hello Gosho nice to meet you");

        gosho.send("addBot");
        petkan.send("cat");

    }
}
