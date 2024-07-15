import Ejercicio.EjercicioDos;
import Ejercicio.EjercicioUno;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // Ejercicio Uno
        EjercicioUno ejerUno = new EjercicioUno();
        List<Integer> set = new ArrayList<>();
        set.add(1);
        set.add(2);
        set.add(3);
        List<List<Integer>> resultUno = ejerUno.subsets(set);
        System.out.println("Ejercicio 1:");
        System.out.println(resultUno);

        // Ejercicio Dos
        EjercicioDos ejerDos = new EjercicioDos();
        
        int n1 = 1;
        List<String> resultDos1 = ejerDos.generateParenthesis(n1);
        System.out.println("Ejercicio 2 con 1 de entrada:");
        System.out.println(resultDos1);
        
        int n3 = 3;
        List<String> resultDos3 = ejerDos.generateParenthesis(n3);
        System.out.println("Ejercicio 2 con 3 de entrada:");
        System.out.println(resultDos3);
    }
}
