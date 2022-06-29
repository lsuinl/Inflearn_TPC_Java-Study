package together_plus;

public class javamysql implements dbconnect{
    @Override
    public void getconnction(String url, String user, String password){
        System.out.println("MySQL DB가 접속됩니다.");
    }
}
