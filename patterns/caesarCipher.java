import java.util.*;

public class Main {

    public static String caesarCipher(String text, int shift){

        StringBuilder result = new StringBuilder();

        shift = shift % 26;

        for(int i = 0; i < text.length(); i++){

            char ch = text.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
              char shifted = (char)('a' + ((ch - 'a') + shift) % 26);
              result.append(shifted);
            }else if(ch >= 'A' && ch <= 'Z'){
              char shifted = (char)('A' + ((ch - 'A') + shift) % 26);
              result.append(shifted);
            }else{
              result.append(ch);
            }

        }

        return result.toString();

    }

    public static void main(String[] args) {
      System.out.println(caesarCipher("HELLO", 3));
      System.out.println(caesarCipher("XYZ", 3));
      System.out.println(caesarCipher("Hello World!", 3));
    }
}
