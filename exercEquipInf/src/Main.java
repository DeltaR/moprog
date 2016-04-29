public class Main {

    public static void main(String[] args) {
        Produto[] prod = new Produto[10];
        prod[0] = new Computador(134, "IBM", "Pentium", 250, "Pentium 4");
        prod[1] = new Impressora(452, "HP", "Laserjet", 95, "Laser");
        prod[2] = new Impressora(452, "Canon", "P500", 85, "Matriz");
        prod[3] = new Modem(564, "Devolo", "d500", 100, "Externo");

        for(int i = 0; i < prod.length; i++){
            if(prod[i] != null){
                System.out.println(prod[i]);
            }
        }
    }
}
