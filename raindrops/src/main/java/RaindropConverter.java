class RaindropConverter {

//     - has 3 as a factor, add 'Pling' to the result.
// - has 5 as a factor, add 'Plang' to the result.
// - has 7 as a factor, add 'Plong' to the result.
    String convert(int number) {
        String result = "";
        if(number % 3 == 0){
            result+="Pling";
        }
        if(number % 5 == 0){
            result+="Plang";
        }
        if(number % 7 == 0){
            result+="Plong";
        }
        if(result.isBlank()){
            result += Integer.toString(number);
        }
        return result;
    }

}
