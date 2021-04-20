import javax.swing.*;

public class MPCWindow extends JFrame
{
    public MPCWindow()
    {
        super("Virtual MPC");

        JPanel button1 = new Button1();
        add(button1);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
}
