package com.fmi.design.patterns;

public class ChatUserFactory {

    public ChatUser getChatUser(String chatUserType, String username){
        if(chatUserType == null){
            return null;
        }
        if(chatUserType.equalsIgnoreCase("User")){
            return new User(username);

        } else if(chatUserType.equalsIgnoreCase("Bot")){
            return new Bot("ChatBot");
        }
        return null;
    }
}
