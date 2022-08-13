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
        for (int i = 0; i < arr.length; i++ ){
            System.out.print(arr[i] );
            if (i != arr.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < arr1.length; i++ ){
            System.out.print(arr1[i]);
            if (i != arr1.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++ ){
            System.out.print(arr2[i] );
            if (i != arr2.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();
        // Задание 3

        for (int i = arr.length - 1; i >= 0; i-- ) {
            System.out.print(arr[i]);
            if (i != 0){
                System.out.print(", " );
            }
        }
        System.out.println();
        for (int i = arr1.length - 1; i >= 0; i-- ) {
            System.out.print(arr1[i]);
            if (i != 0){
                System.out.print(", " );
            }
        }
        System.out.println();
        for (int i = arr2.length - 1; i >= 0; i-- ) {
            System.out.print(arr2[i]);
            if (i != 0){
                System.out.print(", " );
            }
        }




        System.out.println();

        // Задание 4
        for (int k = 0; k < arr.length; k++){
            if (arr[k] % 2 == 1){
               arr[k]++;
            }
            System.out.print(arr[k]);
            if (k != arr.length - 1 ){
                System.out.print(", ");
            }



        }


    }
}