//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception {
        /*
        import package
        load and register driver
        create connection
        create and execute statement
        close connection
         */

        String url ="jdbc:postgresql://localhost:5432/Demo";
                    //database://host:port no. / database name
        String username ="postgres";
        String password ="t1g3r";

        String sql =  "SELECT * FROM public.\"Student\";";

        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url,username,password);

        Statement st = con.createStatement();

        ResultSet res = st.executeQuery(sql);



//        while(res.next()){
//            System.out.println(res.getString("name"));
//        }
        System.out.println("ID     Name       Marks");
        while(res.next()){
            System.out.print(res.getInt("sid")+"      ");
            System.out.print(res.getString("name")+"      ");
            System.out.println(res.getInt("marks"));
        }


        con.close();
    }
}