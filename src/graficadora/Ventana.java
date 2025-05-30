/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package graficadora;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author minely
 */
public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));

    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton2.setText("Círculo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cuadra");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText(" Rect");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Pentágono");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Plano cartesiano");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText(" Lineal");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Borrar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("cuadrática");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton1.setText("Cúbica");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton10.setText(" e");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton12.setText("Raíz n");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("Inv Multi");
        jButton13.setPreferredSize(new java.awt.Dimension(23, 23));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton11.setText("Logaritmo");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton14.setText("seno");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("coseno");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setText("tan");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setText("Repit circu");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setText("Triángulo");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton17))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(233, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))
                            .addComponent(jButton18))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton10)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton14)
                    .addComponent(jButton15)
                    .addComponent(jButton17)
                    .addComponent(jButton16)
                    .addComponent(jButton12)
                    .addComponent(jButton11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton18)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
  
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Graphics panel=jPanel1.getGraphics();

    try {   
        
        String centro = JOptionPane.showInputDialog(this, "Ingrese los puntos x, y del centro:");
        String[] punto = centro.split(",");
        int centroX = Integer.parseInt(punto[0]);
        int centroY = Integer.parseInt(punto[1]);

        int radio = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese el radio del círculo en px):"));

        String color = JOptionPane.showInputDialog(this, "Seleccione un color rojo, azul o amarillo:").toLowerCase();
        Color colorCirculo;
        
        switch (color) {
            case "rojo":
                colorCirculo = Color.RED;
                break;
            case "azul":
                colorCirculo = Color.BLUE;
                break;
            case "amarillo":
                colorCirculo = Color.YELLOW;
                break;
            default:
                JOptionPane.showMessageDialog(this, "Color no válido. Se usará negro por defecto.");
                colorCirculo = Color.BLACK;
        }

        double area = Math.PI * Math.pow(radio, 2);
        double perimetro = 2 * Math.PI * radio;

        JOptionPane.showMessageDialog(this, "Área: " + area + "\nPerímetro: " + perimetro);

        int xDibujo = 250 + centroX - radio; 
        int yDibujo = 250 - centroY - radio;  

        panel.setColor(colorCirculo);
        panel.drawOval(xDibujo, yDibujo, radio * 2, radio * 2);
    
    }//GEN-LAST:event_jButton2ActionPerformed
    
     catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: Ingrese datos válidos.");
       }
    }
     
       
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       Graphics panel=jPanel1.getGraphics();
    panel.setColor(Color.ORANGE);
    try {
       
        String vertice = JOptionPane.showInputDialog(this, "Ingrese los puntos x,y:");

        
        String tamaño = JOptionPane.showInputDialog(this,"Seleccione el tamaño del rectángulo (grande, mediano o pequeño:):");

      
        String[] punto1 = vertice.split(",");
        int pX = Integer.parseInt(punto1[0]);
        int pY = Integer.parseInt(punto1[1]);

        
        int escala;
        if (tamaño.equalsIgnoreCase("pequeño") || tamaño.equals("1")) {
            escala = 1;
        } else if (tamaño.equalsIgnoreCase("mediano") || tamaño.equals("2")) {
            escala = 2;
        } else if (tamaño.equalsIgnoreCase("grande") || tamaño.equals("3")) {
            escala = 3;
        } else {
            JOptionPane.showMessageDialog(this, "Tamaño no válido");
            escala = 1;
        }

        
        int lado = 40 * escala;

        
        panel.drawRect(pX, pY, lado, lado);                                    
    }//GEN-LAST:event_jButton3ActionPerformed
    catch(Exception e){
      JOptionPane.showMessageDialog(this, "Ingrese información correcta");
    }
    }                                 
       
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      Graphics panel=jPanel1.getGraphics();
    panel.setColor(Color.RED);
     
