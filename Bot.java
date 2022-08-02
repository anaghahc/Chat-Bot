import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class Chatbot extends JFrame {

	private JTextArea chatArea = new JTextArea();
	private JTextField chatBox = new JTextField();
	private JButton b = new JButton();
	private JLabel l = new JLabel();

	Chatbot() {

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setSize(600, 600);
		frame.setTitle("Chat Bot");
		frame.getContentPane().setBackground(Color.GRAY);
		frame.add(chatArea);
		frame.add(chatBox);
		frame.add(b);
		l.setText("  SEND");
		b.add(l);

		b.setSize(60, 30);
		b.setLocation(485, 500);
		b.setBackground(Color.LIGHT_GRAY);
		b.setBorder(BorderFactory.createMatteBorder(4, 0, 4, 4, Color.BLACK));

		chatArea.setBackground(Color.LIGHT_GRAY);
		chatArea.setSize(500, 400);
		chatArea.setLocation(45, 8);
		chatArea.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.BLACK));

		chatBox.setBackground(Color.LIGHT_GRAY);
		chatBox.setSize(440, 30);
		chatBox.setLocation(45, 500);
		chatBox.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.BLACK));

		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (e.getSource() == b) {
					String text = chatBox.getText().toLowerCase();
					chatArea.setForeground(Color.BLUE);
					chatArea.append("You-->" + text + "\n");
					chatBox.setText("");

					if (text.contains("hi") || text.contains("hello") || text.contains("hey")) {
						int rand = (int) (Math.random() * 2 + 1);
						if (rand == 1) {
							bot("Hey There");
						} else if (rand == 2) {
							bot("Hello");
						} else if (rand == 3) {
							bot("Holla");
						}
					} else if (text.contains("my name is") || text.contains("i am") || text.contains("i'm")) {
						int rand = (int) (Math.random() * 2 + 1);
						if (rand == 1)
							bot("I will remember that");
						else if (rand == 2)
							bot(("I will keep that in mind"));
					} else if (text.contains("how are you")) {
						bot("I'm Great!Thanks for asking");
					} else if (text.contains("what is your name")) {
						bot("I'm Lot the Bot");
					} else if (text.contains("love")) {
						bot("I'm glad you do");
					}

					else if (text.contains("bye")) {
						bot("So soon ? Anyways" + "\n" + "Bye");
					} else {
						int rand = (int) (Math.random() * 3 + 1);
						if (rand == 1) {
							bot("I don't understand");
						} else if (rand == 2) {
							bot("Please come again");
						} else if (rand == 3) {
							bot("I am afraid I can't help you with that");
						}

					}

				}

			}

		});

	}

	public void bot(String s) {
		chatArea.append("LotTheBot-->" + s + "\n");
	}

}

public class Bot {

	public static void main(String[] args) {

		new Chatbot();
	}

}