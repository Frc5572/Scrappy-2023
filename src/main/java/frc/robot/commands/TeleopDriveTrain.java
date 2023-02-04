// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.Drivetrain;

public class TeleopDriveTrain extends CommandBase {
    /** Creates a new TeleopDriveTrain. */
    Drivetrain drivetrain;
    XboxController driver;

    public TeleopDriveTrain(Drivetrain drivetrain, XboxController driver) {
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
        drivetrain.driveTank(driver.getLeftY() * Constants.Motors.powerDecrease,
            driver.getRightY() * Constants.Motors.powerDecrease);

    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }
}

