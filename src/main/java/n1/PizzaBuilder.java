package n1;

public interface PizzaBuilder {
    PizzaBuilder setSize(int size);
    PizzaBuilder setDough(String dough);
    PizzaBuilder setToppings(String toppings);
    Pizza buildPizza();
}
