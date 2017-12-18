package pl.sda;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListOperations
{
   /* public static void main( String[] args ) {
        int a = 1000000;

        List<Integer>linkLit = new LinkedList<>();
        System.out.println("Link list czas");
        perfectList(linkLit,a);

        List<Integer>arrayList = new ArrayList<>();
        System.out.println("Array list czas");
        perfectList(arrayList,a);

    }*/

    public static void perfectList(List<Integer>list,int size){
        long operationTimeFill = System.currentTimeMillis();
        fillList(list,size);
        long operationTimeFillEnd = System.currentTimeMillis();
        System.out.println(operationTimeFillEnd - operationTimeFill);

        long operationTimeRead = System.currentTimeMillis();
        readList(list,size);
        long operationTimeReedEnd = System.currentTimeMillis();
        System.out.println(operationTimeReedEnd - operationTimeRead);

        long operationTimeRemove = System.currentTimeMillis();
        clearList(list,size);
        long operationTimeRemoveEnd = System.currentTimeMillis();
        System.out.println(operationTimeRemoveEnd - operationTimeRemove);

    }

    public static void fillList(List<Integer> list,int size){
        for(int i = 0;i<size;i++){
            list.add(0,i);
        }
    }

    public static void clearList(List<Integer>list,int size){
        for(int i = 0;i<size;i++){
            list.remove(0);
        }
    }

    public static void readList(List<Integer>list,int size){
        for (int i = 0;i<size;i++){
            int tmp = list.get(i);
        }
    }
}
