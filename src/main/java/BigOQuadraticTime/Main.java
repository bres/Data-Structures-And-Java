package BigOQuadraticTime;


    public class Main {
        public static void main(String[] args) {

            // Create an integer array of the specified size
            int sizeOfIntegerArray1 = 10000;

            int[] numbersArray1= new int [sizeOfIntegerArray1];

            // Use a for loop to store data in the array
            for(int i = 0 ; i < sizeOfIntegerArray1; i++){
                numbersArray1[i] = i;
            }

            // Create an integer array of the specified size
            int sizeOfIntegerArray2 = 10000;

            int[] numbersArray2= new int [sizeOfIntegerArray2];

            // Use a for loop to store data in the array
            for(int i = 0 ; i < sizeOfIntegerArray2; i++){
                numbersArray2[i] = i;
            }

            //choose algorithm
            log1(numbersArray1 ,numbersArray2);
        }

        //-------------------------------------------------//
        public static void log1 ( int[] numbersArray1,  int[] numbersArray2){

            for (int number1 :numbersArray1) { //O(n)
                for (int number2 :numbersArray2) { //O(n)
                    System.out.println("This is a quadratic O calculation"+number1 +" , " +number2);
                }
             }
            // O(n*n) =.. O(n^2)
            //as the input get larger and larger algorithms that run in O(n^2)
            //get slower and slower
        }

        //-------------------------------------------------//
        public static void log2 ( int[] numbersArray1,  int[] numbersArray2){
            //another one loop of complexity of O(n)
            for (int number1 :numbersArray1) { //O(n)
                System.out.println("This is dummy loop");
            }

            for (int number1 :numbersArray1) { //O(n)
                for (int number2 :numbersArray2) { //O(n)
                    System.out.println("This is a quadratic O calculation"+number1 +" , " +number2);
                }
            }
            // what if I have also a loop before that has O(n) complexity ?
            // O(n+n*n) = O(n+n^2)=.. O(n^2)
            // as the input get larger and larger algorithms that run in O(n^2)
            // get slower and slower
        }

        //-------------------------------------------------//
        public static void log3 ( int[] numbersArray1,  int[] numbersArray2){
            //another one loop of complexity of O(n)
            for (int number1 :numbersArray1) { //O(n)
                System.out.println("This is dummy loop");
            }

            for (int number1 :numbersArray1) { //O(n)
                for (int number2 :numbersArray2) { //O(n)
                    for (int number3 :numbersArray1) { //O(n)
                        System.out.println("This is a quadratic O calculation"+number1 +" , " +number2 + " ,"+number3);
                    }
                 }
            }
            // O(n*n*n) =.. O(n^3)
            // as the input get larger and larger algorithms that run in O(n^3)
            // get slower and slower
            // O(n^3) time >  O(n^2) time
        }
    }


