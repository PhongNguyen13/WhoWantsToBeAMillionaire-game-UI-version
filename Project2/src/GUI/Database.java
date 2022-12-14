package GUI;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {

    Connection conn = null;
    String url = "jdbc:derby:PlayerDB;create=true";
    String dbusername = "pdc";
    String dbpassword = "pdc";

    public void dbsetup() {
        try {
            conn = DriverManager.getConnection(url, dbusername, dbpassword);
            Statement statement = conn.createStatement();
            String tableName = "Ranking";

            if (!checkTableExisting(tableName)) {
                statement.executeUpdate("CREATE TABLE " + tableName + " (username VARCHAR(12), score INT)");
            }
            statement.close();

        } catch (Throwable e) {
            System.out.println("error");

        }
    }

    public int checkName(String username) {
        int score = 0;

        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT username, score FROM Ranking "
                    + "WHERE username = '" + username + "'");
            if (rs.next()) {
                score = rs.getInt("score");
            } else {
                System.out.println("no such user");
                statement.executeUpdate("INSERT INTO Ranking " + "VALUES('" + username + "', 0)");
                score = 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return score;
    }

    private boolean checkTableExisting(String newTableName) {
        boolean flag = false;
        try {
            System.out.println("check existing tables.... ");
            String[] types = {"TABLE"};
            DatabaseMetaData dbmd = conn.getMetaData();
            ResultSet rsDBMeta = dbmd.getTables(null, null, null, null);
            while (rsDBMeta.next()) {
                String tableName = rsDBMeta.getString("TABLE_NAME");
                if (tableName.compareToIgnoreCase(newTableName) == 0) {
                    System.out.println(tableName + "  is there");
                    flag = true;
                }
            }
            if (rsDBMeta != null) {
                rsDBMeta.close();
            }
        } catch (SQLException ex) {
        }
        return flag;
    }

    public void quitGame(int score, String username) {
        Statement statement;
        try {
            statement = conn.createStatement();
            statement.executeUpdate("UPDATE Ranking SET score=" + score + " WHERE username='" + username + "'");
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
