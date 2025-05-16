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
            Pizza customHawaianPizza = mestreBuilder.buildCustomPizza(hawaianPizzaBuilder, 24, "standard", "pineapple + ham");
            System.out.println("custom Hawaian Pizza :" + customHawaianPizza);
        } catch (IllegalArgumentException e) {
            System.out.println("custom Hawaian Pizza :" + e.getMessage());
        }

        try {
            Pizza customVeganPizza = mestreBuilder.buildCustomPizza(veganPizzaBuilder, 24, "standard", "tomato + ham");
            System.out.println("custom Vegan Pizza :" + customVeganPizza);
        } catch (IllegalArgumentException e) {
            System.out.println("custom Vegan Pizza :" + e.getMessage());
        }

        try {
            Pizza classicHawaianPizza = mestreBuilder.buildClassicPizza(hawaianPizzaBuilder, "pineapple" );
            System.out.println("classic Hawaian Pizza :" + classicHawaianPizza);
        } catch (IllegalArgumentException e) {
            System.out.println("classic Hawaian Pizza :" + e.getMessage());
        }

        try {
            Pizza classicVeganPizza = mestreBuilder.buildClassicPizza(veganPizzaBuilder, "mushrooms + artichoke + eggplant");
            System.out.println("classic Vegan Pizza :" + classicVeganPizza);
        } catch (IllegalArgumentException e) {
            System.out.println("classic Vegan Pizza :" + e.getMessage());
        }

        try {
            Pizza cheesyCrustHawaianPizza = mestreBuilder.buildCheesyCrust(hawaianPizzaBuilder, "pineapple + ham + mushrooms + zucchini + eggplant");
            System.out.println("cheesyCrust Hawaian Pizza :" + cheesyCrustHawaianPizza);
        } catch (IllegalArgumentException e) {
            System.out.println("cheesyCrust Hawaian Pizza : " + e.getMessage());
        }






    }


}