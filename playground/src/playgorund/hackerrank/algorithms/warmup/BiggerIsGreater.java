/*
 * Copyright (c) 2014, In Mind Computing AG. All rights reserved.
 * IMC PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package playgorund.hackerrank.algorithms.warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 *
 */
public class BiggerIsGreater {

  static boolean isValidTestInputs(final int num) {
    if (num < 0 || num > 100000)
      return false;
    return true;
  }

  /**
   * @param args
   *
   */
  public static void main(final String[] args) {

    final Scanner in = new Scanner(System.in);
    int _a;
    _a = in.nextInt();
    if (!isValidTestInputs(_a)) {
      in.close();
      throw new IllegalArgumentException("Illegal test Inputs");
    }
    final List<String> inputs = new ArrayList<String>();
    for (int i = 0; i < _a; i++) {
      inputs.add(in.next());
    }

    in.close();

    for (final String string : inputs) {
      System.out.println(nextLexicoGraphicString(string));
    }

  }

  /**
   * helper method that appends the given character at each position in the given string and returns a set of such
   * modified strings - set removes duplicates if any(in case a character is repeated)
   */
  private static Set<String> merge(final Character c, final String s) {
    if (s == null || s.isEmpty()) {
      return null;
    }

    final int len = s.length();
    StringBuilder sb = new StringBuilder();
    final Set<String> list = new TreeSet<String>();

    for (int i = 0; i <= len; i++) {
      sb = new StringBuilder();
      sb.append(s.substring(0, i) + c + s.substring(i, len));
      list.add(sb.toString());
    }

    return list;
  }

  static String nextLexicoGraphicString(final String s) {
    final int length = s.length();
    if (length < 1 || length > 100)
      throw new IllegalArgumentException("Illegal string");

    final char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    boolean isAcceptableString = true;
    for (int i = 0; i < s.length(); i++) {
      if (Arrays.binarySearch(alphabet, s.charAt(i)) == -1) {
        isAcceptableString = false;
        break;
      }
    }
    if (!isAcceptableString)
      throw new IllegalArgumentException("Unacceptable string");

    // final List<String> allCombinations = permute(s);
    // // final List<String> lst = new ArrayList<>(allCombinations);
    // final int index = Collections.binarySearch(allCombinations, s);
    //
    // if (index == -1)
    // return "Some Error happened";
    // if (index + 1 == allCombinations.size())
    // return "no answer";
    //
    // return allCombinations.get(index + 1);

    final char[] charArray = s.toCharArray();

    int k = -1;

    for (int i = 0; i < length; i++) {
      if ((i + 1 != length) && charArray[i] < charArray[i + 1]) {
        k = i;
      }
    }

    if (k == -1)
      return "no answer";

    int l = -1;

    for (int i = 0; i < length; i++) {
      if (charArray[k] < charArray[i]) {
        l = i;
      }
    }

    System.out.println("maxIndex :" + l);

    System.out.println("minIndex :" + k);

    final char temp = charArray[k];
    charArray[k] = charArray[l];
    charArray[l] = temp;

    System.out.println("new array :" + new String(charArray));

    reverse(charArray, k, length);

    return new String(charArray);
  }

  public static List<String> permute(final String s) {
    if (null == s || s.isEmpty()) {
      return new ArrayList<String>();
    }

    // List containing words formed in each iteration
    final List<String> strings = new LinkedList<String>();
    strings.add(String.valueOf(s.charAt(0))); // add the first element to the list

    // Temp list that holds the set of strings for
    // appending the current character to all position in each word in the original list
    final List<String> tempList = new LinkedList<String>();

    for (int i = 1; i < s.length(); i++) {

      for (int j = 0; j < strings.size(); j++) {
        tempList.addAll(merge(s.charAt(i), strings.get(j)));
      }
      strings.removeAll(strings);
      strings.addAll(tempList);

      tempList.removeAll(tempList);

    }
    return strings;
  }

  /**
   * @param charArray
   * @param minIndex
   *
   */
  private static void reverse(final char[] charArray, final int minIndex, final int length) {

    for (int i = minIndex + 1; i < length; i++) {
      final char temp = charArray[i];
      charArray[i] = charArray[length - 1];
      charArray[length - 1] = temp;
      System.out.println("new for i:" + i + " array " + new String(charArray));
    }

  }

}
