package list.array.api;

public class Main {

    public static void main(String[] args) {
        int[] number1 = new int[4];

        String[] strings = new String[4];
        strings[0] = "a";

        number1[0] = 10;
        number1[1] = 20;
        number1[2] = 30;

        int[] number2 = {10, 20, 30, 40};
        int[] number3 = new int[]{10, 20, 30, 40};


        System.out.println(number1[0]);
//        System.out.println(number1[3]);
        System.out.println(strings[1]);
        System.out.println(number1.length);

        int i = 0;
        while (number1.length > i) {
            System.out.println(number1[i]);
            i++;
        }

        for (int j = 0; j < number1.length; j++) {
            System.out.println(number1[i]);
        }
    }
}
