package together_plus;

public class radio implements interfac {
    
    @Override
    public void chUp(){
        System.out.println("radio의 채널이 올라간다.");
    }

    @Override
    public void chDown(){
        System.out.println("radio의 채널이 내려간다.");
    }
    @Override
    public void internet(){
        System.out.println("radio는 인터넷이 지원되지 않는다.");
    }
}
