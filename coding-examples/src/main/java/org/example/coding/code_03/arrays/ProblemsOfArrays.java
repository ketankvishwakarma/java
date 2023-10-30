package org.example.coding.code_03.arrays;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.rotateLeft;

public class ProblemsOfArrays {

    public static void main(String[] args) {
        TraverseSpiral.go();
    }
    static class RemoveDuplicates{
        static int[] go(int[] array){
            return remove(array);
        }

        private static int[] remove(int[] array) {
            var current = array[0];
            for(int i = 1; i< array.length; i++){
                if(array[i]==current)
                    array[i]=-1;
                else
                    current= array[i];
            }
            return array;
        }
    }

     static class TraverseSpiral{

    static Integer[][] numbers = {
            { 1, 2, 3, 4 },
            { 12, 13, 14, 5 },
            { 11, 16, 15, 6 },
            { 10, 9, 8, 7 }
    };

    enum Direction{
            RIGHT,DOWN,LEFT,UP
    }
    static void go(){

        int curX = 0;
        int curY = 0;

        int minX = 0;
        int maxX = numbers[0].length;
        int minY = 0;
        int maxY = numbers.length;

        List<Integer>  result = new ArrayList<>();
        Direction dir = Direction.RIGHT;
        int step = 0;
        while (step<maxX*maxY){
            result.add(numbers[curY][curX]);
            if(dir.equals(Direction.RIGHT)){
                if(curX<maxX-1){
                    curX++;
                }else{
                    dir = Direction.DOWN;
                    // this makes the next traversal spiral
                    maxX--;
                }
            }

            if(dir.equals(Direction.DOWN)){
                if(curY<maxY-1){
                    curY++;
                }else{
                    dir = Direction.LEFT;
                    // this makes the next traversal spiral
                    maxY--;
                }
            }
            if(dir.equals(Direction.LEFT)){
                if(curX<maxX-1){
                    curX--;
                }else{
                    dir = Direction.UP;
                    // this makes the next traversal spiral
                    maxX++;
                }
            }

            if(dir.equals(Direction.UP)){
                if(curY>minY){
                    curY--;
                }else{
                    dir = Direction.RIGHT;
                    // this makes the next traversal spiral
                    maxY++;
                    curX++;
                }
            }
            step++;
        }
        System.out.print("--> "+result);
    }


    }
}
