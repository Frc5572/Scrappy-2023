package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import frc.robot.Constants;

public class Drivetrain {
    CANSparkMax frontLeft;
    CANSparkMax frontRight;
    CANSparkMax backLeft;
    CANSparkMax backRight;
    MotorControllerGroup left;
    MotorControllerGroup right;
    DifferentialDrive tankDrive;



    public Drivetrain() {
        frontLeft = new CANSparkMax(Constants.Motors.FRONTLEFTMOTORID, MotorType.kBrushless);
        frontRight = new CANSparkMax(Constants.Motors.FRONTRIGHTMOTORID, MotorType.kBrushless);
        backLeft = new CANSparkMax(Constants.Motors.BACKLEFTMOTORID, MotorType.kBrushless);
        backRight = new CANSparkMax(Constants.Motors.BACKRIGHTMOTORID, MotorType.kBrushless);
        left = new MotorControllerGroup(frontLeft, backLeft);
        right = new MotorControllerGroup(frontRight, backRight);
        tankDrive = new DifferentialDrive(left, right);
    }

}
