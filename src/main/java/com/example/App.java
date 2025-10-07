package com.example;
import com.sun.net.httpserver.*;
import java.net.InetSocketAddress;
import java.io.OutputStream;

public class App {
  public static void main(String[] args) throws Exception {
    HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
    server.createContext("/", (exchange) -> {
      String resp = "Hello from Java on Kubernetes!";
      exchange.sendResponseHeaders(200, resp.getBytes().length);
      try (OutputStream os = exchange.getResponseBody()) {
        os.write(resp.getBytes());
      }
    });
    server.start();
    System.out.println("Started on 8080");
  }
}
