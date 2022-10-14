public class CustomerMenager {
    private Logger[] loggers;
    public CustomerMenager(Logger[] loggers) {
        this.loggers = loggers;

    }



    public void add(Customer customer) {
        //Yarı Bağımlıyız
        System.out.println("Müşteri Eklendi " + customer.getFirstName());

        Utils.runLoggers(loggers,customer.getFirstName());


//        Katı Bağlılık     Heryerde Newlemek zorunda kalırız
//        DataBaseLogger dataBaseLogger = new DataBaseLogger();
//        dataBaseLogger.log(customer.getFirstName() + " Veri Tabanına Loglandı");
    }

    public void delete(Customer customer) {
        System.out.println("Müşteri Silindi " + customer.getFirstName());
        Utils.runLoggers(loggers,customer.getFirstName()); //for dongusu Static olarak tanımaldık New yazmaya gerek kalmadı

//        Katı Bağlılık     Heryerde Newlemek zorunda Kalırız
//        DataBaseLogger dataBaseLogger = new DataBaseLogger();
//        dataBaseLogger.log(customer.getFirstName() + " Veri Tabanına Loglandı");
    }
}
