/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author podkolzinsergey
 */

public class NewJFrame extends javax.swing.JFrame {
int memory;
double root;
double cifra;
double arif;
char znak = '0';
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setAutoscrolls(true);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("1");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 220, 45, 35));

        jButton2.setText("2");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton2MouseReleased(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 220, 45, 35));

        jButton3.setText("3");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton3MouseReleased(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 220, 45, 35));

        jButton4.setText("4");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton4MouseReleased(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 180, 45, 35));

        jButton5.setText("5");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton5MouseReleased(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 180, 45, 35));

        jButton6.setText("6");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton6MouseReleased(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 180, 45, 35));

        jButton7.setText("7");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton7MouseReleased(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 140, 45, 35));

        jButton8.setText("8");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton8MouseReleased(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 140, 45, 35));

        jButton9.setText("9");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton9MouseReleased(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 140, 45, 35));

        jButton10.setText("0");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton10MouseReleased(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 260, 95, 35));

        jButton11.setText(",");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton11MouseReleased(evt);
            }
        });
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 260, 45, 35));

        jButton12.setText("+");
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton12MouseReleased(evt);
            }
        });
        jPanel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 260, 45, 35));

        jButton13.setText("-");
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton13MouseReleased(evt);
            }
        });
        jPanel1.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 220, 45, 35));

        jButton14.setText("*");
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton14MouseReleased(evt);
            }
        });
        jPanel1.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 180, 45, 35));

        jButton15.setText("/");
        jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton15MouseReleased(evt);
            }
        });
        jPanel1.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 140, 45, 35));

        jButton16.setText("±");
        jButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton16MouseReleased(evt);
            }
        });
        jPanel1.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 100, 45, 35));

        jButton17.setText("C");
        jButton17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton17MouseReleased(evt);
            }
        });
        jPanel1.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 100, 45, 35));

        jButton18.setText("CE");
        jButton18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton18MouseReleased(evt);
            }
        });
        jPanel1.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 100, 45, 35));

        jButton19.setText("<-");
        jButton19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton19MouseReleased(evt);
            }
        });
        jPanel1.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 100, 45, 35));

        jButton20.setText("=");
        jButton20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton20MouseReleased(evt);
            }
        });
        jPanel1.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 220, 45, 75));

        jButton21.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jButton21.setText("1/x");
        jButton21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton21MouseReleased(evt);
            }
        });
        jPanel1.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 180, 45, 35));

        jButton22.setText("%");
        jButton22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton22MouseReleased(evt);
            }
        });
        jPanel1.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 140, 45, 35));

        jButton23.setText("V");
        jButton23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton23MouseReleased(evt);
            }
        });
        jPanel1.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 100, 45, 35));

        jButton24.setText("M-");
        jButton24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton24MouseReleased(evt);
            }
        });
        jPanel1.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 60, 45, 35));

        jButton25.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jButton25.setText("M+");
        jButton25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton25MouseReleased(evt);
            }
        });
        jPanel1.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 60, 45, 35));

        jButton26.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jButton26.setText("MS");
        jButton26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton26MouseReleased(evt);
            }
        });
        jPanel1.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 60, 45, 35));

        jButton27.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jButton27.setText("MR");
        jButton27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton27MouseReleased(evt);
            }
        });
        jPanel1.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 60, 45, 35));

        jButton28.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jButton28.setText("MC");
        jButton28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton28MouseReleased(evt);
            }
        });
        jPanel1.add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 60, 45, 35));

        jTextField1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.setText("0");
        jTextField1.setKeymap(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 245, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        jTextField1.setText("0");
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
    
    switch(jTextField1.getText().charAt(jTextField1.getText().length()-1)){
        case '+':
        case '-':
        case '*':
        case '/':
       jTextField1.setText("");
       break;
    }
     
        if(jTextField1.getText().equals("0")){
    jTextField1.setText("");
    }
    jTextField1.setText(jTextField1.getText()+"1");
    
    }//GEN-LAST:event_jButton1MouseReleased

    private void jButton2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseReleased
    switch(jTextField1.getText().charAt(jTextField1.getText().length()-1)){
        case '+':
        case '-':
        case '*':
        case '/':
       jTextField1.setText("");
       break;
    }
        if(jTextField1.getText().equals("0")){
    jTextField1.setText("");
    }
        jTextField1.setText(jTextField1.getText()+"2");
      
    }//GEN-LAST:event_jButton2MouseReleased

    private void jButton3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseReleased
    switch(jTextField1.getText().charAt(jTextField1.getText().length()-1)){
        case '+':
        case '-':
        case '*':
        case '/':
       jTextField1.setText("");
       break;
    }
        if(jTextField1.getText().equals("0")){
    jTextField1.setText("");
    }
        jTextField1.setText(jTextField1.getText()+"3");     
     
    }//GEN-LAST:event_jButton3MouseReleased

    private void jButton4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseReleased
    switch(jTextField1.getText().charAt(jTextField1.getText().length()-1)){
        case '+':
        case '-':
        case '*':
        case '/':
       jTextField1.setText("");
       break;
    }
        if(jTextField1.getText().equals("0")){
    jTextField1.setText("");
    }
        jTextField1.setText(jTextField1.getText()+"4");
    }//GEN-LAST:event_jButton4MouseReleased

    private void jButton5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseReleased
    switch(jTextField1.getText().charAt(jTextField1.getText().length()-1)){
        case '+':
        case '-':
        case '*':
        case '/':
       jTextField1.setText("");
       break;
    }
        if(jTextField1.getText().equals("0")){
    jTextField1.setText("");
    }
        jTextField1.setText(jTextField1.getText()+"5");
    }//GEN-LAST:event_jButton5MouseReleased

    private void jButton6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseReleased
    switch(jTextField1.getText().charAt(jTextField1.getText().length()-1)){
        case '+':
        case '-':
        case '*':
        case '/':
       jTextField1.setText("");
       break;
    }
        if(jTextField1.getText().equals("0")){
    jTextField1.setText("");
    }
        jTextField1.setText(jTextField1.getText()+"6");
    }//GEN-LAST:event_jButton6MouseReleased

    private void jButton7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseReleased
    switch(jTextField1.getText().charAt(jTextField1.getText().length()-1)){
        case '+':
        case '-':
        case '*':
        case '/':
       jTextField1.setText("");
       break;
    }
        if(jTextField1.getText().equals("0")){
    jTextField1.setText("");
    }
        jTextField1.setText(jTextField1.getText()+"7");
    }//GEN-LAST:event_jButton7MouseReleased

    private void jButton8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseReleased
    switch(jTextField1.getText().charAt(jTextField1.getText().length()-1)){
        case '+':
        case '-':
        case '*':
        case '/':
       jTextField1.setText("");
       break;
    }
    if(jTextField1.getText().equals("0")){
    jTextField1.setText("");
    }
        jTextField1.setText(jTextField1.getText()+"8");
    }//GEN-LAST:event_jButton8MouseReleased

    private void jButton9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseReleased
    switch(jTextField1.getText().charAt(jTextField1.getText().length()-1)){
        case '+':
        case '-':
        case '*':
        case '/':
       jTextField1.setText("");
       break;
    }
        if(jTextField1.getText().equals("0")){
    jTextField1.setText("");
    }
        jTextField1.setText(jTextField1.getText()+"9");
    }//GEN-LAST:event_jButton9MouseReleased
