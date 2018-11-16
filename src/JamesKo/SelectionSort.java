package JamesKo;

public class SelectionSort {

    public static void swap(int[] num, int a, int b) {
        int temp = num[a];
        num[a] = num[b];
        num[b] = temp;
    }

    public static void SelectionSort(int[] num)
    {
        for(int a = 0; a < num.length - 1; a++)
        {
            int min = a;
            for(int b = a + 1; b < num.length; b++)
            {
                if (num[b] < num[min])
                {
                    min = b;
                }
            }
            if(min != a)
            {
                swap(num, a, min);
            }

        }
    }

    public static void insertionSort(int[] num){
        for(int a = 1; a < num.length; a++) {
            int mainValue = num[a];
            int b = a-1;

            while (b>=0 && num[b] > mainValue)
            {
                num[b+1] = num[b];
                b = b-1;
            }
            num[b+1] = mainValue;
        }
    }

    public static int[] randomNum(int count) {
        int[] num = new int[count];
        for (int a = 0; a < num.length; a++) {
            num[a] = (int) (Math.random() * 10000);
        }
        return num;
    }
}
