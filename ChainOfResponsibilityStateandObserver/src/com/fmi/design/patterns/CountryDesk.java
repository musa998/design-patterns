package com.fmi.design.patterns;

public class CountryDesk extends DeliveryApprover {

    @Override
    public void proccesRequest(String location) {
        if (location.equalsIgnoreCase("national")) {
            System.out.println("Country purchase approved by Country Desk");
            this.setWorkOnPackageState();
            notifyObservers();
        } else if (_successor != null) {
            _successor.proccesRequest(location);
            this.setWaitingCustomerState();
        }
    }
}




