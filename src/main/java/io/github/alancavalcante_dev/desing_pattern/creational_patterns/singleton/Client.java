package io.github.alancavalcante_dev.desing_pattern.creational_patterns.singleton;



public class Client {

    public static void main(String[] args) {
        ConnectionPool connectionPool = ConnectionPool.getInstance();
        connectionPool.connect("sa", "teste", "render.com");
        connectionPool.query("select * from tbl_user");
        connectionPool.connect("sa", "teste", "render.com");
        connectionPool.query("select * from tbl_user");
    }

}
