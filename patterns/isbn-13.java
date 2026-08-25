

class Main {

    public static boolean isValidISBN13(String isbn){
        if(isbn == null || isbn.length() != 13){
            return false;
        }

        int sum = 0;

        for(int i = 0; i < 12; i++){
            char ch = isbn.charAt(i);
            
            if(ch < '0' || ch > '9'){
                return false;
            }

            int digit = ch - '0';

            if(i % 2 == 0){
                sum += digit;
            }else{
                sum += digit * 3;
            }
        }

        char lastChar = isbn.charAt(12);

        if(lastChar < '0' || lastChar > '9'){
            return false;
        }

        int actualCheckDigit = lastChar - '0';

        int expectedCheckDigit = (10 - (sum % 10)) % 10;

        return actualCheckDigit == expectedCheckDigit;
    }

    public static void main(String[] args) 
{
        System.out.println(isValidISBN13("9780306406157")); // true
        System.out.println(isValidISBN13("9780306406158")); // false
    }
    
    
}
