package br.edu.fatec.sjc;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class NumberAscOrderTest {
    @Test
    public void testSortNumbersInCustomStack() throws StackEmptyException {

        CustomStack<Integer> mockStack = mock(CustomStack.class);

        when(mockStack.isEmpty()).thenReturn(false, false, false, false, false, false, true);
        when(mockStack.pop()).thenReturn(10, 9, 7, 5, 3, 1);

        NumberAscOrder<Integer> numberSorter = new NumberAscOrder<>(mockStack);

        List<Integer> sortedList = numberSorter.sort();

        assertEquals(6, sortedList.size());

        assertEquals(1, sortedList.get(0));
        assertEquals(3, sortedList.get(1));
        assertEquals(5, sortedList.get(2));
        assertEquals(7, sortedList.get(3));
        assertEquals(9, sortedList.get(4));
        assertEquals(10, sortedList.get(5));
    }

    @Test
    public void testSortWithNoElementsInStack() throws StackEmptyException {

        CustomStack<Integer> mockStack = mock(CustomStack.class);

        when(mockStack.isEmpty()).thenReturn(true);

        NumberAscOrder<Integer> numberSorter = new NumberAscOrder<>(mockStack);

        List<Integer> sortedList = numberSorter.sort();

        assertTrue(sortedList.isEmpty());
    }
}