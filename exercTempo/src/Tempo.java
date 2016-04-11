/**
 * Created by Rui on 11/04/2016.
 */
public class Tempo {
    private int hora;
    private int minuto;
    private int segundo;

    public Tempo(){
        hora = 0;
        minuto = 0;
        segundo = 0;
    }

    public int getHora(){
        return hora;
    }

    public int getMinuto(){
        return minuto;
    }

    public int getSegundo(){
        return segundo;
    }

    public void setHora(int hora){
        this.hora = hora;
    }

    public void setMinuto(int minuto){
        this.minuto =  minuto;
    }

    public void setSegundo(int segundo){
        this.segundo = segundo;
    }

    public Tempo(int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    public String toAmPmString() {
        String time;
        if(hora >= 12) time = "PM";
        else time = "AM";
        return String.format("%02d:%02d:%02d " + time, hora, minuto, segundo);
    }

    public void addSecond(){
        if(segundo++ > 59) {
            segundo = 0;
            minuto++;
            if (minuto > 59) {
                minuto = 0;
                hora++;
                if (hora > 23) hora = 0;
            }
        }
    }

    public boolean isMaior(Tempo outroTempo){
        int totalSegundos = contaSegundos();
        int totalSegundos1 = outroTempo.contaSegundos();
        return totalSegundos>totalSegundos1;
    }

    public boolean isMaior(int hora, int minuto, int segundo){
        int totalSegundos = contaSegundos();
        Tempo outroTempo = new Tempo(hora, minuto, segundo);
        int totalSegundos1 = outroTempo.contaSegundos();
        return totalSegundos>totalSegundos1;
    }

    public int difSegundo(Tempo outroTempo){
        int temposegundos = contaSegundos();
        int temposegundos1 = outroTempo.contaSegundos();
        return Math.abs(temposegundos - temposegundos1);
    }

    public Tempo difTempo(Tempo outroTempo){
        Tempo t3 = new Tempo();
        int val;

        if(hora > outroTempo.getHora()){
            if((val = (segundo - outroTempo.getSegundo())) < 0){
                t3.setSegundo(60 - Math.abs(val));
                outroTempo.setMinuto(outroTempo.getMinuto()+1);
            } else t3.setSegundo(val);

            if((val = minuto - outroTempo.getMinuto()) < 0){
                t3.setMinuto(60 - Math.abs(val));
                outroTempo.setHora(outroTempo.getHora()+1);
            } else t3.setMinuto(val);

            t3.setHora(hora - outroTempo.getHora());
        } else{
            t3.setSegundo(segundo - outroTempo.getSegundo());
            t3.setMinuto(minuto - outroTempo.getMinuto());
            t3.setHora(hora - outroTempo.getHora());
        }

        return t3;
    }

    public int contaSegundos(){
        return segundo + minuto*60 + hora*3600;
    }
}
