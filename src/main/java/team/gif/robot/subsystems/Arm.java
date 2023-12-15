// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package team.gif.robot.subsystems;

import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.Constants;
import team.gif.robot.Robot;
import team.gif.robot.RobotMap;

public class Arm extends SubsystemBase {

  public WPI_TalonSRX armmotor = new WPI_TalonSRX(9);

  public Arm() {
    armmotor.configFactoryDefault();
    armmotor.setNeutralMode(NeutralMode.Brake);

//    armmotor.setSensorPhase(true);
//    armmotor.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative);

  }

  public void move(double percentPower) {
    armmotor.set(percentPower);
  }

  public void setArmrPos(double pos) {
    armmotor.set(ControlMode.Position, pos);
  }

  public double getArmPos() {
    return armmotor.getSelectedSensorPosition();
  }

  public void zeroEncoder() {
    armmotor.setSelectedSensorPosition(0);
  }
}
