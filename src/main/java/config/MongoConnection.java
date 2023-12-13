package config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import dev.morphia.Datastore;
import dev.morphia.Morphia;
import dev.morphia.mapping.MapperOptions;

/**
 *
 * @author Son
 */
public class MongoConnection {
    private static final String DATABASE_HOST = "localhost";
    private static final int DATABASE_PORT = 27017;
    private static final String DATABASE_NAME = "dang_kiem_xe";
    
    private static MongoConnection connection;
    private static MongoClient mongoClient;
    private static Datastore datastore;
    
    private MongoConnection() {
        // Private constructor to prevent direct instantiation
    }
    
    // Initialize Morphia and create a Datastore
    private static synchronized void initializeDatastore() {
        try {
            mongoClient = MongoClients.create("mongodb://" + DATABASE_HOST + ":" + DATABASE_PORT);
            Datastore morphia = Morphia.createDatastore(mongoClient, DATABASE_NAME);
            morphia.getMapper().mapPackage("models"); // Replace with the package where your entity classes are located
            morphia.ensureIndexes();
            datastore = morphia;
        } catch (Exception e) {
            e.printStackTrace(); // Handle the exception appropriately in your application
        }
    }
    public synchronized Datastore getDatastore() {
        return datastore;
    }

    // Phương thức để lấy đối tượng MongoClient
    public static synchronized MongoConnection getInstance() {
        if (connection == null) {
            connection = new MongoConnection();
            initializeDatastore();
        }
        return connection;
    }
    public synchronized void close() {
        if (mongoClient != null) {
            mongoClient.close();
        }
    }
}
