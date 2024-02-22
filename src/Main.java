import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter how many cents per kilometer of your vehicle: ");
        double total = scanner.nextDouble();

        System.out.println("please way : ");
        double km = scanner.nextDouble();

        System.out.println("Auto Fuel: "  +  (total * km) + "USD...");
        System.out.println("-we will waiting you...");


    }
}