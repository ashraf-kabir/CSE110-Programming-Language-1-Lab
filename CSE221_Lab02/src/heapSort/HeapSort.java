package heapSort;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class HeapSort {
	
public static void main(String[] args) throws IOException {
        
        int n, i;
        
        Scanner sc=new Scanner(new File(
        		"F:\\workspace eclipse\\workspace eclipse neon 2\\CSE221 Lab02 Heapsort\\src\\heapSort\\input.txt"));
        
        int c=1;
        
        int array[] =new int[10];
        
        while (sc.hasNext()){
            int num=sc.nextInt();
            if (c==-1){
                c++;
                array=new int [num];
            }
            else {
                array[c]=num;
                c++;
            }
        }
        n=array.length-1;
        
        sort(array);
        
        for (i = 1; i <= n; i++) {
            System.out.print(array[i]+ " ");
        }
        
    }
    
    private static int N;
    
    public static void sort(int array[]) {
        buildHeap(array);
        for (int i = N; i > 0; i--) {
            swap(array,0, i);
            N = N-1;
            maxheap(array, 0);
        }
    }
    
    public static void buildHeap(int array[]) {
        N = array.length-1;
        for (int j = N/2; j >= 0; j--) {
            maxheap(array, j);
        }
    }     
    
    public static void maxheap(int array[], int i) {
        int left = 2*i;
        int right = 2*i + 1;
        int max = i;
        if (left <= N && array[left] > array[i]) {
            max = left;
        }
        if (right <= N && array[right] > array[max]) {
            max = right;
        }
        if (max != i) {
            swap(array, i, max);
            maxheap(array, max);
        }
    }
    
    public static void swap(int array[], int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
