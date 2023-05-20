package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

/**
 * Creates a Drivetrain Subsystem
 */
public class Drivetrain extends SubsystemBase {
    VictorSP frontLeft = new VictorSP(Constants.Drivetrain.FRONT_LEFT_MOTOR_ID);
    VictorSP frontRight = new VictorSP(Constants.Drivetrain.FRONT_RIGHT_MOTOR_ID);
    VictorSP backLeft = new VictorSP(Constants.Drivetrain.BACK_LEFT_MOTOR_ID);
    VictorSP backRight = new VictorSP(Constants.Drivetrain.BACK_RIGHT_MOTOR_ID);
    MotorControllerGroup leftGroup = new MotorControllerGroup(frontLeft, backLeft);
    MotorControllerGroup rightGroup = new MotorControllerGroup(frontRight, backRight);
    DifferentialDrive tankDrive = new DifferentialDrive(leftGroup, rightGroup);



    /**
     * Creates Drivetrain constructor
     */
    public Drivetrain() {
        leftGroup.setInverted(true);
    }


    public void driveTank(double left, double right) {
        tankDrive.tankDrive(left, right);
    }

}
