public class printPermutation {

    private static void printPermutation(String s,String d){
        if (s.isEmpty()){
            System.out.println(d);
            return;
        }
        for (int i = 0; i <s.length() ; i++) {
            char a = s.charAt(i);
            String left = s.substring(0,i);
            String right = s.substring(i+1);
            String rem = left + right;
            printPermutation(rem,d+a);
        }
    }
    public static void main(String[] args) {
        String s = "abc";
        printPermutation(s,"");
    }
}
