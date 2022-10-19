package org.usfirst.frc.team4050.subsystems;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team4050.RobotMap;
import org.usfirst.frc.team4050.commands.pDrive;

public class Drivetrain extends Subsystem {

    private final RobotDrive potatoDrive = RobotMap.drivetrainPotatoDrive;
    private final ADXRS450_Gyro cartesianGyro = RobotMap.gyro;

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        setDefaultCommand(new pDrive());
    }

    public void takeJoystickInputs(Joystick left, Joystick right) {
        potatoDrive.mecanumDrive_Cartesian(left.getRawAxis(1), left.getRawAxis(2), right.getRawAxis(3), cartesianGyro.getAngle());
    }
}

