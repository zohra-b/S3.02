package n2;

public class User implements Observer{
    private String name;

    public User(String name){
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Hello " + name + ", we have a new message :\n" + message);
    }
}
