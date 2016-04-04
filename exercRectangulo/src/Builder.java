import javax.swing.JOptionPane;

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
        JOptionPane.showMessageDialog(null, "Neste programa estamos a assumir as medidas em centimetros e os valores são inteiros");
        int width = Integer.parseInt(JOptionPane.showInputDialog("Introduza a largura do rectângulo:"));
        int height = Integer.parseInt(JOptionPane.showInputDialog("Introduza a comprimento do rectângulo:"));
        Rectangle object = new Rectangle(width, height);
        JOptionPane.showMessageDialog(null, "O retângulo tem " + object.getArea() + "cm^2 de área e " + object.getPerimeter() + "cm de perimetro.");

    }
}
