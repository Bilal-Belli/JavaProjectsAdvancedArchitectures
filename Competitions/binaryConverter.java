import java.util.Scanner;

//your code goes here


public class Program {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Converter my_function = new Converter();
        System.out.print(my_function.toBinary(x));
    }
}
class Converter {
    public static String binary="";
    public static String toBinary(int num){
        while(num > 0) {
                    binary = (num%2)+binary;
                    num /= 2;
                    }
        return binary;
    }
}
