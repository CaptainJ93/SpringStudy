package test;

public class BubbleSortingASC {
	// ����Ļ�����С�ĴӺ���ð����ǰ���������ð�������
	public static void main(String[] args) {
		int unsorted[] = {23,43,54,65,2,3,4,54,56,34,76,87,98,54,24,65,2,4,54,65,8,98};
		int replace = 0;
		int compare = 0;
		//С�ĵ�ǰ��
		for (int j = 0; j < unsorted.length - 1 ; j++) {
			for (int i = unsorted.length - 1; i > 0; i--) {
				if (unsorted[i] < unsorted[i - 1]) {
					int t = unsorted[i];
					unsorted[i] = unsorted[i - 1];
					unsorted[i - 1] = t;
		replace++;
				}
		compare++;
			}
		}

		//��ĵ�����
		// for(int i = 0 ; i < unsorted.length - 1 ; i++){
		// for(int j = 0 ; j < unsorted.length - 1 ; j++){
		// if(unsorted[j] > unsorted[j+1]){
		// int t = unsorted[j];
		// unsorted[j] = unsorted[j+1];
		// unsorted[j+1] = t;
		// replace++;
		// }
		// compare++;
		// }
		// }
		for (int i = 0; i <= unsorted.length - 1; i++) {
			System.out.println(unsorted[i] + " ");
		}
		System.out.println(replace + " " + compare);

	}

}
