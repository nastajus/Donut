/**
 * Created by IAN on 12/11/14.
 */
public class Folate extends Vitamin {
    @Override
    public void Cook(){
        if (!isCooked){
            isCooked = true;
            this.milligrams *= 0.1;
        }
    }
}
