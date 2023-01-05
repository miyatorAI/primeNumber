import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("SELECT Mode\n JUDGE or CREATE");
        final Mode mode = Mode.valueOf(scan.nextLine());
        final PrimeNumberMethods methods = new PrimeNumberMethods();
        switch (mode) {
            case JUDGE -> {
                System.out.println("input Number");
                System.out.println(methods.isPrimeNumber(scan.nextLong()));
            }
            case CREATE -> {
                System.out.println("input Number. \n" +
                        "I create a prime number less than or equal to the entered value");
                System.out.println(methods.createPrimeNumber(scan.nextLong()));
            }
            default -> {
            }
        }
    }

    private enum Mode {
        JUDGE,
        CREATE
    }
}
