
package lab.assignment.afterrefactoring;

public abstract class CoffeeTemplate{

    public abstract void prepare();

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void brewEspresso() {
        System.out.println("Brewing espresso");
    }
}