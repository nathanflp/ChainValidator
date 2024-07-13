package com.personetics.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NumberNode implements Node{

    private int number;

    public NumberNode(int number) {
        this.number = number;
    }

//    Checks if a number is greater than or equal to 10 and return a list that contains every element presented in that number
    @Override
    public List<Node> recorverNextElements() {
        List<Node> elements = new ArrayList<>();

        if (number >= 10) {
            int valueEqualOrGreaterThanDozen = number / 10;
            int valueEqualUnits = number % 10;

            elements.add(new NumberNode(valueEqualOrGreaterThanDozen));
            elements.add(new NumberNode(valueEqualUnits));

            return elements;
        }

        return elements;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumberNode that = (NumberNode) o;
        return number == that.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "NumberNode{" +
                "number=" + number +
                '}';
    }

}
