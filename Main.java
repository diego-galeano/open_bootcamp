public class Main {

    public static void main (String[] args){
        sum(2,4,5);
        Coche miCoche = new Coche();
        miCoche.agregarPuerta();
        System.out.println(miCoche.puertas);
    }
    public static int sum(int a, int b, int c){
        return a + b + c;
    }


}
class Coche{
    int puertas = 4;
    public void agregarPuerta(){
        this.puertas++;
    }
}
