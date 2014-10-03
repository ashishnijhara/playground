/*
 * Copyright (c) 2014, In Mind Computing AG. All rights reserved.
 * IMC PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package playgorund.hackerrank.algorithms.warmup;

import java.util.Scanner;

/**
 *
 *
 */
public class UtopianTreeSolution {

  static boolean isValidN(final int num) {
    if (num < 0 || num > 60)
      return false;
    return true;
  }

  static boolean isValidTestInputs(final int num) {
    if (num < 0 || num > 10)
      return false;
    return true;
  }

  public static void main(final String[] args) {
    final Scanner in = new Scanner(System.in);
    int _a;
    _a = in.nextInt();
    if (!isValidTestInputs(_a))
      throw new IllegalArgumentException("Illegal test Inputs");
    final int currentHeight = 1;
    for (int i = 0; i < _a; i++) {
      final int _b;
      _b = in.nextInt();
      int height;
      height = utopianTree(_b, currentHeight);
      System.out.println(height);
    }

  }

  static int utopianTree(final int N, final int currentHeight) {
    if (!isValidN(N))
      throw new IllegalArgumentException("Illegal Cycle Input");
    if (N == 0)
      return currentHeight;
    int result = currentHeight;
    for (int i = 1; i <= N; i++) {
      if (i % 2 == 0)
        result = result + 1;
      else
        result = result * 2;
    }
    return result;

  }

}
