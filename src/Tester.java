/**
 * Created by IAN on 07/11/14.
 */
public class Tester {
    public static void main(String[] args){

        //Food food = new Food(); //not desired, is supposed to be abstract later.
        Donut donut = new Donut();
        int g = donut.nutrient.getNutrient().grams;
        System.out.println( g );

    }
}
