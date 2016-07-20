package calculadora.test;
import java.util.Scanner;

public class Romannumeral {

  public static void main(String[] args) {
	  Romannumeral.CalNum();
  }

public static void CalNum(){
	
    Scanner sc = new Scanner(System.in);
    int Number;
    boolean flag=true;
    do {
           System.out.print("Introduce un número entre 1 y 3000: ");
           Number = sc.nextInt();
           if(Number >3000 || Number<0 || Number==0){
     		  System.out.println("INVALID NUMBER!!");
     	  }else{
       System.out.println(Number + " en numeros romanos -> " + convertirANumerosRomanos(Number));
       flag=false;
     	  }
    } while (flag==true);
	
}
  public static String convertirANumerosRomanos(int number) {
      int i, miles, cent, dec, unit;
      String roman = "";
     
      miles = number / 1000;
      cent = number / 100 % 10;
      dec = number / 10 % 10;
      unit = number % 10;


      for (i = 1; i <= miles; i++) {
    	  roman = roman + "M";
      }

      if (cent == 9) {
    	  roman = roman + "CM";
      } else if (cent >= 5) {
    	  roman = roman + "D";
                     for (i = 6; i <= cent; i++) {
                    	 roman = roman + "C";
                     }
      } else if (cent == 4) {
    	  roman = roman + "CD";
      } else {
                  for (i = 1; i <= cent; i++) {
                         roman = roman + "C";
                  }
      }

      if (dec == 9) {
           roman = roman + "XC";
      } else if (dec >= 5) {
                      roman = roman + "L";
                      for (i = 6; i <= dec; i++) {
                            roman = roman + "X";
                      }
      } else if (dec == 4) {
                      roman = roman + "XL";
      } else {
                    for (i = 1; i <= dec; i++) {
                           roman = roman + "X";
                    }
      }

      if (unit == 9) {
           roman = roman + "IX";
      } else if (unit >= 5) {
                      roman = roman + "V";
                      for (i = 6; i <= unit; i++) {
                             roman = roman + "I";
                      }
      } else if (unit == 4) {
                      roman = roman + "IV";
      } else {
                  for (i = 1; i <= unit; i++) {
                         roman = roman + "I";
                  }
      }
      return roman;
  }
}
