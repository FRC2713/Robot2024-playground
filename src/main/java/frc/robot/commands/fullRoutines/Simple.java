package frc.robot.commands.fullRoutines;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.Robot;
import frc.robot.subsystems.swerveIO.SwerveSubsystem;
import frc.robot.util.AutoPath.Autos;

public class Simple extends SequentialCommandGroup {
  public Simple() {
    addCommands(
        new SequentialCommandGroup(
            new InstantCommand(
                () -> {
                  Robot.swerveDrive.resetOdometry(
                      Autos.FIVE_TO_B.getTrajectory().getInitialHolonomicPose());
                }),
            SwerveSubsystem.Commands.stringTrajectoriesTogether(Autos.FIVE_TO_B.getTrajectory())));
  }
}
