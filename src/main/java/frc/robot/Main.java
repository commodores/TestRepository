// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of


package frc.robot;

import edu.wpi.first.wpilibj.RobotBase;

/**
 
 * you are doing, do not modify this file except to change the parameter class to the startRobot
 * call. Updates
 */
public final class Main {
  private Main() {}

  public static void main(String... args) {
    RobotBase.startRobot(Robot::new);
  }
}
