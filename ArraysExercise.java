
public class ArraysExercise {
	//1
	public static void main(String[] args) {
		double[] exampleArray = {1,5,6,5,4,1};
		double sum = 0.0;
		for (int i = 0; i < exampleArray.length; i++) {
			sum += exampleArray[i];
		}
		System.out.println(sum);
		
		//testing 3
		int[] powers = ArraysExercise.toPower(4, 2);
		for(int i = 0; i < powers.length; i++) {
			System.out.println(powers[i]);
		}
		
	}
	//2 
	//The output would be the index of the largest value in the array
	
	//3
	public static int[] toPower(int size, int power) {
		//create an array of the size we need
		int[] powerArray = new int[size];
		//loop through the array and set each value to the correct value
		for(int i = 0; i < size; i++) {
			powerArray[i] = (int) Math.pow(i, power);
		}
		return powerArray;
	}
}
