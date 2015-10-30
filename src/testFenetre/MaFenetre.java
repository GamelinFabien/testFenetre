package testFenetre;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class MaFenetre extends JFrame{
	
public MaFenetre(){
	this.setTitle("Map");
	this.setSize(400, 400);
	this.setLocationRelativeTo(null);
	
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	this.setContentPane(new Panneau());
	
	this.setVisible(true);
}

}
