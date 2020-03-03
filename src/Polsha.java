import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;


public class Polsha {

    public static void main(String[] arr) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите математическое выражение : ");
        String str = in.nextLine();
        str = Calculating.StringToPolsk(str);
        System.out.print("Запись в польской нотации : ");
        System.out.println(str);
        System.out.println("Результат : "+Calculating.exchangeToDouble(str));
    }
}
