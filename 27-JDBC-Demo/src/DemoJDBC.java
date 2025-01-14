import java.sql.*;

public class DemoJDBC {
    public static void main(String[] args) {

        try {
            // Load Driver
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");


            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM users;");

            // Fetching Records.
            System.out.println("userId" + "\t\t" + "username" + "\t\t" + "email");
            while (resultSet.next()) {
                int userId = resultSet.getInt("user_id");
                String username = resultSet.getString("username");
                String email = resultSet.getString("email");

                System.out.println(userId + "\t\t\t" + username + "\t\t\t" + email);
            }

            String insertUserSql = "INSERT INTO users (username, email) VALUES (?, ?)  returning  user_id ,USERNAME, EMAIL;";
            PreparedStatement preparedStatement = connection.prepareStatement(insertUserSql);

            // Set values.
            preparedStatement.setString(1 , "user23");
            preparedStatement.setString(2 , "user23@example.com");

            ResultSet resultSet1 = preparedStatement.executeQuery();
            while (resultSet1.next()) {
                int userId = resultSet1.getInt("user_id");
                String username = resultSet1.getString("username");
                String email = resultSet1.getString("email");

                System.out.println("INSERTED ===> " +  userId + "\t\t\t" + username + "\t\t\t" + email);
            }

            connection.close();

            System.out.println("Connected successfully...");
        } catch (ClassNotFoundException e) {
            System.out.println("Postgres Driver not found! " + e.toString());
        } catch (SQLException e) {
            System.out.println("Unable to connect with PostgresDB: " + e.toString());
        }

    }
}
