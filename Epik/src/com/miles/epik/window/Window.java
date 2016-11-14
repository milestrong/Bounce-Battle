package com.miles.epik.window;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.prince.epik.chat.Client;

public class Window {
	
	public Window(int w, int h, String title, Game game){
		game.setPreferredSize(new Dimension(w, h));
		//game.setMinimumSize(new Dimension(w, h));
		//game.setMaximumSize(new Dimension(w, h));
		JPanel chat = new JPanel();
		chat.setPreferredSize(new Dimension(600,600));
		
		JFrame frame = new JFrame(title);
		frame.setLayout(new BorderLayout());
		frame.add(game, BorderLayout.WEST);
		frame.add(chat, BorderLayout.EAST);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setLocationRelativeTo(null);
		frame.pack();
		frame.setVisible(true);
		

		
		game.start();
		new Client(chat);
		//frame.pack();
		
		
	}
}
