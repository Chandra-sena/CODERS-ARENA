public class InvoiceTest {
    public static void main(String args[]) {
        Invoice ob = new Invoice("a4", "paper", 100, 25000);
        System.out.println(ob.getPartNumber());
        System.out.println(ob.getPartDesc());
        System.out.println(ob.getInvoiceAmount());

    }
}