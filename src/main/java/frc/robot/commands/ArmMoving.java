// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Arm;

public class ArmMoving extends CommandBase {
  /** Creates a new ArmMoving. */
  private Arm arm1;
  private double goal;

  /*
   * This moves arm to goal.
   */
  public ArmMoving(Arm arm1, double goal) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.arm1 = arm1;
    this.goal = goal;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    arm1.ArmSetToGoal(goal);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    arm1.ArmStop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {

    return Math.abs(arm1.GetArmAng() - goal) < 5;
  }
}
