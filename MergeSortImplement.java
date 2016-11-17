package merge;

import java.util.ArrayList;

public class MergeSortImplement {
	// merge 2 sub-ArrayList to make a new ArrayList
	public void merge(ArrayList<Integer> numberList, ArrayList<Integer> leftNumberList, ArrayList<Integer> rightNumberList) {
		
		int index = 0;
		int leftIndex = 0;
		int rightIndex = 0;

		while (leftIndex < leftNumberList.size() && rightIndex < rightNumberList.size()) {
			//compare & add the bigger element to numberList 
			if (leftNumberList.get(leftIndex) < rightNumberList.get(rightIndex)) {
				numberList.set(index, leftNumberList.get(leftIndex));
				index++;
				leftIndex++;
			} else {
				numberList.set(index, rightNumberList.get(rightIndex));
				index++;
				rightIndex++;
			}
		}
		
		//add the rest of leftNumberList to numberList
		if (rightIndex >= rightNumberList.size()) {
			while (leftIndex < leftNumberList.size()) {
				numberList.set(index, leftNumberList.get(leftIndex));
				index++;
				leftIndex++;
			}
		}
		
		//add the rest of rightNumberList to numberList
		if (leftIndex >= leftNumberList.size()) {
			while (rightIndex < rightNumberList.size()) {
				numberList.set(index, rightNumberList.get(rightIndex));
				index++;
				rightIndex++;
			}
		}

	}

	public void mergeSort(ArrayList<Integer> numberList) {
		if (numberList.size() == 1) {
			return;
		}
		int mid = numberList.size() / 2;
		ArrayList<Integer> leftNumberList = new ArrayList<Integer>();
		ArrayList<Integer> rightNumberList = new ArrayList<Integer>();
		
		// Add elements from position 1st - (mid -1) of numberList to leftNumberList 
		for (int index = 0; index < mid; index++) {
			leftNumberList.add(numberList.get(index));
		}
		
		// Add elements from mid - end of numberList to leftNumberList 
		for (int index = mid; index <= numberList.size() - 1; index++) {
			rightNumberList.add(numberList.get(index));
		}
		mergeSort(leftNumberList);
		mergeSort(rightNumberList);

		merge(numberList, leftNumberList, rightNumberList);
	}
}