package com.fmi.design.patterns;

public class WorkOnPackageState implements State {

    DeliveryApprover deliveryApprover;

    public WorkOnPackageState(DeliveryApprover deliveryApprover) {
        this.deliveryApprover = deliveryApprover;
    }

    @Override
    public void workOnPackage() {
        System.out.println("Preparing package");
        deliveryApprover.setCurrentState(deliveryApprover.getWorkOnPackageState());
    }

    @Override
    public void waitCustomer() {
        System.out.println("Waiting for customer");
        deliveryApprover.setCurrentState(deliveryApprover.getWaitingCustomerState());
    }
}
