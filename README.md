# Expense Manager

A desktop application for tracking personal expenses and earnings, built with Java Swing and MySQL.

## Features

- **Dashboard** – View all months of the current year at a glance, with today's date displayed on launch.
- **Daily Expense Tracking** – Browse expenses day-by-day, navigate between days, and see a per-day summary of earnings vs. expenses.
- **Add Expenses** – Log an expense with a title, amount spent, day, category, and a short description.
- **Earnings Management** – Record monthly income as either a *Main Earning* (e.g. salary) or an *Extra Earning* (e.g. reward/bonus). Only one main earning is allowed per month.
- **Expense Categories** – Expenses are organised into 13 categories:
  - Education, Food, Transportation, Billing, Insurance, Tax, Loan Activity, Medical, Property, Maid/Servant, Entertainment, Clothing, Others
- **Monthly Report** – Generate a visual report showing spending per category as progress bars, for any selected month.
- **Automatic Database Setup** – On first run, the application creates a MySQL database (`expenseYYYY`) for the current year and generates a table for each remaining month automatically.

## Prerequisites

| Requirement | Version |
|---|---|
| Java (JDK / JRE) | 8 or later |
| MySQL Server | 5.x or later |
| NetBeans IDE (optional, for development) | Any recent version |

## Database Configuration

The application connects to MySQL using the following defaults (hardcoded in the source):

| Setting | Value |
|---|---|
| Host | `localhost` |
| Port | `3306` |
| Username | `root` |
| Password | `manas` |

Ensure MySQL is running and the `root` user has permission to create databases before launching the app.

## Building

The project uses **Apache Ant** via a NetBeans project file.

1. Open the project in **NetBeans IDE**.
2. Right-click the project → **Clean and Build**.
3. The compiled JAR and its dependencies will appear in the `dist/` directory.

Alternatively, run Ant from the command line:

```bash
ant jar
```

## Running

After building, run the application from the `dist/` directory:

```bash
cd dist
java -jar "Expense Manager.jar"
```

> **Note:** The `dist/lib/` folder (containing `mysql-connector-java-5.1.6-bin.jar` and `AbsoluteLayout.jar`) must remain alongside the JAR file.

## Project Structure

```
src/
├── EM_Main.java      # Main window – month list, navigation, tool buttons
├── Day.java          # Day view – daily expense list and summary
├── InputBox.java     # Dialog for adding a new expense entry
├── Earnings.java     # Earnings list window for the year
├── AddEarn.java      # Dialog for adding a new earning entry
├── Report.java       # Monthly report with per-category progress bars
└── globalvar.java    # Shared global state (current year, selected table, frame references)

dist/
├── Expense Manager.jar   # Runnable application JAR
└── lib/
    ├── mysql-connector-java-5.1.6-bin.jar
    └── AbsoluteLayout.jar
```

## Dependencies

| Library | Purpose |
|---|---|
| `mysql-connector-java-5.1.6-bin.jar` | JDBC driver for MySQL connectivity |
| `AbsoluteLayout.jar` (NetBeans) | GUI layout manager used by the NetBeans Form Editor |

## License

This project is open source. See the repository for details.
