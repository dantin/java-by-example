import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @version 1.0 2018-05-23
 */
public class RadioButtonTest {
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        RadioButtonFrame frame = new RadioButtonFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
      }
    });
  }
}

/**
 * A frame with a sample text label and radio buttons for selecting font size.
 */
class RadioButtonFrame extends JFrame {
  private static final int DEFAULT_WIDTH  = 400;
  private static final int DEFAULT_HEIGHT = 200;

  private static final int DEFAULT_SIZE = 12;

  private JPanel buttonPanel;
  private ButtonGroup group;
  private JLabel label;

  public RadioButtonFrame() {
    setTitle("RadioButtonTest");
    setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

    // add the sample text label
    
    label = new JLabel("The quick brown fox jumps over the lazy dog.");
    label.setFont(new Font("Serif", Font.PLAIN, DEFAULT_SIZE));
    add(label, BorderLayout.CENTER);

    // add the radio buttons

    buttonPanel = new JPanel();
    group = new ButtonGroup();

    addRadioButton("Small", 8);
    addRadioButton("Medium", 12);
    addRadioButton("Large", 18);
    addRadioButton("Extra large", 36);

    add(buttonPanel, BorderLayout.SOUTH);
  }

  /**
   * Adds a radio button that sets the font size of the sample text.
   *
   * @param name the string to appear on the button
   * @param size the font size that this button sets
   */
  public void addRadioButton(String name, final int size) {
    boolean selected = size == DEFAULT_SIZE;
    JRadioButton button = new JRadioButton(name, selected);
    group.add(button);
    buttonPanel.add(button);

    // this listener sets the label font size

    ActionListener listener = new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        // size refers to the final parameter of the addRadioButton method
        label.setFont(new Font("Serif", Font.PLAIN, size));
      }
    };
    button.addActionListener(listener);
  }
}
