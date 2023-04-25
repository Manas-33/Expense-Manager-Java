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
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        day1 = new javax.swing.JLabel();
        day2 = new javax.swing.JLabel();
        day3 = new javax.swing.JLabel();
        day4 = new javax.swing.JLabel();
        day5 = new javax.swing.JLabel();
        day6 = new javax.swing.JLabel();
        day7 = new javax.swing.JLabel();
        day8 = new javax.swing.JLabel();
        day9 = new javax.swing.JLabel();
        day10 = new javax.swing.JLabel();
        day11 = new javax.swing.JLabel();
        day12 = new javax.swing.JLabel();
        day13 = new javax.swing.JLabel();
        day14 = new javax.swing.JLabel();
        day15 = new javax.swing.JLabel();
        day16 = new javax.swing.JLabel();
        day17 = new javax.swing.JLabel();
        day18 = new javax.swing.JLabel();
        day19 = new javax.swing.JLabel();
        day20 = new javax.swing.JLabel();
        day22 = new javax.swing.JLabel();
        day21 = new javax.swing.JLabel();
        day23 = new javax.swing.JLabel();
        day24 = new javax.swing.JLabel();
        day25 = new javax.swing.JLabel();
        day26 = new javax.swing.JLabel();
        day27 = new javax.swing.JLabel();
        day28 = new javax.swing.JLabel();
        day29 = new javax.swing.JLabel();
        day30 = new javax.swing.JLabel();
        day31 = new javax.swing.JLabel();
        calender_title = new javax.swing.JLabel();
        previous = new javax.swing.JButton();
        next = new javax.swing.JButton();
        dn1 = new javax.swing.JLabel();
        dn2 = new javax.swing.JLabel();
        dn3 = new javax.swing.JLabel();
        dn4 = new javax.swing.JLabel();
        dn5 = new javax.swing.JLabel();
        dn6 = new javax.swing.JLabel();
        dn7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        tp1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        // jLabel5 = new javax.swing.JLabel();
        mg_earn = new javax.swing.JLabel();
        // jLabel6 = new javax.swing.JLabel();
        // jLabel7 = new javax.swing.JLabel();
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
                                .addComponent(mg_earn, javax.swing.GroupLayout.PREFERRED_SIZE, 125,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(monthlyExp, javax.swing.GroupLayout.PREFERRED_SIZE, 125,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblReport, javax.swing.GroupLayout.PREFERRED_SIZE, 125,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65,
                                        Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGap(4, 4, 4)));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addGroup(jPanel2Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(mg_earn, javax.swing.GroupLayout.DEFAULT_SIZE, 54,
                                                                Short.MAX_VALUE)
                                                        .addComponent(monthlyExp, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                54,
                                                                Short.MAX_VALUE)
                                                        .addComponent(lblReport, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                54,
                                                                Short.MAX_VALUE))))));

        tp1.addTab("TOOLS", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(346, 346, 346)
                                .addComponent(jLabel1))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 864,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel2)
                                .addGap(6, 6, 6)
                                .addComponent(dt, javax.swing.GroupLayout.PREFERRED_SIZE, 200,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(107, 107, 107)
                                .addComponent(jLabel3))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 533,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(6, 6, 6)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(tp1, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(dt)
                                        .addComponent(jLabel3))
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 394,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))));

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

            // CODE 2-Display today's date
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
                int mon_no = r4.getInt("month(curdate())");// used later

                dt.setText(date + " " + month + ", " + globalvar.year);
                // Code 2 ENDED

                // Code 3-Check existance of current year database and take action accordingly
                Statement dbchk = (Statement) conn.createStatement();
                String db = "show databases;";

                ResultSet dbase = dbchk.executeQuery(db);
                String dbName = null;

                while (dbase.next()) {
                    if (dbase.getString("Database").equals("emp12cay" + globalvar.year)) {
                        dbName = dbase.getString("Database");// Get the existing database name
                    }
                }

                // if database does'nt exists then create it ELSE load its tables
                Statement create = conn.createStatement();
                String month_nm = null;
                if (dbName == null) {
                    create.executeUpdate("create database emp12cay" + globalvar.year + ";");
                    while (mon_no <= 12) {
                        switch (mon_no) {
                            // The prefix A_ or B_ is just used for convenience so that it could be
                            // displayed in alphabetical order in jTable tb1
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
                        create.executeUpdate("use emp12cay" + globalvar.year + ";");
                        create.executeUpdate("create table " + month_nm
                                + "(ExpID int primary key,Day integer(2),Expenses varchar(30),Spent bigint,Category varchar(25),Description varchar(100));");
                    }
                }
                // Code 3 ended

                // BELOW Code is for loading tables into jTable named tb1
                Statement load_tables = conn.createStatement();
                create.executeUpdate("use emp12cay" + globalvar.year + ";");
                ResultSet tables = load_tables.executeQuery("show tables;");
                DefaultTableModel mdl = (DefaultTableModel) tb1.getModel();

                int exists = 0;
                while (tables.next()) {
                    String tablenm = tables.getString("Tables_in_emp12cay" + globalvar.year);
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

                // Code 4 - To set month name as heading above calender layout
                if (month.equals("April") || month.equals("June") || month.equals("September")
                        || month.equals("November")) {
                    day31.setVisible(false);
                } else if (month.equals("February")) {
                    int year1 = Integer.parseInt(globalvar.year);
                    if ((year1 % 400 == 0) || ((year1 % 4 == 0) && (year1 % 100 != 0))) {// Check if leap year
                        day30.setVisible(false);
                        day31.setVisible(false);
                    } else {
                        day29.setVisible(false);
                        day30.setVisible(false);
                        day31.setVisible(false);
                    }
                }
            } // End parent if

            // To set tablename by default to first index selected of table
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
            // Code 4 ended
        } // End Try
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        // CODE 6 - CREATING AN EVENT WHICH CHECKS FOR ROW SELECTION CHANGE

        // tb1SelectionChanged Event:-
        tb1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent evt) {
                if (!evt.getValueIsAdjusting()) {

                    // THE ACTIONS OF THE EVENT STARTS HERE
                    String x = tb1.getValueAt(tb1.getSelectedRow(), 0).toString();
                    if (x.equals("April") || x.equals("June") || x.equals("September") || x.equals("November")) {
                        day29.setVisible(true);
                        day30.setVisible(true);
                        day31.setVisible(false);
                    } else if (x.equals("February")) {
                        int year1 = Integer.parseInt(globalvar.year);
                        if ((year1 % 400 == 0) || ((year1 % 4 == 0) && (year1 % 100 != 0))) {// Check if leap year
                            day29.setVisible(true);
                            day30.setVisible(false);
                            day31.setVisible(false);
                        } else {
                            day29.setVisible(false);
                            day30.setVisible(false);
                            day31.setVisible(false);
                        }
                    } else {
                        day29.setVisible(true);
                        day30.setVisible(true);
                        day31.setVisible(true);
                    }
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
                    try {
                        Class.forName("java.sql.DriverManager");
                        Connection conn = DriverManager.getConnection(
                                "jdbc:mysql://localhost:3306/emp12cay" + globalvar.year, "root", "manas");
                        int daychk = 1;
                        while (daychk <= 31) {
                            Statement check = conn.createStatement();
                            ResultSet r = check.executeQuery(
                                    "select count(day) from " + globalvar.tablename + " where day=" + daychk + ";");
                            r.next();
                            int t = Integer.parseInt(r.getString("count(day)"));
                            if (t != 0) {
                                switch (daychk) {
                                    case 1:
                                        day1.setBackground(Color.green);
                                        break;
                                    case 2:
                                        day2.setBackground(Color.green);
                                        break;
                                    case 3:
                                        day3.setBackground(Color.green);
                                        break;
                                    case 4:
                                        day4.setBackground(Color.green);
                                        break;
                                    case 5:
                                        day5.setBackground(Color.green);
                                        break;
                                    case 6:
                                        day6.setBackground(Color.green);
                                        break;
                                    case 7:
                                        day7.setBackground(Color.green);
                                        break;
                                    case 8:
                                        day8.setBackground(Color.green);
                                        break;
                                    case 9:
                                        day9.setBackground(Color.green);
                                        break;
                                    case 10:
                                        day10.setBackground(Color.green);
                                        break;
                                    case 11:
                                        day11.setBackground(Color.green);
                                        break;
                                    case 12:
                                        day12.setBackground(Color.green);
                                        break;
                                    case 13:
                                        day13.setBackground(Color.green);
                                        break;
                                    case 14:
                                        day14.setBackground(Color.green);
                                        break;
                                    case 15:
                                        day15.setBackground(Color.green);
                                        break;
                                    case 16:
                                        day16.setBackground(Color.green);
                                        break;
                                    case 17:
                                        day17.setBackground(Color.green);
                                        break;
                                    case 18:
                                        day18.setBackground(Color.green);
                                        break;
                                    case 19:
                                        day19.setBackground(Color.green);
                                        break;
                                    case 20:
                                        day20.setBackground(Color.green);
                                        break;
                                    case 21:
                                        day21.setBackground(Color.green);
                                        break;
                                    case 22:
                                        day22.setBackground(Color.green);
                                        break;
                                    case 23:
                                        day23.setBackground(Color.green);
                                        break;
                                    case 24:
                                        day24.setBackground(Color.green);
                                        break;
                                    case 25:
                                        day25.setBackground(Color.green);
                                        break;
                                    case 26:
                                        day26.setBackground(Color.green);
                                        break;
                                    case 27:
                                        day27.setBackground(Color.green);
                                        break;
                                    case 28:
                                        day28.setBackground(Color.green);
                                        break;
                                    case 29:
                                        day29.setBackground(Color.green);
                                        break;
                                    case 30:
                                        day30.setBackground(Color.green);
                                        break;
                                    case 31:
                                        day31.setBackground(Color.green);
                                        break;
                                }
                            } else {
                                switch (daychk) {
                                    case 1:
                                        day1.setBackground(Color.cyan);
                                        break;
                                    case 2:
                                        day2.setBackground(Color.cyan);
                                        break;
                                    case 3:
                                        day3.setBackground(Color.cyan);
                                        break;
                                    case 4:
                                        day4.setBackground(Color.cyan);
                                        break;
                                    case 5:
                                        day5.setBackground(Color.cyan);
                                        break;
                                    case 6:
                                        day6.setBackground(Color.cyan);
                                        break;
                                    case 7:
                                        day7.setBackground(Color.cyan);
                                        break;
                                    case 8:
                                        day8.setBackground(Color.cyan);
                                        break;
                                    case 9:
                                        day9.setBackground(Color.cyan);
                                        break;
                                    case 10:
                                        day10.setBackground(Color.cyan);
                                        break;
                                    case 11:
                                        day11.setBackground(Color.cyan);
                                        break;
                                    case 12:
                                        day12.setBackground(Color.cyan);
                                        break;
                                    case 13:
                                        day13.setBackground(Color.cyan);
                                        break;
                                    case 14:
                                        day14.setBackground(Color.cyan);
                                        break;
                                    case 15:
                                        day15.setBackground(Color.cyan);
                                        break;
                                    case 16:
                                        day16.setBackground(Color.cyan);
                                        break;
                                    case 17:
                                        day17.setBackground(Color.cyan);
                                        break;
                                    case 18:
                                        day18.setBackground(Color.cyan);
                                        break;
                                    case 19:
                                        day19.setBackground(Color.cyan);
                                        break;
                                    case 20:
                                        day20.setBackground(Color.cyan);
                                        break;
                                    case 21:
                                        day21.setBackground(Color.cyan);
                                        break;
                                    case 22:
                                        day22.setBackground(Color.cyan);
                                        break;
                                    case 23:
                                        day23.setBackground(Color.cyan);
                                        break;
                                    case 24:
                                        day24.setBackground(Color.cyan);
                                        break;
                                    case 25:
                                        day25.setBackground(Color.cyan);
                                        break;
                                    case 26:
                                        day26.setBackground(Color.cyan);
                                        break;
                                    case 27:
                                        day27.setBackground(Color.cyan);
                                        break;
                                    case 28:
                                        day28.setBackground(Color.cyan);
                                        break;
                                    case 29:
                                        day29.setBackground(Color.cyan);
                                        break;
                                    case 30:
                                        day30.setBackground(Color.cyan);
                                        break;
                                    case 31:
                                        day31.setBackground(Color.cyan);
                                        break;
                                }
                            }
                            daychk++;
                        }
                        Statement dn = conn.createStatement();
                        String curMonth = calender_title.getText();
                        String curMonth_no = null;
                        if (curMonth.equals("January")) {
                            curMonth_no = "01";
                        } else if (curMonth.equals("February")) {
                            curMonth_no = "02";
                        } else if (curMonth.equals("March")) {
                            curMonth_no = "03";
                        } else if (curMonth.equals("April")) {
                            curMonth_no = "04";
                        } else if (curMonth.equals("May")) {
                            curMonth_no = "05";
                        } else if (curMonth.equals("June")) {
                            curMonth_no = "06";
                        } else if (curMonth.equals("July")) {
                            curMonth_no = "07";
                        } else if (curMonth.equals("August")) {
                            curMonth_no = "08";
                        } else if (curMonth.equals("September")) {
                            curMonth_no = "09";
                        } else if (curMonth.equals("October")) {
                            curMonth_no = "10";
                        } else if (curMonth.equals("November")) {
                            curMonth_no = "11";
                        } else {
                            curMonth_no = "12";
                        }
                        ResultSet d = dn.executeQuery(
                                "select dayofweek('" + globalvar.year + "-" + curMonth_no + "-01') as dayno;");
                        int k = 0;
                        if (d.next()) {
                            k = d.getInt("dayno");
                        }
                        switch (k) {
                            case 1:
                                dn1.setText("Sunday");
                                dn2.setText("Monday");
                                dn3.setText("Tuesday");
                                dn4.setText("Wednesday");
                                dn5.setText("Thursday");
                                dn6.setText("Friday");
                                dn7.setText("Saturday");
                                break;
                            case 2:
                                dn7.setText("Sunday");
                                dn1.setText("Monday");
                                dn2.setText("Tuesday");
                                dn3.setText("Wednesday");
                                dn4.setText("Thursday");
                                dn5.setText("Friday");
                                dn6.setText("Saturday");
                                break;
                            case 3:
                                dn6.setText("Sunday");
                                dn7.setText("Monday");
                                dn1.setText("Tuesday");
                                dn2.setText("Wednesday");
                                dn3.setText("Thursday");
                                dn4.setText("Friday");
                                dn5.setText("Saturday");
                                break;
                            case 4:
                                dn5.setText("Sunday");
                                dn6.setText("Monday");
                                dn7.setText("Tuesday");
                                dn1.setText("Wednesday");
                                dn2.setText("Thursday");
                                dn3.setText("Friday");
                                dn4.setText("Saturday");
                                break;
                            case 5:
                                dn4.setText("Sunday");
                                dn5.setText("Monday");
                                dn6.setText("Tuesday");
                                dn7.setText("Wednesday");
                                dn1.setText("Thursday");
                                dn2.setText("Friday");
                                dn3.setText("Saturday");
                                break;
                            case 6:
                                dn3.setText("Sunday");
                                dn4.setText("Monday");
                                dn5.setText("Tuesday");
                                dn6.setText("Wednesday");
                                dn7.setText("Thursday");
                                dn1.setText("Friday");
                                dn2.setText("Saturday");
                                break;
                            case 7:
                                dn2.setText("Sunday");
                                dn3.setText("Monday");
                                dn4.setText("Tuesday");
                                dn5.setText("Wednesday");
                                dn6.setText("Thursday");
                                dn7.setText("Friday");
                                dn1.setText("Saturday");
                                break;

                        }

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(rootPane, e.getMessage());
                    }

                }
            }
        });
        // Code 6 ended
        // This Code is to select automatically the cell/row associated to the current
        // month

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

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_nextActionPerformed
        if (tb1.getSelectedRow() == tb1.getRowCount() - 1) {
            tb1.setRowSelectionInterval(0, 0);
        } else {
            tb1.setRowSelectionInterval(tb1.getSelectedRow() + 1, tb1.getSelectedRow() + 1);
        }
    }// GEN-LAST:event_nextActionPerformed

    private void previousActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_previousActionPerformed
        if (tb1.getSelectedRow() == 0) {
            tb1.setRowSelectionInterval(tb1.getRowCount() - 1, tb1.getRowCount() - 1);
        } else {
            tb1.setRowSelectionInterval(tb1.getSelectedRow() - 1, tb1.getSelectedRow() - 1);
        }
    }// GEN-LAST:event_previousActionPerformed

    private void day1MouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_day1MouseReleased
        globalvar.day = "01";
        globalvar.frame2 = new Day();
        globalvar.frame2.show();
        globalvar.frame2.setLocation(this.getLocation());
        this.setVisible(false);

    }// GEN-LAST:event_day1MouseReleased

    private void day2MouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_day2MouseReleased
        globalvar.day = "02";
        globalvar.frame2 = new Day();
        globalvar.frame2.show();
        globalvar.frame2.setLocation(this.getLocation());
        this.setVisible(false);
    }// GEN-LAST:event_day2MouseReleased

    private void day3MouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_day3MouseReleased
        globalvar.day = "03";
        globalvar.frame2 = new Day();
        globalvar.frame2.show();
        globalvar.frame2.setLocation(this.getLocation());
        this.setVisible(false);
    }// GEN-LAST:event_day3MouseReleased

    private void day4MouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_day4MouseReleased
        globalvar.day = "04";
        globalvar.frame2 = new Day();
        globalvar.frame2.show();
        globalvar.frame2.setLocation(this.getLocation());
        this.setVisible(false);
    }// GEN-LAST:event_day4MouseReleased

    private void day5MouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_day5MouseReleased
        globalvar.day = "05";
        globalvar.frame2 = new Day();
        globalvar.frame2.show();
        globalvar.frame2.setLocation(this.getLocation());
        this.setVisible(false);
    }// GEN-LAST:event_day5MouseReleased

    private void day6MouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_day6MouseReleased
        globalvar.day = "06";
        globalvar.frame2 = new Day();
        globalvar.frame2.show();
        globalvar.frame2.setLocation(this.getLocation());
        this.setVisible(false);
    }// GEN-LAST:event_day6MouseReleased

    private void day7MouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_day7MouseReleased
        globalvar.day = "07";
        globalvar.frame2 = new Day();
        globalvar.frame2.show();
        globalvar.frame2.setLocation(this.getLocation());
        this.setVisible(false);
    }// GEN-LAST:event_day7MouseReleased

    private void day8MouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_day8MouseReleased
        globalvar.day = "08";
        globalvar.frame2 = new Day();
        globalvar.frame2.show();
        globalvar.frame2.setLocation(this.getLocation());
        this.setVisible(false);
    }// GEN-LAST:event_day8MouseReleased

    private void day9MouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_day9MouseReleased
        globalvar.day = "09";
        globalvar.frame2 = new Day();
        globalvar.frame2.show();
        globalvar.frame2.setLocation(this.getLocation());
        this.setVisible(false);
    }// GEN-LAST:event_day9MouseReleased

    private void day10MouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_day10MouseReleased
        globalvar.day = "10";
        globalvar.frame2 = new Day();
        globalvar.frame2.show();
        globalvar.frame2.setLocation(this.getLocation());
        this.setVisible(false);
    }// GEN-LAST:event_day10MouseReleased

    private void day11MouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_day11MouseReleased
        globalvar.day = "11";
        globalvar.frame2 = new Day();
        globalvar.frame2.show();
        globalvar.frame2.setLocation(this.getLocation());
        this.setVisible(false);
    }// GEN-LAST:event_day11MouseReleased

    private void day12MouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_day12MouseReleased
        globalvar.day = "12";
        globalvar.frame2 = new Day();
        globalvar.frame2.show();
        globalvar.frame2.setLocation(this.getLocation());
        this.setVisible(false);
    }// GEN-LAST:event_day12MouseReleased

    private void day13MouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_day13MouseReleased
        globalvar.day = "13";
        globalvar.frame2 = new Day();
        globalvar.frame2.show();
        globalvar.frame2.setLocation(this.getLocation());
        this.setVisible(false);
    }// GEN-LAST:event_day13MouseReleased

    private void day14MouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_day14MouseReleased
        globalvar.day = "14";
        globalvar.frame2 = new Day();
        globalvar.frame2.show();
        globalvar.frame2.setLocation(this.getLocation());
        this.setVisible(false);
    }// GEN-LAST:event_day14MouseReleased

    private void day15MouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_day15MouseReleased
        globalvar.day = "15";
        globalvar.frame2 = new Day();
        globalvar.frame2.show();
        globalvar.frame2.setLocation(this.getLocation());
        this.setVisible(false);
    }// GEN-LAST:event_day15MouseReleased

    private void day16MouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_day16MouseReleased
        globalvar.day = "16";
        globalvar.frame2 = new Day();
        globalvar.frame2.show();
        globalvar.frame2.setLocation(this.getLocation());
        this.setVisible(false);
    }// GEN-LAST:event_day16MouseReleased

    private void day17MouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_day17MouseReleased
        globalvar.day = "17";
        globalvar.frame2 = new Day();
        globalvar.frame2.show();
        globalvar.frame2.setLocation(this.getLocation());
        this.setVisible(false);
    }// GEN-LAST:event_day17MouseReleased

    private void day18MouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_day18MouseReleased
        globalvar.day = "18";
        globalvar.frame2 = new Day();
        globalvar.frame2.show();
        globalvar.frame2.setLocation(this.getLocation());
        this.setVisible(false);
    }// GEN-LAST:event_day18MouseReleased

    private void day19MouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_day19MouseReleased
        globalvar.day = "19";
        globalvar.frame2 = new Day();
        globalvar.frame2.show();
        globalvar.frame2.setLocation(this.getLocation());
        this.setVisible(false);
    }// GEN-LAST:event_day19MouseReleased

    private void day20MouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_day20MouseReleased
        globalvar.day = "20";
        globalvar.frame2 = new Day();
        globalvar.frame2.show();
        globalvar.frame2.setLocation(this.getLocation());
        this.setVisible(false);
    }// GEN-LAST:event_day20MouseReleased

    private void day21MouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_day21MouseReleased
        globalvar.day = "21";
        globalvar.frame2 = new Day();
        globalvar.frame2.show();
        globalvar.frame2.setLocation(this.getLocation());
        this.setVisible(false);
    }// GEN-LAST:event_day21MouseReleased

    private void day22MouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_day22MouseReleased
        globalvar.day = "22";
        globalvar.frame2 = new Day();
        globalvar.frame2.show();
        globalvar.frame2.setLocation(this.getLocation());
        this.setVisible(false);
    }// GEN-LAST:event_day22MouseReleased

    private void day23MouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_day23MouseReleased
        globalvar.day = "23";
        globalvar.frame2 = new Day();
        globalvar.frame2.show();
        globalvar.frame2.setLocation(this.getLocation());
        this.setVisible(false);
    }// GEN-LAST:event_day23MouseReleased

    private void day24MouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_day24MouseReleased
        globalvar.day = "24";
        globalvar.frame2 = new Day();
        globalvar.frame2.show();
        globalvar.frame2.setLocation(this.getLocation());
        this.setVisible(false);
    }// GEN-LAST:event_day24MouseReleased

    private void day25MouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_day25MouseReleased
        globalvar.day = "25";
        globalvar.frame2 = new Day();
        globalvar.frame2.show();
        globalvar.frame2.setLocation(this.getLocation());
        this.setVisible(false);
    }// GEN-LAST:event_day25MouseReleased

    private void day26MouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_day26MouseReleased
        globalvar.day = "26";
        globalvar.frame2 = new Day();
        globalvar.frame2.show();
        globalvar.frame2.setLocation(this.getLocation());
        this.setVisible(false);
    }// GEN-LAST:event_day26MouseReleased

    private void day27MouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_day27MouseReleased
        globalvar.day = "27";
        globalvar.frame2 = new Day();
        globalvar.frame2.show();
        globalvar.frame2.setLocation(this.getLocation());
        this.setVisible(false);
    }// GEN-LAST:event_day27MouseReleased

    private void day28MouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_day28MouseReleased
        globalvar.day = "28";
        globalvar.frame2 = new Day();
        globalvar.frame2.show();
        globalvar.frame2.setLocation(this.getLocation());
        this.setVisible(false);
    }// GEN-LAST:event_day28MouseReleased

    private void day29MouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_day29MouseReleased
        globalvar.day = "29";
        globalvar.frame2 = new Day();
        globalvar.frame2.show();
        globalvar.frame2.setLocation(this.getLocation());
        this.setVisible(false);
    }// GEN-LAST:event_day29MouseReleased

    private void day30MouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_day30MouseReleased
        globalvar.day = "30";
        globalvar.frame2 = new Day();
        globalvar.frame2.show();
        globalvar.frame2.setLocation(this.getLocation());
        this.setVisible(false);
    }// GEN-LAST:event_day30MouseReleased

    private void day31MouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_day31MouseReleased
        globalvar.day = "31";
        globalvar.frame2 = new Day();
        globalvar.frame2.show();
        globalvar.frame2.setLocation(this.getLocation());
        this.setVisible(false);
    }// GEN-LAST:event_day31MouseReleased

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

            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp12cay" + globalvar.year, "root",
                    "manas");
            Statement st = (Statement) c.createStatement();

            ResultSet expenses = st.executeQuery("select * from " + globalvar.tablename + " order by day asc;");

            DefaultTableModel newModel = new DefaultTableModel(
                    new Object[][] {

                    },
                    new String[] {
                            "ExpID", "Expenses", "Spent", "Description", "Day"
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
                String s4 = expenses.getString("Description");
                String s5 = expenses.getString("Day");
                newModel.addRow(new Object[] { s1, s2, s3, s4, s5 });
            }
            globalvar.frame2.tb2.setModel(newModel);
            globalvar.frame2.tb2.getColumn("Description")
                    .setPreferredWidth(globalvar.frame2.tb2.getColumn("Description").getPreferredWidth() * 3);
            globalvar.isMonthlyExpensesBeingShown = "Yes";

            // DISABLE/ENABLE FORWARD AND BACK BUTTONS ACCORDING TO THE MONTH
            if (globalvar.frame2.date.getText().equals("January")) {
                globalvar.frame2.dback.setEnabled(false);
            } else if (globalvar.frame2.date.getText().equals("December")) {
                globalvar.frame2.dforw.setEnabled(false);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        globalvar.frame2.setTitle("Expenses of " + globalvar.frame2.date.getText());

        globalvar.frame2.titleExp.setText("<html>Total Expenses of<br> the month</html>");
        globalvar.frame2.titleTotal.setText("<html>Total savings<br>of the month</html>");
    }// GEN-LAST:event_monthlyExpMouseReleased

    // private void jLabel5MouseReleased(java.awt.event.MouseEvent evt) {//
    // GEN-FIRST:event_jLabel5MouseReleased
    // System.exit(0);
    // }// GEN-LAST:event_jLabel5MouseReleased

    // private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//
    // GEN-FIRST:event_jLabel5MouseEntered
    // jLabel5.setBackground(Color.YELLOW);
    // }// GEN-LAST:event_jLabel5MouseEntered

    // private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//
    // GEN-FIRST:event_jLabel5MouseExited
    // jLabel5.setBackground(Color.cyan);
    // }// GEN-LAST:event_jLabel5MouseExited

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
    }// GEN-LAST:event_mg_earnMouseReleased

    // private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//
    // GEN-FIRST:event_jLabel6MouseEntered
    // jLabel6.setBackground(Color.YELLOW);
    // }// GEN-LAST:event_jLabel6MouseEntered

    // private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//
    // GEN-FIRST:event_jLabel6MouseExited
    // jLabel6.setBackground(Color.cyan);
    // }// GEN-LAST:event_jLabel6MouseExited

    // private void jLabel6MouseReleased(java.awt.event.MouseEvent evt) {//
    // GEN-FIRST:event_jLabel6MouseReleased
    // JOptionPane.showMessageDialog(null,
    // "<html>This program is created by <font color=#00AA00>Chaitanya Vaishampayan,
    // Yash Tiwari</font> and <font color=#00AA00>Apoorva Gupta</font><br>and guided
    // by the teacher <font color=#0000DD>Mrs. Shehla Khan</font></html>.");
    // }// GEN-LAST:event_jLabel6MouseReleased

    // private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//
    // GEN-FIRST:event_jLabel7MouseEntered
    // jLabel7.setBackground(Color.YELLOW);
    // }// GEN-LAST:event_jLabel7MouseEntered

    // private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//
    // GEN-FIRST:event_jLabel7MouseExited
    // jLabel7.setBackground(Color.cyan);
    // }// GEN-LAST:event_jLabel7MouseExited

    // private void jLabel7MouseReleased(java.awt.event.MouseEvent evt)
    // {//GEN-FIRST:event_jLabel7MouseReleased
    // Help help = new Help();
    // Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
    // int X = (int) ((dimension.getWidth() - help.getWidth()) / 2);
    // int Y = (int) ((dimension.getHeight() - help.getHeight()) / 2);
    // help.setLocation(X, Y);
    // help.show();
    // }//GEN-LAST:event_jLabel7MouseReleased

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

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EM_Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel  calender_title;
    public javax.swing.JLabel day1;
    public javax.swing.JLabel day10;
    public javax.swing.JLabel day11;
    public javax.swing.JLabel day12;
    public javax.swing.JLabel day13;
    public javax.swing.JLabel day14;
    public javax.swing.JLabel day15;
    public javax.swing.JLabel day16;
    public javax.swing.JLabel day17;
    public javax.swing.JLabel day18;
    public javax.swing.JLabel day19;
    public javax.swing.JLabel day2;
    public javax.swing.JLabel day20;
    public javax.swing.JLabel day21;
    public javax.swing.JLabel day22;
    public javax.swing.JLabel day23;
    public javax.swing.JLabel day24;
    public javax.swing.JLabel day25;
    public javax.swing.JLabel day26;
    public javax.swing.JLabel day27;
    public javax.swing.JLabel day28;
    public javax.swing.JLabel day29;
    public javax.swing.JLabel day3;
    public javax.swing.JLabel day30;
    public javax.swing.JLabel day31;
    public javax.swing.JLabel day4;
    public javax.swing.JLabel day5;
    public javax.swing.JLabel day6;
    public javax.swing.JLabel day7;
    public javax.swing.JLabel day8;
    public javax.swing.JLabel day9;
    private javax.swing.JLabel dn1;
    private javax.swing.JLabel dn2;
    private javax.swing.JLabel dn3;
    private javax.swing.JLabel dn4;
    private javax.swing.JLabel dn5;
    private javax.swing.JLabel dn6;
    private javax.swing.JLabel dn7;
    private javax.swing.JLabel dt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // private javax.swing.JLabel jLabel5;
    // private javax.swing.JLabel jLabel6;
    // private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblReport;
    private javax.swing.JLabel mg_earn;
    private javax.swing.JLabel monthlyExp;
    private javax.swing.JButton next;
    private javax.swing.JButton previous;
    public javax.swing.JTable tb1;
    private javax.swing.JTabbedPane tp1;
    // End of variables declaration//GEN-END:variables
}