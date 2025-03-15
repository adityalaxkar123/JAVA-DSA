public class fourDirectionMaze {

    private static void print(int sr,int sc,int er,int ec,String s,boolean [][] isVisited){
        if(sr<0 || sc<0) return;
        if(sr>er || sc>ec)return;
        if(isVisited[sr][sc]) return;
        if(sr == er && sc == ec){
            System.out.println(s);
            return;
        }
        isVisited[sr][sc] = true;
        //right
        print(sr,sc+1,er,ec,s+"R",isVisited);
        //down
        print(sr+1 ,sc,er,ec,s+"D",isVisited);
        //up
        print(sr - 1,sc,er,ec,s+"U",isVisited);
        //left
        print(sr,sc-1,er,ec,s+"L",isVisited);
        //backTracking
        isVisited[sr][sc] = false;


    }

    public static void main(String[] args) {
        int row = 3;
        int column = 3;
        boolean [][]isVisited = new boolean[row][column];// by default false
        print(0,0,row - 1,column - 1,"",isVisited);
    }
}
