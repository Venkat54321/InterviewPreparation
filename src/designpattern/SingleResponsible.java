package designpattern;

public class SingleResponsible {


}

class Invoice{
    double price;
    String product;

    public double calculateInvoice(){
        return this.price *5;
    }

    public void printInvoice(){
        //
    }
    public void saveToDB(){
        //
    }
}

/**
 * SOLUTION
 */
class InvoiceDao{
    Invoice invoice;
    public  InvoiceDao(Invoice invoice){
        this.invoice = invoice;
    }
    public void saveToDB(){
        //
    }
    public void saveToFile(){
        //
    }
}

class InvoicePrint{

    Invoice invoice;
    public InvoicePrint(Invoice invoice){
        this.invoice = invoice;
    }

    public void printInvoice(){

    }
}
