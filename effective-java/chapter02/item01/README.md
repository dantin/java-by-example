# Service Provider Framework

This is a demo of Service Provider Framework, which use static factory to create new instance.

It is also used in `JDBC`.

```
// Load MySQL Driver.
Class.forName("com.mysql.jdbc.Driver");
// Get Database connection.
Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "password");
// Create PreparedStatement Object
PreparedStatement stmt = conn.prepareStatement("SELECT 1");
```

1. `Connection` is the Service interface.
2. `Class.forName("...")` will instance a `com.mysql.jdbc.Driver` class and register it to `DriverManager` using `DriverManager.registerDriver();`.
3. `DriverManager.getConnection()` is the `Service` API that return a `Connection`.
4. `Driver` is the Provider interface.
