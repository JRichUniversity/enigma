public class util {
    static String format(String key){
        String[] str = key.split(" ");
        String new_str = "";
        for(String s : str){
            new_str += s;
        }
        return new_str;
    }

    static void printIntArr(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void printIntMatrix(int[][] arr){
        for(int i = 0; i < arr.length;i++){
            System.out.print(arr[i][0] + " ");
        }
        System.out.println();
        for(int i = 0; i < arr.length;i++){
            System.out.print(arr[i][1] + " ");
        }
        System.out.println("\n");
    }

    static int alphabet(char c){
        String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        return ALPHABET.indexOf(c);
    }
}
