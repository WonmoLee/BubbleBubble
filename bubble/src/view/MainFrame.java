package view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainFrame extends JFrame{
	private JLabel backgroundMap;
	private Player player;
	
	//생성자
	public MainFrame() {
		initSetting();
		initObject();
		setVisible(true);
	}
	
	//프레임 설정
	private void initSetting() {
		setSize(1000, 640);
		setLayout(null); //absolute layout
		setLocationRelativeTo(null); //창 가운데 위치시킴
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창을 끌때 JVM 종료시킴
	}
	
	private void initObject() {
		//맵배경
		backgroundMap = new JLabel(new ImageIcon("img/backgroundMap.png"));
		setContentPane(backgroundMap);
		
		//플레이어
		player = new Player();
		add(player);
	}
	
	public static void main(String[] args) {
		new MainFrame();
	}
}