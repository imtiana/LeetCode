package main.com.java.leetcode.easy;

public class CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
        String[] s1 = version1.split("\\.");
        String[] s2 = version2.split("\\.");

        int minLength = Math.min(s1.length, s2.length);

        int i = 0;

        for (i = 0; i < minLength; i++) {
            if (Integer.parseInt(s1[i]) > Integer.parseInt(s2[i])) {
                return 1;
            }
            else if (Integer.parseInt(s1[i]) < Integer.parseInt(s2[i])) {
                return -1;
            }
        }

        if (i == s1.length && i == s2.length) {
            return 0;
        }
        else if (i < s1.length) {
            for (int j = i; j < s1.length; j++) {
                if (Integer.parseInt(s1[j]) != 0) { return 1; }
            }
        }
        else if (i < s2.length) {
            for (int j = i; j < s2.length; j++) {
                if (Integer.parseInt(s2[j]) != 0) { return -1; }
            }
        }
        return 0;
    }
}
