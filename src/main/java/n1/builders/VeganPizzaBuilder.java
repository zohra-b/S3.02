package n1.builders;

import n1.models.Pizza;
import n1.interfaces.PizzaBuilder;

public class VeganPizzaBuilder implements PizzaBuilder {
    private int size;
    private String dough;
    private String toppings;


    @Override
    public PizzaBuilder setDough(String dough) {
        this.dough = dough;
        return this;
    }

    @Override
    public PizzaBuilder setSize(int size) {
        this.size = size;
        return this;
    }

    @Override
    public PizzaBuilder setToppings(String toppings) {
        if (toppings.contains("cheese") || toppings.contains("ham") || toppings.contains("tuna") || toppings.contains("chicken")) {
            throw new IllegalArgumentException("one of your toppings is not vegan");}
            this.toppings = toppings;
            return this;


    }

    @Override
    public Pizza buildPizza() {
        return new Pizza(size, dough, toppings);
    }



}

