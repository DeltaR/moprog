/**
 * Created by ruide on 29/04/2016.
 */
public class Computador extends Produto{

    private String cpu;

    public Computador(){
        super();
        this.cpu = "";
    }

    public Computador(int ref, String brand, String model, double price){
        super(ref, brand, model, price);
        this.cpu = "";
        super.setPVP(calcularPVP());
    }

    public Computador(int ref, String brand, String model, double price, String cpu ){
        super(ref, brand, model, price);
        this.cpu = cpu;
        super.setPVP(calcularPVP());
    }

    public String getCPU(){
        return this.cpu;
    }

    public void setCPU(String cpu){
        this.cpu = cpu;
    }

    public String toString(){
        return ":: Computador " + super.getBrand()
                + " (" + super.getRef() + ") ::\nMarca: " + super.getModel()
                + "\nPreço de Custo: " + super.getPrice() + "€"
                + "\nPreço de Venda: " + super.getPVP() + "€"
                + "\nTipo de CPU: " + getCPU() + "\n";
    }

    public double calcularPVP() {
        double price = super.getPrice();
        return price + price*0.23 + price*0.2;
    }
}