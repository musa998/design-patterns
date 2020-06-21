package com.fmi.design.patterns;

public class InternationlDesk extends DeliveryApprover {

    @Override
    public void proccesRequest(String location) {
        if(location.equalsIgnoreCase("international")){
            System.out.println("International purchase approved by International Desk");
            setWorkOnPackageState();
            notifyObservers();
        }
        else if(_successor != null){
            _successor.proccesRequest(location);
            this.setWaitingCustomerState();
        }
    }

}
