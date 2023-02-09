package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.DutyCycleEncoder;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

/**
 * Creates the Arm subsystem.
 */
public class Arm extends SubsystemBase {
    // 1 Neo Motor Semi-Confirmed for the arm.
    private DutyCycleEncoder absEncoder1 = new DutyCycleEncoder(Constants.ArmConstants.EncoderID);
    private CANSparkMax arm_M1;

    /**
     * Creates a constructor for the arm.
     */
    public void arm() {
        arm_M1 = new CANSparkMax(Constants.ArmConstants.Arm_M1ID, MotorType.kBrushless);
        arm_M1.setInverted(false);
    }

    /**
     * @returns The angle of the Arm via the Encoder.
     */
    public double GetArmAng() {
        double armAngle =

            (absEncoder1.getAbsolutePosition() - Constants.ArmConstants.EncOffset) * 360;
        return armAngle;
    }

    /**
     * Moves the arm to the desired angle.
     *
     * @param angleGoal the desired angle for the goal.
     */
    public void ArmSetToGoal(double angleGoal) {
        if (!(Math.abs(GetArmAng() - angleGoal) < 5)) {
            arm_M1.set(0.1);
        }
    }

    /**
     * Stops the Arm.
     */
    public void ArmStop() {
        arm_M1.set(0.0);
    }
}
