package n1.models;

public class Pizza {
    private int size;
    private String dough;
    private String toppings;

    public Pizza(int size, String dough, String toppings) {
        this.size = size;
        this.dough = dough;
        this.toppings = toppings;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Pizza : " +
                "size = " + size +
                ", dough = '" + dough + '\'' +
                ", toppings = '" + toppings + '\'' +
                '}';
    }
}
