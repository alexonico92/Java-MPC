import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.io.File;

import java.awt.event.KeyEvent;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioSystem;

import javax.swing.*;

public class Button1 extends JPanel
{
    public static final int HEIGHT = 500;
    public static final int WIDTH = 500;
    private JButton B1;
    private JButton B2;
    private JButton B3;
    private JButton B4;
    private JButton B5;
    private JButton B6;
    private JButton B7;
    private JButton B8;
    private JButton B9;

    private JPanel buttonPanel;

    public Button1()
    {
        B1 = new B1();
        B2 = new B2();
        B3 = new B3();
        B4 = new B4();
        B5 = new B5();
        B6 = new B6();
        B7 = new B7();
        B8 = new B8();
        B9 = new B9();

        buttonPanel = this;

        setLayout(new GridLayout(3,3));
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        add(B1);
        add(B2);
        add(B3);
        add(B4);
        add(B5);
        add(B6);
        add(B7);
        add(B8);
        add(B9);

    }

    public void playSound(String soundName)
    {
        try
        {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        }
        catch(Exception ex)
        {
            System.out.println("Error with playing sound");
            ex.printStackTrace();
        }
    }

    class B1 extends JButton implements ActionListener, KeyListener
    {
        B1()
        {
            super("Sample 1");
            addActionListener(this);
            addKeyListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent e)
        {
            buttonPanel.setBackground(Color.BLUE);
            //playSound("Kick Drum.wav");
        }

        @Override
        public void keyTyped(KeyEvent e)
        {

        }

        @Override
        public void keyReleased(KeyEvent e)
        {

        }

        @Override
        public void keyPressed (KeyEvent e)
        {
            if (e.getKeyCode() == KeyEvent.VK_1)
            {
                playSound("Kick Drum.wav");
            }
        }
    }

    class B2 extends JButton implements ActionListener, KeyListener
    {
        B2()
        {
            super("Sample 2");
            addActionListener(this);
            addKeyListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent e)
        {
            buttonPanel.setBackground(Color.RED);
            //playSound("Hi Hat.wav");
        }

        @Override
        public void keyTyped(KeyEvent e)
        {

        }

        @Override
        public void keyReleased(KeyEvent e)
        {

        }

        @Override
        public void keyPressed(KeyEvent e)
        {
            if(e.getKeyCode() == KeyEvent.VK_2)
            {
                playSound("Hi Hat.wav");
            }
        }
    }

    class B3 extends JButton implements ActionListener, KeyListener
    {
        B3()
        {
            super("Sample 3");
            addActionListener(this);
            addKeyListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent e)
        {
            buttonPanel.setBackground(Color.GREEN);
            //playSound("Snare Drum.wav");
        }

        @Override
        public void keyTyped(KeyEvent e)
        {

        }

        @Override
        public void keyReleased(KeyEvent e)
        {

        }

        @Override
        public void keyPressed(KeyEvent e)
        {
            if(e.getKeyCode() == KeyEvent.VK_3)
            {
                playSound("Snare Drum.wav");
            }
        }
    }

    class B4 extends JButton implements ActionListener
    {
        B4()
        {
            super("Sample 4");
            addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent e)
        {
            buttonPanel.setBackground(Color.YELLOW);
        }
    }

    class B5 extends JButton implements ActionListener
    {
        B5()
        {
            super("Sample 5");
            addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent e)
        {
            buttonPanel.setBackground(Color.BLACK);
        }
    }

    class B6 extends JButton implements ActionListener
    {
        B6()
        {
            super("Sample 6");
            addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent e)
        {
            buttonPanel.setBackground(Color.PINK);
        }
    }

    class B7 extends JButton implements ActionListener
    {
        B7()
        {
            super("Sample 7");
            addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent e)
        {
            buttonPanel.setBackground(Color.CYAN);
        }
    }

    class B8 extends JButton implements ActionListener
    {
        B8()
        {
            super("Sample 8");
            addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent e)
        {
            buttonPanel.setBackground(Color.ORANGE);
        }
    }

    class B9 extends JButton implements ActionListener
    {
        B9()
        {
            super("Sample 9");
            addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent e)
        {
            buttonPanel.setBackground(Color.GRAY);
        }
    }
}
