// package HEAP;
import java.util.*;
class MinHeap{
    int[] heap;
    int size;
    MinHeap(int capacity){
        heap = new int[capacity];
        size = 0;
    }
    private int getParent(int i){
        return (i-1)/2;
    }
    private int getLeft(int i){
        return 2*i+1;
    }
    private int getRight(int i){
        return 2*i+2;
    }
    public int extractMin(){
        if(size == 0){
            throw new RuntimeException("Empty Heap");
        }
        int root = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapify(0);
        return root; 
    }
    public void insert(int val){
        if(size == heap.length){
            throw new RuntimeException("Heap is Full");
        }
        heap[size] = val;
        int i = size;
        size++;

        while(i!=0 & heap[getParent(i)] > heap[i]){
            swap(i, getParent(i));
            i = getParent(i);
        }
    }
    public void swap(int a, int b){
        int temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }
    public void heapify(int i){
        int smallest = i;
        int left = getLeft(i);
        int right = getRight(i);

        if(left < size && heap[left] < heap[smallest]){
            smallest = left;
        }
        if(right < size && heap[right] < heap[smallest]){
            smallest = right;
        }
        if(smallest != i){
            swap(i, smallest);
            heapify(smallest);
        }
    }
    public int getMin(){
        if(size == 0){
            throw new RuntimeException("Empty Heap");
        }
        return heap[0];
    }
    
}

public class heap {
    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap(10);
        minHeap.insert(10);
        minHeap.insert(4);
        minHeap.insert(15);
        minHeap.insert(1);
        minHeap.insert(4);
        System.out.println(minHeap.getMin());
        System.out.println(minHeap.extractMin());
        System.out.println(minHeap.getMin());
    }
}