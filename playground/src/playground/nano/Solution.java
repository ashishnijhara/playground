/*
 * Copyright (c) 2014, In Mind Computing AG. All rights reserved.
 * IMC PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package playground.nano;

import java.util.Stack;

/**
 *
 *
 */
/**
 *
 *
 */
public class Solution {

  private static boolean isDigit(final String c) {
    return "0123456789".contains(c);
  }

  private static boolean isMultiply(final String c) {
    if (c.equals("*")) {
      return true;
    }
    return false;
  }

  private static boolean isPlus(final String c) {
    if (c.equals("+")) {
      return true;
    }
    return false;
  }

  private static boolean isValidString(final String s) {
    if (s.length() < 0 || s.length() > 200)
      return false;
    return true;
  }

  public static void main(final String args[]) {
    final String s = test1;
    if (!isValidString(s)) {
      throw new RuntimeException("invalid");
    }

    final Stack<String> stack = new Stack<String>();

    for (int i = 0; i < s.length(); i++) {
      final String c = String.valueOf(s.charAt(i));
      if (isDigit(c)) {
        stack.push(c);
        System.out.println("1:  " + c + "   stack :" + stack);
      } else if (isPlus(c)) {
        stack.push(sum(stack.pop(), stack.pop()));
        System.out.println("2:  " + c + "   stack :" + stack);
      } else if (isMultiply(c)) {
        stack.push(multiply(stack.pop(), stack.pop()));
        System.out.println("3:  " + c + "   stack :" + stack);
      }
    }

  }

  private static String multiply(final String a, final String b) {
    final int aN = Integer.parseInt(a);
    final int bN = Integer.parseInt(b);
    return String.valueOf(aN * bN);
  }

  private static String sum(final String a, final String b) {
    final int aN = Integer.parseInt(a);
    final int bN = Integer.parseInt(b);
    return String.valueOf(aN + bN);
  }

  // private static String test1 = "13+62*7+*";
  private static String test1 = "11++";

}
