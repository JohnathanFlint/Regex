package regex.view;
import javax.swing.JFrame;
import regex.controller.Controller;

public class Frame extends JFrame
{
	private Controller baseController;
	private Panel appPanel;
	
	public Frame (Controller baseController)
	{
		super();
		this.baseController = baseController;
		appPanel = new Panel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);;
		this.setTitle("Regex");
		this.setSize(500, 500);
		this.setResizable(false);
		this.setVisible(true);;
	}
}
