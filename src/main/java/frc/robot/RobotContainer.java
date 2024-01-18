// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.commands.Drive;
import frc.robot.subsystems.DriveSubsystem;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;

public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final DriveSubsystem drive = new DriveSubsystem();

  // Replace with CommandPS4Controller or CommandJoystick if needed
  public final Joystick m_driverController = new Joystick(0);

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the trigger bindings
    drive.setDefaultCommand(new Drive(drive, () -> -m_driverController.getRawAxis(1)*0.87, () -> m_driverController.getRawAxis(2)*0.65));
    configureBindings();
  }

  private void configureBindings() {

  }

  public Command getAutonomousCommand() {
    // An example command will be run in autonomous
    return null;
  }
}
