import java.util.Scanner;

public class TravelAgency {
    static String nama;
    static double totalprice = 0;
    static double subPrice = 0;

    public static void Package() {
        System.out.println("\n1. Osaka, Jepun             RM3899.pax");
        System.out.println("2. Taiwan                   RM2999/pax");
        System.out.println("3. Seoul + Nami, Korea      RM2599/pax");
        System.out.println("4. Ho Chi Minh, Vietnam     RM1599/pax");
        System.out.println("5. Done\n");

    }

    public static double subPrice(double price, int pax) {
        double subprice = price * pax;
        totalprice += subprice;

        return subprice;

    }

    public static void display() {
        System.out.println("Total price: " + totalprice);

    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("\n masukkan nama: ");
        nama = inp.nextLine();
        Package();

        System.out.print("Enter your package: ");
        int pakej = inp.nextInt();

        System.out.print("Enter you pax: ");
        int pax = inp.nextInt();

        int price;
        String continueChoice;

        do {
            switch (pakej) {
                case 1:
                    price = 3899;
                    subPrice(price, pax);
                    break;

                case 2:
                    price = 2999;
                    subPrice(price, pax);
                    break;

                case 3:
                    price = 2599;
                    subPrice(price, pax);
                    break;

                case 4:
                    price = 1599;
                    subPrice(price, pax);
                    break;

                default:
                    System.out.println("Thank you");
                    break;
            }

            System.out.println("Do you want to continue? (y/n)");
            continueChoice = inp.next();

            if (continueChoice.equalsIgnoreCase("y")) {
                Package();
                System.out.print("Enter your package: ");
                pakej = inp.nextInt();

                System.out.print("Enter you pax: ");
                pax = inp.nextInt();
            }

        } while (continueChoice.equalsIgnoreCase("y"));

        System.out.println("\nNama: " + nama);
        // System.out.println("Harga: " + totalprice);
        display();
        System.out.println("Thanks, Happy Travel!");

    }

}
