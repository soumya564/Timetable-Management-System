/**
 *
 * @author Abhi Agarwal
 * Timetable Management System
 * Abhi Agarwal, 30th January 2012
 * Bangkok Patana School
 * 
 * Mac Book Pro 10.7, 2.66 GHz Intel Core i7, 4GB 1067 MHz DDR3
 * The function class to edit records
 * Integrated Development Environment Netbeans 7.0.1
 * 
 */
package timetable;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.JOptionPane;

public class Homework_database_edit extends javax.swing.JFrame {
    private static final long serialVersionUID = 1L;
    


    
    public static void edit(int ID ,String subject, String desc, String difficulty, int time, int delete1)
    {
        
        int raflength;
   
         try {

RandomAccessFile raf = new RandomAccessFile(login_area.setURL.getUrl(), "rw");
    
    
// code for adding in spaces
   
char[] subjectarray = new char[20]; //creates a new char array that has the indexies of the length of the word
char[] descarray = new char[500];
char[] difficultyarray = new char[6];

// all the subject stuff
for(int a = 0; a < subjectarray.length; a++){
subjectarray[a] = ' ';
}
for(int i = 0; i < subject.length(); i++){
if(i >= 19) 
{
    break;
}
subjectarray[i] = subject.charAt(i);
} 

for(int e=0; e>=19; e++)
{
    System.out.print(subjectarray[e]);
}

// all the desc stuff
for(int a = 0; a < descarray.length; a++){
descarray[a] = ' ';
}
for(int i = 0; i < desc.length(); i++){
if(i >= 499) 
{
    break;
}
descarray[i] = desc.charAt(i);
} 

for(int e=0; e>=499; e++)
{
    System.out.print(descarray[e]);
}


// all the difficulty stuff


for(int a = 0; a < difficultyarray.length; a++){
difficultyarray[a] = ' ';
}
for(int i = 0; i < difficulty.length(); i++){
if(i >= 6) 
{
    break;
}
difficultyarray[i] = difficulty.charAt(i);
} 

for(int e=0; e>=499; e++)
{
    System.out.print(difficultyarray[e]);
}

// start of writing code

String subject1 = new String(subjectarray);
String desc1 = new String(descarray);
String diff1 = new String(difficultyarray);


raflength =   (((int) raf.length())/538);

int length1 = (int)((((raf.length())/538))+ 1);

raf.skipBytes((Homework_database_edit_1.getn())*538);
// starts writing
                raf.writeInt(ID);
                raf.writeUTF(subject1);
                raf.writeUTF(desc1);
                raf.writeUTF(diff1);
                raf.writeByte(time);
                raf.writeByte(delete1);
                
                 JOptionPane.showMessageDialog(null,"Homework Edited!", "Timetable Management Program", JOptionPane.INFORMATION_MESSAGE);
                 login_area.open1 = 0;
                 
               
    
} catch (FileNotFoundException e) {
        e.printStackTrace();
} catch (IOException e) {
        e.printStackTrace();
}
         
    }
    
    public void pressbutton() {
 Timetable_main_RWRAF.read(Homework_database_edit_1.getn());
    
int ID = (Timetable_main_RWRAF.getID());
String subject = (String)Subject.getSelectedItem();
String desc = DescField.getText();
String difficulty = (String)DiffField.getSelectedItem();
int time = Integer.parseInt((String)Timef1.getSelectedItem());

if(desc.length() < 501)
{

int delete = Timetable_main_RWRAF.checkDelete();

edit(ID, subject, desc, difficulty, time, delete);

this.setVisible(false);       
}
else
{
  JOptionPane.showMessageDialog(null,"Your description is too big, please cut it to 500 words.", "Timetable Management Program", JOptionPane.INFORMATION_MESSAGE);
}
        
}
    /** Creates new form Homework_database_edit */
    public Homework_database_edit() {
        initComponents();
        
Timetable_main_RWRAF.read(Homework_database_edit_1.getn());
            
jTextField6.setText(Timetable_main_RWRAF.getSubject());
           
jTextArea1.setText(Timetable_main_RWRAF.getDesc());
           
jTextField7.setText(Timetable_main_RWRAF.getDiff());

jTextField3.setText(Integer.toString(Timetable_main_RWRAF.getTime()));

this.setDefaultCloseOperation(0);
        jPanel1.setBackground(login_area.FINAL_BG_COLOR);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        DescField = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        Subject = new javax.swing.JComboBox();
        DiffField = new javax.swing.JComboBox();
        Timef1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(846, 50, 0, 0));

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/timetable/header.png"))); // NOI18N
        jLabel3.setMinimumSize(new java.awt.Dimension(490, 235));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 450, 50));

        jButton1.setText("EDIT");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, 170, -1));

        jLabel7.setText("Return");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 510, -1, -1));

        jLabel8.setText("Difficulty: \u0000");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, -1, -1));

        jLabel9.setText("Previous Information");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        jTextField3.setEditable(false);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 230, -1));

        jLabel10.setText("Description of homework: ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel11.setText("Task Time: \u0000");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, -1, 20));

        jTextArea1.setColumns(30);
        jTextArea1.setEditable(false);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(6);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 230, 170));

        jTextField6.setEditable(false);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 230, -1));

        jTextField7.setEditable(false);
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 230, -1));

        jLabel12.setText("Subject:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        jLabel13.setText("Difficulty: \u0000");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, -1, -1));

        jLabel14.setText("New Information");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 110, 20));

        jLabel15.setText("Description of homework: ");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, -1, -1));

        jLabel16.setText("Task Time: \u0000");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, -1, 20));

        DescField.setColumns(30);
        DescField.setLineWrap(true);
        DescField.setRows(5);
        jScrollPane2.setViewportView(DescField);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 210, 170));

        jLabel17.setText("Subject:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, -1, -1));

        Subject.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Computer Science", "Physics", "Mathematics", "English", "French", "Further Mathematics", "Economics" }));
        jPanel1.add(Subject, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 210, -1));

        DiffField.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Easy", "Medium", "Hard" }));
        jPanel1.add(DiffField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 210, -1));

        Timef1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "15", "30", "45", "60", "75", "90", "105", "120", "135", "150", "165", "180" }));
        jPanel1.add(Timef1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 210, -1));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
    this.setVisible(false);// TODO add your handling code here:
}//GEN-LAST:event_jLabel7MouseClicked

private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTextField3ActionPerformed

private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTextField6ActionPerformed

private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTextField7ActionPerformed

private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
// System.out.print(Homework_database_edit_1.getn());
  //  System.out.print(Timetable_main_RWRAF.getLength());

 //   JOptionPane.showMessageDialog(null,"The last record cannot be edited!", "Timetable Management Program", JOptionPane.INFORMATION_MESSAGE);

    
    pressbutton();
    
    

}//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(Homework_database_edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homework_database_edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homework_database_edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homework_database_edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Homework_database_edit().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea DescField;
    private javax.swing.JComboBox DiffField;
    private javax.swing.JComboBox Subject;
    private javax.swing.JComboBox Timef1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
