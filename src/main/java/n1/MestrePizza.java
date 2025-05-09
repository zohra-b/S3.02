package n1;

public class MestrePizza {
    private int size;
    private String dough;
    private String toppings;

    public Pizza builder(PizzaBuilder pizzaBuilder, int size, String dough, String toppings) {
        return pizzaBuilder
                .setSize(size)
                .setDough(dough)
                .setToppings(toppings).buildPizza();

    }
}