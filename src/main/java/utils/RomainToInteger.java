package utils;

import exception.ErrorCodes;
import exception.InvalidOperationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import parsers.ParserRomanToInteger;
import languages.Roman;
import validator.RomanValidator;

import java.util.List;

public class RomainToInteger {
  private static Logger LOG = LoggerFactory.getLogger(ParserRomanToInteger.class);

  public static int romanToInt(Roman roman){
    List<String> errors = RomanValidator.validate(roman);
    if (!errors.isEmpty()) {
      LOG.error("Roman is not valid {}", roman);
      throw new InvalidOperationException("Le chiffre romain n'est pas valide", ErrorCodes.ROMAN_IS_NOT_VALID, errors);
    }
    String s = roman.getWriting();
    int somme = 0;
    int x = 0;

    for( int i = s.length()-1; i >= 0; i--){
      int current = valueOfRomanLetter((s.charAt(i)));
      if( current >= x ){
        x = current;
        somme += x;
      }else{
        RomanValidator.validateSoustraction(s.charAt(i),s.charAt(i+1));
        somme -= current;
      }
    }
    return somme;
  }
  static int valueOfRomanLetter(char lettre) {
    switch (lettre) {
      case 'I':
        return 1;
      case 'V':
        return 5;
      case 'X':
        return 10;
      case 'L':
        return 50;
      case 'C':
        return 100;
      case 'D':
        return 500;
      case 'M':
        return 1000;
      default:
        throw new NumberFormatException(
          "Illegal character \"" + lettre + "\" in Roman numeral");
    }
  }
}
