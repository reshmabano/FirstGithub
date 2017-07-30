package JAVADemo;

public class ArrayDemo {

	public static void main(String[] args) {
	int array[]=new int[5];
	
	array[0]=1;
	array[1]=2;
	array[2]=3;
	array[3]=4;
	array[4]=5;
	
	int sizeofarray = array.length; 
	
	// System.out.println("Length of array is " + sizeofarray);
	
	for(int i=0;i<sizeofarray;i++){
		System.out.println("student id is " +array[i]);
	}
			
	

	}

}
