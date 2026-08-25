class Solution {
    public int compress(char[] chars) {
        
        int ans = 0;
    
        for(int i = 0; i < chars.length;){
            
            char letter = chars[i];
            int count = 0;

            while(i < chars.length && chars[i] == letter){
                count++;
                i++;
            }

            chars[ans++] = letter;

            if(count > 1){
                String countStr = String.valueOf(count);
                
                for(int j = 0; j < countStr.length(); j++){
                    chars[ans++] = countStr.charAt(j);
                }
            }
        }

        return ans;

    }
}
