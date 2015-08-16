package com.github.budgettracker.vertx;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerRequest;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.handler.StaticHandler;

public class HelloWorld extends AbstractVerticle{

    @Override
    public void start() throws Exception {
        HttpServer server = vertx.createHttpServer();
        Router router = Router.router(vertx);
        router.route().handler(ctx -> {
            HttpServerRequest req = ctx.request();
            System.out.println(req.path());
            ctx.next();
        });
        router.route().handler(StaticHandler.create().setWebRoot("webapp"));
        server.requestHandler(router::accept);
        server.listen(8080, "localhost");
    }
    
    

//  public static void main(String[] args) {
//    // Create an HTTP server which simply returns "Hello World!" to each request.
//    Vertx.vertx().createHttpServer().requestHandler(req -> req.response().end("Hello World!")).listen(8080);
//  }

}
