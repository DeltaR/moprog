import javax.swing.JOptionPane;
import java.util.*;

class Rectangle{
    private float width;
    private float height;

    Rectangle(float width, float height){
        this.width = width;
        this.height = height;
    }

    public float getArea(){
        return width*height;
    }

    public float getPerimeter(){
        return 2*width + 2*height;
    }

}

public class Builder {

    public static void main(String[] args) {
        Formatter f = new Formatter(); //Usado para formatar o output da Area
        Scanner s = new Scanner(System.in);
        System.out.println("Neste programa estamos a assumir as medidas em centimetros e os valores são inteiros");
        System.out.println("Introduza a largura do rectângulo:");
        float width = s.nextFloat();
        System.out.println("Introduza a comprimento do rectângulo:");
        float height = s.nextFloat();
        Rectangle object = new Rectangle(width, height);
        System.out.println("O retângulo tem " + f.format("%4.2f", object.getArea()) + "cm^2 de área e " + object.getPerimeter() + "cm de perimetro.");

    }
    /*
    public static void main(String[] args) {
        Formatter f = new Formatter(); //Usado para formatar o output da Area
        JOptionPane.showMessageDialog(null, "Neste programa estamos a assumir as medidas em centimetros e os valores são inteiros");
        float width = Float.parseFloat(JOptionPane.showInputDialog("Introduza a largura do rectângulo:"));
        float height = Float.parseFloat(JOptionPane.showInputDialog("Introduza a comprimento do rectângulo:"));
        Rectangle object = new Rectangle(width, height);
        JOptionPane.showMessageDialog(null, "O retângulo tem " + f.format("%4.2f", object.getArea()) + "cm^2 de área e " + object.getPerimeter() + "cm de perimetro.");

    }
     */
}
