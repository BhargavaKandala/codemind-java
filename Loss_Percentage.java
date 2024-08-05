import java.util.*;

public class Hello{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        float a ,b;
        a = read.nextInt();
        b = read.nextInt();
        float loss = a - b;
        float lossperc = (loss * 100)/a;
        System.out.printf("%.2f",lossperc);
    }
}