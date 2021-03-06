import javax.swing.JOptionPane;
import java.util.Scanner;

class Person{
    private String name;
    private int age;

    Person(){
        name = "";
        age = 0;
    }

    Person(String name){
        this.name = name;
        age = 0;
    }

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String toString(){
        if(age>0) return "O meu nome é " + name + " e tenho " + age + " anos";
        else return "O meu nome é " + name;
    }
}


public class Cumprimentar {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nome da primeira pessoa?");
        String name = s.nextLine();
        Person actor = new Person(name);
        System.out.println("Nome da segunda pessoa?");
        String name2 = s.nextLine();
        Person actor2 = new Person();
        actor2.setName(name2);
        System.out.println("Nome da terceira Pessoa?");
        String name3 = s.nextLine();
        System.out.println("Idade da Terceira Pessoa?");
        int age3 = s.nextInt();
        Person actor3 = new Person(name3, age3);
        System.out.println(actor);
        System.out.println("Olá " + actor.getName() + "! O meu é " + actor2.getName());
        System.out.println("Olá a todos! " + actor3);
        actor3.setAge(age3+1);
        System.out.println("Mas como hoje faço anos, agora tenho " + actor3.getAge());

    }

    /*

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Nome da primeira pessoa?");
        Person actor = new Person(name);
        String name2 = JOptionPane.showInputDialog("Nome da Segunda Pessoa?");
        Person actor2 = new Person();
        actor2.setName(name2);
        String name3 = JOptionPane.showInputDialog("Nome da Terceira Pessoa?");
        int age3 = Integer.parseInt(JOptionPane.showInputDialog("Idade da Terceira Pessoa?"));
        Person actor3 = new Person(name3, age3);
        JOptionPane.showMessageDialog(null, actor);
        JOptionPane.showMessageDialog(null, "Olá " + actor.getName() + "! O meu é " + actor2.getName());
        JOptionPane.showMessageDialog(null, "Olá a todos! " + actor3);
        actor3.setAge(age3+1);
        JOptionPane.showMessageDialog(null, "Mas como hoje faço anos, agora tenho " + actor3.getAge());
    }

*/
}
