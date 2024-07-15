package Ejercicio;

import java.util.ArrayList;
import java.util.List;

public class EjercicioDos {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate(result, new StringBuilder(), 0, 0, n);
        return result;
    }

    private void generate(List<String> result, StringBuilder current, int open, int close, int max) {
        if (current.length() == max * 2) {
            result.add(current.toString());
            return;
        }

        if (open < max) {
            current.append('(');
            generate(result, current, open + 1, close, max);
            current.deleteCharAt(current.length() - 1); // Volver hacia atras
        }

        if (close < open) {
            current.append(')');
            generate(result, current, open, close + 1, max);
            current.deleteCharAt(current.length() - 1); // Volver hacia atras
        }
    }
}
