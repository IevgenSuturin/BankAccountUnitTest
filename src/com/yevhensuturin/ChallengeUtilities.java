package com.yevhensuturin;

public class ChallengeUtilities {

    //Returns a char array containing every n-th char. When sourceArray.length < n, returns sourceArray
    public char[] everyNthChar(char[] sourceArray, int n){
        if(sourceArray == null || sourceArray.length<n){
            return sourceArray;
        }

        int returnLength = sourceArray.length/n;
        char[] result = new char[returnLength];
        int currIndex = 0;
        for (int i=0; i<sourceArray.length; i += n){
           result[currIndex++]=sourceArray[i];
        }
        return result;
    }

//    Remove pairs of the same character that are next to each other
//    by removing one occurrence of the character
    public String removePairs(String source){
        if(source.length()<2){
            return source;
        }

        StringBuilder sb = new StringBuilder();
        char[] string = source.toCharArray();
        sb.append(string[0]);
        for (int i=1; i< string.length; i++){
            if(string[i-1] != string[i]){
                sb.append(string[i]);
            }
        }
        return sb.toString();
    }

//  Perform a conversion based on some internal business rule.
    public int converter(int a, int b){
        return (a/b) + (a*30) - 2;
    }

    public String nullIfOddLength(String source){
        if (source.length() % 2 == 0){
            return source;
        }
        return null;
    }
}
