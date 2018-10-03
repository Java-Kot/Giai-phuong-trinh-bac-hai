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
            if (b == 0) {
                System.out.print("Phương trình không chính xác!");
            } else {
                float ptb1 = (-c) / b;
            }
        } else {
            double delta = Math.pow(b,2) - 4 * a * c;
            double nghiem1 = -b + Math.sqrt(delta) / 2 * a;
            double nghiem2 = -b - Math.sqrt(delta) / 2 * a;
            System.out.println("Nghiệm thứ nhất là : " + nghiem1 + " Nghiệm thứ 2 là " + nghiem2);
        }
    }
}
