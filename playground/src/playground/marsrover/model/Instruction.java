/*
 * Copyright (c) 2014, In Mind Computing AG. All rights reserved.
 * IMC PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package playground.marsrover.model;

/**
 *
 *
 */
public enum Instruction {

  L("L"), R("R"), M("M");

  String orientation;

  private Instruction(final String signal) {
    orientation = signal;
  }

  /**
   * @return the signal
   */
  public String getOrientation() {
    return orientation;
  }

}
