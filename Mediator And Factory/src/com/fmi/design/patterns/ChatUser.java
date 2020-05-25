package com.fmi.design.patterns;

public abstract class ChatUser {

    protected ChatRoomBase mediator;
    protected String username;

    public void send(String message) {
        if (message.equalsIgnoreCase("addBot")){
            addBot();
        }
        System.out.println("Colleague - "+ username +  " --> " + message);
        mediator.send(message, this);
    }
    public abstract void receive(String message);

    public void enter(ChatRoomBase mediator){
        if (this.mediator != null){
            leave();
        }
        mediator.register(this);
        this.mediator = mediator;
    }
    public void leave(){
        if (this.mediator != null){
            this.mediator.unRegister(this);
            this.mediator = null;
        }
    }
    private void addBot(){
            for (ChatUser activeVisitor : mediator.activeVisitors) {
                if (activeVisitor instanceof Bot){
                    return;
                }
            }
            mediator.register(new Bot("ChatBot"));
    }
}
