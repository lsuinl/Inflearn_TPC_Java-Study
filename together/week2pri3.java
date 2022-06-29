package together;
import together_plus.dbconnect;
import together_plus.javamysql;
import together_plus.javaoracle;

public class week2pri3 {
    public static void main(String[] args){
        //oracle, mysql -> orivar class
        dbconnect conn=new javaoracle();
        conn.getconnction("url", "bit", "12345");

        conn= new javamysql();
        conn.getconnction("url", "root", "ABCDEF");
    }
}
