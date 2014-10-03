/*
 * Copyright (c) 2014, In Mind Computing AG. All rights reserved.
 * IMC PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package playground.marsrover.model;

/**
 *
 *
 */
public class Plateau {

  private final Coordinate upperRight;
  private final Coordinate lowerLeft;

  public Plateau(final Coordinate upperRight, final Coordinate lowerLeft) {
    this.upperRight = upperRight;
    this.lowerLeft = lowerLeft;
  }

  /**
   * @return the lowerLeft
   */
  public Coordinate getLowerLeft() {
    return lowerLeft;
  }

  /**
   * @return the upperRight
   */
  public Coordinate getUpperRight() {
    return upperRight;
  }

}
