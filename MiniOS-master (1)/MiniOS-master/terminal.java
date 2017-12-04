import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
public class terminal extends javax.swing.JInternalFrame {

    static String s;
    static String temp;
    
    public terminal() {
        initComponents();
        s="";
        temp="";
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        d = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        a = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        d.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        d.setText("Terminal_Command$");
        d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dActionPerformed(evt);
            }
        });
        d.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dKeyPressed(evt);
            }
        });

        a.setBackground(new java.awt.Color(0, 0, 0));
        a.setColumns(20);
        a.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        a.setForeground(new java.awt.Color(255, 255, 0));
        a.setRows(5);
        jScrollPane1.setViewportView(a);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                    .addComponent(d)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dKeyPressed

        String s="";
        String temp="";
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
           s=d.getText();
           d.setText("Terminal_Command$");
           temp = s.substring(s.lastIndexOf( "$" )+1);
           if(temp.equals("admin"))
           {
               a.setText(" Karthik \n SaiKrishna \n Navaneeth \n PavanSai");
           }
           else if(temp.equals("clear"))
           {
               a.setText("");
           }
           else if(temp.equals("exit"))
           {
           //     tex.textArea.setText("");  
               home tex =new home();
               tex.setVisible(true);
               dispose();  
           }
           else if(temp.equals("cd game"))
           {  
               games gam =new games();
               gam.setVisible(true);
               dispose();  
           }
           else if(temp.equals("shutdown"))
           {
               System.exit(0);
           }             
           else if(temp.contains("ls"))
           {
                File dir = new File("C:\\Users\\admin");
                File[] list = dir.listFiles();
                String buffer = "";
                for(File file :list)
                {
                    if(file.isDirectory())
                    {
                        System.out.println("Directory :"+file.getName());
                        buffer +="Directory :"+file.getName() + "\n";
                    //    a.setText("Directory :"+file.getName()+"\n");
                    }
                    else
                    {
                        System.out.println("File :"+file.getName());
                        buffer +="File :"+file.getName() + "\n";               
                    //a.setText("File :"+file.getName()+"\n");
                    }
                    a.setText(buffer);
                }   
            }
           else if(temp.contains("cd Desktop")){
                File dir = new File("C:\\Users\\admin\\Desktop");
                File[] list = dir.listFiles();
                String buffer = "";
                for(File file :list)
                {
                    if(file.isDirectory())
                    {
                        System.out.println("Directory :"+file.getName());
                        buffer +="Directory :"+file.getName() + "\n";
                    //    a.setText("Directory :"+file.getName()+"\n");
                    }
                    else
                    {
                        System.out.println("File :"+file.getName());
                        buffer +="File :"+file.getName() + "\n";               
                    //a.setText("File :"+file.getName()+"\n");
                    }
                    a.setText(buffer);
                }   
               
           }
           else if(temp.contains("cd Downloads")){
                File dir = new File("C:\\Users\\admin\\Downloads");
                File[] list = dir.listFiles();
                String buffer = "";
                for(File file :list)
                {
                    if(file.isDirectory())
                    {
                        System.out.println("Directory :"+file.getName());
                        buffer +="Directory :"+file.getName() + "\n";
                    //    a.setText("Directory :"+file.getName()+"\n");
                    }
                    else
                    {
                        System.out.println("File :"+file.getName());
                        buffer +="File :"+file.getName() + "\n";               
                    //a.setText("File :"+file.getName()+"\n");
                    }
                    a.setText(buffer);
                }   
               
           }
            else
            {
               try 
               {
                   final Process p = Runtime.getRuntime().exec(s);
                   new Thread(new Runnable()
                   {
                       public void run() 
                       {
                           BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
                           String line = "";
                           try 
                           {
                               String buffer = "";
                               while ((line = input.readLine()) != null)
                               {
                                   buffer +=input.readLine() + "\n";
                                   System.out.println("buffer value" + buffer);
                                   if(buffer.contains("null"))
                                   {
                                       System.out.println("line" + line);
                                       a.setText(line);
                                   }
                                   else
                                   {
                                       System.out.println(buffer);
                                       a.setText(buffer);
                                   }
                               }
                               d.setText("Terminal_Command$");
                            }
                            catch (IOException e)
                            {
                               e.printStackTrace();
                            }
                        }
                   }).start();
                   p.waitFor();
               } catch (IOException ex) {
                   Logger.getLogger(terminal.class.getName()).log(Level.SEVERE, null, ex);
               } catch (InterruptedException ex) {
                   Logger.getLogger(terminal.class.getName()).log(Level.SEVERE, null, ex);
               }
            }                 
        }
    }//GEN-LAST:event_dKeyPressed
    private static void createfolder(String temp1){
        String pathname;
        pathname = "C:\\Users\\admin\\Desktop\\" + temp1;
        File folder=new File(pathname);
        try{
            if(folder.exists()){
                System.out.println("folder"+folder.getName()+"exists");
            } 
            else{
                folder.mkdir();
                System.out.println("folder "+folder.getName()+" is created"); 
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
  
    private void dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // TODO add your handling code here:
        home.jComboBox1.removeItem("Terminal");
//        System.out.println("closed");
    }//GEN-LAST:event_formInternalFrameClosed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTextArea a;
    private javax.swing.JTextField d;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}