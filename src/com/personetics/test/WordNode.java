package com.personetics.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WordNode implements Node {

    private String letters;

    public WordNode(String letters) {
        this.letters = letters;
    }


// Transforms every letter on the node into a character and return a list that contain the characters
    @Override
    public List<Node> recorverNextElements() {
        List<Node> elements = new ArrayList<>();

        for (char c : letters.toCharArray()) {
            elements.add(new WordNode(String.valueOf(c)));
        }
        return elements;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WordNode wordNode = (WordNode) o;
        return Objects.equals(letters, wordNode.letters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(letters);
    }

    @Override
    public String toString() {
        return "WordNode{" +
                "letters='" + letters + '\'' +
                '}';
    }
}
