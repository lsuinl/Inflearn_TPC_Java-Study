package together_plus;

public interface interfac { //객체생성x; interfac i =new interfac();
    //final static(상수)를 사용가능
    public int MAXCH=100; //interfac.MAXCH
    public final static int MINCH=1; //interfac.MINCH

    //추상메서드
    public void chUp();
    public void chDown();
    public void internet();

}
