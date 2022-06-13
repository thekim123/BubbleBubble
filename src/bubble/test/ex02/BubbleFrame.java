package bubble.test.ex02;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class BubbleFrame extends JFrame {
	
	private JLabel backgroundMap;
	private Player player;
	
	public BubbleFrame() {
		initObject();
		initSetting();
		setVisible(true);
	}
	
	private void initObject() {
		backgroundMap = new JLabel(new ImageIcon("image/backgroundMap.png"));
		setContentPane(backgroundMap);
		
		player = new Player();
		add(player);
//		backgroundMap.setSize(1000,600);
//		// backgroundMap.setLocation(300, 300);
//		add(backgroundMap);
	}
	
	private void initSetting() {
		setSize(1000, 640);
		setLayout(null);	//absolute 레이아웃 ( 자유롭게 그림을 그릴 수 있음.)
		
		setLocationRelativeTo(null);	// JFrame 을 가운데에 배치
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// 창 종료시 JVM종료하기
	}
	
	public static void main(String[] args) {
		new BubbleFrame();
	}
}
