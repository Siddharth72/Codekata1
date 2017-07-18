import java.util.Scanner;

public class Cs1arraysubset {
	
	public static void main(String[] args){
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value for n for a1[n] : ");
		int n = scan.nextInt();
		
		System.out.println("Enter the value for n2 for a2[n2] : ");
		int n2 = scan.nextInt();
		
		System.out.println("Enter the Element for a1[] : ");
	    int[] a = new int[n];
	    int[] b = new int[n2];
		
	    for(int i=0;i<a.length;i++){
			a[i] = scan.nextInt();
		}
		System.out.println("Enter the Element for a2[] : ");
		for(int j=0;j<b.length;j++){
			b[j] = scan.nextInt();
		}
		
		System.out.println("");
		getSubset(a,b);
        scan.close();
	}
	
	public static void getSubset(int[] x,int[] y){
		
		int count = 0;
		for(int i=0;i<x.length;i++){
			
			for(int j=0;j<y.length;j++){
				
				if(x[i]==y[j]){
					count++;
					break;
				}
			}
		}
		if(count == y.length){
			System.out.println("a1 is Subset of a2");
			}
		else{
			System.out.println("a1 is not a Subset of a2");
		}
	}

}
