import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    Scanner sc1 = new Scanner(System.in);
	    
	    List<Integer> l1 = new ArrayList<>();
	    List<Integer> l2 = new ArrayList<>();

	    int size = sc.nextInt(); 
	    int[] arr = new int[size];
	   
	    for(int i=0;i<size;i++){
	        arr[i]=sc1.nextInt();
	    }
	   
	    for(int i=0;i<size-1;i++){
	    	
	        if(arr[i]==arr[i+1]){
	        l1.add(arr[i]);
	       }
	       else if(arr[i]!=arr[i+1]){
	        l2.add(arr[i]);
	       }
	    }
	    System.out.println(l2);
	sc.close(); sc1.close();
	}

}
