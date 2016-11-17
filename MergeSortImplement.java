package merge;

import java.util.ArrayList;

public class MergeSortImplement {
	public void merge(ArrayList<Integer> numberList, ArrayList<Integer> leftNumberList,
			ArrayList<Integer> rightNumberList) {
		int index = 0;
		int leftIndex = 0;
		int rightIndex = 0;

		while (leftIndex < leftNumberList.size() && rightIndex < rightNumberList.size()) {
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

		if (rightIndex >= rightNumberList.size()) {
			while (leftIndex < leftNumberList.size()) {
				numberList.set(index, leftNumberList.get(leftIndex));
				index++;
				leftIndex++;
			}
		}

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
		for (int i = 0; i < mid; i++) {
			leftNumberList.add(numberList.get(i));
		}

		for (int i = mid; i <= numberList.size() - 1; i++) {
			rightNumberList.add(numberList.get(i));
		}
		mergeSort(leftNumberList);
		mergeSort(rightNumberList);

		merge(numberList, leftNumberList, rightNumberList);
	}
}
