import java.util.Scanner;

public class MaximumLengthEvenSubarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int s=0;
            int c=0;
            for (int j = 1; j <=n ; j++) {
                s=s+j;
                c=c+1;
            }
            if(s%2==0){
                System.out.println(c);
            }
            else{
                int d=s%2;
                c=c-d;
                System.out.println(c);
            }
        }
    }
}
