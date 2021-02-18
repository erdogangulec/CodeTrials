package vize;

public class bellsayi {
	 
    static String s = "";
 
    public static void main(String args[]) {
        //Highest number with unique digits (no 0 or 5)
        int i = 98764321;
        boolean isUnique = true;
        boolean canBeDivided = true;
        while (i>0) {
            s = String.valueOf(i);
            isUnique = uniqueDigits(i);
            if (isUnique) {
                //Number has unique digits
                canBeDivided = testNumber(i);
                if(canBeDivided) {
                    System.out.println("Number found: " + i);
                    i=0;
                }
            }
            i--;
        }
    }

	private static boolean uniqueDigits(int i) {
		// TODO Auto-generated method stub
		return false;
	}

	private static boolean testNumber(int i) {
		// TODO Auto-generated method stub
		return false;
	}
 
}