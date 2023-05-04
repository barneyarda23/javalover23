package day26_arrays2;

public class C07 {
    public static void main(String[] args) {




        findElement(5);
    }
    public static void findElement(int desiredNumber){

        int [] arr = {3,5,1,55,6,9,5,1,3,17,1};
        int count = 0;

        for (int i = 0; i < arr.length; i++){
            if(arr[i] == desiredNumber){
                count++;


            }


        }
        System.out.println("desired number : " + desiredNumber + count);





    }

}
