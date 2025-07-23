import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementDemo {
    public static void main(String[] args) throws Exception {

        String url ="jdbc:postgresql://localhost:5432/Demo";
        //database://host:port no. / database name
        String username ="postgres";
        String password ="t1g3r";

        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url,username,password);

        //User Inputs
        int sid = 7;
        String name = "Minato Uzumaki";
        int marks = 101;

        String sql = "Insert into public.\"Student\" values(?,?,?);";

        PreparedStatement st = con.prepareStatement(sql);
        //set the variables to columns
        st.setInt(1,sid);
        st.setString(2,name);
        st.setInt(3,marks);

        st.execute();

        con.close();
    }
}
