import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_Query_1 {

    public static void main(String[] args) {

        // 1 Kullanilacak veritabani icin dogru surucuyu ekle

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
        }

        try {
            DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=UTC", "root", "1234");
        } catch (SQLException e) {

        }


        /*
        git init
        git add .
        git commit -m "day_01"
        git branch -M main
        git remote add origin https://github.com/burkaygul/JDBCTeam113.git
        git push -u origin main
         */
    }

}
