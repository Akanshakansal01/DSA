package QPS;

public class Patching_Array {
    public static void main(String[] args) {
        int arr[]={1,5,10};
        int n=33;
        System.out.println(minPatches(arr,n));
    }
    public static int minPatches(int[] arr, int n) {
        long missing=1;
        int patch=0;
        int i=0;
        while(missing<=n)
        {
            if(i<arr.length && missing>=arr[i])
            {
                missing+=arr[i];
                i++;
            }
            else
            {
                patch++;
                missing += missing;
            }
        }
        return patch;
    }
}
