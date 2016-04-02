import javax.swing.JOptionPane;

public class Hospital {
    static final int visitors = 100;
    static String visit_in[]= new String[visitors];
    static int nVisit = 0;

    public static void main(String[] args) {
        int op;
        while((op = menu()) != 0) {
            switch (op) {
                case 1:
                    if(nVisit != visitors){
                        String name = JOptionPane.showInputDialog("Qual o nome do visitante?");
                        insert(name);
                    }
                    else JOptionPane.showMessageDialog(null, "Base de dados completa! Não pode inserir mais visitantes.");
                    break;
                case 2:
                    if(nVisit > 0) list();
                    else JOptionPane.showMessageDialog(null, "Não há nenhum visitante registado");
                    break;
                case 3:
                    String name = JOptionPane.showInputDialog("Qual o nome do visitante que pretende procurar?");
                    position(name);
                    break;
                case 4:
                    int pos = Integer.parseInt(JOptionPane.showInputDialog("Qual a posição do visitante que pretende atualizar?"));
                    if(visit_in[pos-1] != null) update(pos-1);
                    else JOptionPane.showMessageDialog(null, "O visitante com essa posição não se encontra na base de dados.");
                    break;
                case 5:
                    int pos2 = Integer.parseInt(JOptionPane.showInputDialog("Qual a posição do visitante que pretende eliminar?"));
                    if(visit_in[pos2-1] != null) delete(pos2-1);
                    else JOptionPane.showMessageDialog(null, "O visitante com essa posição não se encontra na base de dados.");
                    break;
                case 6:
                    char a = (JOptionPane.showInputDialog("Introduza a letra pela qual pretende listar:")).charAt(0);
                    listLetter(a);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Escolha um valor do menu anterior.");
            }
        }
        JOptionPane.showMessageDialog(null, "Programa Terminado. Obrigado! :)");
    }

    private static int menu(){
        int op = Integer.parseInt(JOptionPane.showInputDialog("\tHOSPITAL MOPROG\n\n" +
                "1 - Inserir um visitante\n" +
                "2 - Listar todos os visitantes\n" +
                "3 - Posição dum dado visitante\n" +
                "4 - Atualizar um nome dado\n" +
                "5 - Eliminar um visitante dado\n" +
                "6 - Listar os nomes dos visitantes iniciados por uma determinada letra\n" +
                "0 - Fechar\n"));

        return op;
    }

    private static void insert(String name){
        visit_in[nVisit] = name;
        nVisit++;
        JOptionPane.showMessageDialog(null, "Foi inserido com sucesso o visitante " + name);
    }

    private static void list(){
        String m = "Visitantes Registados \n\n";
        for(int i = 0; i < nVisit; i++)
            m += (i+1) + " - " + visit_in[i] + "\n";
        JOptionPane.showMessageDialog(null, m);
    }

    private static void position(String name){
        int pos = search(name);
        if(pos >= 0) JOptionPane.showMessageDialog(null, "Nome encontrado! O visitante" + name + " encontra-se na posição " + (pos+1));
        else JOptionPane.showMessageDialog(null, "Visitante com o nome " + name + " não foi encontrado!");
    }

    private static void update(int pos){
        String old_name = visit_in[pos];
        String new_name = JOptionPane.showInputDialog("O nome antigo era " + old_name + ". Para qual nome pretende alterar?");
        visit_in[pos] = new_name;
        JOptionPane.showMessageDialog(null, "Nome alterado de " + old_name + " para " + new_name + " com sucesso!");
    }

    private static void delete(int pos){
        for(int i = pos; i<nVisit-1; i++){
            visit_in[i] = visit_in[i+1];
        }
        JOptionPane.showMessageDialog(null, "O visitante na posição " + (pos+1) + " foi eliminado com sucesso!");
        nVisit--;
    }

    private static void listLetter(char letter){
        String list = "Visitantes registados começando pela letra \"" + letter + "\":\n\n";
        int pos = 0;
        for(int i = 0; i < nVisit; i++){
            if(Character.toUpperCase(visit_in[i].charAt(0)) == (Character.toUpperCase(letter))) list += (i+1) + " - " + visit_in[i] + "\n";
            else pos++;
        }
        if(pos != visitors)
            JOptionPane.showMessageDialog(null, list);
        else
            JOptionPane.showMessageDialog(null, "Nenhum utilizador encontrado com essa letra");
    }

    private static int search(String name){
        int pos = 0;
        while(pos < visitors && !visit_in[pos].equalsIgnoreCase(name)) pos++;
        if(pos < visitors) return pos;
        else return -1;
    }
}
