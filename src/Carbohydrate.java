/**
 * Created by IAN on 12/11/14.
 */
public class Carbohydrate extends Organic {
    Carbohydrate(int grams) {
        super(grams);
        kcal = 4;
    }
    @Override
    public void Cook(){
        if (!isCooked){
            isCooked = true;
            this.milligrams *= .5;
        }
    }
}
