/**
 * Created by ruide on 29/04/2016.
 */
public class Impressora extends Produto {

    private String type;

    public Impressora(){
        super();
        type = "";
    }

    public Impressora(int ref, String brand, String model, double price){
        super(ref, brand, model, price);
        type = "";
        super.setPVP(calcularPVP());
    }

    public Impressora(int ref, String brand, String model, double price, String type ){
        super(ref, brand, model, price);
        this.type = type;
        super.setPVP(calcularPVP());
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    public String toString(){
        return ":: Impressora " + super.getBrand()
                + " (" + super.getRef() + ") ::\nMarca: " + super.getModel()
                + "\nPreço de Custo: " + super.getPrice() + "€"
                + "\nPreço de Venda: " + super.getPVP() + "€"
                + "\nTipo: " + getType() + "\n";
    }

    public double calcularPVP() {
        double price = super.getPrice();
        if(type.equalsIgnoreCase("Matriz"))
            return price + price*0.23 + price*0.05;
        else
            return price + price*0.23 + price*0.2;
    }
}
