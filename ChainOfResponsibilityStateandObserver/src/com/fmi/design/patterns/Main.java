package com.fmi.design.patterns;

public class Main {

    public static void main(String[] args) {

        DeliveryApprover town =  new TownDesk();
        DeliveryApprover country = new CountryDesk();
        DeliveryApprover international = new InternationlDesk();

        town.setSuccessor(country);
        country.setSuccessor(international);

        Observer packageCarryBoy = new PackageCarryBoy();

        town.subscribe(packageCarryBoy);
        country.subscribe(packageCarryBoy);
        international.subscribe(packageCarryBoy);

        town.proccesRequest("national");
    }
}
