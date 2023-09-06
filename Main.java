import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {2, 8, 22, 16, 6, 13, 11, 5, 4, 32, 3, 7};
        selectionSort(list);
        System.out.println(Arrays.toString(list));
    }
    public static void selectionSort(int[] list){
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[i]){
                    int t = list[i];
                    list[i] = list[j];
                    list[j] = t;
                }
            }
        }
    }
}
