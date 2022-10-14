public class Main {
    public static void main(String[] args) {
        Logger[] loggers = {new DataBaseLogger(),new SmsLogger(),new FileLogger()};
        Customer customer = new Customer(1,"Akın","Kebabcı");
        CustomerMenager customerMenager = new CustomerMenager(loggers);
        customerMenager.add(customer);

    }
}