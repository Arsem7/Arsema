package Number4;

public class BubbleSort {
        public static void main(String[] args) {
            char[] arr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
            bubbleSort(arr);
            System.out.println("Sorted array:");
            for (int i : arr) {
                System.out.print(i + " ");
            }
        }

        public static void bubbleSort(char[] arr) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        arr[j] = (char) (arr[j] + arr[j + 1]);
                        arr[j + 1] = (char) (arr[j] - arr[j + 1]);
                        arr[j] = (char) (arr[j] - arr[j + 1]);
                    }
                }
            }
        }
    }

