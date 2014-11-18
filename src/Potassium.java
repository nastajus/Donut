/**
 * Created by IAN on 12/11/14.
 */
public class Potassium extends Mineral {

    Potassium(double milligrams){
        super(milligrams);
    }

    @Override
    public void Cook(){
        if(!isCooked){
            isCooked = true;
            this.milligrams *= 0.1;
        }
    }
}
