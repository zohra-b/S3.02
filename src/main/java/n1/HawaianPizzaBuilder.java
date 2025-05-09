package n1;

public class HawaianPizzaBuilder implements PizzaBuilder{
    private int size;
    private String dough;
    private String toppings;

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
        if (!toppings.contains("pineapple")){
            throw new IllegalArgumentException("You're using a Hawaian Builder, your pizza must contain pineapple");
        }
        this.toppings = toppings;
        return this;

    }

    public Pizza buildPizza(){
        return new Pizza(size, dough, toppings);
    }

}
