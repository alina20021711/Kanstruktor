

import java.util.Arrays;
import java.util.Random;

public class Main {


    public static void main(String[] args) {
        System.out.println("Hello world!");

        Random random = new Random();
        int[] array = new int[20];

        for (int i = 0; i < 20; i++) {
            array[i] = random.nextInt(5);
            System.out.println(array[i]);
        }

        int result = 0;
        for (int i = 1; i < 20; i++) {
            if (array[i] == array[i - 1]) {
                result++;


                System.out.println("количество одинокових пар:" + result);

                int[] array1 = new int[]{1, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
                System.out.println(Arrays.toString(getDes(array1, 1)));

            }
        }
    }

        static int[] getDes(int[] s, int d){
            int[] index =new int[s.length];
            for(int i = 0; i< s.length; i++){
                for(int j = i+1; j< s.length; j++){
                    if(s[i]== s[j])
                        index[i]++;
                }
            }
            int counter=0;
            for(int anIndex : index){
                if(anIndex == d -1)counter++;

            }
            int[] array =new int[counter];
            counter=0;
            for(int i = 0; i< index.length; i++){
                if(index[i]== d -1){
                    array[counter++]= s[i];

                }
            }
            return array.length==0?new int[0]: array;



        }
}