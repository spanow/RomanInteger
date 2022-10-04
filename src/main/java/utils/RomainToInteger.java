package utils;

import exception.ErrorCodes;
import exception.InvalidOperationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import parsers.ParserRomanToInteger;
import languages.Roman;
import validator.RomanValidator;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;

public class RomainToInteger {
    private static final Logger LOG = LoggerFactory.getLogger(ParserRomanToInteger.class);
    private static HashMap<Character, Integer> values = new HashMap();

    static {
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);
    }


    public RomainToInteger(){

    }
    public int romanToInt(Roman roman) {
        List<String> errors = RomanValidator.validate(roman);
        if (!errors.isEmpty()) {
            LOG.error("Roman is not valid {}", roman);
            throw new InvalidOperationException("The Roman Numeral is not Valid", ErrorCodes.ROMAN_IS_NOT_VALID, errors);
        }
        String s = roman.getWriting();
        int somme = 0;
        int x = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int current = valueOfRomanLetter((s.charAt(i)));
            if (current >= x) {
                x = current;
                somme += x;
            } else {
                RomanValidator.validateSoustraction(s.charAt(i), s.charAt(i + 1));
                somme -= current;
            }
        }
        return somme;
    }

    private static int valueOfRomanLetter(char lettre) {

        if (values.containsKey(Character.valueOf(lettre))) {
            return values.get(lettre);
        }
        throw new NumberFormatException(
                "Illegal character \"" + lettre + "\" in Roman numeral");
    }
}

