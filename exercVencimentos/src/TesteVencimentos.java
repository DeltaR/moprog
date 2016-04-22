public class TesteVencimentos {
    public static void main(String[] args) {
        TrabalhadorPeca trabalhador1 = new TrabalhadorPeca("Jorge Silva", 20,30);

        TrabalhadorComissao trabalhador2 = new TrabalhadorComissao("Susana Ferreira", 500, 1500, 6);

        TrabalhadorHora trabalhador3 = new TrabalhadorHora("Carlos Miguel", 160, 3.5f);

        Trabalhador[] work = new Trabalhador[10];

        work[0] = trabalhador1;
        work[1] = trabalhador2;
        work[2] = trabalhador3;

        System.out.println("\n### Listagem das representações textuais dos trabalhadores ###");
        for(int i = 0; i < work.length; i++)
            if(work[i] != null)
                System.out.println(work[i]);

        System.out.println("\n### Listagem das representações textuais apenas dos trabalhadores à hora ###");
        for(int i = 0; i < work.length; i++)
            if(work[i] instanceof TrabalhadorHora)
                System.out.println(work[i]);

        System.out.println("\n### Listagem dos nomes dos trabalhadores existentes, acompanhadas dos respetivos" +
                "vencimentos. ###");
        for(int i = 0; i < work.length; i++)
            if(work[i] != null)
                System.out.printf("%s - Vencimento: %.2f €%n" ,work[i].getNome(), work[i].calcularVencimento());
    }
}
