package com.chaos.leetcode.array;

public class ArrayStringsAreEqual {

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringTool stringTool = new StringTool();
        String s1 = stringTool.convertString(word1);
        String s2 = stringTool.convertString(word2);
        System.out.println(s1);
        System.out.println(s2);
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        String[] word1 = {"abc", "d", "defg"};
        String[] word2 = {"abcddefg"};
        System.out.println(new ArrayStringsAreEqual().arrayStringsAreEqual(word1, word2));
    }


    interface IStringTool{
        String convertString(String[] words);
    }

    class  StringTool implements  IStringTool{

        @Override
        public String convertString(String[] words) {
            if (null == words || words.length == 0) return "";
            StringBuilder stringBuilder = new StringBuilder();
            for (String word : words) {
                stringBuilder.append(word);
            }
            return stringBuilder.toString();
        }
    }
}