//Кнопка 0
    private void jButton10MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseReleased
     
     switch(jTextField1.getText().charAt(jTextField1.getText().length()-1)){
        case '+':
        case '-':
        case '*':
        case '/':
       jTextField1.setText("");
       break;
    }
        if(!jTextField1.getText().equals("0")){     
         jTextField1.setText(jTextField1.getText()+"0");  
        }
     
 

    }//GEN-LAST:event_jButton10MouseReleased

    private void jButton17MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton17MouseReleased
    jTextField1.setText("0");
    znak='0';
    }//GEN-LAST:event_jButton17MouseReleased

    private void jButton18MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton18MouseReleased
     jTextField1.setText("0");
     znak='0';
    }//GEN-LAST:event_jButton18MouseReleased

    private void jButton19MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton19MouseReleased
        jTextField1.setText(jTextField1.getText().substring(0,jTextField1.getText().length()-1));
        if(jTextField1.getText().length()==0){
        jTextField1.setText("0");
    }    
    }//GEN-LAST:event_jButton19MouseReleased

    private void jButton16MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MouseReleased
    if(jTextField1.getText().length()==0){
        jTextField1.setText("0");
    }
    if(jTextField1.getText().charAt(0)=='-'){
     jTextField1.setText(jTextField1.getText().substring(1,jTextField1.getText().length()));   
    }
    else  jTextField1.setText("-"+jTextField1.getText());
    }//GEN-LAST:event_jButton16MouseReleased

    private void jButton11MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseReleased
       if(!jTextField1.getText().contains(".")){
        jTextField1.setText(jTextField1.getText()+".");   
       }
    }//GEN-LAST:event_jButton11MouseReleased

    private void jButton26MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton26MouseReleased
    memory=Integer.parseInt(jTextField1.getText());

    }//GEN-LAST:event_jButton26MouseReleased

    private void jButton27MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton27MouseReleased
    jTextField1.setText(String.valueOf(memory));
    }//GEN-LAST:event_jButton27MouseReleased

    private void jButton28MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton28MouseReleased
       memory=0;
      jTextField1.setText("0");  
    }//GEN-LAST:event_jButton28MouseReleased

    private void jButton25MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton25MouseReleased
        memory=memory+Integer.parseInt(jTextField1.getText());
    }//GEN-LAST:event_jButton25MouseReleased

    private void jButton24MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton24MouseReleased
    memory=memory-Integer.parseInt(jTextField1.getText());
    }//GEN-LAST:event_jButton24MouseReleased

    private void jButton23MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton23MouseReleased
    if(jTextField1.getText().equals("0")){
    jTextField1.setText("");
    }
    root=Math.sqrt(Double.parseDouble(jTextField1.getText()));
    if(Double.parseDouble(jTextField1.getText()) % root==0){ 
    jTextField1.setText(String.valueOf(root).substring(0,String.valueOf(root).length()-2)); 
    } 
    else { 
    jTextField1.setText(String.valueOf(root).substring(0,10)); 
    }
    }//GEN-LAST:event_jButton23MouseReleased

    private void jButton21MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton21MouseReleased
    if(jTextField1.getText().equals("0")){
    jTextField1.setText("");
    }
    cifra=1/Double.parseDouble(jTextField1.getText());
    cifra=Math.round(cifra * 100000000.00000) / 100000000.00000;
    if(cifra == (long) cifra){
         jTextField1.setText(String.format("%d",(long) cifra));
        }
        else{
        jTextField1.setText(String.format("%s", cifra));

        }
    

    }//GEN-LAST:event_jButton21MouseReleased

    private void jButton12MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseReleased
