package solid.work;

public class humanworker implements workserv, cleanserv, eatserv {
    @Override
    public void work() {
        System.out.println("работает");
    }

    @Override
    public void clear() {
        System.out.println("убирает");
    }

    @Override
    public void eat() {
        System.out.println("ест");
    }
}{

}
