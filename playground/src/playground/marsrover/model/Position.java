/*
 * Copyright (c) 2014, In Mind Computing AG. All rights reserved.
 * IMC PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package playground.marsrover.model;

/**
 *
 *
 */
public class Position {

  private final Coordinate coordinate;
  private final Heading heading;

  public Position(final Coordinate c, final Heading h) {
    coordinate = c;
    heading = h;
  }

  /**
   * @return the coordinate
   */
  public Coordinate getCoordinate() {
    return coordinate;
  }

  /**
   * @return the orientation
   */
  public Heading getHeading() {
    return heading;
  }

}
