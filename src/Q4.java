public class Q4 {
    public static void main(String[] args) {            // Kanged from GPT because I am lazy lol
        char[] chars = {'c', 'a', 'r', 'b', 'o', 'n'};
        permute(chars, 0);
    }

    public static void permute(char[] arr, int index) {
        if (index == arr.length) {
            System.out.println(new String(arr));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            swap(arr, index, i);
            permute(arr, index + 1);
            swap(arr, index, i); // Backtrack
        }
    }

    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
