package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Drivetrain extends SubsystemBase {
    CANSparkMax frontLeft;
    CANSparkMax frontRight;
    CANSparkMax backLeft;
    CANSparkMax backRight;
    MotorControllerGroup leftGroup;
    MotorControllerGroup rightGroup;
    DifferentialDrive tankDrive;



    public Drivetrain() {
        frontLeft = new CANSparkMax(Constants.Motors.FRONTLEFTMOTORID, MotorType.kBrushless);
        frontRight = new CANSparkMax(Constants.Motors.FRONTRIGHTMOTORID, MotorType.kBrushless);
        backLeft = new CANSparkMax(Constants.Motors.BACKLEFTMOTORID, MotorType.kBrushless);
        backRight = new CANSparkMax(Constants.Motors.BACKRIGHTMOTORID, MotorType.kBrushless);
        leftGroup = new MotorControllerGroup(frontLeft, backLeft);
        rightGroup = new MotorControllerGroup(frontRight, backRight);
        tankDrive = new DifferentialDrive(leftGroup, rightGroup);
        leftGroup.setInverted(true);
    }

    public void driveTank(double left, double right) {
        tankDrive.tankDrive(left, right);
    }

}
