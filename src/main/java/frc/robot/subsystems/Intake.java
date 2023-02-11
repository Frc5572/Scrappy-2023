package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;


public class Intake extends SubsystemBase {
    CANSparkMax intake_M1;

    public void intake() {
        intake_M1 = new CANSparkMax(Constants.IntakeConstants.intake_M1ID, MotorType.kBrushless);
    }

    public void intakeIn() {
        intake_M1.set(Constants.IntakeConstants.intakeInSpeed);

    }

    public void intakeOut() {
        intake_M1.set(Constants.IntakeConstants.intakeOutSpeed);
    }

    public void intakeStop() {
        intake_M1.set(Constants.IntakeConstants.IntakeStop);
    }
}
