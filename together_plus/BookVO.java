package together_plus;

//책->제목,가격,출판사, 페이지수 ...
public class BookVO {
    public String title;
    public int price;
    public String company;
    public int page;
    //디폴트생성자메서드(생략)
    public BookVO(){
        //초기화작업
        title="자바";
        price=14000;
        company="수인";
        page=780;
    }
    //생서앚 메서드의 중복정의(overloading)
    public BookVO(String title, int price, String company, int page){
        this.title=title;
        this.price=price;
        this.company=company;
        this.page=page;
    }
}
