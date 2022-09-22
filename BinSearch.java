public class BinSearch {
	int a[];
	int k,key,low,high;
	BinSearch(int size){
		a=new int[size];
		low=0;
		high=a.length-1;
	}
	public void add(int element) {
		a[k++]=element;
	}
	public void bin(int key) {
		while (low<=high) {
		 	int mid=(low+high)/2;
		 	for(int i=0; i<a.length; i++) {
			  if(a[mid]==key) {
				System.out.println("Element found at index:"+mid);
			  }
			  else if(a[mid]<key) {
				  low=mid+1;
			  }
			  else high=mid-1;
		 	}
		}
		if (low>high) {
			System.out.println("Element not found");
		}
	}
}

