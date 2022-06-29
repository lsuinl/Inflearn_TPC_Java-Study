package together;

import together_plus.TV;
import together_plus.interfac;

public class week2pri2 {
    public static void main(String[] args){
        //interfac로 tv클래스를 구동하시오
        interfac i = new TV();
        for(int r=0;r<40;r++){
            i.chUp();
        }
        i.chDown();
        i.internet();
    }
}
