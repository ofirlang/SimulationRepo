// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.subsystems.dayig;


public class Dayig extends CommandBase {
  /** Creates a new Dayig. */
  public Dayig() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(RobotContainer.dora);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (dayig.m_xboxController.getBumperPressed(Hand.kLeft))
    {
        dayig.m_motor.set(-0.1);
    }

    else if (dayig.m_xboxController.getBumperPressed(Hand.kRight))
    {
      dayig.m_motor.set(0.1);
    }

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
