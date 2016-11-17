package merge;

import java.util.ArrayList;

public class MergeSortTest {
	public static void main(String[] args) {
		MergeSortImplement MergeSort = new MergeSortImplement();
        ArrayList<Integer> listOfNumber = new ArrayList<Integer>();
        listOfNumber.add(5);
        listOfNumber.add(10);
        listOfNumber.add(1);
        listOfNumber.add(4);
        listOfNumber.add(7);
        listOfNumber.add(9);
        listOfNumber.add(3);
        listOfNumber.add(20);
        listOfNumber.add(10);
        listOfNumber.add(13);
        
        MergeSort.mergeSort(listOfNumber);
        System.out.println(listOfNumber);
    }
}
