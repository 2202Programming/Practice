/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  public static final int FL_SPARKMAX_CANID = 11;
  public static final int ML_SPARKMAX_CANID = 12;
  public static final int BL_SPARKMAX_CANID = 13;
  public static final int FR_SPARKMAX_CANID = 21;
  public static final int MR_SPARKMAX_CANID = 22;
  public static final int BR_SPARKMAX_CANID = 23;

  public static final int GEARSHIFT_PCM_ID = 1;
  public static final int GEARSHIFTUP_SOLENOID_PCM = 0;
  public static final int GEARSHIFTDOWN_SOLENOID_PCM = 1;
}
