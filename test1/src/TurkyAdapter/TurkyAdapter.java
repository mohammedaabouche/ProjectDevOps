package TurkyAdapter;

import Ducky.IDuck;
import turky.AfricanTurky;

public class TurkyAdapter implements IDuck {
    AfricanTurky turky;

    public TurkyAdapter(AfricanTurky turky) {
        this.turky = turky;
    }
    public void fly(){
        for(int i=0;i<5;i++){
            System.out.println("fly short, fly short, fly short");}

    }
    public void dook(){
        System.out.println("oh hhhoohhohoohh africa");
    }
}
