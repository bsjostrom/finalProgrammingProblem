
/**
 * Write a description of class Rational here.
 *
 * @author Bailee
 * @version (a version number or a date)
 */
public class Rational
{
    private int numerator;
    private int denominator;
    
    public Rational () {
    numerator = 0;
    denominator = 1;
}
    
    public void setNumerator(int numerator) {
      this.numerator = numerator;
    }
    
    public int getNumerator() {
        return this.numerator;
    }
    
     public void setDenominator(int denominator) {
      this.denominator = denominator;
    }
    
    public int getDenominator() {
        return this.denominator;
    }
    
    /*public String toString() { //step 6
        return String.format();
        
    }
    
    public void negate(){ //step 8
        setNumerator(numerator * -1);
        
    }
    
    public void invert(){ // step 10
        numerator = denominator;
        denominator = numerator;
        
    }
    public String printRational()
    {
        printRational = getNumerator() + "/" + getDenominator();
        return printRational;
        //displays a rational in some format
    }*/
    
    
    public static void main() {
       Rational rational = new Rational();
       
       
       rational.setNumerator(5);
       rational.setDenominator(10);
       
       
      System.out.println("Step 5: " + rational.getNumerator() + ":" + rational.getDenominator());
      //System.out.println(rational.negate());
      
              
}


}
