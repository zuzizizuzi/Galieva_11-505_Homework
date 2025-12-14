package solid.simple;

public class printer implements printerServ {
    @Override
    public void print(Order objToPrint){
            System.out.println(objToPrint.getProduct());
    }
}