if ((jTextField1.getText().charAt(jTextField1.getText().length()-1)=='+')||(jTextField1.getText().charAt(jTextField1.getText().length()-1)=='-')||(jTextField1.getText().charAt(jTextField1.getText().length()-1)=='*')||(jTextField1.getText().charAt(jTextField1.getText().length()-1)=='/')){ 
jTextField1.setText(jTextField1.getText().substring(0,jTextField1.getText().length()-1)); 
} 
if(znak!=0){
    jButton20MouseReleased(null);
/*
    arif=arif+Double.parseDouble(jTextField1.getText());
        if(arif == (long) arif){
         jTextField1.setText(String.format("%d",(long) arif));
        }
        else{
        jTextField1.setText(String.format("%s", arif));
        }  
*/        
}
arif=Double.parseDouble(jTextField1.getText()); 
znak='+'; 
jTextField1.setText(jTextField1.getText()+"+");


    
    }//GEN-LAST:event_jButton12MouseReleased

    private void jButton20MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton20MouseReleased
        switch(znak){
            case '+':
        arif=arif+Double.parseDouble(jTextField1.getText());
        if(arif == (long) arif){
         jTextField1.setText(String.format("%d",(long) arif));
        }
        else{
        jTextField1.setText(String.format("%s", arif));
        }
         break;
        case '-':
        arif=arif-Double.parseDouble(jTextField1.getText());
        if(arif == (long) arif){
         jTextField1.setText(String.format("%d",(long) arif));
        }
        else{
        jTextField1.setText(String.format("%s", arif));
        }
         break;
        case '*':
        arif=arif*Double.parseDouble(jTextField1.getText());
        if(arif == (long) arif){
         jTextField1.setText(String.format("%d",(long) arif));
        }
        else{
        jTextField1.setText(String.format("%s", arif));
        }
         break;
        case '/':
        arif=arif/Double.parseDouble(jTextField1.getText());
        if(arif == (long) arif){
         jTextField1.setText(String.format("%d",(long) arif));
        }
        else{
        jTextField1.setText(String.format("%s", arif));
        }
         break;
        }
        znak='0';
       
    }//GEN-LAST:event_jButton20MouseReleased

    private void jButton13MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseReleased
    if ((jTextField1.getText().charAt(jTextField1.getText().length()-1)=='+')||(jTextField1.getText().charAt(jTextField1.getText().length()-1)=='-')||(jTextField1.getText().charAt(jTextField1.getText().length()-1)=='*')||(jTextField1.getText().charAt(jTextField1.getText().length()-1)=='/')){ 
jTextField1.setText(jTextField1.getText().substring(0,jTextField1.getText().length()-1)); 
} 
 if(znak!=0){
    jButton20MouseReleased(null);
}
arif=Double.parseDouble(jTextField1.getText()); 
znak='-'; 
jTextField1.setText(jTextField1.getText()+"-");
    
       
    }//GEN-LAST:event_jButton13MouseReleased

    private void jButton14MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseReleased
    if ((jTextField1.getText().charAt(jTextField1.getText().length()-1)=='+')||(jTextField1.getText().charAt(jTextField1.getText().length()-1)=='-')||(jTextField1.getText().charAt(jTextField1.getText().length()-1)=='*')||(jTextField1.getText().charAt(jTextField1.getText().length()-1)=='/')){ 
jTextField1.setText(jTextField1.getText().substring(0,jTextField1.getText().length()-1)); 
}
    if(znak!=0){
    jButton20MouseReleased(null);
}
arif=Double.parseDouble(jTextField1.getText()); 
znak='*'; 
jTextField1.setText(jTextField1.getText()+"*");  
    }//GEN-LAST:event_jButton14MouseReleased

    private void jButton15MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MouseReleased
    if ((jTextField1.getText().charAt(jTextField1.getText().length()-1)=='+')||(jTextField1.getText().charAt(jTextField1.getText().length()-1)=='-')||(jTextField1.getText().charAt(jTextField1.getText().length()-1)=='*')||(jTextField1.getText().charAt(jTextField1.getText().length()-1)=='/')){ 
jTextField1.setText(jTextField1.getText().substring(0,jTextField1.getText().length()-1)); 
}
   if(znak!=0){
    jButton20MouseReleased(null);
}
arif=Double.parseDouble(jTextField1.getText()); 
znak='/'; 
jTextField1.setText(jTextField1.getText()+"/");
    }//GEN-LAST:event_jButton15MouseReleased

    private void jButton22MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton22MouseReleased
        arif=arif*Double.parseDouble(jTextField1.getText())/100;
        arif=Math.round(arif * 100000000.00000) / 100000000.00000;
        
         if(arif == (long) arif){
         jTextField1.setText(String.format("%d",(long) arif));
        }
        else{
        jTextField1.setText(String.format("%s", arif));
        }
        
    }//GEN-LAST:event_jButton22MouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton10;
    public javax.swing.JButton jButton11;
    public javax.swing.JButton jButton12;
    public javax.swing.JButton jButton13;
    public javax.swing.JButton jButton14;
    public javax.swing.JButton jButton15;
    public javax.swing.JButton jButton16;
    public javax.swing.JButton jButton17;
    public javax.swing.JButton jButton18;
    public javax.swing.JButton jButton19;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton20;
    public javax.swing.JButton jButton21;
    public javax.swing.JButton jButton22;
    public javax.swing.JButton jButton23;
    public javax.swing.JButton jButton24;
    public javax.swing.JButton jButton25;
    public javax.swing.JButton jButton26;
    public javax.swing.JButton jButton27;
    public javax.swing.JButton jButton28;
    public javax.swing.JButton jButton3;
    public javax.swing.JButton jButton4;
    public javax.swing.JButton jButton5;
    public javax.swing.JButton jButton6;
    public javax.swing.JButton jButton7;
    public javax.swing.JButton jButton8;
    public javax.swing.JButton jButton9;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
