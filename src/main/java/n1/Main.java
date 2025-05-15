package n1;

import n1.builders.HawaianPizzaBuilder;
import n1.builders.MestrePizza;
import n1.builders.VeganPizzaBuilder;
import n1.models.Pizza;

public class Main {
    public static void main(String[] args) {
        VeganPizzaBuilder veganPizzaBuilder = new VeganPizzaBuilder();
        HawaianPizzaBuilder hawaianPizzaBuilder = new HawaianPizzaBuilder();
        MestrePizza mestreBuilder = new MestrePizza();


        try {
            Pizza veggie = veganPizzaBuilder
                    .setSize(20)
                    .setDough("crispy")
                    .setToppings("cream, spinach").buildPizza();
            System.out.println("Pizza with Vegan Builder :" + veggie);

        } catch (IllegalArgumentException e) {
            System.out.println("Veggie pizza : " + e.getMessage());

        }

        try {
            Pizza spicy = hawaianPizzaBuilder
                    .setSize(25)
                    .setDough("gluten free")
                    .setToppings("pepper, kimchi")
                    .buildPizza();
            System.out.println("Pizza with Hawaian Builder :" + spicy);
        } catch (IllegalArgumentException e) {
            System.out.println("Spicy Pizza : " + e.getMessage());
        }


        try {
            Pizza freeStyle = mestreBuilder.builder(hawaianPizzaBuilder, 24, "standard", "pineapple + ham");
            System.out.println("Pizza with Director :" + freeStyle);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }




    }


}