package lab.assignment.afterrefactoring;

public class Mocha extends CoffeeTemplate{

    public void prepare(){
        boilWater();
        brewEspresso();
        addIngredients();
        finalTouchForMocha();
        System.out.println(">>Serving coffee");
    }

    private void finalTouchForMocha(){
        System.out.println("Adding sugar");
    }

    private void addIngredients(){
        System.out.println("Adding cocoa powder");
        System.out.println("Adding hot milk");
    }
}

