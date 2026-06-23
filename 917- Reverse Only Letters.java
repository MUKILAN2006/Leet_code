class Solution {
    public String reverseOnlyLetters(String s) {
        int i=0;
        int j=s.length()-1;
        char arr[]=s.toCharArray();

        while(i<j){
            if(!Character.isLetter(s.charAt(i)))
            i++;

            if(!Character.isLetter(s.charAt(j)))
            j--;

            if(Character.isLetter(s.charAt(i)) && Character.isLetter(s.charAt(j)))
            {
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        
        return new String(arr) ;
    }
}