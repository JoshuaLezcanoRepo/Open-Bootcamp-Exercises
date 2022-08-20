public class Main {
    public static void main(String[] args) {
        int numeroIf = 0;
        int numeroWhile = 0;
        var estacion = "Invierno";

        System.out.println("Ciclo If");
        if (numeroIf > 0) {
            System.out.println("Número Positivo");
        } else if (numeroIf < 0){
            System.out.println("Número Negativo");
        } else {
            System.out.println("Número 0");
        }

        System.out.println("Ciclo While");
        while (numeroWhile < 3) {
            numeroWhile = numeroWhile + 1;
            System.out.println(numeroWhile);
        }

        System.out.println("Ciclo Do");
        do {
            numeroWhile = numeroWhile + 1;
            System.out.println(numeroWhile);
        } while (numeroWhile < 3);

        System.out.println("Ciclo For");
        for (int numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor + 1) {
            System.out.println(numeroFor);
        }

        System.out.println("Ciclo Switch");
        switch (estacion){
            case "Verano":
                System.out.println("La estación es Verano");
                break;
            case "Invierno":
                System.out.println("La estación es Invierno");
                break;
            case "Primavera":
                System.out.println("La estación es Primavera");
                break;
            case "Otoño":
                System.out.println("La estación es Otoño");
                break;
            default:
                System.out.println("No es una estación");
        }
    }
}