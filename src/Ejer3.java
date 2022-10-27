import java.util.*;

public class Ejer3 {
    public static void main(String[] args) throws Exception {
        // Punto Uno

        Queue<Integer> FilaUno = new LinkedList<>();
        Queue<Integer> FilaDos = new LinkedList<>();
        Queue<Integer> FilaTres = new LinkedList<>();

        Queue<Integer> Carritos = new LinkedList<>();


        //Llenar fila Aleatoriamente con 20 Clientes
        for (int i = 0;i<=20 ;i++ ){
            //Aleatoriamente selecionamos llenamos las filas
            int n = (int) (Math.random() * (4 - 1)) + 1;
            switch(n){
                case 1:
                    FilaUno.add(i);
                    break;
                case 2:
                    FilaDos.add(i);
                    break;
                case 3:
                    FilaTres.add(i);
                    break;
            }
        }
        //Imprimimos las cantidad de clientes en las filas
        System.out.println("Cantidad de Clientes en la ");
        System.out.println("Fila Uno = " + FilaUno.size());
        System.out.println("Fila Dos = " + FilaDos.size());
        System.out.println("Fila Tres = " + FilaTres.size());
        //System.out.println("-------------------------------------");

        //Generamos Carritos de Compras
        int m = (int) (Math.random() * (0 - 25)) + 26;
        for (int i = 0;i<=m ;i++ ){
            Carritos.add(i);
        }
        //Comparamos si hay carritos disponibles
        System.out.println("De 25 Hay " +Carritos.size() +" carritos disponibles");

        if(Carritos.size() != 0){

            //Comparamos cual fila tiene menos clientes
            //Fila Uno
            if (FilaUno.size()<FilaDos.size() && FilaUno.size()<FilaTres.size()){
                System.out.println("Haga la fila en la caja Uno");
            }
            //Fila Dos
            else if (FilaDos.size()<FilaUno.size() && FilaDos.size()<FilaTres.size()){
                System.out.println("Haga la fila en la caja Dos");
            }
            //Fila Tres
            else if (FilaTres.size()<FilaUno.size() && FilaTres.size()<FilaDos.size()){
                System.out.println("Haga la fila en la caja Tres");
            }
            //Fila Iguales
            else{
                if (FilaTres.size() == FilaUno.size() && FilaTres.size() == FilaDos.size()){
                    //Si son iguales.... de forma aleatoria se asigna a cualquier fila
                    int n = (int) (Math.random() * (4 - 1)) + 1;
                    //Asignamos el dato
                    switch( n ){
                        case 1:
                            FilaUno.add(n);
                            System.out.println("Haga la fila en la caja Uno");
                            break;
                        case 2:
                            FilaDos.add(n);
                            System.out.println("Haga la fila en la caja Dos");
                            break;
                        case 3:
                            FilaTres.add(n);
                            System.out.println("Haga la fila en la caja Tres");
                            break;
                    }
                }else if(FilaTres.size() == FilaUno.size()){
                    //Si son iguales.... de forma aleatoria se asigna a cualquier fila
                    int n = (int) (Math.random() * (4 - 1)) + 1;
                    System.out.println("numero generado " + n);
                    //Asignamos el dato
                    switch( n ){
                        case 1:
                            FilaUno.add(n);
                            System.out.println("Haga la fila en la caja Uno");
                            break;
                        case 3:
                            FilaTres.add(n);
                            System.out.println("Haga la fila en la caja Tres");
                            break;
                    }
                }else if(FilaTres.size() == FilaDos.size()){
                    //Si son iguales.... de forma aleatoria se asigna a cualquier fila
                    int n = (int) (Math.random() * (4 - 1)) + 1;
                    System.out.println("numero generado " + n);
                    //Asignamos el dato
                    switch( n ){
                        case 3:
                            FilaTres.add(n);
                            System.out.println("Haga la fila en la caja Tres");
                            break;
                        case 2:
                            FilaDos.add(n);
                            System.out.println("Haga la fila en la caja Dos");
                            break;
                    }
                }else if(FilaTres.size() == FilaDos.size()){
                    //Si son iguales.... de forma aleatoria se asigna a cualquier fila
                    int n = (int) (Math.random() * (4 - 1)) + 1;
                    System.out.println("numero generado " + n);
                    //Asignamos el dato
                    switch( n ){
                        case 1:
                            FilaUno.add(n);
                            System.out.println("Haga la fila en la caja Uno");
                            break;
                        case 2:
                            FilaDos.add(n);
                            System.out.println("Haga la fila en la caja Dos");
                            break;
                    }
                }
            }
            Carritos.remove();
            System.out.println("Total Carritos Disponibles "+ Carritos.size());
            //Verificamos si el cliente se quiere salir
            int c = (int) (Math.random() * (0 - 2)) + 2;
            //Si es 2 Cliente quiere Continuar
            if (c==1){
                System.out.println("EL cliente quiere Salir de la fila" );
                System.out.println("usted no puede salir de la fila");
            }else{
                //Cliente quiere salir de la Cola
                System.out.println("El cliente quiere seguir realizando la fila");

                System.out.println("El Cliente ha realizado el pago " +
                        "exitosamente " + c);
                //Vuelve y se pone el carrito en la fila de carritos
                Carritos.add(1);
                //se resta un cliente en la fila
            }
        }else{
            System.out.println("No hay carritos disponibles, debes esperar Uno" );
        }
    }


}
