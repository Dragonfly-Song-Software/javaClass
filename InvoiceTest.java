
// Fig. 3.9: AccountTest.java
// Inputting and outputting floating-point numbers with Account objects.

import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice Inv = new Invoice("HD_1001", "Hard Drive", 23, 320.00);
        //detail all the details of the Invoice
        System.out.println("Part Number:  " + Inv.getPartNumber());
        System.out.println("Part Desciption:  " + Inv.getPartDesc());
        System.out.println("Part Qty:  " + Inv.getQty());
        System.out.println("Part Price:  $" + Inv.getPrice());
        System.out.println("Invoice Total:  $" + Inv.getInvoiceAmount());
    }//end InvoiceTest
}
