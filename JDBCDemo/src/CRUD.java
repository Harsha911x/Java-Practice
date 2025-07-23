import java.sql.*;

public class CRUD {
    public static void main(String[] args) throws Exception {
        String url ="jdbc:postgresql://localhost:5432/Demo";
        //database://host:port no. / database name
        String username ="postgres";
        String password ="t1g3r";



        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url,username,password);

        //Create operation
//        String sql1 =  "Insert into public.\"Student\" values(6,'Naruto',97);";
//
//        Statement st1 = con.createStatement();
//
//        boolean status1 = st1.execute(sql1);

//        if(status){
//            System.out.println("Inserted!!!");
//        }
//        else{
//            System.out.println("Error!!!!! . Not Inserted!!!");
//        }


// *******************************************************
// *******************************************************


//        //Update operation
//        String sql2 =  "Update public.\"Student\" set name = 'Naruto Uzumaki' where sid=6;";
//
//        Statement st2 = con.createStatement();
//
//        boolean status2 = st2.execute(sql2);


// *******************************************************
// *******************************************************

        //Update operation
        String sql2 =  "delete from public.\"Student\" where sid=6;";

        Statement st2 = con.createStatement();

        boolean status2 = st2.execute(sql2);



        con.close();

    }
}
