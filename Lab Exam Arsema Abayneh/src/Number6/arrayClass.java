package Number6;

public class arrayClass {

    public static void main(String[] args) {
        int[] array = {3, 7, 1, 9, 4};
        deleteValue(array, 5, 7);
        for (int i = 0 ; i < array.length; i++) {
            boolean b = i <= -1;
            if (b) {
                System.out.println("index not found"); }
            else{
            System.out.println(array[i]);}
        }
    }
    static int[] deleteValue(int[] array,int size, int target) {
        for (int i = 0; i<array.length; i++) {
            if (array[i] == target) {
                for (int j = i; j<size-1;j++) {
                    array[j] =array[j+1];
                }
                array[size-1] = 0;
                return array;
            }
        }
        return null;
    }
}
