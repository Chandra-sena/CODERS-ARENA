
public class Book {
	private String bookname,ISBN,author,publisher;
	
	Book( String bn,String i,String auth,String bp){
		this.bookname=bn;
		this.ISBN=i;
		this.author=auth;
		this.publisher=bp;
	}
	
	public void setbookname(String bookname) {
		this.bookname=bookname;
	}
	public void setisbn(String ISBN) {
		this.ISBN=ISBN;
	}
	public void setauthor(String author) {
		this.author=author;
	}
	public void setpublisher(String publisher) {
		this.publisher=publisher;
	}
	public String getbookname() {
		return bookname;
	}
	public String getisbn() {
		return ISBN;
	}
	public String getauthor() {
		return author;
	}
	public String getpublisher() {
		return publisher;
	}
	public String BookInfo() {
		return "bookname:"+bookname+" isbn npo:"+ISBN+" "+author+" "+publisher;
	}

}
