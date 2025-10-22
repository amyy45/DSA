package arrays;

import java.lang.reflect.Array;
import java.util.*;

public class union_sorted_array {
    //using hashmap
    static ArrayList<Integer> FindUnion(int arr1[], int arr2[]) {
        int n=arr1.length;
        int m=arr2.length;
        HashMap <Integer,Integer> freq=new HashMap<>();
        ArrayList<Integer> Union=new ArrayList<>();
        // Counting frequency of each element in both arrays
        for (int i = 0; i < n; i++)
            freq.put(arr1[i],freq.getOrDefault(arr1[i],0)+1);   
        for (int i = 0; i < m; i++)
            freq.put(arr2[i],freq.getOrDefault(arr2[i],0)+1);
        // Adding unique elements to the Union list
        for (int j: freq.keySet())
            Union.add(j);
        return Union;
    }
    //using set

    static ArrayList<Integer> FindUnionUsingSet(int arr1[], int arr2[]) {
        int n=arr1.length;
        int m=arr2.length;
        HashSet <Integer> set=new HashSet<>();
        ArrayList<Integer> Union=new ArrayList<>();
        // Adding elements of both arrays to the set
        for (int i = 0; i < n; i++)
            set.add(arr1[i]);   
        for (int i = 0; i < m; i++)
            set.add(arr2[i]);
        // Adding unique elements to the Union list
        for (int j: set)
            Union.add(j);
        return Union;
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {2, 3, 5, 6, 7};
        ArrayList<Integer> result = FindUnionUsingSet(arr1, arr2);
        System.out.println("Union of the two arrays is: " + result);
    }
}
