/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.ShiftGear;
import frc.robot.subsystems.GearShifter.Gear;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  public XboxController driver = new XboxController(0);

  public OI() {

    new JoystickButton(driver, 4).whenPressed(new ShiftGear(Gear.HIGH_GEAR));
    new JoystickButton(driver, 1).whenPressed(new ShiftGear(Gear.LOW_GEAR));

  }
}
