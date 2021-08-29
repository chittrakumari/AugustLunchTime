import java.util.Scanner;

public class ProgrammingLanguage {
    public static  void  main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int c=0;
            int a=sc.nextInt();
            int b=sc.nextInt();
            int a1=sc.nextInt();
            int b1=sc.nextInt();
            int a2=sc.nextInt();
            int b2=sc.nextInt();
            if((a==a1 || b==a1) && (a==b1 || b==b1)){
                c=1;
                System.out.println(c);

            }
            else if((a==a2|| b==a2) && (a==b2 || b==b2)){
                c=2;
                System.out.println(c);

            }
            else{
                System.out.println(c);
            }
        }
    }
}
