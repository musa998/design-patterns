package com.fmi.design.patterns;

 // abstract handler class
public abstract class DeliveryApprover extends Observable{

    protected DeliveryApprover _successor;
    protected State waitingCustomerState;
    protected State workOnPackageState;
    protected State currentState;

     public DeliveryApprover() {
         waitingCustomerState = new WaitingCustomerState(this);
         workOnPackageState = new WorkOnPackageState(this);
         currentState = waitingCustomerState;
     }

     public abstract void proccesRequest(String location);

     public State getWaitingCustomerState() {
         return waitingCustomerState;
     }

     public void setWaitingCustomerState() {
         currentState.waitCustomer();
     }

     public State getWorkOnPackageState() {
         return workOnPackageState;
     }

     public void setWorkOnPackageState() {
         currentState.workOnPackage();
     }

     public State getCurrentState() {
         return currentState;
     }

     public void setCurrentState(State state) {
         this.currentState = state;
     }

     public void setSuccessor(DeliveryApprover successor) {
         this._successor = successor;
     }

}
