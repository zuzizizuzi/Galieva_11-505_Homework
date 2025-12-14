package solid.bird;

public class sparrow extends bird implements Flyable {
    @Override
    public void eat() {
        System.out.println("ест");
    }

    @Override
    public void flyserv() {
        System.out.println("летит");
    }
}


