package validator;


import languages.Roman;

import java.util.ArrayList;
import java.util.List;

public class RomanValidator {

  public static List<String> validate(Roman roman) {
    List<String> errors = new ArrayList<>();

    if (roman == null) {
      errors.add("Veuillez renseigner un chiffre Romain!");

      return errors;

    }
    if (roman.getWriting().length()==0) {
      errors.add("Veuillez renseigner un chiffre Romain!");
    }
    if(!validateRomanWriting(roman.getWriting())){
      errors.add("Veuillez revoir la manière dont vous avez écris votre chiffre Romain");
    }

    return errors;
  }


  private static boolean validateRomanWriting(String writing){
    if (writing.length()==0)
      return false;
//    for(int i=0;i<writing.length()-1;i++){
//      if(writing.charAt(i) != 'I' && writing.charAt(i) != 'X' && writing.charAt(i) != 'M' &&writing.charAt(i) != 'V' &&writing.charAt(i) != 'L' &&writing.charAt(i) != 'C'&& writing.charAt(i) != 'D')
//        return false;
//      if(writing.charAt(i)=='I' && (writing.charAt(i+1)!='V' || writing.charAt(i+1)!='X' || writing.charAt(i+1)!='I')){
//        return false;
//      }
//      if(writing.charAt(i)=='X' && (writing.charAt(i+1)!='L' || writing.charAt(i+1)!='C' || writing.charAt(i+1)!='X')){
//        return false;
//      }
//      if(writing.charAt(i)=='C' && (writing.charAt(i+1)!='D' || writing.charAt(i+1)!='M' || writing.charAt(i+1)!='C')){
//        return false;
//      }
//    }

    return true;
  }

}
