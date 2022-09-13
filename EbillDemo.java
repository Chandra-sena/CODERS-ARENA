import java.util.Scanner;
public class EbillDemo {
	public static void main(String args[]) {
		Scanner n=new Scanner(System.in);
        Ebill ob = new Ebill();
        System.out.println("enter the customer no:");
        int cn=n.nextInt();
        ob.cno = cn;
        System.out.println("choose thr type of your EB:  1.Domestic  2.Commercial");
        int t =n.nextInt();
        ob.eb = t; 
        System.out.println("enter the customer name:");
        String s1=n.next();
        ob.cname = s1;
        System.out.println("enter the previous month reading:");
        double prev=n.nextDouble();
        ob.pmr = prev;
        System.out.println("enter the current month reading:");
        double curr=n.nextDouble();
        ob.cmr = curr;
        System.out.println("customer no:" + ob.cno);
        System.out.println("customer name:" + ob.cname);
        System.out.println("units :" + ob.displayu());
        System.out.println("bill:" + ob.bill());
    }

}
