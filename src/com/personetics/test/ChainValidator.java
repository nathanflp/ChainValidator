package com.personetics.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ChainValidator {

    private final Node node;

    public ChainValidator(Node node) {
        this.node = node;
    }

 /*
    Validates if the list is valid.
    1- Receives a list of nodes, Calls the IsThereAnyDivergentObject method that checks if all elements in the list are the same type.
    2- If they are valid transforms it into a new hashset object removing duplicated values and reducing time complexity to O(1).
    3- Calls the recoverNextElements method which returns a list of nodes that the current node depends.
    4- Checks if the hashset contains all the values returned by recorverNextElements. If not returns false.
 */
    public static boolean validate(List<Node> nodes){

        if (Node.IsThereAnyDivergentObject(nodes)) {
            return false;
        }

        Set<Node> hashSet = new HashSet<>(nodes);
        for (Node node : nodes) {
            if (!hashSet.containsAll(node.recorverNextElements())) {
                return false;
            }

        }
        return true;
    }
}
