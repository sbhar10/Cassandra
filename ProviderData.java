import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Session;

public class ProviderData {

    public static void main(String args[]){

        //queries
        String query1 = "INSERT INTO PROVIDER (provider_id, provider_name, provider_city, provider_phone)"

                + " VALUES(3, 'Appolo', 'Minnesota', 1000);" ;

        String query2 = "UPDATE PROVIDER SET provider_name='STARS' WHERE provider_id = 1 ";

        String query3 = "SELECT * FROM PROVIDER";

        String query4 = "INSERT INTO PROVIDER_EMAIL(name, email)"
        + "VALUES ('Appollo', ['Appollo1@gmail.com','Appollo2@yahoo.com']);";

        //Creating Cluster object
        Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();

        //Creating Session object
        Session session = cluster.connect("PROVIDER_US");



        //Executing the query
        //session.execute(query1);

        //session.execute(query2);
        //Getting the ResultSet
        //ResultSet result = session.execute(query3);

        //System.out.println(result.all());

        session.execute(query4);

        System.out.println("Done");
    }
}
