import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

public class cal extends javax.swing.JInternalFrame {
    int pc;
    JLabel jdays[]=new JLabel[100];
        
    int m[]={31,28,31,30,31,30,31,31,30,31,30,31};
    public cal() {
        initComponents();
        pc=0;
        jComboBox1.removeAllItems();
        for(int i=1950;i<=2100;i++){
            jComboBox1.addItem(Integer.toString(i));
        }
        String mon[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        jComboBox2.removeAllItems();
        for(int i=0;i<12;i++){
            jComboBox2.addItem(mon[i]);
        }
        
        
        String y="2017";
        int year=Integer.parseInt(y);
        int month=11;
        
        int noh=(year-1950)/100;
        
        int odd1=0;
        for(int i=1;i<=noh;i++)
        {
            if(i%4==0)
            {
                odd1=odd1+6;
            }
            else
            {
                odd1=odd1+5;
            }
        }
        if(odd1>=7)
        {
            odd1=odd1%7;
        }
        int odd2=0;
        int nosy=(year%100)-1;
        int lp=nosy/4;
        int or=nosy-lp;
        for(int i=0;i<lp;i++)
        {
            odd2=odd2+2;
        }
        for(int i=0;i<or;i++)
        {
            odd2=odd2+1;
        }
        if(odd2>=7)
        {
            odd2=odd2%7;
        }
        
        if(year%4==0)
        {
            m[1]=29;
        }
        int tday=0;
        for(int i=0;i<month-1;i++)
        {
            tday=tday+m[i];
        }
        tday=tday+1;
        int odd3=tday%7;
        if(odd3>=7)
        {
            odd3=odd3%7;
        }
        
        int odd=odd1+odd2+odd3;
        if(odd>=7)
        {
            odd=odd%7;
        }
        discal(odd);
    }
    public void findoddday()
    {
        String y=jComboBox1.getSelectedItem().toString();
        //String y="2017";
        int year=Integer.parseInt(y);
        int month=jComboBox2.getSelectedIndex()+1;
        //int month=11;
        
        int noh=(year-1950)/100;
        
        int odd1=0;
        for(int i=1;i<=noh;i++)
        {
            if(i%4==0)
            {
                odd1=odd1+6;
            }
            else
            {
                odd1=odd1+5;
            }
        }
        if(odd1>=7)
        {
            odd1=odd1%7;
        }
        int odd2=0;
        int nosy=(year%100)-1;
        int lp=nosy/4;
        int or=nosy-lp;
        for(int i=0;i<lp;i++)
        {
            odd2=odd2+2;
        }
        for(int i=0;i<or;i++)
        {
            odd2=odd2+1;
        }
        if(odd2>=7)
        {
            odd2=odd2%7;
        }
        
        if(year%4==0)
        {
            m[1]=29;
        }
        int tday=0;
        for(int i=0;i<month-1;i++)
        {
            tday=tday+m[i];
        }
        tday=tday+1;
        int odd3=tday%7;
        if(odd3>=7)
        {
            odd3=odd3%7;
        }
        
        int odd=odd1+odd2+odd3;
        if(odd>=7)
        {
            odd=odd%7;
        }
        discal(odd);
    }
    public void discal(int od)
    {
        for(int i=0;i<pc;i++)
        {
            this.remove(jdays[i]);
        }
        Font f1=new Font("Vijaya",Font.BOLD,15);
        String da[]={" S " , " M " , " T " , " W " , " T " , " F " , " S "};
        int x=100,y=150;
        for(int i=0;i<7;i++)
        {
            jdays[i]=new JLabel();
            jdays[i].setText(da[i]);
            jdays[i].setBounds(x, y,30,30);
            jdays[i].setFont(f1);
            jdays[i].setForeground(Color.GREEN);
            x=x+30;
            this.add(jdays[i]);
            repaint();
        }
        jdays[0].setForeground(Color.red);
        int ind=jComboBox2.getSelectedIndex();
        String year=jComboBox1.getSelectedItem().toString();
        int yr=Integer.parseInt(year);
        if(yr%4==0)
        {
            m[1]=29;
        }
        
        Font f2=new Font("Vijaya",Font.PLAIN,15);
        int X=100,Y=170;
        X=X+(30*od);
        for(int i=0;i<m[ind];i++)
        {
            jdays[i]=new JLabel();
            jdays[i].setText(Integer.toString(i+1));
            jdays[i].setBounds(X, Y,30,30);
            jdays[i].setFont(f2);
            
            if(X==100)
            {
                jdays[i].setForeground(Color.red);
            }
            else
            {
                jdays[i].setForeground(Color.BLUE);
            }
            this.add(jdays[i]);
            repaint();
            X=X+30;
            if(X>280)
            {
                X=100;
                Y=Y+30;
            }
        }
        pc=m[ind];
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();

        setClosable(true);
        setForeground(new java.awt.Color(255, 153, 255));
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
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

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox1PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox2PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(305, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
                     
    
    private void jComboBox1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox1PopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        findoddday();
    }//GEN-LAST:event_jComboBox1PopupMenuWillBecomeInvisible

    private void jComboBox2PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox2PopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        findoddday();
    }//GEN-LAST:event_jComboBox2PopupMenuWillBecomeInvisible

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // TODO add your handling code here:
        home.jComboBox1.removeItem("Calendar");
    }//GEN-LAST:event_formInternalFrameClosed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // TODO add your handling code here:
        home.jComboBox1.removeItem("Calendar");
    }//GEN-LAST:event_formInternalFrameActivated
      
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cal().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JComboBox<String> jComboBox3;
}
