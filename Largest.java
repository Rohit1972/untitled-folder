import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();

        //Find the Largest of the 3 Numbers
        int max=a;
        if (b>max) {
            max=b;
        }
        if (c>max) {
            max=c;
        }
        System.out.println("The maximum between these three numbers are: " + max);
        in.close();
    }
    
}
