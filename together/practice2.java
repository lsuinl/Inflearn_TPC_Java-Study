package together;
import together_plus.BookVO;

public class practice2 {
    public static void main(String[] args){
        BookVO b1=new BookVO();

        System.out.print(b1.title+"\t");
        System.out.print(b1.price+"\t");
        System.out.print(b1.company+"\t");
        System.out.println(b1.page+"\t");
        
        BookVO b2=new BookVO("Python",18000, "솨인", 800);

        System.out.print(b2.title+"\t");
        System.out.print(b2.price+"\t");
        System.out.print(b2.company+"\t");
    System.out.print(b2.page+"\t");
    }
}
