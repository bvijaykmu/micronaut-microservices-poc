package pl.altkom.asc.lab.micronaut.poc.policy.client;

import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.Client;
import pl.altkom.asc.lab.micronaut.poc.policy.service.api.v1.Health;

@Client(id = "/policy-service", path = "/hello")
public interface HelloClient {

    @Get("/")
    HttpStatus index();

    @Get("/version")
    Health version();
}