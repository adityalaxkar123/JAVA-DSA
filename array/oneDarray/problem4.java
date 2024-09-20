import java.util.Scanner;
public class problem4 {
    static int lastOccurences(int []arr ,int y){
        int last =-1;
        for(int i=0;i<arr.length;i++){
            if(y==arr[i]){
                last=i;
            }
            
        }
        return last;
    }
    
    
    
    
    
    
    static int countOccurences(int[] arr , int x){
        int count =0;
     for(int i=0;i<arr.length;i++){
         if(x==arr[i]){
             count++;
         }
     }   
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int []arr=new int [n];
        System.out.println("Enter "+n+"elements:  ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter x");
        int x = sc.nextInt();
        System.out.println("count of x: "+ countOccurences(arr,x));
        System.out.println("Enter y");
        int y =sc.nextInt();
        System.out.println("last of y:"+lastOccurences(arr,y));
        sc.close();
    }
    
}
    

