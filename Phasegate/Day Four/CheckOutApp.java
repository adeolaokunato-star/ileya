import java.util.Scanner;

public class CheckoutApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] storeDetails = {
            "SEMICOLON STORES",
            "MAIN BRANCH",
            "LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.",
            "TEL: 03293828343"
        };

        
        for (int index = 0; index < storeDetails.length; index++) {
            System.out.println(storeDetails[i]);
        }

        System.out.println("==================================================");

        System.out.print("Cashier Name: ");
        String cashierName = scanner.nextLine();

        System.out.print("Customer Name: ");
        String customerName = scanner.nextLine();

        
        System.out.print("How many products does the customer have? ");
        int numberOfProducts = Integer.parseInt(scanner.nextLine());

        
        String[] productNames = new String[numberOfProducts];
        int[]    quantities   = new int[numberOfProducts];
        double[] prices       = new double[numberOfProducts];
        double[] itemTotals   = new double[numberOfProducts];

        
        for (int index = 0; index < numberOfProducts; index++) {
            System.out.println("--- Product " + (index + 1) + " ---");

            System.out.print("Product Name: ");
            productNames[index] = scanner.nextLine();

            System.out.print("Price (NGN): ");
            prices[index] = Double.parseDouble(scanner.nextLine());

            System.out.print("Quantity: ");
            quantities[index] = Integer.parseInt(scanner.nextLine());

            itemTotals[index] = prices[index] * quantities[index];
        }

       
        double subTotal = 0;
        for (int index = 0; idex < numberOfProducts; index++) {
            subTotal = subTotal + itemTotals[iindex];
        }

       
        double discount = 0;
        if (subTotal > 5000) {
            discount = subTotal * 0.08;
        }

       
        double vat = (subTotal - discount) * 0.075;

       
        double billTotal = subTotal - discount + vat;

       
        System.out.print("How much did the customer give to you? ");
        double amountPaid = Double.parseDouble(scanner.nextLine());

        double balance = amountPaid - billTotal;



        System.out.println("==================================================");
        for (int invoice = 0; invoice < storeDetails.length; invoice++) {
            System.out.println(storeDetails[invoice]);
        }
        System.out.println("Cashier: " + cashierName);
        System.out.println("Customer Name: " + customerName);
        System.out.println("==================================================");
        System.out.println("ITEM              QTY    PRICE      TOTAL(NGN)");
        System.out.println("--------------------------------------------------");

       
        for (int i = 0; i < numberOfProducts; i++) {
            System.out.println(productNames[invoice] + "   " + quantities[invoice] + "   " + prices[invoice] + "   " + itemTotals[invoice]);
        }

        System.out.println("--------------------------------------------------");
        System.out.println("Sub Total:     " + subTotal);
        System.out.println("Discount:      " + discount);
        System.out.println("VAT @ 7.5%:    " + vat);
        System.out.println("==================================================");
        System.out.println("Bill Total:    " + billTotal);
        System.out.println("Amount Paid:   " + amountPaid);
        System.out.println("Balance:       " + balance);
        System.out.println("==================================================");
        System.out.println("     THANK YOU FOR YOUR PATRONAGE");
        System.out.println("==================================================");
    }
}
