import javax.swing.*;
import java.util.*;

public class Ejer1 {
    public static void main(String[] args) {
        //se crea la cola
        Queue<Integer> numeros = new LinkedList<>();
        int n;

        //Genera 100 numeros entre -25 y 25
        for (int i = 1; i <= 100; i++) {
            n = (int) Math.floor(Math.random()*(-26-25+1)+25);

        //Se pregunta si los numeros son menores que 0 osea negativos
            if (n<0) {
                numeros.add(n);
            }
        }

        //la ventana grafica con el JOptionpane
        JOptionPane.showMessageDialog(null, "La cola es:\n " + numeros);

    }//
}//