package sorting;
import java.util.Scanner;
public class sorting2 {



static void sortString(String s[]){

for (int i = 0; i < s.length - 1; i++) {
    int min_idx=i;
    for (int j = i + 1; j < s.length; j++) {
        if(s[j].compareTo(s[min_idx]) < 0){
            min_idx = j;
        }
    }
   String temp = s[i];
   s[i]=s[min_idx];
   s[min_idx]=temp;
 
}
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a[]={"apple","kiwi","watermaleon","banana","mango"};
        sortString(a);
        for (String val : a) {
            System.out.print(val +"  ,  ");
        }

        sc.close();
    }
}
