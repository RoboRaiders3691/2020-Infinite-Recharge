package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.SubSys.DriveTrain;
import frc.robot.SubSys.Intake;
import frc.robot.SubSys.Lift;
import frc.robot.SubSys.Shooter;

public class Learning{
    private static Joystick Joy;

    public static void JoySetup(){
        Joy = new Joystick(0);
    }

    public static void inputPeriodic(){
            if(Joy.getRawButton(9)){
                if(Joy.getRawAxis(4) > 0.1)
                    DriveTrain.slide(true);
                else if(Joy.getRawAxis(4) > 0.1)
                    DriveTrain.slide(false);
            }
            else{
                DriveTrain.setLeft(-Joy.getRawAxis(1));
                DriveTrain.setRight(-Joy.getRawAxis(5));
            }
                
    }
}