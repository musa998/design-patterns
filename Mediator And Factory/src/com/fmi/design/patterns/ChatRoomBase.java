package com.fmi.design.patterns;

import java.util.ArrayList;
import java.util.List;

/// Base mediator class
public abstract class ChatRoomBase {
    protected List<ChatUser> activeVisitors = new ArrayList<ChatUser>();
    protected abstract void send(String message, ChatUser sender);
    protected abstract void register(ChatUser user);
    protected abstract void unRegister(ChatUser user);
}
