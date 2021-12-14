public class Fraction {

    int numerator;
    int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction fraction){
        int tempNumerator = (this.numerator * fraction.denominator) + (this.denominator * fraction.numerator);
        int tempDenominator = (this.denominator * fraction.denominator);
        return new Fraction(tempNumerator,tempDenominator);
    }

//  public void add(Fraction fraction){
//       this.numerator = (this.numerator * fraction.denominator) + (this.denominator * fraction.numerator);
//       this.denominator = (this.denominator * fraction.denominator);
//   }


//    public Fraction subtract(Fraction fraction){
//
//    }
//    public Fraction multiply(Fraction fraction){
//
//    }
//    public Fraction divide(Fraction fraction){
//
//    }
    
    @Override
    public String toString(){
        return (numerator+" / "+denominator);
    }
}
