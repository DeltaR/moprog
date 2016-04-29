/**
 * Created by ruide on 29/04/2016.
 */
public class Modem extends Produto {

    private String local;

    public Modem(){
        super();
        this.local = "";
    }

    public Modem(int ref, String brand, String model, double price){
        super(ref, brand, model, price);
        this.local = "";
        super.setPVP(calcularPVP());
    }

    public Modem(int ref, String brand, String model, double price, String local ){
        super(ref, brand, model, price);
        this.local = local;
        super.setPVP(calcularPVP());
    }

    public String getLocal(){
        return this.local;
    }

    public void setLocal(String local){
        this.local = local;
    }

    public String toString(){
        return ":: Modem " + super.getBrand()
                + " (" + super.getRef() + ") ::\nMarca: " + super.getModel()
                + "\nPreço de Custo: " + super.getPrice() + "€"
                + "\nPreço de Venda: " + super.getPVP() + "€"
                + "\nLocalização: " + getLocal() + "\n";
    }

    public double calcularPVP() {
        double price = super.getPrice();
        if(local.equalsIgnoreCase("Externo"))
            return price + price*0.23 + price*0.05;
        else
            return price + price*0.23 + price*0.2;
    }
}
