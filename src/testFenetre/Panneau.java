package testFenetre;

import java.awt.Graphics;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
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
  File file = new File ("Images/map/map1.txt");  
  FileReader fileReader = new FileReader (file);
      char caractere = (char) fileReader.read();
     // System.out.print (caractere);
      int c = fileReader.read();
          while (c != -1)
          {
              System.out.print ((char) c);
              c = fileReader.read();
              
          }
          System.out.print ("caca");
  fileReader.close();

         
      
      

      /*scan map*/
      //for(int a=0; a<100; a++){
    	//  for(int b=0; b<100; b++){
    		  /*positionnement des images en fonction des caracteres*/
    		/*  if(SquareTab[a][b] == "*"){
    			  g.drawImage(wall, a, b, this);
    		  }
    		  else if(SquareTab[a][b] == "G"){
    			  g.drawImage(grass, a, b, this);
			  }
    		  else if(Square[a][b] == "D"){
    			  g.drawImage(departure, a, b, this);
			  }
    		  else if(SquareTab[a][b] == "A"){
    			  g.drawImage(arrival, a, b, this);
			  }
    		  else if(SquareTab[a][b] == " "){
    			  g.drawImage(ground, a, b, this);
			  }*/
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