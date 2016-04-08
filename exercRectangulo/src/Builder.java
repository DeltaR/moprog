import javax.swing.JOptionPane;
import java.util.Scanner;

class Rectangle{
    private int width;
    private int height;

    Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    public int getArea(){
        return width*height;
    }

    public int getPerimeter(){
        return 2*width + 2*height;
    }

}

public class Builder {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Neste programa estamos a assumir as medidas em centimetros e os valores são inteiros");
        System.out.println("Introduza a largura do rectângulo:");
        int width = s.nextInt();
        System.out.println("Introduza a comprimento do rectângulo:");
        int height = s.nextInt();
        Rectangle object = new Rectangle(width, height);
        System.out.println("O retângulo tem " + object.getArea() + "cm^2 de área e " + object.getPerimeter() + "cm de perimetro.");

    }
    /*
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Neste programa estamos a assumir as medidas em centimetros e os valores são inteiros");
        int width = Integer.parseInt(JOptionPane.showInputDialog("Introduza a largura do rectângulo:"));
        int height = Integer.parseInt(JOptionPane.showInputDialog("Introduza a comprimento do rectângulo:"));
        Rectangle object = new Rectangle(width, height);
        JOptionPane.showMessageDialog(null, "O retângulo tem " + object.getArea() + "cm^2 de área e " + object.getPerimeter() + "cm de perimetro.");

    }
     */
}
