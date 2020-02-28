package lab.assignment.afterrefactoring;

public class Americano extends CoffeeTemplate{
    public void prepare(){
        boilWater();
        brewEspresso();
        addIngredients();
        finalTouch();
        System.out.println(">>Serving coffee");
    }

    public void addIngredients() {
       System.out.println("Add more hot water");
    }

    public void finalTouch() {
        System.out.println("Add sugar and cream");
    }
}