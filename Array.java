import java.util.Scanner;
//you're hroh

public class Array {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=in.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
                System.out.print("a" + (i + 1) + "=");
                ar[i]=in.nextInt();
        }
        for(int i=0;i<n;i++)
                System.out.print(ar[i]+" ");

        System.out.println();

        for(int i=0;i<n;i++)
            System.out.println(ar[i]+" ");



    }
}
