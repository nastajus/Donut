/**
 * Created by IAN on 07/11/14.
 */
public class Protein extends Organic {
    public Protein (int grams){
        super(grams);
        kcal = 4;
    }
    //get//set
    @Override
    public void Cook(){
        if (!isCooked){
            isCooked = true;
            this.milligrams *= .5;
        }
    }


}
