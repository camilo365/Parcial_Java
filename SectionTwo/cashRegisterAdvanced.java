import java.util.Scanner;

class cashRegisterAdvanced {

    static int[] bills = {100000, 50000, 20000, 10000, 5000, 2000};
    static int[] coins = {1000, 500, 200, 100, 50};

    public static void calculateChange(double totalPurchase, double moneyDelivered
    ) {
        if (moneyDelivered < totalPurchase) {
            System.out.println("The money delivered is insufficient.");
            return;
        }

        double change = moneyDelivered - totalPurchase;
        System.out.printf("The total change to be returned is: %.0f pesos\n", change);

        int cambioCents = (int) Math.round(change);

        System.out.println("\nBillets to be returned:");
        for (int billete : bills) {
            int cantidadBilletes = cambioCents / billete;
            if (cantidadBilletes > 0) {
                System.out.println(cantidadBilletes + " billets de " + billete + " pesos");
            }
            cambioCents %= billete;
        }

        System.out.println("\ncoins to be returned:");
        for (int coins : coins) {
            int amountCoins = cambioCents / coins;
            if (amountCoins > 0) {
                System.out.println(amountCoins + " coins of " + coins + " pesos");
            }
            cambioCents %= coins;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar el total de la compra y el monto entregado
        System.out.print("Enter the total purchase: ");
        double totalPurchase = sc.nextDouble();

        System.out.print("Enter the amount delivered by the client: ");
        double amountDelivered = sc.nextDouble();


        calculateChange(totalPurchase, amountDelivered);

        sc.close();
    }
}


