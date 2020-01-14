package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import com.revrobotics.SparkMax;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.ArcadeDrive;

public class Drivetrain extends Subsystem {
    private CANSparkMax frontRight = new CANSparkMax(RobotMap.FR_SPARKMAX_CANID,
            CANSparkMaxLowLevel.MotorType.kBrushless);
    private CANSparkMax frontLeft = new CANSparkMax(RobotMap.FL_SPARKMAX_CANID,
            CANSparkMaxLowLevel.MotorType.kBrushless);
    private CANSparkMax backRight = new CANSparkMax(RobotMap.BR_SPARKMAX_CANID,
            CANSparkMaxLowLevel.MotorType.kBrushless);
    private CANSparkMax backLeft = new CANSparkMax(RobotMap.BL_SPARKMAX_CANID,
            CANSparkMaxLowLevel.MotorType.kBrushless);
    private CANSparkMax middleRight = new CANSparkMax(RobotMap.MR_SPARKMAX_CANID,
            CANSparkMaxLowLevel.MotorType.kBrushless);
    private CANSparkMax middleLeft = new CANSparkMax(RobotMap.ML_SPARKMAX_CANID,
            CANSparkMaxLowLevel.MotorType.kBrushless);
    private DifferentialDrive drive;

    public Drivetrain() {
        middleRight.follow(frontRight);
        middleLeft.follow(frontLeft);
        backRight.follow(frontRight);
        backLeft.follow(frontLeft);
        drive = new DifferentialDrive(frontLeft, frontRight);
    }

    public void arcadeDrive(double xSpeed, double rotationSpeed) {
        drive.arcadeDrive(xSpeed, rotationSpeed);
    }

    public void initDefaultCommand() {
        
        setDefaultCommand(new ArcadeDrive());
    }
}