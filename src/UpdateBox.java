
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * UpdateBox.java
 *
 * Created on Jan 2, 2016, 3:46:36 PM
 */

/**
 *
 * @author Nilkanth
 */
public class UpdateBox extends javax.swing.JFrame {

    /** Creates new form UpdateBox */
    public UpdateBox() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        tf_spt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_exp = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tf_dsc = new javax.swing.JTextArea();
        lbl = new javax.swing.JLabel();
        cb1 = new javax.swing.JComboBox();
        cb2 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit Expense");
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 12));
        jLabel3.setText("Description: Short description of your expense(max. 100 characters)");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 165, -1, -1));
        getContentPane().add(tf_spt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 117, 204, -1));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 12));
        jLabel1.setText("Expense : Just the title of your expense");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 12));
        jLabel2.setText("Spent : Amount in Rs you spent on it");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 84, -1, -1));
        getContentPane().add(tf_exp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 39, 204, -1));

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 12));
        jButton1.setText("Update");
        jButton1.setPreferredSize(new java.awt.Dimension(71, 27));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 35, 99, -1));

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 12));
        jButton2.setText("Cancel");
        jButton2.setPreferredSize(new java.awt.Dimension(71, 27));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 75, 99, -1));

        jButton3.setFont(new java.awt.Font("Comic Sans MS", 1, 12));
        jButton3.setText("Clear");
        jButton3.setPreferredSize(new java.awt.Dimension(71, 27));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 113, 99, -1));

        tf_dsc.setColumns(20);
        tf_dsc.setRows(5);
        jScrollPane1.setViewportView(tf_dsc);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 194, 590, 54));

        lbl.setFont(new java.awt.Font("Comic Sans MS", 0, 11));
        lbl.setText("Select the Day:-");
        getContentPane().add(lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));

        cb1.setFont(new java.awt.Font("Comic Sans MS", 0, 12));
        cb1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28" }));
        getContentPane().add(cb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 66, -1));

        cb2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        cb2.setMaximumRowCount(12);
        cb2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Education", "Food", "Transportation Expense", "Billing Expense", "Insurance", "Tax", "Loan Activity", "Medical Expenses", "Property Expense", "Maid/Servant Expense", "Entertainment", "Clothing", "Others..." }));
        getContentPane().add(cb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 170, -1));

        jLabel4.setText("Category :-");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 115, -1, -1));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 10, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    int day=0;
    if(globalvar.isMonthlyExpensesBeingShown.equals("Yes")){
        day = cb1.getSelectedIndex()+1;
        String month_sel = globalvar.frame1.tb1.getValueAt(globalvar.frame1.tb1.getSelectedRow(),0).toString();

        }
    else{
    day = Integer.parseInt(globalvar.frame2.date.getText().substring(0,2));
    }
    try{
        if(tf_exp.getText().isEmpty()||tf_spt.getText().isEmpty()||tf_dsc.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter all the details required!");
        }
        else{
            Class.forName("java.sql.DriverManager");
            Connection c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/emp12cay" + globalvar.year,"root","manas");
            String i = globalvar.frame2.tb2.getModel().getValueAt(globalvar.frame2.tb2.getSelectedRow(), 0).toString();
            String exp = tf_exp.getText();
            int spt = Integer.parseInt(tf_spt.getText());
            String dsc = tf_dsc.getText();
            String cat = cb2.getSelectedItem().toString();
            
            Statement ins_record = (Statement)c.createStatement();
            ins_record.executeUpdate("update " + globalvar.tablename +" set Day = "+day+", Expenses = '" + exp + "', spent = " + spt + ", Category ='" + cat + "', Description = '" + dsc + "' where ExpID = " + i + ";");

            //Clear Table
            DefaultTableModel model = (DefaultTableModel)globalvar.frame2.tb2.getModel();
            while(model.getRowCount()>0){
                model.removeRow(0);
            }

            //Reload table
            Statement refresh = (Statement)c.createStatement();
            String query = null;
            if(globalvar.isMonthlyExpensesBeingShown.equals("Yes")){
            query = "select * from " + globalvar.tablename + " order by day asc;";
            }
            else{
            query = "select * from " + globalvar.tablename + " where day = " + day + ";";
            }
            ResultSet data = refresh.executeQuery(query);
            DefaultTableModel m = (DefaultTableModel) globalvar.frame2.tb2.getModel();
            while(data.next()){
                String s1 = data.getString("ExpID");
                String s2 = data.getString("Expenses");
                String s3 = "Rs." + data.getString("Spent");
                String s4 = data.getString("Category");
                String s5 = data.getString("Description");
                if(globalvar.isMonthlyExpensesBeingShown.equals("Yes")){
                String s6 = data.getString("Day");
                m.addRow(new Object[]{s1,s2,s3,s4,s5,s6});
                }
                else{
                m.addRow(new Object[]{s1,s2,s3,s4,s5});
                }
                
            }
            int q = globalvar.frame2.tb2.getRowCount()-1;
            globalvar.frame2.tb2.setRowSelectionInterval(q, q);
            this.dispose();
            }
        }
    catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }

    //
                int temp = 0;
                if(!globalvar.frame2.lblEarn.getText().equals("Not found")){
                temp = Integer.parseInt(globalvar.frame2.lblEarn.getText().substring(3));
                }
                int temp1=0,temp2=0;

                if(globalvar.frame2.tb2.getRowCount()!=0){
                        while(temp1<=globalvar.frame2.tb2.getRowCount()-1){
                            temp2 = temp2 + Integer.parseInt(globalvar.frame2.tb2.getModel().getValueAt(temp1,2).toString().substring(3));
                            temp1++;
                        }
                        globalvar.frame2.lblExp.setText("Rs." + temp2);
                    }
                else{
                    globalvar.frame2.lblExp.setText("Rs.0");
                }

                if(temp!=0){
                        int total = temp - temp2;
                        globalvar.frame2.lblTotal.setText("Rs." + total);
                }
                else{
                    globalvar.frame2.lblEarn.setText("Not found");
                    globalvar.frame2.lblTotal.setText("-");
                }
}//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
}//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        tf_exp.setText("");
        tf_spt.setText("");
        tf_dsc.setText("");
}//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    int sel_Row = globalvar.frame2.tb2.getSelectedRow();
    tf_exp.setText(globalvar.frame2.tb2.getModel().getValueAt(sel_Row,1).toString());
    tf_spt .setText(globalvar.frame2.tb2.getModel().getValueAt(sel_Row,2).toString().substring(3));
    cb2.setSelectedItem(globalvar.frame2.tb2.getModel().getValueAt(sel_Row,3).toString());
    tf_dsc.setText(globalvar.frame2.tb2.getModel().getValueAt(sel_Row,4).toString());

    //Add items to combo box
    int year1 = Integer.parseInt(globalvar.year);
    String month = globalvar.tablename.substring(2);
    if(globalvar.isMonthlyExpensesBeingShown.equals("Yes")){
        lbl.setVisible(true);
        cb1.setVisible(true);
        if(month.equals("April")||month.equals("June")||month.equals("September")||month.equals("November")){

            cb1.addItem("29");
            cb1.addItem("30");
        }
        else if((year1%400==0)||((year1%4==0)&&(year1%100!=0))&&(month.equals("February"))){

            cb1.addItem("29");
        }
        else if(month.equals("January")||month.equals("March")||month.equals("May")||month.equals("July")||month.equals("August")||month.equals("October")||month.equals("December")){

            cb1.addItem("29");
            cb1.addItem("30");
            cb1.addItem("31");
        }
        cb1.setSelectedItem(globalvar.frame2.tb2.getModel().getValueAt(globalvar.frame2.tb2.getSelectedRow(), 4));
        }
    else{
        lbl.setVisible(false);
        cb1.setVisible(false);
    }
    }//GEN-LAST:event_formWindowOpened

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateBox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox cb1;
    private javax.swing.JComboBox cb2;
    public javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl;
    private javax.swing.JTextArea tf_dsc;
    private javax.swing.JTextField tf_exp;
    private javax.swing.JTextField tf_spt;
    // End of variables declaration//GEN-END:variables

}
