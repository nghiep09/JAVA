import java.util.Scanner;

public class cdtien_te {
    public static void main(String[] args) {
        double vnd=23000;
        double usd;
        System.out.println("nhập số tiền usd:");
        Scanner scanner=new Scanner(System.in);
        usd=scanner.nextDouble();
        double quydoi=usd*vnd;
        System.out.println("số tiền là: "+quydoi);
    }
}
