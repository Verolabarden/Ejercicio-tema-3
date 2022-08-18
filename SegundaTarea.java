package paqprincipal;

public class SegundaTarea {
    public static void main(String[] args) {
        coch1 micoche= new coch1();
        micoche.Aumentar();
        System.out.println(micoche.puertas);


    }

    static class coch1 {
        public int puertas=0;
        public  void Aumentar() {
            this.puertas++;


        }

    }
}
