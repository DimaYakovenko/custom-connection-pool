package pool;

import lombok.SneakyThrows;

import java.sql.Connection;

public class App {
    @SneakyThrows
    public static void main(String[] args) {
        final String url = "jdbc:postgresql://localhost:5434/postgres";
        final String username = "postgres";
        final String password = "postgres";

        PooledDataSource pooledDataSource = new PooledDataSource(url, username, password);
        try (final Connection connection = pooledDataSource.getConnection()) {
            System.out.println(connection);
        }
    }
}
