import java.util.Scanner;
public class CheckoutApp{
    public static void main(String[] args){
        Scanner yomi = new Scanner(System.in);
        String[] storeDetails = {
            "SEMICOLON STORES",
            "MAIN BRANCH",
            "LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.",
            "TEL: 03293828343"
        };
        for (int index = 0; index < storeDetails.length; index++){
            System.out.println(storeDetails[index]);
        }
        System.out.println("==================================================");
        System.out.print("Cashier Name: ");
        String cashierName = yomi.nextLine();
        System.out.print("Customer Name: ");
        String customerName = yomi.nextLine();
        System.out.print("How many products does the customer have?: ");
        int numberOfProducts = yomi.nextInt();
        String[] productNames = new String[numberOfProducts];
        int[]    quantities   = new int[numberOfProducts];
        double[] prices       = new double[numberOfProducts];
        double[] itemTotals   = new double[numberOfProducts];        
        for (int index = 0; index < numberOfProducts; index++){
            System.out.println("--- Product " + (index + 1) + " ---");
            System.out.print("Product Name: ");
            productNames[index] = yomi.nextLine();
            System.out.print("Price: ");
            prices[index] = yomi.nextInt();
            System.out.print("Quantity: ");
            quantities[index] = yomi.nextInt();
            itemTotals[index] = prices[index] * quantities[index];
        }
        double subTotal = 0;
        for (int index = 0; index < numberOfProducts; index++){
            subTotal = subTotal + itemTotals[index];
        }
        double discount = 0;
        if (subTotal > 5000){
            discount = subTotal * 0.08;
        }
        double vat = (subTotal - discount) * 0.075;
        double billTotal = subTotal - discount + vat;
        System.out.print("How much did the customer give to you?: ");
        double amountPaid = yomi.nextInt();
        double balance = amountPaid - billTotal;
        System.out.println("==================================================");
        for (int invoice = 0; invoice < storeDetails.length; invoice++){
            System.out.println(storeDetails[invoice]);
        }
        System.out.println("Cashier: " + cashierName);
        System.out.println("Customer Name: " + customerName);
        System.out.println("==================================================");
        System.out.println("ITEM  QTY    PRICE      TOTAL");
        System.out.println("--------------------------------------------------");
        for (int invoice = 0; invoice < numberOfProducts; invoice++) {
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
        System.out.println("=====================================================================");
        System.out.println("     THANK YOU FOR YOUR PATRONAGE YOMI GREETS AND COME AGAIN");
        System.out.println("=============================================================e");
    }
}
