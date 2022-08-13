public class Main {
    public static void main(String[] args) {
        // Задание 1
        int [] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        double [] arr1 = {1.57, 7.654, 9.986};

        int [] arr2 = {3,56,88,23,12,34};

        // Задание 2
        System.out.println(arr[0] + "," + arr[1] + "," + arr[2]);
        System.out.println(arr1[0] + "," + arr1[1] + "," + arr1[2]);
        for (int i = 0; i < arr2.length; i++ ){
            System.out.print(arr2[i] + ",");   // так тоже могу, но в задании не указано. Видел, другие так решали и страхуюсь
        }
        System.out.println();
        // Задание 3
        System.out.println(arr[2] + "," + arr[1] + "," + arr[0]);
        System.out.println(arr1[2] + "," + arr1[1] + "," + arr1[0]);
        for (int i = arr2.length - 1; i >= 0; i-- ) {
            System.out.print(arr2[i] + ",");
        }

        System.out.println();

        // Задание 4
        for (int k = 0; k < arr.length; k++){
            if (arr[k] % 2 != 0){
                System.out.print(arr[k] + 1 + ",");
            }



        }


    }
}