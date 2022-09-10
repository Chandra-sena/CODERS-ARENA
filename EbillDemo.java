public class EbillDemo {
    public static void main(String args[]) {
        Ebill ob = new Ebill();
        ob.cno = 37;
        ob.cname = "sena";
        ob.eb = 1;
        ob.pmr = 375;
        ob.cmr = 1000;
        System.out.println("customer no:" + ob.cno);
        System.out.println("customer name:" + ob.cname);
        System.out.println("units :" + ob.displayu());
        System.out.println("bill:" + ob.bill());
    }
}