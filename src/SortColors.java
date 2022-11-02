import java.util.Scanner;

public class SortColors {
    public static void main(String args[])
    {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            sort(arr);
    }
    public static void printArray(int arr[]){
        for(int k=0;k< arr.length;k++)
        {
            System.out.print(arr[k]+" ");
        }
    }
    public static void sort(int arr[]) {
        int n=arr.length;
        int i;
        int c1 = 0, c2 = 0, c3 = 0;
        for (i = 0; i < n; i++) {
            switch (arr[i]) {
                case 0:
                    c1++;
                    break;
                case 1:
                    c2++;
                    break;
                case 2:
                    c3++;
                    break;
            }
        }
        i = 0;
        while (c1 > 0) {
            arr[i++] = 0;
            c1--;
        }
        while (c2 > 0) {
            arr[i++] = 1;
            c2--;
        }
        while (c3 > 0) {
            arr[i++] = 2;
            c3--;
        }
        printArray(arr);
    }
}
