package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

/**
 * Creates a Drivetrain Subsystem
 */
public class Drivetrain extends SubsystemBase {
    WPI_TalonSRX frontLeft;
    WPI_TalonSRX frontRight;
    WPI_TalonSRX backLeft;
    WPI_TalonSRX backRight;
    MotorControllerGroup leftGroup;
    MotorControllerGroup rightGroup;
    DifferentialDrive tankDrive;



    /**
     * Creates Drivetrain constructor
     */
    public Drivetrain() {
        frontLeft = new WPI_TalonSRX(Constants.Motors.FRONT_LEFT_MOTOR_ID);
        backLeft = new WPI_TalonSRX(Constants.Motors.BACK_LEFT_MOTOR_ID);
        leftGroup = new MotorControllerGroup(frontLeft, backLeft);
        backRight = new WPI_TalonSRX(Constants.Motors.BACK_RIGHT_MOTORI_D);
        frontRight = new WPI_TalonSRX(Constants.Motors.FRONT_RIGHT_MOTOR_ID);
        rightGroup = new MotorControllerGroup(frontRight, backRight);
        tankDrive = new DifferentialDrive(leftGroup, rightGroup);
        leftGroup.setInverted(true);
    }


    public void driveTank(double left, double right) {
        tankDrive.tankDrive(left, right);
    }

}
