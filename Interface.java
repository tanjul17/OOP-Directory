public class Interface {
    public static void main(String[] args) {
        // Queen q = new Queen();
        // q.moves();
        Beta tanjul = new Beta();
        tanjul.call();
        System.out.println(tanjul.buy);
    }
}
//multiple inheritance by interface
interface Mammy{
    int money =10;
    void call();
    
}
interface Papa{
    String buy="Car";
    void call();//abstract method do not specify body..

    }
class Beta implements Mammy,Papa{
    public void call(){
        System.out.println("beta method");
    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up,down,left,right,diagonal(in all 4)");
    }
}
class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up,down,left,right");
    }
}
class King implements ChessPlayer {
    public void moves() {
        System.out.println("up,down,left,right,diagonal(in 1 direct.");
    }
}