package practicearrays;

public class MoveZerosToTheEnd {
	
	public int[] moveZerosToTheEnd(int[] array){
		
		if(array==null||array.length <=0){
			return null;
		}
			int[] returnArray = new  int[array.length];
			int index = 0;
			int count =0;
			int n= array.length;
			for(int i =0;i<array.length;i++){
				if(array[i]!=0){
					returnArray[index]=array[i];
					index++;
					count++;
				}	
			}
			int j=index+1;
			while(j<array.length){
				returnArray[j]=0;		
			}
			return returnArray;
	}
	
	// inplace swap
	
	public void moveZerosToTheEndInPlaceSwap(int[] array){
		if(array==null||array.length <=0){
			System.out.println("Array input in not valid");
		}else{
			int count = 0;
			int temp =0;
			for(int i=0;i<array.length;i++){
				if(array[i]!=0){
					array[count++]=array[i];
					
				}
			}
			while(count<array.length){
				array[count++]=0;
			}
		}
		
	}

}
