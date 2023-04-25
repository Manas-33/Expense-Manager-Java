import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class EM_Main extends javax.swing.JFrame {

    public EM_Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        tp1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        mg_earn = new javax.swing.JLabel();
        monthlyExp = new javax.swing.JLabel();
        lblReport = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE));
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Expense Manager");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icons/expmgr.png")));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }

            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setText("Expense Manager");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setText("Today's Date:");

        dt.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        dt.setText("LOADING...");

        tb1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        tb1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "Months"
                }) {
            boolean[] canEdit = new boolean[] {
                    false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tb1.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        tb1.setGridColor(new java.awt.Color(0, 255, 255));
        tb1.setIntercellSpacing(new java.awt.Dimension(1, 4));
        tb1.setRowHeight(30);
        tb1.setSelectionBackground(new java.awt.Color(153, 153, 255));
        tb1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        tb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tb1MouseReleased(evt);
            }
        });
        tb1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tb1FocusGained(evt);
            }
        });
        tb1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tb1KeyReleased(evt);
            }

            public void keyTyped(java.awt.event.KeyEvent evt) {
                tb1KeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(tb1);
        if (tb1.getColumnModel().getColumnCount() > 0) {
            tb1.getColumnModel().getColumn(0).setResizable(false);
        }

        jSeparator1.setBackground(new java.awt.Color(0, 0, 255));

        tp1.setBackground(new java.awt.Color(204, 204, 255));
        tp1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        tp1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        mg_earn.setBackground(new java.awt.Color(0, 255, 255));
        mg_earn.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        mg_earn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mg_earn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/money.png"))); // NOI18N
        mg_earn.setText("<html>Manage<br>Earnings");
        mg_earn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED,
                java.awt.Color.gray, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        mg_earn.setOpaque(true);
        mg_earn.setPreferredSize(new java.awt.Dimension(101, 44));
        mg_earn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mg_earnMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                mg_earnMouseExited(evt);
            }

            public void mouseReleased(java.awt.event.MouseEvent evt) {
                mg_earnMouseReleased(evt);
            }
        });

        monthlyExp.setBackground(new java.awt.Color(0, 255, 255));
        monthlyExp.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        monthlyExp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        monthlyExp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/monthly.png"))); // NOI18N
        monthlyExp.setText("<html>Monthly<br>Expenses</html>");
        monthlyExp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED,
                java.awt.Color.gray, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        monthlyExp.setOpaque(true);
        monthlyExp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                monthlyExpMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                monthlyExpMouseExited(evt);
            }

            public void mouseReleased(java.awt.event.MouseEvent evt) {
                monthlyExpMouseReleased(evt);
            }
        });

        lblReport.setBackground(new java.awt.Color(0, 255, 255));
        lblReport.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblReport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rport.png"))); // NOI18N
        lblReport.setText("<html>Generate<br>Report</html>");
        lblReport.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED,
                java.awt.Color.gray, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        lblReport.setOpaque(true);
        lblReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblReportMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblReportMouseExited(evt);
            }

            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblReportMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(mg_earn, javax.swing.GroupLayout.PREFERRED_SIZE, 304,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(monthlyExp, javax.swing.GroupLayout.PREFERRED_SIZE, 289,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblReport, javax.swing.GroupLayout.PREFERRED_SIZE, 284,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL,
                new java.awt.Component[] { lblReport, mg_earn, monthlyExp });

        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(mg_earn, javax.swing.GroupLayout.DEFAULT_SIZE, 54,
                                                Short.MAX_VALUE)
                                        .addComponent(monthlyExp, javax.swing.GroupLayout.DEFAULT_SIZE, 54,
                                                Short.MAX_VALUE)
                                        .addComponent(lblReport, javax.swing.GroupLayout.DEFAULT_SIZE, 54,
                                                Short.MAX_VALUE))
                                .addContainerGap()));

        tp1.addTab("TOOLS", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel2)
                                                .addGap(6, 6, 6)
                                                .addComponent(dt, javax.swing.GroupLayout.PREFERRED_SIZE, 200,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(162, 162, 162)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                layout.createSequentialGroup()
                                                        .addComponent(jLabel1)
                                                        .addGap(378, 378, 378))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                layout.createSequentialGroup()
                                                        .addComponent(tp1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addContainerGap())))
                        .addComponent(jSeparator1));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(tp1, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(dt))
                                .addGap(11, 11, 11)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowActivated

    }// GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowOpened
        // CODE 1 - FORMATTING
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int X = (int) ((dimension.getWidth() - this.getWidth()) / 2);
        int Y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
        this.setLocation(X, Y);

        globalvar.frame1 = this;// Becomes easies to recreate this jframe from another one
        tb1.getTableHeader().setPreferredSize(new Dimension(tb1.getWidth(), 24));// Format Table Header Height
        tb1.getTableHeader().setFont(new Font("Comic Sans MS", Font.BOLD, 14));// Format Table Header Font
        tb1.getTableHeader().setBackground(Color.yellow);// Set table header background color
        // END OF CODE 1

        String month = null, date = null;

        try {
            Class.forName("java.sql.DriverManager");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "manas");
            Statement stmt1 = (Statement) conn.createStatement();
            Statement stmt2 = (Statement) conn.createStatement();
            Statement stmt3 = (Statement) conn.createStatement();
            Statement stmt4 = (Statement) conn.createStatement(); // used for getting month number which will be used
                                                                  // later

            // Display today's date
            String d = "Select dayofmonth(curdate());";
            String m = "Select monthname(curdate());";
            String y = "Select year(curdate());";
            String mno = "Select month(curdate());";

            ResultSet r1 = stmt1.executeQuery(d);
            ResultSet r2 = stmt2.executeQuery(m);
            ResultSet r3 = stmt3.executeQuery(y);
            ResultSet r4 = stmt4.executeQuery(mno);

            if (r1.next() && r2.next() && r3.next() && r4.next()) {
                month = r2.getString("monthname(curdate())");
                globalvar.year = r3.getString("year(curdate())");
                date = r1.getString("dayofmonth(curdate())");
                int mon_no = r4.getInt("month(curdate())");

                dt.setText(date + " " + month + ", " + globalvar.year);

                Statement dbchk = (Statement) conn.createStatement();
                String db = "show databases;";

                ResultSet dbase = dbchk.executeQuery(db);
                String dbName = null;

                while (dbase.next()) {
                    if (dbase.getString("Database").equals("expense" + globalvar.year)) {
                        dbName = dbase.getString("Database");
                    }
                }

                Statement create = conn.createStatement();
                String month_nm = null;
                if (dbName == null) {
                    create.executeUpdate("create database expense" + globalvar.year + ";");
                    while (mon_no <= 12) {
                        switch (mon_no) {
                            case 1:
                                month_nm = "A_January";
                                break;
                            case 2:
                                month_nm = "B_February";
                                break;
                            case 3:
                                month_nm = "C_March";
                                break;
                            case 4:
                                month_nm = "D_April";
                                break;
                            case 5:
                                month_nm = "E_May";
                                break;
                            case 6:
                                month_nm = "F_June";
                                break;
                            case 7:
                                month_nm = "G_July";
                                break;
                            case 8:
                                month_nm = "H_August";
                                break;
                            case 9:
                                month_nm = "I_September";
                                break;
                            case 10:
                                month_nm = "J_October";
                                break;
                            case 11:
                                month_nm = "K_November";
                                break;
                            case 12:
                                month_nm = "L_December";
                                break;
                        }
                        mon_no++;
                        create.executeUpdate("use expense" + globalvar.year + ";");
                        create.executeUpdate("create table " + month_nm
                                + "(ExpID int primary key,Day integer(2),Expenses varchar(30),Spent bigint,Category varchar(25),Description varchar(100));");
                    }
                }

                Statement load_tables = conn.createStatement();
                create.executeUpdate("use expense" + globalvar.year + ";");
                ResultSet tables = load_tables.executeQuery("show tables;");
                DefaultTableModel mdl = (DefaultTableModel) tb1.getModel();

                int exists = 0;
                while (tables.next()) {
                    String tablenm = tables.getString("Tables_in_expense" + globalvar.year);
                    if (!tablenm.equals("earnings")) {
                        mdl.addRow(new Object[] { tablenm.substring(2, 3).toUpperCase() + tablenm.substring(3) });
                    } else {
                        exists = 1;
                    }
                }
                if (exists == 0) {
                    create.executeUpdate(
                            "create table earnings(e_id integer primary key, Title varchar(20), amount bigint, month varchar(11));");
                }

                tb1.setModel(mdl);

            } // End parent if

            String prefix;
            if (month.equals("January")) {
                prefix = "A_";
            } else if (month.equals("February")) {
                prefix = "B_";
            } else if (month.equals("March")) {
                prefix = "C_";
            } else if (month.equals("April")) {
                prefix = "D_";
            } else if (month.equals("May")) {
                prefix = "E_";
            } else if (month.equals("June")) {
                prefix = "F_";
            } else if (month.equals("July")) {
                prefix = "G_";
            } else if (month.equals("August")) {
                prefix = "H_";
            } else if (month.equals("September")) {
                prefix = "I_";
            } else if (month.equals("October")) {
                prefix = "J_";
            } else if (month.equals("November")) {
                prefix = "K_";
            } else {
                prefix = "L_";
            }
            globalvar.tablename = prefix.concat(month);
        } // End Try
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        tb1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent evt) {
                if (!evt.getValueIsAdjusting()) {

                    String month_sel = tb1.getValueAt(tb1.getSelectedRow(), 0).toString();
                    String prefix;
                    if (month_sel.equals("January")) {
                        prefix = "A_";
                    } else if (month_sel.equals("February")) {
                        prefix = "B_";
                    } else if (month_sel.equals("March")) {
                        prefix = "C_";
                    } else if (month_sel.equals("April")) {
                        prefix = "D_";
                    } else if (month_sel.equals("May")) {
                        prefix = "E_";
                    } else if (month_sel.equals("June")) {
                        prefix = "F_";
                    } else if (month_sel.equals("July")) {
                        prefix = "G_";
                    } else if (month_sel.equals("August")) {
                        prefix = "H_";
                    } else if (month_sel.equals("September")) {
                        prefix = "I_";
                    } else if (month_sel.equals("October")) {
                        prefix = "J_";
                    } else if (month_sel.equals("November")) {
                        prefix = "K_";
                    } else {
                        prefix = "L_";
                    }
                    globalvar.tablename = prefix.concat(month_sel);
                    // Notify the user which days have expenses associated and which not
                }
            }
        });

        int i = 0;
        for (int q = 0; q <= tb1.getRowCount() - 1; q++) {
            if (tb1.getValueAt(q, 0).toString().equals(month)) {
                i = q;
            }
        }
        tb1.setRowSelectionInterval(i, i);
    }// GEN-LAST:event_formWindowOpened

    private void tb1MouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tb1MouseReleased

    }// GEN-LAST:event_tb1MouseReleased

    private void tb1KeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_tb1KeyReleased

    }// GEN-LAST:event_tb1KeyReleased

    private void tb1KeyTyped(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_tb1KeyTyped

    }// GEN-LAST:event_tb1KeyTyped

    private void tb1FocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_tb1FocusGained

    }// GEN-LAST:event_tb1FocusGained



    private void monthlyExpMouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_monthlyExpMouseReleased
        globalvar.day = "not needed";
        globalvar.frame2 = new Day();
        globalvar.frame2.setLocation(this.getLocation());
        globalvar.frame2.show();
        this.setVisible(false);
        globalvar.frame2.date.setText(globalvar.tablename.substring(2));
        globalvar.frame2.dayname.setText(globalvar.year);
        globalvar.frame2.theTitle.setText("Monthly Expenses");

        try {
            Class.forName("java.sql.DriverManager");

            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/expense" + globalvar.year, "root",
                    "manas");
            Statement st = (Statement) c.createStatement();

            ResultSet expenses = st.executeQuery("select * from " + globalvar.tablename + " order by day asc;");

            DefaultTableModel newModel = new DefaultTableModel(
                    new Object[][] {

                    },
                    new String[] {
                            "ExpID", "Expenses", "Spent", "Category", "Day"
                    }) {
                boolean[] canEdit = new boolean[] {
                        false, false, false, false, false
                };

                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return false;
                }
            };

            while (expenses.next()) {
                String s1 = expenses.getString("expid");
                String s2 = expenses.getString("Expenses");
                String s3 = "Rs." + expenses.getString("Spent");
                String s4 = expenses.getString("Category");
                String s5 = expenses.getString("Day");
                newModel.addRow(new Object[] { s1, s2, s3, s4, s5 });
            }
            globalvar.frame2.tb2.setModel(newModel);
            globalvar.frame2.tb2.getColumn("Description")
                    .setPreferredWidth(globalvar.frame2.tb2.getColumn("Description").getPreferredWidth() * 3);
            globalvar.isMonthlyExpensesBeingShown = "Yes";

            if (globalvar.frame2.date.getText().equals("January")) {
                globalvar.frame2.dback.setEnabled(false);
            } else if (globalvar.frame2.date.getText().equals("December")) {
                globalvar.frame2.dforw.setEnabled(false);
            }
        } catch (Exception e) {
        }
        globalvar.frame2.setTitle("Expenses of " + globalvar.frame2.date.getText());

        globalvar.frame2.titleExp.setText("<html>Total Expenses of<br> the month</html>");
        globalvar.frame2.titleTotal.setText("<html>Total savings<br>of the month</html>");
    }// GEN-LAST:event_monthlyExpMouseReleased

    private void monthlyExpMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_monthlyExpMouseEntered
        monthlyExp.setBackground(Color.YELLOW);
    }// GEN-LAST:event_monthlyExpMouseEntered

    private void monthlyExpMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_monthlyExpMouseExited
        monthlyExp.setBackground(Color.cyan);
    }// GEN-LAST:event_monthlyExpMouseExited

    private void mg_earnMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_mg_earnMouseEntered
        mg_earn.setBackground(Color.YELLOW);
    }// GEN-LAST:event_mg_earnMouseEntered

    private void mg_earnMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_mg_earnMouseExited
        mg_earn.setBackground(Color.cyan);
    }// GEN-LAST:event_mg_earnMouseExited

    private void mg_earnMouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_mg_earnMouseReleased
        this.setVisible(false);
        globalvar.frame3 = new Earnings();
        globalvar.frame3.setLocation(this.getLocation());
        globalvar.frame3.show();
    }

    private void lblReportMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_lblReportMouseEntered
        lblReport.setBackground(Color.YELLOW);
    }// GEN-LAST:event_lblReportMouseEntered

    private void lblReportMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_lblReportMouseExited
        lblReport.setBackground(Color.cyan);
    }// GEN-LAST:event_lblReportMouseExited

    private void lblReportMouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_lblReportMouseReleased
        Report rpt = new Report();
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int X = (int) ((dimension.getWidth() - rpt.getWidth()) / 2);
        int Y = (int) ((dimension.getHeight() - rpt.getHeight()) / 2);
        rpt.setLocation(X, Y);
        this.setVisible(false);
        rpt.show();
    }// GEN-LAST:event_lblReportMouseReleased

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EM_Main().setVisible(true);
            }
        });
    }

//GEN-BEGIN:variables
    private javax.swing.JLabel dt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblReport;
    private javax.swing.JLabel mg_earn;
    private javax.swing.JLabel monthlyExp;
    public javax.swing.JTable tb1;
    private javax.swing.JTabbedPane tp1;
//GEN-END:variables
}