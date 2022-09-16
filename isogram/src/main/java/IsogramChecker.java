import java.util.Arrays;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        phrase = phrase.trim().toLowerCase().replaceAll("[^a-zA-Z0-9]", "");;
        char[] charArray = phrase.toCharArray();
        Arrays.sort(charArray);
        boolean flag = true;
        for(int i = 0; i < charArray.length - 1; i++){
            if(charArray[i] == charArray[i+1]){
                flag = false;
            }
        }
        return flag;
    }

}