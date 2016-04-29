/**
 * Created by ruide on 29/04/2016.
 */
public abstract class Produto {

    private int ref;
    private String brand;
    private String model;
    private double price;
    private double pvp;

    public Produto(){
        ref = 0;
        brand = "";
        model = "";
        price = 0;
        pvp = 0;
    }

    public Produto(int ref, String brand, String model, double price){
        this.ref = ref;
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public int getRef(){
        return this.ref;
    }

    public String getBrand(){
        return this.brand;
    }

    public String getModel(){
        return this.model;
    }

    public double getPrice(){
        return this.price;
    }

    public double getPVP(){
        return this.pvp;
    }

    public void setRef(int ref){
        this.ref = ref;
    }

    public void setBrand (String brand){
        this.brand =  brand;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPVP(double pvp) {
        this.pvp = pvp;
    }

    public abstract double calcularPVP();
}
