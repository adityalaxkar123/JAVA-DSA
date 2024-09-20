public class passbyvaluearray {
        
        
        static void printArray(int[] arr){
             for(int i=0;i<arr.length;i++){
                
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        static void change_array(int[] arr){
            for(int i=0; i<arr.length;i++){
                arr[i] = 0;
            }
        }
        static void changeVal(int a){
            a=1000;
        }
        public static void main(String []args){
            int a=5;
            changeVal(a);
            System.out.println(a);
            int [] arr = new int[5];
            arr[0]=5;
            arr[1]=6;
            arr[2]=7;
            arr[3]=8;
            arr[4]=9;
            change_array(arr);
            printArray(arr);
            
        }
    }  
