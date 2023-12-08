package team.gif.robot.subsystems.driver;
import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Collectormotor extends SubsystemBase {
  public TalonSRX motor = new TalonSRX(6);

  public Collectormotor(){}

  public void move(double percentPower){motor.set(TalonSRXControlMode.PercentOutput,percentPower);}
}