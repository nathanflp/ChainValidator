package com.personetics.test;

import java.util.List;

public class PopulateNodesWithNumbersAndWords {

   private List<Node> numbers = List.of(
            new NumberNode(36),
            new NumberNode(6),
            new NumberNode(24),
            new NumberNode(4),
            new NumberNode(47),
            new NumberNode(7),
            new NumberNode(2),
            new NumberNode(3),
            new NumberNode(27)
    );

    private List<Node> words = List.of(
            new WordNode("p"),
            new WordNode("aba"),
            new WordNode("a"),
            new WordNode("b"),
            new WordNode("perso"),
            new WordNode("o"),
            new WordNode("r"),
            new WordNode("e"),
            new WordNode("s")
    );

    private List<Node> notValidNode = List.of(
            new NumberNode(64),
            new NumberNode(5),
            new NumberNode(65),
            new NumberNode(6),
            new NumberNode(24),
            new NumberNode(4)
    );

    public PopulateNodesWithNumbersAndWords() {
    }

    public List<Node> getNumbers() {
        return numbers;
    }

    public List<Node> getWords() {
        return words;
    }

    public List<Node> getNotValidNode() {
        return notValidNode;
    }
}
