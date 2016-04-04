import javax.swing.JOptionPane;

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

    public String toStringName(){
        return "O meu nome é " + name;
    }

    public String toStringAge(){
        return name + " tem " + age + " anos";
    }
}

public class Cumprimentar {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Nome da primeira pessoa?");
        Person actor = new Person(name);
        String name2 = JOptionPane.showInputDialog("Nome da Segunda Pessoa?");
        Person actor2 = new Person();
        actor2.setName(name2);
        String name3 = JOptionPane.showInputDialog("Nome da Terceira Pessoa?");
        int age3 = Integer.parseInt(JOptionPane.showInputDialog("Idade da Terceira Pessoa?"));
        Person actor3 = new Person(name3, age3);
        JOptionPane.showMessageDialog(null, actor.toStringName());
        JOptionPane.showMessageDialog(null, "Olá " + actor.getName() + "! O meu é " + actor2.getName());
        JOptionPane.showMessageDialog(null, "Olá a todos! " + actor3.toStringName());
        JOptionPane.showMessageDialog(null, actor3.toStringAge());
        actor3.setAge(age3+1);
        JOptionPane.showMessageDialog(null, "Mas como hoje faz anos, agora tem " + actor3.getAge());
    }

}