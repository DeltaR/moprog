public class TesteData {

    public static void main(String[] args) {
        Data data1 = new Data(2016, 04, 11);
        System.out.println("data1: " + data1);
        Data data2 = new Data(1974, 04, 25);
        System.out.println("data2: " + data2.toAnoMesDiaString());
        System.out.println("data1 > data2? " + data1.isMaior(data2));
        System.out.println("data1-data2: " + data1.diferenca(data2) + " dias.");
        System.out.println("data1-Natal: " + data1.diferenca(2016, 12, 25) + " dias.");
        System.out.println("dia da semana data2: " + data2.diaDaSemana());
        System.out.println("data2: 1974 bissexto? " + data2.isAnoBissexto(1974));
        System.out.println("Data: 1974 bissexto? " + Data.isAnoBissexto(1974));
    }
}
