package Arrays;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers1 = new int[3];
        //System.out.println(numbers);

        //set the first item
        //numbers[0]=10;
        //set the second item
        //numbers[1]=20;
        //set the third item
        //numbers[2]=30;

        //shorter way if you know the items of the array before
        int[] numbers2 = {10,20,30};


        //System.out.println(Arrays.toString(numbers1));
        //console --> [I@5acf9800 a combination of the type of the array  I--integer ,@-->5acf9800 the address of this object in memory

        //System.out.println(Arrays.toString(numbers2));

        // we can not change the size of an array and this is why we use linkedLists
        //System.out.println(numbers2.length);

        //exercise - create a dynamic array that automatically grows, and we can apply insert,delete!
        Array numbers3 = new Array(2);

        numbers3.insert(10);
        numbers3.insert(20);
        numbers3.insert(30);
        numbers3.insert(40);


//        numbers3.removeAt(3);
        System.out.println("index of item is:"+ numbers3.indexOf(40));


        numbers3.print();


    }
}
