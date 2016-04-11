public class TesteTempo {

    public static void main(String[] args) {
        Tempo t1 = new Tempo(5, 30, 12);
        System.out.println("t1: " + t1.toAmPmString());
        t1.addSecond();
        System.out.println("t1: " + t1.toAmPmString());
        Tempo t2 = new Tempo(18,5,20);
        System.out.println("t2: " + t2.toAmPmString());
        System.out.println("t1 > t2? " + t1.isMaior(t2));
        System.out.println("t1 > 23:07:04? " + t1.isMaior(23,7,4));
        System.out.println("t1 - t2: " + t1.difSegundo(t2) + " segundos");
        System.out.println("t1 - t2: " + t1.difTempo(t2));
    }
}