try {
       
        String vertice = JOptionPane.showInputDialog(this, "Ingrese los puntos x,y:");

        
        String tamaño = JOptionPane.showInputDialog(this,"Seleccione el tamaño del rectángulo (grande, mediano o pequeño:):");

      
        String[] punto1 = vertice.split(",");
        int pX = Integer.parseInt(punto1[0]);
        int pY = Integer.parseInt(punto1[1]);

        
        int escala;
        if (tamaño.equalsIgnoreCase("pequeño") || tamaño.equals("1")) {
            escala = 1;
        } else if (tamaño.equalsIgnoreCase("mediano") || tamaño.equals("2")) {
            escala = 2;
        } else if (tamaño.equalsIgnoreCase("grande") || tamaño.equals("3")) {
            escala = 3;
        } else {
            JOptionPane.showMessageDialog(this, "Tamaño no válido");
            escala = 1;
        }

        
        int ancho = 60 * escala;
        int alto =  40 * escala;
        
        panel.drawRect(pX, pY, ancho,alto);     
    
    }//GEN-LAST:event_jButton4ActionPerformed
    catch(Exception e){
      JOptionPane.showMessageDialog(this, "Ingrese información correcta");
    }

    }                                 
       
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      Graphics panel=jPanel1.getGraphics();
    panel.setColor(Color.MAGENTA);
    
    try {
        
    String vertice = JOptionPane.showInputDialog(this, "Ingrese los puntos x, y:");
   
    String tamaño = JOptionPane.showInputDialog(this, "Seleccione el tamaño del pentágono(grande, mediano, pequeño):");
           
            String[] puntoCentral = vertice.split(",");
            int centroX = Integer.parseInt(puntoCentral[0]);
            int centroY = Integer.parseInt(puntoCentral[1]);

            int escala;
            if (tamaño.equalsIgnoreCase("pequeño") || tamaño.equals("1")) {
                escala = 1;
            } else if (tamaño.equalsIgnoreCase("mediano") || tamaño.equals("2")) {
                escala = 2;
            } else if (tamaño.equalsIgnoreCase("grande") || tamaño.equals("3")) {
                escala = 3;
            } else {
                JOptionPane.showMessageDialog(this, "Tamaño no válido.");
                escala = 1;
            }

            
            int radio = 40 * escala;

         
            int[] xCoordenadas = new int[5];
            int[] yCoordenadas = new int[5];


            for (int i = 0; i < 5; i++) {
                double angulo = (Math.PI / 2) + i * (2 * Math.PI / 5); 
                xCoordenadas[i] = (int) (centroX + radio * Math.cos(angulo));
                yCoordenadas[i] = (int) (centroY - radio * Math.sin(angulo));
            }

            panel.drawPolygon(xCoordenadas, yCoordenadas, 5);
    
     
    }//GEN-LAST:event_jButton5ActionPerformed
      catch(Exception e){
      JOptionPane.showMessageDialog(this, "Ingrese información correcta");
    }
    }    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      Graphics panel= jPanel1.getGraphics();
      panel.setColor(Color.ORANGE);
      panel.drawLine(250,0,250,500);
      panel.drawLine(0,250,500,250);
      
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
      Graphics panel= jPanel1.getGraphics();
      panel.setColor(Color.blue);
      
      String pendiente = JOptionPane.showInputDialog(this, "Ingrese m:");
      String intercepto = JOptionPane.showInputDialog(this, "Ingrese b:");
      
      int m = Integer.parseInt(pendiente);
      int b = Integer.parseInt(intercepto);
      
      for(int x = -250; x <= 250; x++){
          int y = m*x+b;
      panel.fillOval(250-3 + x , 250-3 - y, 6, 6);
      }
  
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jPanel1.repaint();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       Graphics panel= jPanel1.getGraphics();
       panel.setColor(Color.blue);
       
      String parametro_cu = JOptionPane.showInputDialog(this, "Ingrese a:");
      String parametro_li = JOptionPane.showInputDialog(this, "Ingrese b:");
      String parametro_in = JOptionPane.showInputDialog(this, "Ingrese c");
      
      int a = Integer.parseInt(parametro_cu);
      int b = Integer.parseInt(parametro_li);
      int c = Integer.parseInt(parametro_in);
      
       double escala = 0.05;
       for(int x = -250; x <= 250; x++){
          double y = a * Math.pow(x,2)+b*x+c;
          int drawX = 250 + x;
        int drawY = 250 - (int)(y * escala);
        
        if (drawX >= 0 && drawX <= 500 && drawY >= 0 && drawY <= 500) {
            panel.fillOval(drawX, drawY, 6, 6);
      }
       }
       
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      Graphics panel= jPanel1.getGraphics();
       panel.setColor(Color.blue);
       
      String coefi_a = JOptionPane.showInputDialog(this, "Ingrese x:");
      String coefi_b = JOptionPane.showInputDialog(this, "Ingrese b:");
      String coefi_c= JOptionPane.showInputDialog(this, "Ingrese c:");
      String termino_d= JOptionPane.showInputDialog(this, "Ingrese d:");
            
        int a = Integer.parseInt(coefi_a);
        int b = Integer.parseInt(coefi_b);
        int c = Integer.parseInt(coefi_c);
        int d = Integer.parseInt(termino_d);
        
       double escala = 0.02;
    for (int x = -250; x <= 250; x++) {
        double y = a * Math.pow(x, 3) + b * Math.pow(x, 2) + c * x + d;
        int drawX = 250 + x;
        int drawY = 250 - (int)(y * escala);

        if (drawY >= 0 && drawY <= 500) {
            panel.fillOval(drawX, drawY, 6, 6);
        }
    } 
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       Graphics panel= jPanel1.getGraphics();
       panel.setColor(Color.blue);
       
       for (int x= -4; x <= 4; x++){
          int y = (int) (Math.pow(Math.E, x)*25);
          panel.fillOval(250-3 + x*62, 250-3 - y, 6, 6);
       } 
       
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
              Graphics panel=jPanel1.getGraphics();
        panel.setColor(Color.BLUE);
        
    
    
    for (int i = -250; i <= 250; i++) {
        if (i == 0) continue; 

        double x = i / 62.0; 
        double y = 1.0 / x;  
        int drawX = 250 + i;
        int drawY = 250 - (int)(y * 25);
        
        if (drawY >= 0 && drawY <= 500) {
            panel.fillOval(drawX - 3, drawY - 3, 6, 6);
        }
    }                               
        
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
         Graphics panel=jPanel1.getGraphics();
        panel.setColor(Color.BLUE);
       try {
     
        String parametro_n = JOptionPane.showInputDialog(this, "Ingrese el valor de n:");
        int n = Integer.parseInt(parametro_n);

        
        int centroX = jPanel1.getWidth() / 2;
        int centroY = jPanel1.getHeight() / 2;
        
        
        panel.setColor(Color.GREEN);
        for (int x = -100; x <= 100; x++) {
            double y = Math.signum(x) * Math.pow(Math.abs(x), 1.0 / n);
            
            int xPixel = centroX + x * 3;
            int yPixel = centroY - (int) (y * 25);
            
            if (xPixel >= 0 && xPixel < jPanel1.getWidth() && yPixel >= 0 && yPixel < jPanel1.getHeight()) {
                panel.fillOval(xPixel - 2, yPixel - 2, 4, 4);
            }
        }
             
    
    }//GEN-LAST:event_jButton12ActionPerformed
     catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Ingrese información correcta.");
    }

    } 
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
            
        
    int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de n:"));

    Graphics g = jPanel1.getGraphics();
    g.setColor(Color.BLUE);

    int width = jPanel1.getWidth();
    int height = jPanel1.getHeight();
    int escala = 50;
    
    int centroY = 250;
    int centroX=250;

    g.setColor(Color.BLUE);
    for (double x = 0.1; x <= 10; x += 0.1) { 
        double y = Math.log(x) / Math.log(n); 

        int xPixel = centroX + (int) (x * escala);
        int yPixel = centroY - (int) (y * escala);

        
        g.fillOval(xPixel, yPixel, 3, 3);
    }

    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
      Graphics g = jPanel1.getGraphics();
    g.setColor(Color.BLUE);

    int escala =50;
    int centroX =250;
    int centroY=250;

    int prevXSeno = -1, prevYSeno = -1;

    for (double x = -2 * Math.PI; x <= 2 * Math.PI; x += 0.1) {
        double seno = Math.sin(x);

        
        int xPixel = centroX + (int) (x * escala);
        int yPixelSeno = centroY - (int) (seno * escala);

        
        if (prevXSeno != -1) {
            g.drawLine(prevXSeno, prevYSeno, xPixel, yPixelSeno);
        }

        prevXSeno = xPixel;
        prevYSeno = yPixelSeno;
    }


    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
     Graphics g = jPanel1.getGraphics();
