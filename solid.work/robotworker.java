package solid.work;

public class robotworker implements workserv, cleanserv {
    @Override
    public void work() {
        System.out.println("робот работает");
    }

    @Override
    public void clear() {
        System.out.println("робот убирает");
    }

    //нет eat()
}
