package frc.robot;

/**
 * Constants file.
 */

public final class Constants {

    public static final double stickDeadband = 0.1;
    public static final int driverID = 0;
    public static final int operatorID = 1;

    /**
     * Motor CAN id's.
     */
    public static final class Motors {
    }

    /**
     * Pneumatics CAN id constants.
     */
    public static final class Pneumatics {
    }

    /**
     * Vision constants for limelight calculations.
     */
    public static final class VisionConstants {
        public static final double deadPocket = 0.05;
        public static final double limelightHeight = 0;
        public static final double targetHeight = 0;
        public static final double limelightAngle = 0;
    }

    /*
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
