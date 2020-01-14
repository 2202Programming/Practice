package frc.robot.commands;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ArcadeDrive extends Command {

    @Override
    protected boolean isFinished() {
        return false;
    }

    public ArcadeDrive() {
        requires(Robot.driveTrain);
    }

    protected void execute() {
        Robot.driveTrain.arcadeDrive(Robot.oi.driver.getY(Hand.kLeft), Robot.oi.driver.getX(Hand.kRight));
    }

}