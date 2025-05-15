package n1.interfaces;

import n1.models.Pizza;

public interface PizzaBuilder {
    PizzaBuilder setSize(int size);
    PizzaBuilder setDough(String dough);
    PizzaBuilder setToppings(String toppings);
    Pizza buildPizza();
}
