import java.util.Scanner;
public class problem29
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row and column of array1 respectively");
		int r1=sc.nextInt();
		int c1=sc.nextInt();
		int [][]a=new int[r1][c1];
	    System.out.println("Enter the r1*c1 element of array");
	    for(int i=0;i<r1;i++){
	        for(int j=0;j<c1;j++){
	            a[i][j]=sc.nextInt();
	        }
	    }
	   	System.out.println("Enter the row and column of array2 respectively");
		int r2=sc.nextInt();
		int c2=sc.nextInt();
		int [][]b=new int[r2][c2];
	    System.out.println("Enter the r2*c2 element of array");
	    for(int i=0;i<r2;i++){
	        for(int j=0;j<c2;j++){
	            b[i][j]=sc.nextInt();
	        }
	    }
	    System.out.println("the original array1 is:");
	    for(int i=0;i<r1;i++){
	        for(int j=0;j<c1;j++){
	            System.out.print(a[i][j]+" ");
	        }
	        System.out.println();
	    }
	    System.out.println("the original array2 is:");
	    for(int i=0;i<r2;i++){
	        for(int j=0;j<c2;j++){
	            System.out.print(b[i][j]+" ");
	        }
	        System.out.println();
	    }
	    int [][]mul=new int[r1][c2];
	    if(c1!=r2){
	        System.out.println("wrong input of array order");
	    }
	    
	    for(int i=0;i<r1;i++){
	       for(int j=0;j<c2;j++){
	           for(int k=0;k<c1;k++){
	                    mul[i][j]+=(a[i][k]*b[k][j]);
	                }
	            }
	        }
	    
	    
	    System.out.println("the mul of array is:");
	    for(int i=0;i<r1;i++){
	        for(int j=0;j<c2;j++){
	            System.out.print(mul[i][j]+" ");
	        }
	        System.out.println();
	    }
		sc.close();
	}
}
