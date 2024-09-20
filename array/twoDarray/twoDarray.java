class ArraysExample2{    
    void multiArrays(){
        int [][] arr ={{56,43,6},{34,7,8},{12,56,8}};
        System.out.println(arr[0][0]);//56
        System.out.println(arr[0][1]);//43
        System.out.println(arr[0][2]);//6
        
        System.out.println(arr[1][0]);//34
        System.out.println(arr[1][1]);//7
        System.out.println(arr[1][2]);//8
        
        System.out.println(arr[2][0]);//12
        System.out.println(arr[2][1]);//56
        System.out.println(arr[2][2]);//8
        
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

public class twoDarray{
    public static void main(String[] args){
        ArraysExample2 obj=new ArraysExample2();
        //obj.demoArrays();
        obj.multiArrays();
    }
}
