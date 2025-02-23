public class Interface {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves(); 
        Rook r = new Rook(); 
        r.moves();
        King k = new King();
        k.moves();
    }
}
interface Chessplayer{
    void moves();
}
class Queen implements Chessplayer {
    public void moves(){
        System.out.println("up, down, left, right,diagonal(in all dir)");
    }
}
class Rook implements Chessplayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
} 
class King implements Chessplayer{
    public void moves(){
        System.out.println("up,down,left ,right, by 1 step");
    }
}