public class Main {

public static String runLengthEncode(String str) {

  if(str == null || str.length() == 0){
    return "";
  }

  StringBuilder result = new StringBuilder();

  int count = 1;

  for(int i = 1; i < str.length(); i++){

    if(str.charAt(i) == str.charAt(i - 1)){
      count++;
    }else{
      result.append(str.charAt(i - 1));
      result.append(count);

      count = 1;
    }
  }
  result.append(str.charAt(str.length() - 1));
  result.append(count);

  return result.toString();

}

public static void main(String[] args) {
    System.out.println(runLengthEncode("aaabbccccdaa")); // a3b2c4d1a2
    System.out.println(runLengthEncode("abcd"));         // a1b1c1d1
    System.out.println(runLengthEncode("aaaaa"));        // a5
    System.out.println(runLengthEncode("a"));            // a1
    System.out.println(runLengthEncode("aabbcc"));       // a2b2c2
    System.out.println(runLengthEncode(""));             // ""
}
}
