public class oopsinterfaces6 {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
        
    }
    
}
interface chessPlayer {
    void moves();
}
class Queen implements chessPlayer {
    public void moves(){
       System.out.println("left,right,up,down,diagoanal(in all 4 direction)");
    }
}
class Rock implements chessPlayer {
    public void moves(){
       System.out.println("left,right,up,down");
    }
}
class King implements chessPlayer {
    public void moves(){
       System.out.println("left,right,up,down,diagonal(by 1 step)");
    }
}