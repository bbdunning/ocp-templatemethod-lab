package lab.assignment.afterrefactoring.clientcode;

import lab.assignment.afterrefactoring.CoffeeTemplate;
import lab.assignment.afterrefactoring.Mocha;
import lab.assignment.afterrefactoring.Capuccino;
import lab.assignment.afterrefactoring.Americano;

public class CoffeeClient {


    public static void main(String[] args) {

        CoffeeTemplate starbuzz = new Mocha();
        starbuzz.prepare();

        System.out.println("********************");

        starbuzz = new Capuccino();
        starbuzz.prepare();

        System.out.println("********************");

        starbuzz = new Americano();
        starbuzz.prepare();

        System.out.println("********************");

    }

}
