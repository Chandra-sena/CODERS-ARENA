 import java.util.Scanner;
 class BinarySearch{
	static int a[],low,high,key,k=0;
	public static void main(String args[]) {
		Scanner n=new Scanner(System.in);
		low =0;
		int p=n.nextInt();
		for(int i=0; i<p ;i++) {
			a[k++]=n.nextInt();
		}
		high=a.length-1;
		System.out.println("Enter the key value:");
		key=n.nextInt();
		 int mid = (low + high)/2;  
		   while( low <= high ){  
		      if ( a[mid] < key ){  
		        low = mid + 1;     
		      }else if ( a[mid] == key ){  
		        System.out.println("The Element is found at index :"+mid);
		      }else{  
		         high = mid - 1;
		      }  
		      mid = (low + high)/2;  
		   }  
		   if ( low > high ){  
		      System.out.println("The Element not found in the given array");
	       }
   }
 }