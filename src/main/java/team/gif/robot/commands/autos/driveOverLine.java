package team.gif.robot.commands.autos;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import team.gif.robot.Robot;

public class driveOverLine extends SequentialCommandGroup {

    public driveOverLine() {
        addRequirements(Robot.drivey);
        new driveTankAuto().schedule();
        if (Timer.getMatchTime() > 2.0) {
            new driveTankAuto().cancel();

        }
    }
}