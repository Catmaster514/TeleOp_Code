// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.Victor;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;




public class RobotSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  // creates the victor motor controller variables
  /* 
  private Victor frontMotor;
  private Victor backMotor;
  private Victor motor3;
  private Victor motor4;
  private DifferentialDrive robot;
  private XboxController xbox;  

  
  public RobotSubsystem() {
    //defines the Victor motors 
    xbox = new XboxController(0);
    frontMotor = new Victor(0);
    backMotor = new Victor(8);
    motor3 = new Victor(9);
    motor4 = new Victor(1);
    frontMotor.addFollower(motor4);
    backMotor.addFollower(motor3);
    robot = new DifferentialDrive(frontMotor, backMotor);
    frontMotor.setInverted(true);
    robot.setSafetyEnabled(false);
    
  }

  /* this code is commented incase it needs to be implemented at a later date 
  public void tankDrive(XboxController xbox)
  {
    
    if(xbox.getRightX() == 0)
    {
      
      //Sets the motors to the the inverse of the joystick in the up and down
      motor1.set(-xbox.getLeftY());
      motor2.set(-xbox.getLeftY());
      motor3.set(-xbox.getLeftY());
      motor4.set(-xbox.getLeftY());
    } else if(Math.abs(xbox.getRightX()) > 0)
    {
      //turns the robot using the right stick values
      motor1.set(xbox.getRightX());
      motor2.set(-xbox.getRightX());
      motor3.set(-xbox.getRightX());
      motor4.set(xbox.getRightX());
    } else
    {
      motor1.stopMotor();
      motor2.stopMotor();
      motor3.stopMotor();
      motor4.stopMotor();
    }
    
    
  }*//* 
  public void arcadeDrive(double leftSpeed, double rightSpeed)
  {
    if(xbox.getRightTriggerAxis() < .8)
   {
    robot.arcadeDrive(leftSpeed*.8, rightSpeed *.8);
   } else
   {
    robot.stopMotor();
   }
  }
  */
  /*public void arcadeDrive(XboxController xbox) 
  {
    //checks which value of the joystick is greater to see if it should turn or drive forward
    if(Math.abs(xbox.getLeftX()) > Math.abs(xbox.getLeftY()))
    {
      //turns the robot 
      motor1.set(xbox.getLeftX());
      motor2.set(-xbox.getLeftX());
      motor3.set(-xbox.getLeftX());
      motor4.set(xbox.getLeftX());
    } else if(Math.abs(xbox.getLeftX()) < Math.abs(xbox.getLeftY()))
    {
      motor1.set(-xbox.getLeftX());
      motor2.set(-xbox.getLeftX());
      motor3.set(-xbox.getLeftX());
      motor4.set(-xbox.getLeftX());
    } else
    {
      motor1.stopMotor();
      motor2.stopMotor();
      motor3.stopMotor();
      motor4.stopMotor();
    }
  }

  public void driveSwitch(XboxController xbox)
  {
    //switches from between tank drive and arcade drive when the a button is pressed 
    if(xbox.getRawButtonPressed(0) && driveType == 0)
    {
      driveType += 1;
    } else if(xbox.getRawButtonPressed(0))
    {
      driveType = 0;
    }
  }

  /**
   * Example command factory method.
   *
   * @return a command
   */
  public Command exampleMethodCommand() {
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
