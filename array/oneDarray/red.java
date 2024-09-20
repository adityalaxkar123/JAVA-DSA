class ArraysExample{
    
    void demoArrays(){
        int [] ages=new int[3];
        float[] weight=new float[3];
        // String [] name =new String[3];
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
        
    }


public class red{
    public static void main(String[] args){
        ArraysExample obj=new ArraysExample();
        obj.demoArrays();
        
    }
}
}