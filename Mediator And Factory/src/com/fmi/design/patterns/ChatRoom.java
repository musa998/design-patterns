package com.fmi.design.patterns;

public class ChatRoom extends ChatRoomBase {
    @Override
    protected void send(String message, ChatUser sender) {
        for (var visitor : activeVisitors) {
            if (visitor != sender){
                visitor.receive(message);
            }
            
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