g.setColor(Color.BLUE);

int escala = 50;
int centroX = 250;
int centroY = 250;

int prevXCoseno = -1, prevYCoseno = -1;

for (double x = -2 * Math.PI; x <= 2 * Math.PI; x += 0.1) {
    double coseno = Math.cos(x); // Calcular coseno
    
    int xPixel = centroX + (int) (x * escala);
    int yPixelCoseno = centroY - (int) (coseno * escala);
    
    if (prevXCoseno != -1) {
        g.drawLine(prevXCoseno, prevYCoseno, xPixel, yPixelCoseno);
    }
    
    prevXCoseno = xPixel;
    prevYCoseno = yPixelCoseno;
}                               


    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
     Graphics g = jPanel1.getGraphics();
    g.setColor(Color.BLUE);
    
    int escala = 50;  
    int centroX = jPanel1.getWidth() / 2;
    int centroY = jPanel1.getHeight() / 2;

    int prevXTangente = -1, prevYTangente = -1;

   
    for (double i = -2 * Math.PI; i <= 2 * Math.PI; i += Math.PI) {
        int xAsintota = centroX + (int) (i * escala / 2);
     
    }

    g.setColor(Color.BLUE);
    for (double x = -2 * Math.PI; x <= 2 * Math.PI; x += 0.05) {
        double tangente = Math.tan(x);
        
        if (Math.abs(tangente) > 10) { 
            prevXTangente = -1;
            continue;
        }

        int xPixel = centroX + (int) (x * escala);
        int yPixelTangente = centroY - (int) (tangente * escala);

        if (prevXTangente != -1) {
            g.drawLine(prevXTangente, prevYTangente, xPixel, yPixelTangente);
        }

        prevXTangente = xPixel;
        prevYTangente = yPixelTangente;
    }


    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
                                             
    Graphics panel = jPanel1.getGraphics();
    
    try {   
        
        String centro = JOptionPane.showInputDialog(this, "Ingrese los puntos x, y del centro:");
        String[] punto = centro.split(",");
        int centroX = Integer.parseInt(punto[0]);
        int centroY = Integer.parseInt(punto[1]);

       
        int cantidadCirculos = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese la cantidad de círculos concéntricos:"));

     
        int incrementoRadio = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese el incremento en el radio para cada círculo:"));
        String color = JOptionPane.showInputDialog(this, "Seleccione un color (rojo, azul o amarillo):").toLowerCase();
        Color colorCirculo;
        
        switch (color) {
            case "rojo":
                colorCirculo = Color.RED;
                break;
            case "azul":
                colorCirculo = Color.BLUE;
                break;
            case "amarillo":
                colorCirculo = Color.YELLOW;
                break;
            default:
                JOptionPane.showMessageDialog(this, "Color no válido. Se usará negro por defecto.");
                colorCirculo = Color.BLACK;
        }

        int xCentro = 250 + centroX; 
        int yCentro = 250 - centroY; 

        panel.setColor(colorCirculo);
        for (int i = 0; i < cantidadCirculos; i++) {
            int radio = (i + 1) * incrementoRadio;
            int xDibujo = xCentro - radio;
            int yDibujo = yCentro - radio;
            panel.drawOval(xDibujo, yDibujo, radio * 2, radio * 2);
        }

   

    }//GEN-LAST:event_jButton17ActionPerformed
      catch(Exception e){
      JOptionPane.showMessageDialog(this, "Ingrese información correcta");
    }
    }    
    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
       Graphics panel=jPanel1.getGraphics();
       int centroX = 250;
       int centroY = 250;
        
    try {
       
        String base = JOptionPane.showInputDialog(this, "Ingrese la base del triángulo:");
        String altura = JOptionPane.showInputDialog(this, "Ingrese la altura del triángulo:");
         String color = JOptionPane.showInputDialog(this, "Seleccione un color rojo, azul o amarillo:").toLowerCase();
        
         int x1 = Integer.parseInt(base);
         int x2 = Integer.parseInt(altura);
         
         Color colortriangulo;
        
        switch (color) {
            case "rojo":
                colortriangulo = Color.RED;
                break;
            case "azul":
                colortriangulo = Color.BLUE;
                break;
            case "amarillo":
                colortriangulo = Color.YELLOW;
                break;
            default:
                JOptionPane.showMessageDialog(this, "Color no válido. Se usará negro por defecto.");
                colortriangulo = Color.BLACK;
        }
         
        int[] xCoordenadas = new int[5];
            int[] yCoordenadas = new int[5];
           

            for (int i = 0; i < 5; i++) {
                
            }
        
         panel.drawLine(x2, x1, x2, x2);
         panel.drawLine(x2, x1, x2, x2);
         panel.drawLine(x2, x1, x2, x2);
        
    }//GEN-LAST:event_jButton18ActionPerformed
    catch(Exception e){
      JOptionPane.showMessageDialog(this, "Ingrese información correcta");
    }
    }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
