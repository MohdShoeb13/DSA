package com.dsa.search;

public class SquareRoot {

    public static void main(String[] args) {
        System.out.println(sqrt(9));
    }

    static int sqrt(int number){
        int i = 1;
        while(i*i <= number){
            i++;
        }
        return i-1;
    }

    static int sqRootFloor(int x)
    {
        int low = 1, high = x, ans = -1;

        while(low <= high)
        {
            int mid = (low + high) / 2;

            int mSq = mid * mid;

            if(mSq == x)
                return mid;
            else if(mSq > x)
                high = mid - 1;
            else
            {
                low = mid + 1;
                ans = mid;
            }
        }

        return ans;
    }

    static int bSearch(int arr[], int low, int high, int x)
    {
        if(low > high)
            return -1;

        int mid = (low + high) / 2;

        if(arr[mid] == x)
            return mid;

        else if(arr[mid] > x)
            return bSearch(arr, low, mid - 1, x);

        else
            return bSearch(arr, mid + 1, high, x);
    }

    static int search(int arr[], int x)
    {
        if(arr[0] == x) return 0;

        int i = 1;

        while(arr[i] < x)
            i = i * 2;

        if(arr[i] == x) return i;


        return bSearch(arr, i / 2 + 1, i - 1, x);
    }


}
