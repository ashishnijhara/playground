/*
 * Copyright (c) 2014, In Mind Computing AG. All rights reserved.
 * IMC PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package playground.marsrover.model;

/**
 *
 *
 */
public class Coordinate {

  private final int x;
  private final int y;

  public Coordinate(final int x, final int y) {
    this.x = x;
    this.y = y;
  }

  /**
   * @return the x
   */
  public int getX() {
    return x;
  }

  /**
   * @return the y
   */
  public int getY() {
    return y;
  }

}
