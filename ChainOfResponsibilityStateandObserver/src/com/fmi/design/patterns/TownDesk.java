package com.fmi.design.patterns;

public class TownDesk extends DeliveryApprover {

    @Override
    public void proccesRequest(String location) {
        if(location.equalsIgnoreCase("Town")){
            System.out.println("Town purchase approved by Town Desk");
            this.setWorkOnPackageState();
            notifyObservers();
        }
        else if (_successor != null) {
            _successor.proccesRequest(location);
            this.setWaitingCustomerState();
        }
    }
}
