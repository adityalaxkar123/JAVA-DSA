public class ratInMaze {

    private static int maze(int sr,int sc,int er,int ec){
        if(sr > er || sc >ec) return 0;
        if (sr == er && sc == ec) return 1;
        int downWays = maze(sr+1,sc,er,ec);
        int rightWays = maze(sr,sc+1,er,ec);
        int totalCount = downWays + rightWays;

        return totalCount;
    }
    private static void print(int sr,int sc,int er,int ec,String s){
        if(sr > er || sc >ec) return;
        if (sr == er && sc == ec){
            System.out.println(s);
            return;
        }
        //downWays
        print(sr+1,sc,er,ec,s+"D" );
        //rightWays
        print(sr,sc+1,er,ec,s+"R" );


    }


    public static void main(String[] args) {
        int rows = 3;
        int columns = 3;
//        System.out.println(maze(1,1,rows,columns));
        print(1,1,rows,columns,"");
    }

}
