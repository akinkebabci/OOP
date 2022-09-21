public class Main {
    public static void main(String[] args) {
        IndividualCustomer akin = new IndividualCustomer();
        akin.customerNumber ="12345";

        CorporateCustomer hassanGida = new CorporateCustomer();
        hassanGida.customerNumber ="785336";

        SendicaCustomer isges = new SendicaCustomer();
        isges.customerNumber = "9999";

        CustomerManager customerManager = new CustomerManager();
        //customerManager.add(hassanGida);
        //customerManager.add(akin);
        //customerManager.add(isges);

        //Hepsini bir arrayle çoklu larak ta ekleyebiliriz
        Customer[] customers = {akin,hassanGida,isges};
        customerManager.addMultiple(customers);


    }
}