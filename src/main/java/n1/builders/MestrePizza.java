package n1.builders;

import n1.interfaces.PizzaBuilder;
import n1.models.Pizza;

public class MestrePizza {

    public Pizza buildCustomPizza(PizzaBuilder pizzaBuilder, int size, String dough, String toppings) {
        return pizzaBuilder
                .setSize(size)
                .setDough(dough)
                .setToppings(toppings)
                .buildPizza();

    }

    public Pizza buildClassicPizza(PizzaBuilder pizzaBuilder, String toppings) {
        return pizzaBuilder
                .setSize(28)
                .setDough("classic")
                .setToppings("tomato + mozzarella + " + toppings)
                .buildPizza();
    }

    public Pizza buildCheesyCrust(PizzaBuilder pizzaBuilder, String toppings){
        return pizzaBuilder
                .setSize(28)
                .setDough("cheesy crust")
                .setToppings(toppings)
                .buildPizza();
    }

}