
public class CellTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cell<Integer, String> mixCell = new Cell<Integer, String>();
		Cell<Integer, Integer> integerCell = new Cell<Integer, Integer>();
		Cell<String, String> stringCell = new Cell<String, String>();
		stringCell.setValue("Budi", "Susi");
		
		mixCell.setValue(1, "4");
		integerCell.setValue(45, 60);
		int mcType1 = mixCell.getT1Value();
		String mcType2 = mixCell.getT2Value();
		int icType1 = integerCell.getT1Value();
		int icType2 = integerCell.getT2Value();
		System.out.println(mixCell);
		System.out.println(integerCell);
		System.out.println("The numerical value is: " +
				mcType1 + ". The text value is: " + mcType2);
		System.out.println("The first numerical value is: " + icType1 +
				" and the second is : " + icType2);
		System.out.println("--------------------------");
		System.out.println(stringCell);
	}//end main

	

}
