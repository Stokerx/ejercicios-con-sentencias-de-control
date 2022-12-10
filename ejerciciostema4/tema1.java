package ejerciciostema4;

public class tema1 {
    public static void main(String arg[]){

        var numerolf = -1;

        if (numerolf < 0){
            System.out.println("el numero es negativo");

        }else if (numerolf > 0){
            System.out.println("el numero es positivo");
        }else if (numerolf == 0){

            System.out.println("el numero es cero");

        }

    }
}


class tema2 {

    public static void main (String arg[]){

        System.out.println("---------BUCLE WHILE----------");
        int numeroWhile =0;

        while(numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;

        }
    }

}

class tem3 {

    public static void main(String[] args) {

        System.out.println("-----------BUCLE DOWHILE-----------");

        int numeroDoWhile = 2;

        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile++;

        }while (numeroDoWhile < 3);
    }
}

class tem4{

    public static void main(String[] args) {

        for (int numeroFor = 0; numeroFor < 3; numeroFor++ ){
            System.out.println(numeroFor);
        }
    }
}

class tem5{
    public static void main(String[] args) {

        var estaciones = "invierno";

        switch (estaciones){
            case "spring": case "primmavera":
                System.out.println("es Primavera");
                break;

            case "summer": case "verano":

                System.out.println("es verano");
                break;

            case   "autumn" : case "otono" :
                System.out.println("es otono");
                break;

            case "winter" : case "invierno":
                System.out.println("es invierno");

                break;

            default:
                System.out.println("estamos en marte");
        }
    }
}