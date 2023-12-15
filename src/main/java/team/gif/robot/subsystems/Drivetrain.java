// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package team.gif.robot.subsystems;

import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.Robot;

public class Drivetrain extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
public static TalonSRX leftCIM = new TalonSRX(10);
public static TalonSRX rightCIM = new TalonSRX(8);

  public Drivetrain() {}

  public void ldrive(double x){
    leftCIM.set(TalonSRXControlMode.PercentOutput,x);
  }

  public void rdrive(double x){
    rightCIM.set(TalonSRXControlMode.PercentOutput,x);
  }
}
