package together;

import together_plus.inflearn;

public class practice3 {
    public static void main(String[] args){
        inflearn inf = new inflearn();
        inf.tpc();
        inflearn.java();
        // inflearn.java(); //위에서 inf 선언 안하면 이렇게 씀

        //java api 생성사 private
        //System sys=new System();
        System.out.println("출력");
        //Math m = new Math();
        int v=Math.max(10, 20);
        System.out.println(v);
    }
}
