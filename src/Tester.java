/**
 * Created by IAN on 07/11/14.
 */
public class Tester {
    public static void main(String[] args){

        Protein p = new Protein(2);
        System.out.println(p.milligrams);   //TODO: abstract weights to p.size() or something.

        Magnesium mmm = new Magnesium(420);
        System.out.println(mmm.milligrams);

        Donut d = new Donut();


    }
}
