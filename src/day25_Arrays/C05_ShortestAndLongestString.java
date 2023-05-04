package day25_Arrays;
//Question 6- Create a method that prints the longest and shortest words in a given String array.

public class C05_ShortestAndLongestString {
    public static void main(String[] args) {

        String [] nameArr= {"John","Ibrahimovic", " messi" ,"ronaldo", "kaka" , "Alex" , "Hagi", "Ali"};

        shortestAndLongest(nameArr);


    }

    public static void shortestAndLongest(String[] strArray){

        String longestName = strArray[0];
        String shortestName = strArray[0];

        for(int i =0; i<=strArray.length-1; i++){
            if(strArray[i].length()>longestName.length()){
                longestName= strArray[i];



            }
            if(strArray[i].length()<shortestName.length()){
                shortestName = strArray[i];

            }

            System.out.println("the longest name : " + longestName);
            System.out.println("the shortest name : " + shortestName);



        }




    }
}
