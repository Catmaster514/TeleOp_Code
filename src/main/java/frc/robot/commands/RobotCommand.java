// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.RobotSubsystem;
import edu.wpi.first.wpilibj2.command.Command;


/** An example command that uses an example subsystem. */
public class RobotCommand extends Command {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  /* 
  private double rightSpeed;
  private double leftSpeed;
  private XboxController xbox;
  private RobotSubsystem subsystem;
  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public RobotCommand(RobotSubsystem subsystem) {
    subsystem = new RobotSubsystem();
    
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(subsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  /* 
  public void execute() {
    //runs the move command every 20 miliseconds
    leftSpeed = xbox.getLeftY();
    rightSpeed = xbox.getLeftX();
    subsystem.arcadeDrive(leftSpeed, rightSpeed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}
*/
  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
