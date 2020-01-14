package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

public class GearShifter extends Subsystem {
    private DoubleSolenoid gearShiftSolenoid = new DoubleSolenoid(RobotMap.GEARSHIFT_PCM_ID,
            RobotMap.GEARSHIFTUP_SOLENOID_PCM, RobotMap.GEARSHIFTDOWN_SOLENOID_PCM);

    public enum Gear {
        HIGH_GEAR(DoubleSolenoid.Value.kForward), // ### need to check right order
        LOW_GEAR(DoubleSolenoid.Value.kReverse);
        private final DoubleSolenoid.Value gearCode;

        Gear(DoubleSolenoid.Value value) {
            gearCode = value;
        }

        public DoubleSolenoid.Value solenoidCmd() {
            return this.gearCode;
        }
    }

    // State
    Gear curGear = Gear.LOW_GEAR;

    public GearShifter() {

    }

    @Override
    protected void initDefaultCommand() {

    }

    public void shiftUp() {
        gearShiftSolenoid.set(Gear.HIGH_GEAR.solenoidCmd());
        curGear = Gear.HIGH_GEAR;
    }

    public void shiftDown() {
        gearShiftSolenoid.set(Gear.LOW_GEAR.solenoidCmd());
        curGear = Gear.LOW_GEAR;
    }
}