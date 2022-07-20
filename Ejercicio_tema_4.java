public class Ejercicio_tema_4 {
    
    public static void main(String[] arg){
        int numeroIf = 0;
        
        if(numeroIf < 0){
            System.out.println("El número es negativo");
        }else if(numeroIf > 0){
            System.out.println("El número es positivo");
        }else{
            System.out.println("El número es 0");
        }
        int numeroWhile = 0;
        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        do{
            System.out.println(numeroWhile);
        }while (false);

        int numeroFor = 0;

        for (int i = 0; i <= 3; i++){
            System.out.println(i);
        }

        String estacion = "Primavera";
        switch (estacion){
            case "Verano":
                System.out.println("Estás en Verano");
                break;
            case "Otoño":
                System.out.println("Estás en Otoño");
                break;
            case "Invierno":
                System.out.println("Estás en Invierno");
                break;
            case  "Primavera":
                System.out.println("Estás en Primavera");
                break;
            default:
                System.out.println("No es una estación");
        }

    }
}
