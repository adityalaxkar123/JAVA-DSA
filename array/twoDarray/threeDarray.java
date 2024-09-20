class ArraysExample{
    
    
    void multiArrays(){
        int [][][] arr_3= new int[5][3][2];
        arr_3[0][0][0]=1;
        arr_3[0][0][1]=2;
        arr_3[0][1][0]=3;
        arr_3[0][1][1]=4;
        arr_3[0][2][0]=5;
        arr_3[0][2][1]=6;
        
        System.out.println(arr_3[0][0][0]);
        System.out.println(arr_3[0][0][1]);
        System.out.println(arr_3[0][1][0]);
        System.out.println(arr_3[0][1][1]);
        System.out.println(arr_3[0][2][0]);
        System.out.println(arr_3[0][2][1]);
        
        /*System.out.println(arr[0][0]);//56
        System.out.println(arr[0][1]);//43
        System.out.println(arr[0][2]);//6
        
        System.out.println(arr[1][0]);//34
        System.out.println(arr[1][1]);//7
        System.out.println(arr[1][2]);//8
        
        System.out.println(arr[2][0]);//12
        System.out.println(arr[2][1]);//56
        System.out.println(arr[2][2]);//8
        */
    }
    /*void demoArrays(){
        int [] ages=new int[3];
        float[] weight=new float[3];
        String [] name={"aditya","anurag","omprakash"};
        ages[0]=34;
        ages[1]=12;
        ages[2]=45;
        //ages[5]=34;//out of bound
        weight[0]=23;
        weight[1]=25;
        weight[2]=33;
        
        
        
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        
        System.out.println(weight[0]);
        System.out.println(weight[1]);
        System.out.println(weight[2]);
        
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
        
    }*/
    
}

public class threeDarray{
    public static void main(String[] args){
        ArraysExample obj=new ArraysExample();
        //obj.demoArrays();
        obj.multiArrays();
    }
}