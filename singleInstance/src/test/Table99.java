package test;
public class Table99 {
	public static void main(String[] args){
		int j = 1,i =1;
		for(; i <= j && j <= 9 ;j++){
				System.out.print(i+" * "+j+" = "+i*j+"  ");
				if(j == 9){
					i++;j = i-1;
					System.out.println("");
				}
			}
		}
}
