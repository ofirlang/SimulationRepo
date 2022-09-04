 
package frc.robot.subsystems;
 
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class dayig extends SubsystemBase {

  private static final int kMotorPort = 0;
  private static final int kXboxPort = 0;

  public static Talon m_motor;
  public static Talon m_leftMotor;
  public static Talon m_rightMotor;
  public static XboxController m_xboxController;

  public dayig() {
    m_motor = new Talon(kMotorPort);
    m_xboxController = new XboxController(kXboxPort);
  }

  @Override
  public void periodic() { 
    
    
  }
}
