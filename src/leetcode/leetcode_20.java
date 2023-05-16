package leetcode;

import java.util.Stack;

public class leetcode_20 {
    class Solution {
        public boolean isValid(String s) {
            Stack<Character> s1 = new Stack<>();
            char[] arr=s.toCharArray();
            for (char c: arr) {
                if(c=='['||c=='('||c=='{'){
                    s1.push(c);
                }else{
                    if(s1.isEmpty()){
                        return false;
                    }else{
                        if ( c == ')' && s1.pop() != '(') {
                            return false;
                        }
                        if ( c == ']' && s1.pop() != '[') {
                            return false;
                        }
                        if ( c == '}' && s1.pop() != '{') {
                            return false;
                        }
                    }
                }
            }
            if(!s1.isEmpty()){
                return false;
            }
            return true;
        }
    }
}
