import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Vvedite nomer mesyatsa:" );
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        if (number >= 1 && number <= 12) {
            System.out.println(month[number - 1]);
        }else {
            System.out.println("Vveden nevernyj parametr.");
        }
    }
}

