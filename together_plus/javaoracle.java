package together_plus;

public class javaoracle implements dbconnect{
    @Override
    public void getconnction(String url, String user, String password){
        System.out.println("Oracle DB가 접속됩니다.");
    }
}
