package designpattern.structure.decorator;

public class BasePizza implements Pizza{
    private Pizza pizza;
    public BasePizza(Pizza pizza){
        this.pizza = pizza;
    }
    @Override
    public String bake() {
        return "BasePizza";
    }
}
