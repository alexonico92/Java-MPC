import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.io.File;

import java.awt.Insets;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JComponent;
import javax.swing.KeyStroke;
import javax.swing.AbstractAction;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.Action;

import java.awt.event.KeyEvent;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioSystem;

import javax.swing.*;

public class Button2
{
    JButton B1;
    JButton B2;
    JButton B3;
    JButton B4;
    JButton B5;
    JButton B6;
    JButton B7;
    JButton B8;
    JButton B9;
    JButton B10;
    JButton B11;
    JButton B12;

    JPanel buttonPanel;

    JFrame frame;

    public void MPCmain()
    {
        frame = new JFrame("Virtual MPC");
        frame.setLayout(null);

        Container pane = frame.getContentPane();
        pane.setLayout(new BorderLayout());
        Insets insets = pane.getInsets();
        Dimension size;

        buttonPanel = new JPanel();

        B1 = new JButton("Sample 1");
        B2 = new JButton("Sample 2");
        B3 = new JButton("Sample 3");
        B4 = new JButton("Sample 4");
        B5 = new JButton("Sample 5");
        B6 = new JButton("Sample 6");
        B7 = new JButton("Sample 7");
        B8 = new JButton("Sample 8");
        B9 = new JButton("Sample 9");
        B10 = new JButton("Instruction");
        B11 = new JButton("Record");
        B12 = new JButton("Credits");


        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4,3));

        B1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_1, 0), "1");
        B2.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_2, 0), "2");
        B3.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_3, 0), "3");
        B4.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_4, 0), "4");
        B5.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_5, 0), "5");
        B6.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_6, 0), "6");
        B7.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_7, 0), "7");
        B8.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_8, 0), "8");
        B9.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_9, 0), "9");

        Action actionB1 = new AbstractAction()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                playSound("Kick Drum.wav");
            }
        };

        //B1.getActionMap().put("1", actionB1);
        B1.addActionListener(actionB1);
        InputMap inputMap = B1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(KeyStroke.getKeyStroke("1"), "hit B1");
        B1.getActionMap().put("hit B1", actionB1);


        Action actionB2 = new AbstractAction()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                playSound("Hi Hat.wav");
            }
        };

        //B2.getActionMap().put("2", actionB2);
        B2.addActionListener(actionB2);
        InputMap inputMap1 = B2.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap1.put(KeyStroke.getKeyStroke("2"), "hit B2");
        B2.getActionMap().put("hit B2", actionB2);

        Action actionB3 = new AbstractAction()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                playSound("Snare Drum.wav");
            }
        };

        //B3.getActionMap().put("3", actionB3);
        B3.addActionListener(actionB3);
        InputMap inputMap2 = B3.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap2.put(KeyStroke.getKeyStroke("3"), "hit B3");
        B3.getActionMap().put("hit B3", actionB3);

        Action actionB4 = new AbstractAction()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                playSound("Double Bass.wav");
            }
        };

        //B4.getActionMap().put("4", actionB4);
        B4.addActionListener(actionB4);
        InputMap inputMap3 = B4.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap3.put(KeyStroke.getKeyStroke("4"), "hit B4");
        B4.getActionMap().put("hit B4", actionB4);

        Action actionB5 = new AbstractAction()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                playSound("Piano.wav");
            }
        };

        //B5.getActionMap().put("5", actionB5);
        B5.addActionListener(actionB5);
        InputMap inputMap4 = B5.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap4.put(KeyStroke.getKeyStroke("5"), "hit B5");
        B5.getActionMap().put("hit B5", actionB5);

        Action actionB6 = new AbstractAction()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                playSound("Snare Drum.wav");
            }
        };

        //B6.getActionMap().put("6", actionB6);
        B6.addActionListener(actionB6);
        InputMap inputMap5 = B6.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap5.put(KeyStroke.getKeyStroke("6"), "hit B6");
        B6.getActionMap().put("hit B6", actionB6);

        Action actionB7 = new AbstractAction()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                playSound("Snare Drum.wav");
            }
        };

        //B7.getActionMap().put("7", actionB7);
        B7.addActionListener(actionB7);
        InputMap inputMap6 = B7.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap6.put(KeyStroke.getKeyStroke("7"), "hit B7");
        B7.getActionMap().put("hit B7", actionB7);

        Action actionB8 = new AbstractAction()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                playSound("Kick Drum.wav");
            }
        };

        //B8.getActionMap().put("8", actionB8);
        B8.addActionListener(actionB8);
        InputMap inputMap7 = B8.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap7.put(KeyStroke.getKeyStroke("8"), "hit B8");
        B8.getActionMap().put("hit B8", actionB8);

        Action actionB9 = new AbstractAction()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                playSound("Kick Drum.wav");
            }
        };

        //B9.getActionMap().put("9", actionB9);
        B9.addActionListener(actionB9);
        InputMap inputMap8 = B9.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap8.put(KeyStroke.getKeyStroke("9"), "hit B9");
        B9.getActionMap().put("hit B9", actionB9);

        Action actionB10 = new AbstractAction()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(frame.getComponent(0), "Play sample: press keys from 1-9\n \n Click mouse on sample button to load file\n \n Press space bar to start recording\n \n Only .wav files can be used as sample file");
            }
        };

        B10.addActionListener(actionB10);

        buttonPanel.add(B1);
        buttonPanel.add(B2);
        buttonPanel.add(B3);
        buttonPanel.add(B4);
        buttonPanel.add(B5);
        buttonPanel.add(B6);
        buttonPanel.add(B7);
        buttonPanel.add(B8);
        buttonPanel.add(B9);
        buttonPanel.add(B10);
        buttonPanel.add(B11);
        buttonPanel.add(B12);

        pane.add(buttonPanel);

        //size = buttonPanel.getPreferredSize();
        //buttonPanel.setBounds(100 + insets.left, 100 + insets.top, size.width, size.height);

        frame.setVisible(true);
        frame.setSize(450, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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

    public static void main(String[] args)
    {
        Button2 bmpc = new Button2();
        bmpc.MPCmain();
    }
}