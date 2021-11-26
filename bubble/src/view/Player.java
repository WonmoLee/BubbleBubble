package view;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel {
	//위치 상태
	private int x;
	private int y;
	
	private ImageIcon playerR, playerL;
	
	//생성자
	public Player() {
		initObject();
		initSetting();
	}
	
	private void initSetting() {
		x = 55;
		y = 535;
		
		setIcon(playerR);
		setSize(50, 50);
		setLocation(x, y);
	}
	
	private void initObject() {
		playerR = new ImageIcon("img/playerR.png");
		playerL = new ImageIcon("img/playerL.png");
	}
}
