package frc.robot.commands;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.util.ExpoShaper;

public class ArcadeDrive extends Command {
    private ExpoShaper speedShaper;
    private ExpoShaper rotationShaper;

    @Override
    protected boolean isFinished() {
        return false;
    }

    public ArcadeDrive() {
        requires(Robot.driveTrain);
    }

    protected void execute() {
        // Robot.driveTrain.ArcadeDrive(0.90, 0, true);
        double s = speedShaper.expo(Robot.oi.driver.getY(Hand.kLeft));
        // soften the input by limiting the max input
        double rot = rotationShaper.expo(0.8 * Robot.oi.driver.getX(Hand.kRight));
        Robot.driveTrain.arcadeDrive(s, rot);
    }

}