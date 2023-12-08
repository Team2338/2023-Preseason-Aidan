package team.gif.robot.commands.autos;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class driveOverLine extends SequentialCommandGroup {

    public driveOverLine() {
        new driveTankAuto().schedule();
    }
}