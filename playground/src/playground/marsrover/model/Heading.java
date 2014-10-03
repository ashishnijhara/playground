/*
 * Copyright (c) 2014, In Mind Computing AG. All rights reserved.
 * IMC PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package playground.marsrover.model;

/**
 *
 *
 */
public enum Heading {

  N("N"), S("S"), E("E"), W("W");

  private String heading;

  private Heading(final String heading) {
    this.heading = heading;
  }

  /**
   * @return the direction
   */
  public String getHeading() {
    return heading;
  }

}
