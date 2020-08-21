package cn.nci.test;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @PackgeName: cn.nci.test
 * @ClassName: FindElementFromCollections
 * @Author: WangXiaolin
 * Date: 2020/7/28 20:15
 * project name: springmvc_start
 * @Version:
 * @Description:
 */
public class FindElementFromCollections {
    public static boolean useList(String[] arr, String targetValue) {
        return Arrays.asList(arr).contains(targetValue);
    }

    public static boolean useSet(String[] arr, String targetValue) {
        Set<String> set = new HashSet<String>(Arrays.asList(arr));
        return set.contains(targetValue);
    }

    public static boolean useLoop(String[] arr, String targetValue) {
        for (String s : arr) {
            if (s.equals(targetValue))
                return true;
        }
        return false;
    }

    public static boolean useArraysBinarySearch(String[] arr, String targetValue) {
        int a = Arrays.binarySearch(arr, targetValue);
        if (a > 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
//        String[] arr = new String[]{"CD", "BC", "EF", "DE", "AB"};

        int length = 30000;
        String targetValue = "99";
        String[] arr = new String[length];

        Random s = new Random();
        for (int i = 0; i < length; i++) {
            arr[i] = String.valueOf(s.nextInt());
        }

        //use list
        long startTime = System.nanoTime();
        for (int i = 0; i < length; i++) {
            useList(arr, targetValue);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("useList:  " + duration / 1000000);

        //use set
        startTime = System.nanoTime();
        for (int i = 0; i < length; i++) {
            useSet(arr, targetValue);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("useSet:  " + duration / 1000000);

        //use loop
        startTime = System.nanoTime();
        for (int i = 0; i < length; i++) {
            useLoop(arr, targetValue);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("useLoop:  " + duration / 1000000);

        //use Arrays.binarySearch()
        startTime = System.nanoTime();
        for (int i = 0; i < length; i++) {
            useArraysBinarySearch(arr, targetValue);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("useArrayBinary:  " + duration / 1000000);

        //use ArrayUtils.contains
        startTime = System.nanoTime();
        for (int i = 0; i < length; i++) {
            ArrayUtils.contains(arr, targetValue);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayUtils.contains:  " + duration / 1000000);
    }
}
