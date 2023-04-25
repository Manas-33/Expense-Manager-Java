
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class InputBox extends javax.swing.JFrame {

    /** Creates new form InputBox */
    public InputBox() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tf_exp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tf_spt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tf_dsc = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        cb1 = new javax.swing.JComboBox();
        lbl = new javax.swing.JLabel();
        cb2 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Input Expense");
        setLocationByPlatform(true);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 12));
        jLabel1.setText("Expense : Title of your expense");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        tf_exp.setNextFocusableComponent(tf_spt);
        getContentPane().add(tf_exp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 39, 204, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 12));
        jLabel2.setText("Spent : Amount in Rs you spent on it");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 84, -1, -1));

        tf_spt.setNextFocusableComponent(tf_dsc);
        getContentPane().add(tf_spt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 117, 204, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 12));
        jLabel3.setText("Description: Short description of your expense(max. 100 characters)");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 165, -1, -1));

        tf_dsc.setColumns(20);
        tf_dsc.setRows(5);
        tf_dsc.setNextFocusableComponent(jButton1);
        jScrollPane1.setViewportView(tf_dsc);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 194, 590, 54));

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 12));
        jButton1.setText("Submit");
        jButton1.setNextFocusableComponent(jButton2);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 35, 99, -1));

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 12));
        jButton2.setText("Cancel");
        jButton2.setNextFocusableComponent(jButton3);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 75, 99, -1));

        jButton3.setFont(new java.awt.Font("Comic Sans MS", 1, 12));
        jButton3.setText("Clear");
        jButton3.setNextFocusableComponent(tf_exp);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 113, 99, -1));

        cb1.setFont(new java.awt.Font("Comic Sans MS", 0, 12));
        cb1.setModel(new javax.swing.DefaultComboBoxModel(
                new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
                        "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28" }));
        getContentPane().add(cb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 66, -1));

        lbl.setFont(new java.awt.Font("Comic Sans MS", 0, 11));
        lbl.setText("Select the Day:- ");
        getContentPane().add(lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));

        cb2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        cb2.setMaximumRowCount(12);
        cb2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Education", "Food", "Transportation Expense",
                "Billing Expense", "Insurance", "Tax", "Loan Activity", "Medical Expenses", "Property Expense",
                "Maid/Servant Expense", "Entertainment", "Clothing", "Others..." }));
        getContentPane().add(cb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 170, -1));

        jLabel4.setText("Category :-");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 115, -1, -1));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 10, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }// GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
        tf_exp.setText("");
        tf_spt.setText("");
        tf_dsc.setText("");
    }// GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        int day = 0;
        if (globalvar.isMonthlyExpensesBeingShown.equals("Yes")) {
            day = cb1.getSelectedIndex() + 1;
            String month_sel = globalvar.frame1.tb1.getValueAt(globalvar.frame1.tb1.getSelectedRow(), 0).toString();

            if ((month_sel.equals("April") || month_sel.equals("June") || month_sel.equals("September")
                    || month_sel.equals("November")) && (day > 30) || (day < 1)) {
                JOptionPane.showMessageDialog(null, "Invalid Day!!");
                return;
            } else if (month_sel.equals("February")) {
                int year1 = Integer.parseInt(globalvar.year);
                if (((year1 % 400 == 0) || ((year1 % 4 == 0) && (year1 % 100 != 0))) && (day > 29 || day < 1)) {// Check
                                                                                                                // if
                                                                                                                // leap
                                                                                                                // year
                    JOptionPane.showMessageDialog(null, "Invalid Day!!");
                    return;
                } else if (day > 28 || day < 1) {// Means it is not a leap year
                    JOptionPane.showMessageDialog(null, "Invalid Day!!");
                }
            } else if ((month_sel.equals("January") || month_sel.equals("March") || month_sel.equals("May")
                    || month_sel.equals("July") || month_sel.equals("August") || month_sel.equals("October")
                    || month_sel.equals("December")) && (day > 31 || day < 1)) {// Month is of 31 days
                JOptionPane.showMessageDialog(null, "Invalid Day!!");
                return;
            }
        } else {
            day = Integer.parseInt(globalvar.frame2.date.getText().substring(0, 2));
        }

        try {
            if (tf_exp.getText().isEmpty() || tf_spt.getText().isEmpty() || tf_dsc.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter all the details required.");
            } else {
                Class.forName("java.sql.DriverManager");
                Connection c = (Connection) DriverManager
                        .getConnection("jdbc:mysql://localhost:3306/emp12cay" + globalvar.year, "root", "manas");
                Statement get_ExpId = (Statement) c.createStatement();
                ResultSet k = get_ExpId.executeQuery("select count(ExpID) from " + globalvar.tablename + ";");

                int i = 0;// Variable i is used to store the ExpID of the record which is going to be
                          // inserted into table in mysql
                if (k.next()) {
                    i = k.getInt("count(ExpID)") + 1;
                }
                String exp = tf_exp.getText();
                int spt = 0;

                // Check spent must be Integer
                try {
                    spt = Integer.parseInt(tf_spt.getText());

                } catch (Exception p) {
                    JOptionPane.showMessageDialog(null, "Invalid entry in field 'Spent'.");
                    return;
                }
                // end check

                String cat = cb2.getSelectedItem().toString();
                String dsc = tf_dsc.getText();

                Statement ins_record = (Statement) c.createStatement();
                ins_record.executeUpdate("insert into " + globalvar.tablename + " values(" + i + "," + day + ",'" + exp
                        + "'," + spt + ",'" + cat + "','" + dsc + "');");

                // Clear Table
                DefaultTableModel model = (DefaultTableModel) globalvar.frame2.tb2.getModel();
                while (model.getRowCount() > 0) {
                    model.removeRow(0);
                }

                // Reload table
                Statement refresh = (Statement) c.createStatement();
                String query;
                if (globalvar.isMonthlyExpensesBeingShown.equals("Yes")) {
                    query = "select * from " + globalvar.tablename + " order by day asc;";
                } else {
                    query = "select * from " + globalvar.tablename + " where day = " + day + ";";
                }
                ResultSet data = refresh.executeQuery(query);
                DefaultTableModel m = (DefaultTableModel) globalvar.frame2.tb2.getModel();
                String s1 = null, s2, s3, s4, s5, s6;
                while (data.next()) {
                    s1 = data.getString("ExpID");
                    s2 = data.getString("Expenses");
                    s3 = "Rs." + data.getString("Spent");
                    s4 = data.getString("Category");
                    // s5 = data.getString("Description");
                    if (globalvar.isMonthlyExpensesBeingShown.equals("Yes")) {
                        s6 = data.getString("Day");
                        m.addRow(new Object[] { s1, s2, s3, s4, s6 });
                    }

                }
                int q = 0;
                while (q <= globalvar.frame2.tb2.getRowCount()) {
                    if (globalvar.frame2.tb2.getModel().getValueAt(q, 0).toString().equals(s1)) {
                        break;
                    } else {
                        q++;
                    }
                }
                globalvar.frame2.tb2.setRowSelectionInterval(q, q);
                this.dispose();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        //
        int temp = 0;
        if (!globalvar.frame2.lblEarn.getText().equals("Not found")) {
            temp = Integer.parseInt(globalvar.frame2.lblEarn.getText().substring(3));
        }
        int temp1 = 0, temp2 = 0;

        if (globalvar.frame2.tb2.getRowCount() != 0) {
            while (temp1 <= globalvar.frame2.tb2.getRowCount() - 1) {
                temp2 = temp2 + Integer
                        .parseInt(globalvar.frame2.tb2.getModel().getValueAt(temp1, 2).toString().substring(3));
                temp1++;
            }
            globalvar.frame2.lblExp.setText("Rs." + temp2);
        } else {
            globalvar.frame2.lblExp.setText("Rs.0");
        }

        if (temp != 0) {
            int total = temp - temp2;
            globalvar.frame2.lblTotal.setText("Rs." + total);
        } else {
            globalvar.frame2.lblEarn.setText("Not found");
            globalvar.frame2.lblTotal.setText("-");
        }
    }// GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowOpened
        int year1 = Integer.parseInt(globalvar.year);
        String month = globalvar.tablename.substring(2);
        if (globalvar.isMonthlyExpensesBeingShown.equals("Yes")) {
            lbl.setVisible(true);
            cb1.setVisible(true);
            if (month.equals("April") || month.equals("June") || month.equals("September")
                    || month.equals("November")) {

                cb1.addItem("29");
                cb1.addItem("30");
            } else if ((year1 % 400 == 0) || ((year1 % 4 == 0) && (year1 % 100 != 0)) && (month.equals("February"))) {

                cb1.addItem("29");
            } else if (month.equals("January") || month.equals("March") || month.equals("May") || month.equals("July")
                    || month.equals("August") || month.equals("October") || month.equals("December")) {

                cb1.addItem("29");
                cb1.addItem("30");
                cb1.addItem("31");
            }
        } else {
            lbl.setVisible(false);
            cb1.setVisible(false);
        }
    }// GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InputBox().setVisible(true);
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
