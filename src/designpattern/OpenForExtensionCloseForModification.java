package designpattern;

public class OpenForExtensionCloseForModification {

    public static void main(String[] args) {

    }
}

class Invoice1{
    double price;
    String name;
}

class InvoiceDao1{
    Invoice1 invoice1;
    public InvoiceDao1(Invoice1 invoice1){
        this.invoice1 = invoice1;
    }

    public void saveToDB(){
        //
    }
    public void saveToFile() {
        //
    }
}

interface InvoiceDao2{
   public void save(Invoice1 invoice1);
}

class DatabaseInvoice implements InvoiceDao2{

    @Override
    public void save(Invoice1 invoiceDao2){
        //
    }
}

class FileInvoice implements InvoiceDao2{

    @Override
    public void save(Invoice1 invoice1) {
        //
    }
}

class MongoDBSave implements InvoiceDao2{

    @Override
    public void save(Invoice1 invoice1) {
        //
    }
}