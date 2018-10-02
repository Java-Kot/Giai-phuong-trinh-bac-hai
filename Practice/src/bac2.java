import java.util.Scanner;

public class bac2 {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số a:");
        int a = sc.nextInt();
        System.out.println("Nhập vào số b");
        int b = sc.nextInt();
        System.out.println("Nhập vào số c");
        int c = sc.nextInt();
        if (a == 0) {
            System.out.println("Tạm thời chưa biết phương trình bậc 1 là cái gì !!! Oke !");
        } else {
            System.out.println("Nói chung đến đây cũng không biết giải toán luôn !");
        }
    }
}
