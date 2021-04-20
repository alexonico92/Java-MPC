import java.awt.EventQueue;

public class ProgramRunner
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new Button2();
            }
        });
    }
}
