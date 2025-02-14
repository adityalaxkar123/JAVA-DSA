import java.util.HashSet;

public class basic {


    public static void main(String[] args) {
        HashSet<String> st = new HashSet<>();
        st.add("aditya");
        st.add("laxkar");
        st.add("laxkar");

        System.out.println(st);
        System.out.println(st.contains("aditya"));
        System.out.println(st.size());
        System.out.println(st.remove("laxkar"));
        System.out.println(st.contains("laxkar"));
        System.out.println(st.size());
        st.add("mark");
        //iterating over hashSet
        for (String s : st){
            System.out.print(" "+s);
        }
    }
}
