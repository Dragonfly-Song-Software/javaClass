/**
 * Created by patriciabryant on 11/15/16.
 * Create a calss called invoice that a hardware store might use to represent an invoice for an item sold at the store.
 * An Invoice should include 4 pieces of infoamtion as instance variables -- a part number (type: String), a part desciption (type:String)
 *
 */
public class Invoice
    {
    private String partNumber; // instance variable
    private String partDesc; // instance variable
    private Integer qty; // instance variable
    private Double price; // instance variable

        //parameterized constructor implementation
        public Invoice(String aPartNumber, String aPartDesc, Integer aQty, Double aPrice) {
            setPartDesc(aPartDesc);
            setPartNumber(aPartNumber);
            setPrice(aPrice);
            setQty(aQty);
        }

        public String getPartNumber()
        {
            return partNumber;
        }
        public String getPartDesc()
        {
            return partDesc;
        }
        public Integer getQty()
        {
            return getQty();
        }
        public Double getPrice()
        {
            return getPrice();
        }

        public void setPartDesc(String aPartDesc) {
            this.partDesc = partDesc;
        }

        public void setPartNumber(String aPartNumber) {
            this.partNumber = partNumber;
        }

        public void setPrice(Double aPrice) {
            if(aPrice > 0)
                price = aPrice;
            else
                price = 0.0;
        }

        public void setQty(Integer aQty) {
            if(aQty >0)
                qty=aQty;
            else
                qty= 0;
        }

        //calculate amount of invoice
        public Double getInvoiceAmount()
        {
        return qty * price;
        }//end method getInvoiceAmount'

    }
