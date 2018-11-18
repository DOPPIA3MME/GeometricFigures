/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figure_geometriche;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.FileNotFoundException;
import java.io.FileReader;
 
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
 

/* 
 * @author Maurizio
 * @author Minieri
*/

public class ImageTest 
{
    
    public void loadimage(String j) throws Exception 
    {
        System.out.println("Sto in loadimage\nSCELTA = "+Principale.SCELTA);
      
      
      switch(Principale.SCELTA)
      {
          case 1:
                try
                {
                        FileReader e = new FileReader(Path.PATH+"\\CARATTERISTICHE\\"+j+".jpg");
                        String imag= j+".jpg";

                       //seleziono il percorso, che prendo dal file Path.java ovviamente vado a vedere nella cartella caratteristiche e seleziono quella stringa
                       ImagePanel panel = new ImagePanel(new ImageIcon(Path.PATH + "\\CARATTERISTICHE\\"+ imag).getImage());
                       JFrame frame = new JFrame();
                       frame.getContentPane().add(panel);
                       frame.pack();
                       frame.setVisible(true);
                       System.out.println("e apro = "+j+"jpg da CARATTERISTICHE");
                }
                catch(FileNotFoundException ex)
                {
                     JOptionPane.showMessageDialog(null, "L'immagine non esiste.\nNella finestra PATH devi selezionare la cartella Figure_Geometriche", "Error", JOptionPane.ERROR_MESSAGE);
                     Path.deletepath();
                }
            break;
            
          case 2:
              try
                {
                        FileReader e = new FileReader(Path.PATH+"\\FORMULE\\"+j+".jpg");
                        String imag= j+".jpg";

                       //seleziono il percorso, che prendo dal file Path.java ovviamente vado a vedere nella cartella caratteristiche e seleziono quella stringa
                       ImagePanel panel = new ImagePanel(new ImageIcon(Path.PATH + "\\FORMULE\\"+ imag).getImage());
                       JFrame frame = new JFrame();
                       frame.getContentPane().add(panel);
                       frame.pack();
                       frame.setVisible(true);
                       System.out.println("e apro = "+j+"jpg da FORMULE");
                }
                catch(FileNotFoundException ex)
                {
                     JOptionPane.showMessageDialog(null, "L'immagine non esiste.\nNella finestra PATH devi selezionare la cartella Figure_Geometriche", "Error", JOptionPane.ERROR_MESSAGE);
                     Path.deletepath();
                }
          break;
      
      }
    }
    
  
}
 





class ImagePanel extends JPanel 
{
 
  private Image img;
 
  public ImagePanel(String img) {
    this(new ImageIcon(img).getImage());
  }
 
  //metodo che setta le caratteristiche del pannello
  public ImagePanel(Image img) 
  {
    this.img = img;
    Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
    setPreferredSize(size);
    setMinimumSize(size);
    setMaximumSize(size);
    setSize(size);
    setLayout(null);
  }
 
  
  // Stampa l'immagine nel pannello appena aperto
  public void paintComponent(Graphics g) {
    g.drawImage(img, 0, 0, null);
  }
 
}

