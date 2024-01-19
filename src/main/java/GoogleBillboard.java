

public class GoogleBillboard {
	public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";  
	String digits;
	double dNum;
	public static void main(final String[] args) {
		for(int i = 12; i<e.length(); i++){
    digits=e.substring(i-10,i);
    dNum = Double.parseDouble(digits);
    if (isPrime(dNum)==true){
      System.out.println(dNum);
      break;
    }
  }
	}
	

	//Finish this function
	public boolean isPrime(double dNum){
  if (dNum<10){
    return false;
  }
  for (int i = 2; i<=Math.sqrt(dNum); i++)
  {
    if (dNum%i==0)
    {
      return false;
    }
  }
  return true;
}
