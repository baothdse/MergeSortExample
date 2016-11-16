package merge;

import java.util.ArrayList;

public class MergeSortTest {
	public static void main(String[] args) {
		MergeSortImplement test = new MergeSortImplement();
        ArrayList<Integer> listOfNumber = new ArrayList<Integer>();
        listOfNumber.add(5);
        listOfNumber.add(8);
        listOfNumber.add(1);
        listOfNumber.add(4);
        listOfNumber.add(7);
        listOfNumber.add(9);
        listOfNumber.add(3);
        test.mergeSort(listOfNumber);
    }
}
