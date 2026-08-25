// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {

    public static boolean isValidISBN10(String isbn){
        if(isbn == null || isbn.length() != 10){
            return false;
        }

        int sum = 0;

        for(int i = 0; i < 10; i++){
            char ch = isbn.charAt(i);
            int digit;

            if(i == 9 && ch == 'X'){
                digit = 10;
            }else{
                if(ch < '0' || ch > '9'){
                    return false;
                }

                digit = ch - '0';
            }

            int weight = 10 - i;

            sum += digit * weight;
        }
        return sum % 11 == 0;
    }

    public static void main(String[] args) {
        System.out.println(isValidISBN10("0306406152")); // true
        System.out.println(isValidISBN10("080442957X")); // true
        System.out.println(isValidISBN10("0306406153")); // false
    }
    
}
