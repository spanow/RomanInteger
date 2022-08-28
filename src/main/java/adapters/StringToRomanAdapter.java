package adapters;

import romans.Roman;

public class StringToRomanAdapter {

  public static Roman stringToRoman(String stringToFormat){
    Roman roman = new Roman(format(stringToFormat),0);
    return roman;
  }
  private static String format(String s) {
      s=s.replace("IIIII", "V");
      s=s.replace("IIII", "IV");
      s=s.replace("VV", "X");
      s=s.replace("VIV", "IX");
      s=s.replace("XXXXX", "L");
      s=s.replace("XXXX", "XL");
      s=s.replace("LL", "C");
      s=s.replace("LXL", "XC");
      s=s.replace("CCCCC", "D");
      s=s.replace("CCCC", "CD");
      s=s.replace("DD", "M");
      s=s.replace("DCD", "CM");
    return s;
  }
}
