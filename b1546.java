import java.util.Scanner;
public class b1546 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double max=0, result=0;
        int n=sc.nextInt();
        int[] suin= new int[n];

        for(int i=0; i<n;i++){
            suin[i]=sc.nextInt();
            max= max>suin[i] ? max:suin[i];
        }
        for(int e: suin){ //유의, 값을 초기화할 때는 안 쓰는 것이 좋음
            result+=e/max*100;
        }
        System.out.println(result/n);
        sc.close();
    }
}
