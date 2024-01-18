// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.DriveSubsystem;

public class Drive extends Command {
  /** Creates a new Drive. */
  DriveSubsystem m_drive;
  DoubleSupplier m_left;
  DoubleSupplier m_right;
  public Drive(DriveSubsystem drive ,DoubleSupplier left, DoubleSupplier right) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.m_drive = drive;
    this.m_left = left;
    this.m_right = right;
    addRequirements(m_drive);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_drive.arcadeDrive(m_left.getAsDouble(), m_right.getAsDouble());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
