package Practice;

abstract class Database {
    protected String hostUrl;
    protected String username;
    
    Database(String hostUrl, String username) {
        this.hostUrl = hostUrl;
        this.username = username;
    }

    abstract void connect();
}

class MySQL extends Database {
    MySQL(String hostUrl, String username) {
        super(hostUrl, username);
    }

    public void connect() {
        System.out.printf("Connecting to MySQL at %s", hostUrl);
    }
}

class OracleDatabase extends Database {
    OracleDatabase(String hostUrl, String username) {
        super(hostUrl, username);
    }

    public void connect() {
        System.out.printf("Connecting to oracle database at %s", hostUrl);
    }
}

public class Database_Connector {
    public static void main(String[] args) {
        Database db = new MySQL("x1239kxj", "vinayak");

        db.connect();
    }
}