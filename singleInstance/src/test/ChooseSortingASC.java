package test;

public class ChooseSortingASC {

	public static void main(String[] args) {
		int unsorted[] = {23,43,54,65,2,3,4,54,56,34,76,87,98,54,24,65,2,4,54,65,8,8};
		int replace = 0;
		int compare = 0;
		for(int i = 0 ; i < unsorted.length-1 ; i++){
			//ѡ������Ч�ʸ��ߣ���Ϊ���ų����Ѿ��źõĲ���
			//�˴���ѭ�������㿪ʼ������ΪС�ڳ���-1����һ��ʼ������ΪС�ڳ���
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
