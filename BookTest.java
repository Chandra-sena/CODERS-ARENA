import java.util.Scanner ;
public class BookTest{
	public static void main(String args[]) {
	     Scanner ob =new Scanner(System.in);
	     String bname=ob.nextLine();
	     String bpublisher=ob.nextLine();
	     String bisbn=ob.nextLine();
	     String bauthor=ob.nextLine();
	     Book[] b=new Book[30];
	     for(int i=0; i<1; i++) {
	    	 b[i]=new Book(bname,bpublisher,bisbn,bauthor);
		    
		     System.out.println("The info about book:"+b[i].BookInfo());		
   }
 }
}

