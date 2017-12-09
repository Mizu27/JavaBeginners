package tutorials;

/**
 * @author Hamza Mani
 * @date 31.10.2017
 *
 */
public class ASCII_Zeichnungen2 {
	// TODO Gib dort ein '+' aus, wo der Zeilenindex gleich dem Spaltenindex
	// ist, ansonsten gib ein '-' aus.
	public static void main(String[] args){
		//diagLinks();
		twodimenstional();
	}
	private static void twodimenstional (){
		int[][] myArray = { {0,1,2,3}, {3,2,1,0}, {3,5,6,1}, {3,8,3,4} };
		int n=4;
		int x = myArray.length;
		for (int i = 0; i < n; i++) {
	        for (int j = 0; j < n; j++){
		System.out.print(myArray[i][j]);
		}System.out.println("\n"+x);}

	}
	private static void diagLinks() {
	    int n = 2;
	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < n; j++) {
	            if (i == j) {
	                System.out.print("+");
	            } else {
	                System.out.print("-");
	            }
	        }
	        System.out.println();
	    }
	}	
}
