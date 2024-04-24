import Ducky.AfrecanDuck;
import Ducky.FrenshDuck;
import Ducky.IDuck;
import TurkyAdapter.TurkyAdapter;
import turky.AfricanTurky;

public class Main {
    public static void main(String[] args) {
        System.out.println("FORKDevolop----------------FORKDevolop--------------------FORKDevolop");
        AfricanTurky africanTurky = new AfricanTurky();
        IDuck afrecanDuck = new FrenshDuck();
        IDuck turkyAdapter = new TurkyAdapter(africanTurky);

        System.out.println("what the afrecan turky says");
        africanTurky.dook();
        africanTurky.fly();

        System.out.println("what the afrecan duck says");
        afrecanDuck.dook();
        afrecanDuck.fly();

        System.out.println("what the afrecan turky adapter says");
        turkyAdapter.dook();
        turkyAdapter.fly();
    }
}