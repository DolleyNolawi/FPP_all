package org.meron.code.challenge;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public Solution() {
	}

	public int getMin(String s) {
		long[] result = new long[s.length() + 1];
		result[0] = 0;
		for (int i = 1; i <= s.length(); ++i) {
			result[i] = Integer.MAX_VALUE;
			for (int j = 1; j <= i; ++j) {
				if (s.charAt(j - 1) == '0') {
					continue;
				}
				long num = Long.valueOf(s.substring(j - 1, i), 2);
				if (isPowerFive(num)) {
					result[i] = Math.min(result[i], result[j - 1] + 1);
				}
			}
		}
		return result[s.length()] == Integer.MAX_VALUE ? -1 : (int) result[s.length()];
	}

	// check if the number is power of 5
	private boolean isPowerFive(long inputValue) {
		if (inputValue == 0) {
			return false;
		}
		int num = (int) (Math.log(inputValue) / Math.log(5));
		return Math.pow(5, num) == inputValue;
	}

}