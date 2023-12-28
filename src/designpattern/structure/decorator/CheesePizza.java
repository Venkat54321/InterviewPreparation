package designpattern.structure.decorator;

public class CheesePizza extends PizzaDecorator{
    private Pizza pizza;
    public CheesePizza(Pizza pizza) {
        super(pizza);
        this.pizza = pizza;
    }
    public String bake(){
        return "Cheese Pizza";
    }
}
