package br.edu.fatec.sjc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberAscOrder<T extends Number & Comparable<T>> {

    private CustomStack<T> Stack;

    public NumberAscOrder(CustomStack<T> stack) {
        this.Stack = stack;
    }

    public List<T> sort() throws StackEmptyException {
        List<T> sortedList = new ArrayList<>();

        while (!Stack.isEmpty()) {
            sortedList.add(Stack.pop());
        }

        Collections.reverse(sortedList);
        return sortedList;
    }
}
