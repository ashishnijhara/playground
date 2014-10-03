/*
 * Copyright (c) 2014, In Mind Computing AG. All rights reserved.
 * IMC PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package playground.marsrover;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 *
 */
public class Controller {

  public static void main(final String[] args) throws IOException {

    System.out.println("Please provide the  : \n");
    final Scanner reader = new Scanner(System.in);

    while (reader.hasNextLine()) {
      System.out.println(reader.nextLine());
    }
    reader.close();

  }

}
