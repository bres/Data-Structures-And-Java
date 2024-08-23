package BigOLinearlyTime;

public class Main {
    public static void main(String[] args) {

        // Create an integer array of the specified size
        int sizeOfIntegerArray = 10000;
        int[] numbersArray= new int [sizeOfIntegerArray];

        // Use a for loop to store data in the array
        for(int i = 0 ; i < sizeOfIntegerArray; i++){
            numbersArray[i] = i;
        }

        // Create a string array of the specified size
        int sizeOfStringArray = 20000;

        String[] stringArray = new String[sizeOfStringArray];

        // Use a for loop to store data in the array
        for (int i = 0; i < sizeOfStringArray; i++) {
            stringArray[i] = "String " + (i + 1); // Storing "String 1", "String 2", etc.
        }

        //choose algorithm
        log4(numbersArray);
    }

    //-------------------------------------------------//
    public static void log1 ( int[] numbers){
        System.out.println(numbers[0]);  //O(1)
        // the size of input doesn't matter
    }
    //-------------------------------------------------//
    public static void log2 ( int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[0]);  //O(n)
            //the cost of this algorithm grows linearly
            //and in direct correlation to the size of the input,
            //so we present the complexity of this method with the size of the
            //O(n)
        }
    }
    //-------------------------------------------------//
    public static void log3 ( int[] numbers){
        System.out.println(numbers[0]);  //O(1)

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[0]);  //O(n)
            //the cost of this algorithm grows linearly
            //and in direct correlation to the size of the input,
            //so we present the complexity of this method with the size of the
            //O(n)
        }
        System.out.println(numbers[0]);  //O(1)
        // O(1+n+1) = O(2+n) = .. O(n)
    }
    //-------------------------------------------------//
    public static void log4 ( int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[0]);  //O(n)
            //the cost of this algorithm grows linearly
            //and in direct correlation to the size of the input,
            //so we present the complexity of this method with the size of the
            //O(n)
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[0]);  //O(n)
            //the cost of this algorithm grows linearly
            //and in direct correlation to the size of the input,
            //so we present the complexity of this method with the size of the
            //O(n)
        }
    }         // O(n+n) = O(2*n) = .. O(n)
    //-------------------------------------------------//
    public static void log5 ( int[] numbers){

            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[0]);  //O(n)
                //the cost of this algorithm grows linearly
                //and in direct correlation to the size of the input,
                //so we present the complexity of this method with the size of the
                //O(n)
            }
            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[0]);  //O(n)
                //the cost of this algorithm grows linearly
                //and in direct correlation to the size of the input,
                //so we present the complexity of this method with the size of the
                //O(n)
            }
            // O(n+n) = O(2*n) = .. O(n)
    }
    //-------------------------------------------------//
    public static void log6 ( int[] numbers){

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[0]);  //O(n)
            //the cost of this algorithm grows linearly
            //and in direct correlation to the size of the input,
            //so we present the complexity of this method with the size of the
            //O(n)
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[0]);  //O(n)
            //the cost of this algorithm grows linearly
            //and in direct correlation to the size of the input,
            //so we present the complexity of this method with the size of the
            //O(n)
        }
        // O(n+n) = O(2*n) = .. O(n)
    }
    //-------------------------------------------------//
    public static void log7 ( int[] numbers, String[] stringArray){

        for (int number :numbers) { //O(n)
            System.out.println(number);
        }
        for (String str : stringArray) {//O(m)
            System.out.println(str);
        }

        // O(n+m) =.. O(n) because the runtime of this method increase linearly
    }
}
