public class Main {
    public static void main(String[] args) {
        suma(2, 2, 5);
        Coche miCoche = new Coche();
        miCoche.sumaPuerta(2);
    }
    public static void suma(int a, int b, int c) {
        System.out.println("El Resultado de la Suma entre los numeros es: " + (a + b + c));
    }
}

class Coche {
    public int npuertas = 2;

    public void sumaPuerta(int d) {
        this.npuertas = npuertas + d;
        System.out.println("El Nro de Puertas es: " + npuertas);
    }
}