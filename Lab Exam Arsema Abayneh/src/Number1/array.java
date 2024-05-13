package Number1;
import java.util.Arrays;
import java.util.Scanner;
        public class array {
            public static void main(String[] args) {
                Scanner keyboard = new Scanner(System.in);
                System.out.println("size of array");
                int size = keyboard.nextInt();
                int[] array = new int[size];
                System.out.println("enter numbers: ");
                for (int i=0; i<size; i++){
                    array[i] = keyboard.nextInt();
                }
                System.out.println("element to be found ");
                int key = keyboard.nextInt();
                array A1 = new array();
                System.out.println("repetition number: ");
                System.out.println(A1.Search(array,key));}

            public int Search(int[] array,int key) {
                int count = 0;
                for (int i = 0; i<array.length; i++) {
                    if(array[i]==key) count++;
                }
                return count;
            }

}
