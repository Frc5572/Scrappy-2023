// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.Constants;
import frc.robot.subsystems.Drivetrain;

/**
 * Creates a TeleopDriveTrain Command
 */
public class TeleopDriveTrain extends CommandBase {
    /** Creates a new TeleopDriveTrain. */
    Drivetrain drivetrain;
    CommandXboxController driver;

    /**
     * Creates a TeleopDriveTrain Constructor
     *
     * @param drivetrain The subsystem of TeleopDriveTrain Command
     * @param driver CommandXboxController of driver
     */
    public TeleopDriveTrain(Drivetrain drivetrain, CommandXboxController driver) {
        // Use addRequirements() here to declare subsystem dependencies
        this.drivetrain = drivetrain;
        this.driver = driver;
        addRequirements(drivetrain);
    }


    // Called when the command is initially scheduled.
    @Override
    public void initialize() {}

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        drivetrain.driveTank(driver.getLeftY() * Constants.Motors.POWER_DECREASE,
            driver.getRightY() * Constants.Motors.POWER_DECREASE);

    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }
}

