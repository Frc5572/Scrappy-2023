package frc.robot;

/**
 * Constants file.
 */

public final class Constants {
    public static final double STICK_DEADBAND = 0.1;
    public static final int DRIVER_ID = 0;
    public static final int OPERATOR_ID = 1;

    /**
     * Motor CAN id's.
     */
    public static final class Motors {
        public static final int FRONT_LEFT_MOTOR_ID = 1;
        public static final int FRONT_RIGHT_MOTOR_ID = 1;
        public static final int BACK_LEFT_MOTOR_ID = 1;
        public static final int BACK_RIGHT_MOTORI_D = 1;
        public static final double POWER_DECREASE = .5;

    }

    /**
     * Pneumatics CAN id constants.
     */
    public static final class Pneumatics {
        public static final int FORWARD = 0;
        public static final int BACKWARD = 0;
    }

    /**
     * Vision constants for limelight calculations.
     */
    public static final class VisionConstants {
        public static final double DEAD_POCKET = 0.05;
        public static final double LIME_LIGHT_HEIGHT = 0;
        public static final double TARGET_HEIGHT = 0;
        public static final double LIME_LIGHT_ANGLE = 0;
    }

    /**
     * Constants for the Arm Constants
     */
    public static final class ArmConstants {
        // public static final int INTAKE_M1ID = 1;
        public static final int Arm_M1ID = 0;
        public static final int EncoderID = 0;
        public static final double EncOffset = 0.0;
        public static final double angleSecondPosition = 0.0;
        public static final double armPosHome = 0.0;
        public static final double armPosFloor = 0.0;
        public static final double armPosMiddle = 0.0;
        public static final double armPosTop = 0.0;

    }

}
