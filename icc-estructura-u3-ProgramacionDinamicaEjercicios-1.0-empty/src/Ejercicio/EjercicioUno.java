package Ejercicio;

import java.util.ArrayList;
import java.util.List;

public class EjercicioUno {

    public List<List<Integer>> subsets(List<Integer> set) {
        List<List<Integer>> subsets = new ArrayList<List<Integer>>();
        subsets.add(new ArrayList<Integer>()); // Comienza con el conjunto vacío
        
        for (Integer element : set) {
            int n = subsets.size();
            for (int i = 0; i < n; i++) {
                List<Integer> subset = new ArrayList<>(subsets.get(i));
                subset.add(element);
                subsets.add(subset);
            }
        }
        
        return subsets;
    }

    /*public List<List<Integer>> subsets(List<Integer> set) {
        List<List<Integer>> subsets = new ArrayList<List<Integer>>();
        subsets.add(new ArrayList<Integer>());

        for (Integer element : set){
        addSetByElement (element, subsets);
        }
        return subsets;
    }
    
    private void addSetByElement (Integer element, List<List<Integer>>subsets){
    int currentSize = subsets.size();
    for (int i = 0; i < currentSize; i ++){
        List<Integer>newSubset = new ArrayList<Integer>(subsets.get(i));
        newSubset.add(element);
        subsets.add(newSubset);
    }
}*/
}