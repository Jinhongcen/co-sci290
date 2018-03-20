/*
  Jinhong Cen
  Co sci290
  6.8 (Conversions between Celsius and Fahrenheit) Write a class that contains the following two methods:
  /** Convert from Celsius to Fahrenheit 
public static double celsiusToFahrenheit(double celsius)
/** Convert from Fahrenheit to Celsius 
public static double fahrenheitToCelsius(double fahrenheit)
The formula for the conversion is: fahrenheit = (9.0 / 5) * celsius + 32 celsius = (5.0 / 9) * (fahrenheit – 32)
*/
import java.text.DecimalFormat;
public class Lab10{
  public static double celsiusToFahrenheit(double celsius){
    double ToFa;
    ToFa = (9.0/5)*celsius+32;
    return ToFa;
  }
/** Convert from Fahrenheit to Celsius */
    
public static double fahrenheitToCelsius(double fahrenheit){
  double ToCe;
  ToCe = (5.0/9)*(fahrenheit-32);
  return ToCe;
}
  public static void main(String[] args){
    double i,j,k,l,a,b,c,d;
    DecimalFormat df = new DecimalFormat("#.00");
    i=celsiusToFahrenheit(40.0);
    j=celsiusToFahrenheit(39.0);
    k=celsiusToFahrenheit(32.0);
    l=celsiusToFahrenheit(31.0);
    a=fahrenheitToCelsius(120.0);
    b=fahrenheitToCelsius(110.0);
    c=fahrenheitToCelsius(40.0);
    d=fahrenheitToCelsius(30.0);
    System.out.println( 
   " Celsius Fahrenheit | Fahrenheit Celsius\n"
 + " 40.0    " + i+"      | 120.0      " +  df.format(a)+"\n"
 + " 39.0    "+ j +"      | 110.0      " +  df.format(b)+"\n"
 + "  ...\n" 
 + " 32.0    "+ k +"       | 40.0       "  +   df.format(c) +"\n"
 + " 31.0    "+ df.format(l)+"      | 30.0       "  +  df.format(d)
);
  }
}