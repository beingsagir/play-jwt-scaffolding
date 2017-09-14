package controllers;

import org.junit.Test;
import play.Application;
import play.inject.guice.GuiceApplicationBuilder;
import play.mvc.Http;
import play.mvc.Result;
import play.test.WithApplication;

import static org.junit.Assert.assertEquals;
import static play.mvc.Http.Status.OK;
import static play.test.Helpers.GET;
import static play.test.Helpers.route;

public class HomeControllerTest extends WithApplication {

    @Override
    protected Application provideApplication() {
        return new GuiceApplicationBuilder().build();
    }

    @Test
    public void testIndex() {
        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(GET)
                .uri("/");

        Result result = route(app, request);
        assertEquals(OK, result.status());
    }

    @Test
    public void testSignUp() {
        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(GET)
                .uri("/signUp/:email/:password");

        Result result = route(app, request);
        assertEquals(OK, result.status());
    }

    @Test

    public void testSignIn() {
        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(GET)
                .uri("/signIn/:email/:password");

        Result result = route(app, request);
        assertEquals(OK, result.status());
    }

    @Test
    public void testAccess() {
        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(GET)
                .uri("/authCheck");

        Result result = route(app, request);
        assertEquals(OK, result.status());
    }

    @Test
    public void testGetCurrentUser() {
        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(GET)
                .uri("/userCreatedTest/:email/:password");

        Result result = route(app, request);
        assertEquals(OK, result.status());
    }
}
