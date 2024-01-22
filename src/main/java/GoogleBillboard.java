

public class GoogleBillboard {
	public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";  
	public static void main(final String[] args) {
	String digits;
	double dNum;
	for(int i = 12; i<e.length(); i++){
    		digits=e.substring(i-10,i);
    		dNum = Double.parseDouble(digits);
    		if (isPrime(dNum)==false){
      			System.out.println(dNum);
     			 break;
    			}
  		}
	}
	

	//Finish this function
	public static boolean isPrime(double dNum){
	bolean True = false;
  	for (int i = 2; i<=Math.sqrt(dNum); i++){
	if(dNum%i==0)
	True=true;
	}
	if (True==true){
	return false;
	}
  return true;
}

}
