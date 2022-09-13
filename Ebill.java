
public class Ebill {
	int cno, eb;
	  String cname;
	  double pmr, cmr, tb, u;
	  public double bill() {
		  u=cmr-pmr;
	    if (eb == 1) {
	      
	      if (u <= 100) {
	        tb = u;
	      } else if (u > 100 && u < 200) {
	        tb =  u+(2.5* u);
	      } else if (u > 200 && u < 500) {
	        tb = u+(2.5* u)+(4 * u);
	      } else {
	        tb = u+(2.5 * u)+(4 * u)+(6 * u);
	      }
	    } 
	    else {
	      if (u <= 100) {
	        tb = (2 * u);
	      } else if (u > 100 && u < 200) {
	        tb = (2 * u)+(4.5 * u);
	      } else if (u > 200 && u < 500) {
	        tb = (2 * u)+(4.5 * u)+(6 * u);
	      } else {
	        tb = (2 * u)+(4.5 * u)+(6 * u)+(7 * u);
	      }

	    }
	    return (double)tb;

	  }
	  public double displayu(){
	    u=cmr-pmr;
	    return u;}

}
