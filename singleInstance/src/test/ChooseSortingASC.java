package test;

public class ChooseSortingASC {

	public static void main(String[] args) {
		int unsorted[] = {23,43,54,65,2,3,4,54,56,34,76,87,98,54,24,65,2,4,54,65,8,8};
		int replace = 0;
		int compare = 0;
		for(int i = 0 ; i < unsorted.length-1 ; i++){
			//选择排序效率更高，因为会排除掉已经排好的部分
			//此处内循环，从零开始条件就为小于长度-1，从一开始条件就为小于长度
			for(int j = i ; j < unsorted.length-1 ; j++){
				if(unsorted[i] > unsorted[j+1]){
					int t = unsorted[i];
					unsorted[i] = unsorted[j+1];
					unsorted[j+1] = t;
					replace++;
				}
				compare++;
			}
		}
		
		for (int i = 0; i <= unsorted.length - 1; i++) {
			System.out.println(unsorted[i] + " ");
		}
		System.out.println(replace + " " + compare);
	}

}
