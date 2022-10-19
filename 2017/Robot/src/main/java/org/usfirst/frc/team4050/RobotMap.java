package org.usfirst.frc.team4050;

import edu.wpi.first.wpilibj.*;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    public static SpeedController drivetrainpFrontLeft;
    public static SpeedController drivetrainpFrontRight;
    public static SpeedController drivetrainpRearLeft;
    public static SpeedController drivetrainpRearRight;
    public static RobotDrive drivetrainPotatoDrive;

    public static ADXRS450_Gyro gyro = new ADXRS450_Gyro(SPI.Port.kOnboardCS0);


    public static void init() {
        drivetrainpFrontLeft = new Talon(0);
        drivetrainpFrontRight = new Talon(1);
        drivetrainpRearLeft = new Talon(2);
        drivetrainpRearRight = new Talon(3);
        drivetrainPotatoDrive = new RobotDrive(drivetrainpFrontLeft, drivetrainpRearLeft, drivetrainpFrontRight, drivetrainpRearRight);
        
        drivetrainPotatoDrive.setSafetyEnabled(true);
        drivetrainPotatoDrive.setExpiration(0.1);
        drivetrainPotatoDrive.setSensitivity(0.5);
        drivetrainPotatoDrive.setMaxOutput(1.0);

        gyro.calibrate();

    }
}



/**
 *   Motor PWM Assignments + wheel layout
 *
 *       \\\|------------|///
 *       \\\| 0        1 |///
 *          |            |
 *          |            |
 *          |            |
 *          |            |
 *       ///| 2        3 |\\\
 *       ///|____________|\\\
 *
 *
 */