package com.fmi.design.patterns;

public class ChatRoom extends ChatRoomBase {
    ChatUserFactory factory = new ChatUserFactory();
    @Override
    protected void send(String message, ChatUser sender) {
        // Using this object because java.util.ConcurrentModificationException
        ChatUser userToRemove = null;

        if (message.equalsIgnoreCase("addBot") &&
                !activeVisitors.stream().anyMatch(v -> v instanceof Bot)) {

            register(new Bot("ChatBot"));
        }
        for (var visitor : activeVisitors) {
            if (visitor != sender){
                visitor.receive(message);
            }
            if (visitor instanceof Bot){
                if (message.equalsIgnoreCase("cat")){
                    System.out.println(visitor.username +  " --> " + "Word 'cat' is not allowed here");
                    send("Word 'cat' is not allowed here", visitor);
                    userToRemove = sender;
                }
            }

        }
        if (userToRemove != null){
            unRegister(userToRemove);
        }
    }

    @Override
    protected void register(ChatUser user) {
        activeVisitors.add(user);
    }

    @Override
    protected void unRegister(ChatUser user) {
        activeVisitors.remove(user);
    }
}
