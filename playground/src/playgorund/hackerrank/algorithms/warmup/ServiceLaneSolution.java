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
public class ServiceLaneSolution {

  static boolean isValidN(final int num) {
    if (num < 2 || num > 100000)
      return false;
    return true;
  }

  static boolean isValidTestInputs(final int num) {
    if (num < 1 || num > 1000)
      return false;
    return true;
  }

  static boolean isValidWidth(final int num) {
    if (num < 1 || num > 3)
      return false;
    return true;
  }

  public static void main(final String[] args) {
    final Scanner in = new Scanner(System.in);
    int _a;
    _a = in.nextInt();
    if (!isValidN(_a))
      throw new IllegalArgumentException("Illegal Length of Highway");
    int _b;
    _b = in.nextInt();
    if (!isValidTestInputs(_b))
      throw new IllegalArgumentException("Illegal test Inputs");
    final int width[] = new int[_a];
    int k = 0;
    do {
      final int w = in.nextInt();
      if (!isValidWidth(w))
        throw new IllegalArgumentException("Illegal Width");
      width[k] = w;
      k++;
    } while (in.hasNextInt() && k < _a);
    int i;
    int j;
    k = 0;
    do {
      i = in.nextInt();
      j = in.nextInt();
      System.out.println(serviceLane(i, j, _a, width));
      k++;
    } while (in.hasNextInt() && k < _b);
    System.exit(0);
  }

  static int min(final int a, final int b) {
    if (a < b)
      return a;
    else
      return b;
  }

  /**
   * @param i
   * @param j
   * @param _a
   * @param width
   * @return
   *
   */
  private static int serviceLane(final int i, final int j, final int N, final int[] width) {
    if (i < 0 || i >= N)
      throw new IllegalArgumentException("Illegal i");
    if (j < 0 || j >= N)
      throw new IllegalArgumentException("Illegal j");

    final int res = j - i + 1;
    if (res < 2 || res > min(N, 1000))
      throw new IllegalArgumentException("Illegal i & j combindation");

    int result = width[i];
    for (int k = i + 1; k <= j; k++) {
      if (width[k] < result)
        result = width[k];
    }

    return result;

  }

}
