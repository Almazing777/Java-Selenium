package sprintTwo;
//1.Create a loop that will print numbers from 1 to 10, except number 7
//2.Create An Array of integers from 1 to 5, Call an integer on array using index and print it.
//3.Call index outside of the bound. Handle this exception printing “Outside of bound message.”

import java.util.*;


public class LevelOne {
    public static void main(String[] args){
        //1
        for (int i = 0; i <= 10; i++) {
            if(i == 7){
                continue;
            }
            System.out.println(i);
        }

        //2
        int[] nums = {1,2,3,4,5};
        System.out.println(nums[4]);

        //3

        try{
            int[] nums2 = {1,2,3,4,5,6,7,8,9};
            System.out.println(nums2[10]);
        }
        catch(Exception e) {
            System.out.println("Error: outside of bound");
        }
    }
}
