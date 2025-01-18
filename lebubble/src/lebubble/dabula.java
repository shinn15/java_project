package lebubble;
import java.util.ArrayList;
import java.awt.Color;
import java.util.Random;
import java.awt.Graphics;
import javax.swing.JPanel;


public class dabula extends JPanel {
	
	Random gulo = new Random();
	ArrayList<bula> bulalist;
	int size = 25;

public dabula() {
	bulalist = new ArrayList<bula>();
	setBackground(Color.WHITE);
	bulatest();
}
	

private class bula {
			
			private int x;
			private int y;
			private int size;
			private Color kulay;
			
		public bula(int bagox, int bagoy, int newsize) {
			
				
				x = bagox;
				y = bagoy;
				size = newsize;
				kulay = new Color (gulo.nextInt(256),
						gulo.nextInt(256),
						gulo.nextInt(256));
					
			
		}
		
		public void guhit(Graphics awit) {
			
			awit.setColor(kulay);
			awit.fillOval(x - size/2, y - size/2, size, size);
			
		}	
		
}

public void paintComponents(Graphics awit) {
	super.paintComponents(awit);
	
	for (bula b : bulalist) {
		b.guhit(awit);
	}
	
}

public void bulatest() {
	for (int n = 0; n < 100; n++) {
		int x = gulo.nextInt(600);
		int y = gulo.nextInt(400);
		int size = gulo.nextInt(50);
		bulalist.add(new bula(x, y, size));
	}
	
	repaint();
}

	
	
}
	
	
	
	
	
	


