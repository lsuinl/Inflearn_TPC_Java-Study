package together;
import together_plus.BookVO;

public class practice1 {
    public static void main(String[] args){
        //책 1권을 저장하기 위한 객체 생성
        BookVO b = new BookVO();
        b.title="파이썬";
        b.price=16000;
        b.company="에어콘";
        b.page=700;

        System.out.print(b.title+"\t");
        System.out.print(b.price+"\t");
        System.out.print(b.company+"\t");
        System.out.print(b.page+"\t");

    }
}
