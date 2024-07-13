package com.personetics.test;

import java.util.List;


public interface Node {

    // Return a list of nodes that the current node depends
    List<Node> recorverNextElements();

/*
    Validates if there is any different object class on the list.
    1- If it finds a divergent element type returns true. Else returns false.
*/

    public static boolean IsThereAnyDivergentObject(List<Node> list) {

        if (list.isEmpty()) {
            return false;
        }

        Class<? extends Node> tipoInicial = list.get(0).getClass();

        for (Object item : list) {
            if (!item.getClass().equals(tipoInicial)) {
                return true;
            }
        }

        return false;
    }

}


