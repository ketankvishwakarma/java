package org.example.coding.code_02.recursion;

import java.util.*;
import java.util.function.Consumer;

public class SimpleRecursions {
    static class Factorial{
        static int find(int n){
            if(n==0||n==1)
                return 1;
            return n* find(n-1);
        }
    }

    static class SumOfAllNumbersUptoN{
        static int find(int n){
            if(n==0||n==1)
                return 1;
            return n + find(n-1);
        }
    }

    static class Fibonacci{
        static int find(int n){
            if(n==1||n==2)
                return 1;
            return find(n-1)+find(n-2);
        }
    }

    static class SumOfDigits{
        static int find(int digit){
            if(digit<0)
                return 0;
            if(digit<10)
                return digit;
            var lastDigit = digit % 10;
            var remaining = digit/10;
            return lastDigit+find(remaining);
        }
    }

    static class GreatestCommonDivisor {
        static int find(int first, int second){
            if(second==0)
                return first;
            var rem = first%second;
            first = second;
            second=rem;
            return find(first,rem);
        }
    }

    static class LowestCommonMultiplier {
        // lcm(a, b) = a ∗ b / gcd(a, b);
        static int find(int first, int second){
            return first*second/ GreatestCommonDivisor.find(first,second);
        }
    }

    static class ReverseString {

        static String go(String str){
            if(str.length()<=1)
                return str;
            var lastChar = str.charAt(str.length()-1);
            var substring = str.substring(0,str.length()-1);
            return lastChar+go(substring);
        }
    }

    static class SumOfArrayElements {

        static Integer go(List<Integer> data){
            if(data.size()<=1)
                return data.get(0);
            var lastChar = data.get(data.size()-1);
            var substring = data.subList(0,data.size()-1);
            return lastChar+go(substring);
        }
    }

    static class DecimalToBinary {

        static String go(int n){
          if(n<=1) {
              return String.valueOf(n);
          }
          var result = n/2;
          var remainder = n%2;
          return go(result)+String.valueOf(remainder);
        }
    }

    static class DecimalToOcta {

        static String go(int n){
            if(n<8)
                return String.valueOf(n);
            var result = n/8;
            var remainder = n%8;
            return go(result)+String.valueOf(remainder);
        }
    }

    static class PowerOf {
        static Integer go(int value,int exponent){
            if(exponent<=1)
                return value;
            return value*go(value,exponent-1);
        }
    }

    static class PascalsTriangle{

       static void go(int height){
            calculatePascalsTriangle(height,System.out::println);
       }

        private static List<Integer> calculatePascalsTriangle(int height, Consumer<List<Integer>> consumer) {
           // terminal condition
            if(height==1){
                consumer.accept(List.of(1));
                return List.of(1);
            }
           // recursive descent
           List<Integer> previousLineValues = calculatePascalsTriangle(height-1,consumer);
           List<Integer> nextLine = calculateLine(height,previousLineValues);
           consumer.accept(nextLine);
           return nextLine;
        }

        private static List<Integer> calculateLine(int height, List<Integer> previousLineValues) {
           List<Integer> line = new ArrayList<>();
           line.add(1);
           for(int i=0;i<previousLineValues.size()-1;i++){
               line.add(previousLineValues.get(i)+previousLineValues.get(i+1));
           }
           line.add(1);
           return line;
        }
    }
    static class Permutation{
        static void go(String val){
            System.out.println(calculate(val,""));
        }

        static private Set<String> calculate(String val, String prefix) {
            if(val.length()==0){
                return Set.of(prefix);
            }
            Set<String> all = new HashSet<>();
            for(int i = 0;i<val.length();i++){
                var newPrefix = prefix+val.charAt(i);
                var newRemaining = val.substring(0,i)+val.substring(i+1);
                all.addAll(calculate(newRemaining,newPrefix));
            }
            return all;
        }
    }
}
