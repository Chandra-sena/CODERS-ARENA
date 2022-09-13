import java.util.Scanner;

public class InvoiceTest {
	 public static void main(String args[]) {
	        Scanner n=new Scanner(System.in);
	        System.out.println("Enter the part number:");
	        String s=n.nextLine();
	        System.out.println("Enter the part description:");
	        String s1=n.nextLine();
	        System.out.println("Enter the quantity:");
	        int x=n.nextInt();
	        System.out.println("Enter the price:");
	        double d=n.nextDouble();
	        Invoice ob = new Invoice(s,s1,x,d);
	        ob.setPartDesc(s1);
	        System.out.println(ob.getPartNumber());
	        System.out.println(ob.getPartDesc());
	        System.out.println(ob.getInvoiceAmount());

	    }

}