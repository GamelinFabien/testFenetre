package testFenetre;

import java.awt.Graphics;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
	 
public class Panneau extends JPanel {
  public void paintComponent(Graphics g){
    try {
      Image character = ImageIO.read(new File("Images/tile/character/character1.png"));
      Image grass = ImageIO.read(new File("Images/tile/grass/grass1.png"));
      Image ground = ImageIO.read(new File("Images/tile/ground/ground1.png"));
      Image wall = ImageIO.read(new File("Images/tile/wall/wall1.png"));
      Image departure = ImageIO.read(new File("Images/tile/departure/departure1.png"));
      Image arrival = ImageIO.read(new File("Images/tile/arrival/arrival1.png"));
      
      /*recup fichier et lecture*/
      /* ground.getLength <=> a
       * ground.getWidth <=> b
       */

      FileInputStream fis = null;
      
      try {
      	 fis = new FileInputStream(new File("map/map1.txt"));
         int n = 0;
         int a = 0;
         int b = 0;
        		 
         while ((n = fis.read()) >= 0) {
	      	// System.out.println(n+ " : "+(char)n);     	  	 
	    	// System.out.println(a+ " - "+b);
	      	 if(n != 13 && n != 10){    		
		 		 if((char)n == '*'){
					  g.drawImage(wall, a, b, this);
				  }
				  else if((char)n == 'G'){
					  g.drawImage(grass, a, b, this);
				  }
				  else if((char)n == 'D'){
					  g.drawImage(departure, a, b, this);
				  }
				  else if((char)n == 'A'){
					  g.drawImage(arrival, a, b, this);
				  }
				  else if((char)n == 'P'){
					  g.drawImage(character, a, b, this);
				  }
				  else if((char)n == ' '){
					  g.drawImage(ground, a, b, this);
				  }
		 		a+= 26;
	      	 }
	      	 else if(n == 10){
	      		 b += 26;
	      		 a = 0;
	      	 }

         }
        // System.out.println("Copie terminée !");

      } catch (FileNotFoundException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      } finally {
         try {
            if (fis != null)
               fis.close();
         } catch (IOException e) {
            e.printStackTrace();
         }
      }
         
      
      



    	//  }
	 // }

      
      
     /* 
      g.drawImage(grass, 0, 0, this);
      g.drawImage(grass, 26, 0, this);
      g.drawImage(ground, 52, 0, this);
      g.drawImage(grass, 78, 0, this);
      g.drawImage(grass, 104, 0, this);
      g.drawImage(grass, 130, 0, this);
      g.drawImage(grass, 156, 0, this);
      g.drawImage(ground, 182, 0, this);
      g.drawImage(ground, 208, 0, this);
      g.drawImage(grass, 234, 0, this);*/
      
      //Pour une image de fond
      //g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
    } catch (IOException e) {
      e.printStackTrace();
    }                
  }               
}	