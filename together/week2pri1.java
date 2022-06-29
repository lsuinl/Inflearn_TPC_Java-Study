package together;

import together_plus.TV;
import together_plus.interfac;
import together_plus.radio;

public class week2pri1 {
    public static void main(String[] args){
        interfac i =new TV();
        i.chUp();
        i.chDown();
        i.internet();
        
        i=new radio();
        i.chUp();
        i.chDown();
        i.internet();
    }
}
