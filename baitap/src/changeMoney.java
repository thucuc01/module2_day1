import java.util.Scanner;

public class changeMoney {
    public static void main(String[] args) {
        double usd;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap gia tri usd : ");
        usd=scanner.nextDouble();
        double vnd=usd*23000;
        System.out.println("Gia tri vnd= " +vnd);

    }
}
