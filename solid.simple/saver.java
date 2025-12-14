package solid.simple;

public class saver implements SaverServ {
    @Override
    public void save(Order objToSave){
        System.out.println(objToSave.getProduct() + "Cохранен");
    }


}
