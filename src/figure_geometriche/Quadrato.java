/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figure_geometriche;


import java.io.IOException;
import static java.lang.Math.sqrt;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

      
 /**
 *
 * @author Maurizio
 */
public class Quadrato extends javax.swing.JFrame {
      
      float lato;
      float perimetro;
      float area;
      float diagonale;
      
      boolean perimetrovuoto=true;
      boolean latovuoto=true;
      boolean areavuoto=true;
      boolean diagonalevuoto=true;
    
    public Quadrato() {
        initComponents();
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        TextI_perimetro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TextO_area = new javax.swing.JTextField();
        TextO_perimetro = new javax.swing.JTextField();
        bFatto = new javax.swing.JButton();
        TextI_lato = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TextO_lato = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TextI_area = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TextO_diagonale = new javax.swing.JTextField();
        TextI_diagonale = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        Item_caratteristiche = new javax.swing.JMenuItem();
        Item_formule = new javax.swing.JMenuItem();
        Item_costruzione = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        TextI_perimetro.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                TextI_perimetroAncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                TextI_perimetroAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                TextI_perimetroAncestorRemoved(evt);
            }
        });
        TextI_perimetro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextI_perimetroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TextI_perimetroMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TextI_perimetroMousePressed(evt);
            }
        });
        TextI_perimetro.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                TextI_perimetroComponentHidden(evt);
            }
        });
        TextI_perimetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextI_perimetroActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("QUADRATO");

        jLabel2.setText("Inserisci il lato");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Area                 :");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Perimetro       :");

        TextO_area.setEditable(false);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, TextI_area, org.jdesktop.beansbinding.ELProperty.create("${text}"), TextO_area, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        TextO_perimetro.setEditable(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, TextI_perimetro, org.jdesktop.beansbinding.ELProperty.create("${text}"), TextO_perimetro, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        bFatto.setText("FATTO");
        bFatto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFattoActionPerformed(evt);
            }
        });

        TextI_lato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TextI_latoMousePressed(evt);
            }
        });

        jLabel3.setText("Inserisci perimetro");

        TextO_lato.setEditable(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, TextI_lato, org.jdesktop.beansbinding.ELProperty.create("${text}"), TextO_lato, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        TextO_lato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextO_latoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Lato                  :");

        TextI_area.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                TextI_areaAncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                TextI_areaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                TextI_areaAncestorRemoved(evt);
            }
        });
        TextI_area.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextI_areaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TextI_areaMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TextI_areaMousePressed(evt);
            }
        });
        TextI_area.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                TextI_areaComponentHidden(evt);
            }
        });
        TextI_area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextI_areaActionPerformed(evt);
            }
        });

        jLabel7.setText("Inserisci area");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("Diagonale        :");

        TextO_diagonale.setEditable(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, TextI_diagonale, org.jdesktop.beansbinding.ELProperty.create("${text}"), TextO_diagonale, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        TextI_diagonale.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                TextI_diagonaleAncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                TextI_diagonaleAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                TextI_diagonaleAncestorRemoved(evt);
            }
        });
        TextI_diagonale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextI_diagonaleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TextI_diagonaleMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TextI_diagonaleMousePressed(evt);
            }
        });
        TextI_diagonale.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                TextI_diagonaleComponentHidden(evt);
            }
        });
        TextI_diagonale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextI_diagonaleActionPerformed(evt);
            }
        });

        jLabel9.setText("Inserisci diagonale");

        jMenu2.setText("Aiuto");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        Item_caratteristiche.setText("Caratteristiche");
        Item_caratteristiche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_caratteristicheActionPerformed(evt);
            }
        });
        jMenu2.add(Item_caratteristiche);

        Item_formule.setText("Formule");
        Item_formule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_formuleActionPerformed(evt);
            }
        });
        jMenu2.add(Item_formule);

        Item_costruzione.setText("Costruzione");
        Item_costruzione.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_costruzioneActionPerformed(evt);
            }
        });
        jMenu2.add(Item_costruzione);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(bFatto)))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextI_area, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(TextO_area, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(TextO_perimetro)
                            .addComponent(TextO_lato)
                            .addComponent(TextI_perimetro)
                            .addComponent(TextO_diagonale)
                            .addComponent(TextI_diagonale, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TextI_lato))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextI_lato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextI_perimetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextI_diagonale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TextI_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bFatto)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextO_lato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextO_perimetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextO_diagonale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextO_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextI_perimetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextI_perimetroActionPerformed
           
    }//GEN-LAST:event_TextI_perimetroActionPerformed

    //avendo il perimetro
    public void Calcola_Lato()
    {
        lato=(perimetro)/4;
    }
    
    //avendo l'area
     public void Calcola_Lato2()
    {
      
        lato=(float)sqrt(area);
    }
     
     //avendo la diagonale
     public void Calcola_Lato3()
    {
        lato=(float)(diagonale/sqrt(2));
    }
     
     
     //avendo il lato
     public void Calcola_Diagonale()
    {
        diagonale = (float) (lato * sqrt(2));
    }
    
    public void Calcola_Area()
    {
         area=lato*lato;
    }
    
    
     public void Calcola_Perimetro()
    {
        perimetro=lato*4;
    }
   
    
    
    
    private void bFattoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFattoActionPerformed
         
        
        
                       //Input : lato
                        try
                        {
    
                              //prendo il float nella text del lato
                              lato = Float.parseFloat(TextI_lato.getText());
                            //se lo trovo allora latovuoto è falso
                              latovuoto=false;
        
                        }
                        catch(NumberFormatException e)
                        {
                            //altrimenti è vero
                            latovuoto=true;
                        }
      
                       
                        
                      //Input : perimetro 
                    try
                    {
                         
                         
                         //prendo la stringa che cè nella textinputperim e la inserisco nella variabile perim trasformandola in float
                         perimetro = Float.parseFloat(TextI_perimetro.getText());
                          perimetrovuoto=false;
                         
                        

                    }
                    catch(NumberFormatException e)
                    {
                       
                        perimetrovuoto=true;
                    }
                    
                    
                    
                    //Input : Area
                    try
                    {
   
                         //prendo la stringa che cè nella textinputperim e la inserisco nella variabile perim trasformandola in float
                         area = Float.parseFloat(TextI_area.getText());
                         areavuoto=false;
      
                    }
                    catch(NumberFormatException e)
                    {
                        areavuoto=true;
                    }
                    
                    
                     //se inserisco la diagonale
                    try
                    {
               
                         //prendo la stringa che cè nella textinputperim e la inserisco nella variabile perim trasformandola in float
                         diagonale = Float.parseFloat(TextI_diagonale.getText());
                         diagonalevuoto=false;
         
                    }
                    catch(NumberFormatException e)
                    {
                        diagonalevuoto=true;
                    }
                    
                    
                    
                  
                    
 
        if(latovuoto==true&&perimetrovuoto==true&&areavuoto==true&&diagonalevuoto==true)
             JOptionPane.showMessageDialog(null, "     Input non valido! Devi inserire un numero.\nAttento a non usare la virgola al posto del punto\n                         NABBO!", "Error", JOptionPane.ERROR_MESSAGE);
        else if(latovuoto==false)
        {
                              //calcolo il perimetro avendo il lato
                             Calcola_Perimetro();
                             //calcolo l'area avendo il lato
                             Calcola_Area();
                             //calcolo la diagonale avendo il lato
                             Calcola_Diagonale();
                            

                             TextO_area.setText(String.valueOf(area));
                             TextO_perimetro.setText(String.valueOf(perimetro));
                             TextO_diagonale.setText(String.valueOf(diagonale));
        }
        else if(perimetrovuoto==false)
        {
                       //calcolo il lato
                         Calcola_Lato();
                         //per poter calcolare l'area devo prima calcolare il lato
                         Calcola_Area();
                         //calcolo la diagonale avendo il lato
                         Calcola_Diagonale();
                        
                         TextO_area.setText(String.valueOf(area));
                         TextO_lato.setText(String.valueOf(lato));
                          TextO_diagonale.setText(String.valueOf(diagonale));
        }
        else if(areavuoto==false)
        {
                         //calcolo il lato avendo l'area
                         Calcola_Lato2();
                         //per poter calcolare il perimetro devo prima calcolare il lato
                         Calcola_Perimetro();
                         //calcolo la diagonale avendo il lato
                         Calcola_Diagonale();
                         

                         TextO_perimetro.setText(String.valueOf(perimetro));
                         TextO_lato.setText(String.valueOf(lato));
                         TextO_diagonale.setText(String.valueOf(diagonale));
        }
        else if(diagonalevuoto==false)
        {
                         //calcolo il lato avendo la diagonale
                         Calcola_Lato3();
                         //per poter calcolare il perimetro devo prima calcolare il lato
                         Calcola_Perimetro();
                         //calcolo l'area avendo il lato
                         Calcola_Area();

                         TextO_perimetro.setText(String.valueOf(perimetro));
                         TextO_lato.setText(String.valueOf(lato));
                         TextO_area.setText(String.valueOf(area));
        }
        
    }//GEN-LAST:event_bFattoActionPerformed

    private void TextI_perimetroAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_TextI_perimetroAncestorAdded
     
    }//GEN-LAST:event_TextI_perimetroAncestorAdded

    private void TextI_perimetroAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_TextI_perimetroAncestorMoved
      
    }//GEN-LAST:event_TextI_perimetroAncestorMoved

    private void TextI_perimetroAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_TextI_perimetroAncestorRemoved
     
    }//GEN-LAST:event_TextI_perimetroAncestorRemoved

    private void TextI_perimetroComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_TextI_perimetroComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_TextI_perimetroComponentHidden

    private void TextI_perimetroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextI_perimetroMouseClicked
         
       
    }//GEN-LAST:event_TextI_perimetroMouseClicked

    private void TextI_perimetroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextI_perimetroMouseEntered
       
    }//GEN-LAST:event_TextI_perimetroMouseEntered

    private void TextI_perimetroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextI_perimetroMousePressed
         TextO_area.setText("");
         TextO_lato.setText("");
         TextO_diagonale.setText("");
    }//GEN-LAST:event_TextI_perimetroMousePressed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
       
          JOptionPane.showMessageDialog(null," ","Information",JOptionPane.INFORMATION_MESSAGE);
            
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void Item_formuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_formuleActionPerformed
            
            Principale.SCELTA=2;
            ImageTest i= new ImageTest();
        try {
            i.loadimage("Formule_quadrato");
        } catch (Exception ex) {
        }
        
    }//GEN-LAST:event_Item_formuleActionPerformed

    private void Item_caratteristicheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_caratteristicheActionPerformed
              
              Principale.SCELTA=1;
              ImageTest i= new ImageTest();
              
        try {
            i.loadimage("Q_caratteristiche");
        } catch (Exception ex) {
        }
  
    }//GEN-LAST:event_Item_caratteristicheActionPerformed

    private void Item_costruzioneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_costruzioneActionPerformed

        String url="https://it.wikipedia.org/wiki/Quadrato#/media/File:Straight_Square_Inscribed_in_a_Circle.gif";
        try
        {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        }
        catch(IOException ex)
        {
            Logger.getLogger(Quadrato.class.getName()).log(Level.SEVERE,null,ex);
        }
    }//GEN-LAST:event_Item_costruzioneActionPerformed

    private void TextI_latoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextI_latoMousePressed
         TextO_area.setText("");
         TextO_perimetro.setText("");
         TextO_diagonale.setText("");
    }//GEN-LAST:event_TextI_latoMousePressed

    private void TextI_areaAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_TextI_areaAncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_TextI_areaAncestorMoved

    private void TextI_areaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_TextI_areaAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_TextI_areaAncestorAdded

    private void TextI_areaAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_TextI_areaAncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_TextI_areaAncestorRemoved

    private void TextI_areaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextI_areaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TextI_areaMouseClicked

    private void TextI_areaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextI_areaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_TextI_areaMouseEntered

    private void TextI_areaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextI_areaMousePressed
         TextO_lato.setText("");
         TextO_perimetro.setText("");
         TextO_diagonale.setText("");
    }//GEN-LAST:event_TextI_areaMousePressed

    private void TextI_areaComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_TextI_areaComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_TextI_areaComponentHidden

    private void TextI_areaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextI_areaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextI_areaActionPerformed

    private void TextI_diagonaleAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_TextI_diagonaleAncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_TextI_diagonaleAncestorMoved

    private void TextI_diagonaleAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_TextI_diagonaleAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_TextI_diagonaleAncestorAdded

    private void TextI_diagonaleAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_TextI_diagonaleAncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_TextI_diagonaleAncestorRemoved

    private void TextI_diagonaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextI_diagonaleMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TextI_diagonaleMouseClicked

    private void TextI_diagonaleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextI_diagonaleMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_TextI_diagonaleMouseEntered

    private void TextI_diagonaleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextI_diagonaleMousePressed
          TextO_lato.setText("");
          TextO_perimetro.setText("");
          TextO_area.setText("");
    }//GEN-LAST:event_TextI_diagonaleMousePressed

    private void TextI_diagonaleComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_TextI_diagonaleComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_TextI_diagonaleComponentHidden

    private void TextI_diagonaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextI_diagonaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextI_diagonaleActionPerformed

    private void TextO_latoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextO_latoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextO_latoActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Item_caratteristiche;
    private javax.swing.JMenuItem Item_costruzione;
    private javax.swing.JMenuItem Item_formule;
    private javax.swing.JTextField TextI_area;
    private javax.swing.JTextField TextI_diagonale;
    private javax.swing.JTextField TextI_lato;
    private javax.swing.JTextField TextI_perimetro;
    private javax.swing.JTextField TextO_area;
    private javax.swing.JTextField TextO_diagonale;
    private javax.swing.JTextField TextO_lato;
    private javax.swing.JTextField TextO_perimetro;
    private javax.swing.JButton bFatto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

   
}
