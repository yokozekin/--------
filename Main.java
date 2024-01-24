import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("案件を教えてください：");
        String str = stdIn.next();

        switch (str) {

            case ("請負業務"):
                System.out.println(str);
                break;

            case ("自社商材"):
                System.out.println(str);
                break;

            default:
                System.out.println("どちらにも対応していません");
        }
    }
}
