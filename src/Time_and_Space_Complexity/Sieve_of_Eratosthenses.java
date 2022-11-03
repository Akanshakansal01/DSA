package Time_and_Space_Complexity;

public class Sieve_of_Eratosthenses {
    public static void main(String[] args) {
        int n=100;
        PrimeSieve(n);
    }
    public static void PrimeSieve(int n)
    {
        // kisi index pe false set hai us index ko prime number consider kiya jayega.
        // kisi index pe true set hai us index ko not  number consider kiya jayega.
        boolean[] arr=new boolean[n+1];
        arr[0]=true;  // 0 is not prime number
        arr[1]=true;  // 1 is not prime number
        for(int i=2;i*i< arr.length;i++)
        {
            if(arr[i]==false)
            {
                for(int j=2;i*j<=n;j++)
                {
                    arr[i*j]=true; // not prime set kiya hai
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == false)
            {   // i is prime number
                System.out.print(i + " ");
            }
        }
    }
}
// complexity :