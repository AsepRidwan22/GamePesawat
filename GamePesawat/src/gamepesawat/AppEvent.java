package gamepesawat;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
// import javax.swing.Timer;

// import java.awt.event.ActionListener;

// import java.awt.Color;

// import jdk.internal.org.jline.utils.Colors;

// import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

public class AppEvent extends JFrame implements KeyListener {

    JLabel kotak = new JLabel();
    JLabel tembak = new JLabel();
    // Timer timer = new Timer(1000, new MyTimerActionListener());
    ImageIcon kapal;
    ImageIcon peluru;
    // int no;

    int[] jarak = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };

    int poX, poY;

    public AppEvent() {

        poX = 400;
        poY = 500;

        // no = 0;
        // timer = new Timer(1000, (ActionListener) this);

        kotak.setBounds((poX / 2) - (50 / 2), poY - 100, 50, 50);
        tembak.setBounds((poX / 2) - (17 / 2), poY - 100, 20, 20);
        // kotak.setBackground(Color.blue);
        // kotak.setOpaque(true);
        kapal = new ImageIcon(this.getClass().getResource("pesawat.gif"));
        peluru = new ImageIcon(this.getClass().getResource("peluru2.png"));

        kotak.setIcon(kapal);
        // tembak.setSize(200, 200);
        tembak.setIcon(peluru);

        this.add(kotak);
        this.add(tembak);
        // this.getContentPane().setBackground(Color.gray);

        this.addKeyListener(this);

        // setting frame
        this.setSize(400, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(null);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new AppEvent();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()) {
            case 'a':
                kotak.setLocation(kotak.getX() - 10, kotak.getY());
                break;
            case 'd':
                kotak.setLocation(kotak.getX() + 10, kotak.getY());
                break;
            case 'w':
                kotak.setLocation(kotak.getX(), kotak.getY() - 10);
                break;
            case 's':
                kotak.setLocation(kotak.getX(), kotak.getY() + 5);
                break;
        }
        // System.out.println("You Released : " + e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case 37:
                kotak.setLocation(kotak.getX() - 10, kotak.getY());
                break;
            case 39:
                kotak.setLocation(kotak.getX() + 10, kotak.getY());
                break;
            case 38:
                kotak.setLocation(kotak.getX(), kotak.getY() - 10);
                break;
            case 40:
                kotak.setLocation(kotak.getX(), kotak.getY() + 10);
                break;
            case 32:
                tembak.setLocation(tembak.getX(), tembak.getY() - 10);
                break;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("You Released : " + e.getKeyCode());
    }
}
