// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package team.gif.robot.subsystems.driver;

import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.Robot;

public class Drivetrain extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
public static TalonSRX leftCIM = new TalonSRX(0);
public static TalonSRX rightCIM = new TalonSRX(0);

  public Drivetrain() {}

  public void ldrive(double x){
    leftCIM.set(TalonSRXControlMode.PercentOutput,x);
  }

  public void rdrive(double x){
    rightCIM.set(TalonSRXControlMode.PercentOutput,x);
  }

  /**
   * Example command factory method.
   *
   * @return a command
   */
  public CommandBase exampleMethodCommand() {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return runOnce(
        () -> {
          /* one-time action goes here */
        });
  }

  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
