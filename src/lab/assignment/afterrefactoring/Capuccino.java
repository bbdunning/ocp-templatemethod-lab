package lab.assignment.afterrefactoring;

public class Capuccino extends CoffeeTemplate{
    public void prepare(){
        boilWater();
        brewEspresso();
        addIngredients();
        finalTouch();
        System.out.println(">>Serving coffee");
    }

    private void addIngredients(){
        System.out.println("Add hot milk");
        System.out.println("Add cinnamon");
    }

    private void finalTouch(){
        System.out.println("Top with milk foam");
    }
}
