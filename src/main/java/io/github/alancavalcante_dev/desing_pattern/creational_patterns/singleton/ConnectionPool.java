package io.github.alancavalcante_dev.desing_pattern.creational_patterns.singleton;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool implements Connection {

    private Integer POOL_SIZE = 10;
    private List<Boolean> list = new ArrayList<>();
    private static ConnectionPool connectionPool = new ConnectionPool();
    private Boolean isConnected = false;

    private ConnectionPool() {
        System.out.println("Creating connection pool");

        if (list.size() < POOL_SIZE) {
            list.add(inUse(true));
        }

        System.out.println(list);
    }

    public void connect(String user, String password, String host) {
        if (!isConnected) {
            if (user.isBlank() || password.isBlank() || host.isBlank()) {
                this.isConnected = false;
                throw new RuntimeException("Precisa conectar em um banco de dados");
            }
            this.isConnected = true;
            System.out.println("Conectado");
        }
        else {
            System.out.println("Já esta conectado");
        }
    }

    public static ConnectionPool getInstance() {
        return connectionPool;
    }

    @Override
    public Boolean inUse(Boolean used) {
        return used;
    }

    public void query(String query) {
        if (!isConnected) {
            throw new RuntimeException("Voce nao esta conectado");
        }
        System.out.println("Running '" + query + "' in Postgres");
    }
}
