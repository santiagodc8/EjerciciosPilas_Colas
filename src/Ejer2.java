import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Ejer2 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Queue<Integer> cola1 = new LinkedList<>();
        Queue<Integer> cola2 = new LinkedList<>();

        System.out.println("Ingrese el numero total de elementos que va a " +
                "tener la primera cola");

        int total1 = entrada.nextInt();

        System.out.println("Ingrese " + total1 + " numeros para la primera " +
                "cola");
        for(int i=0;i<total1;i++){
            System.out.println("Elemento["+(i+1)+"]:");
            int num1 = entrada.nextInt();
            cola1.add(num1);
        }

        System.out.println("Ingrese el numero total de elementos que va a " +
                "tener la segunda cola");

        int total2 = entrada.nextInt();

        System.out.println("Ingrese " + total2 + " numeros para la segunda " +
                "cola");
        for(int i=0;i<total2;i++){
            System.out.println("Elemento["+(1+i)+"]:");
            int num2 = entrada.nextInt();
            cola2.add(num2);
        }

        System.out.println("La cola 1 es: " + cola1);
        System.out.println("La cola 2 es: " + cola2);

        if ( cola1.size() == cola2.size() ){
            System.out.println("las colas son iguales ");

        } else {
            System.out.println("las colas no son iguales ");
        }

    }

}


