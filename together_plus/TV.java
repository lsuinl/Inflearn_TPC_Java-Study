package together_plus;

public class TV implements interfac {
    int currCH=70;
    @Override
    public void chUp(){
        if(currCH<interfac.MAXCH){
            currCH++;
        System.out.println("TV의 채널이 올라간다.:"+currCH);
        }
        else{
            currCH=1;
            System.out.println("TV의 채널이 올라간ㄷㅏ.:"+currCH);
        }
    }

    @Override
    public void chDown(){
        if(currCH>interfac.MINCH){
            currCH--;
            System.out.println("TV의 채널이 내려간다."+currCH);
        }
        else{
            currCH=100;
            System.out.println("TV의 채널이 내려간ㄷㅏ.:"+currCH);
        }
    }
    @Override
    public void internet(){
        System.out.println("인터넷이 된다.");
    }
}
