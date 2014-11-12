/**
 * Created by IAN on 09/11/14.
 */
public class Calcium extends Mineral {
    Calcium(double mg){
        super(mg);
    }
    @Override
    public void Cook(){
        if (!isCooked){
            isCooked = true;
            this.milligrams *= .9;
        }
    }
}
