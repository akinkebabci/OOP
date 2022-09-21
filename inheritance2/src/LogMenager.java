public class LogMenager {
    public void log(int logTpe){
        if (logTpe==1){
            System.out.println("DataBaseye Loglandı");
        }else if (logTpe == 2){
            System.out.println("File Loglandı");
        }else {
            System.out.println("Email Gönderildi");
        }
    }
}
//1 - DATA base
//2 - File base
//3 - Email base
