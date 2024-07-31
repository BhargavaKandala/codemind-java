import java.util.*;

public class Demo{
    public static void main(String[] args)
    {
        double a,b;
        Scanner read = new Scanner(System.in);
        a = read.nextInt();
        b = read.nextInt();
        double c = Math.sqrt(Math.pow(a,2) + Math.pow(b ,2));
        System.out.printf("%.2f", c);
    }
}