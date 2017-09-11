package services;

import com.google.inject.Inject;
import models.User;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.Security;

public class SecureService extends Security.Authenticator {

    @Inject
    AuthService authService;

    @Override
    public String getUsername(Http.Context ctx) {
        String token = getTokenFromHeader(ctx);
        if (token != null) {
            User user = authService.getUserByToken(token);
            if (user != null) {
                return user.username;
            }
        }
        return null;
    }

    @Override
    public Result onUnauthorized(Http.Context context) {
        return super.onUnauthorized(context);
    }

    private String getTokenFromHeader(Http.Context ctx) {
        String[] authTokenHeaderValues = ctx.request().headers().get("X-AUTH-TOKEN");
        if ((authTokenHeaderValues != null) && (authTokenHeaderValues.length == 1) && (authTokenHeaderValues[0] != null)) {
            return authTokenHeaderValues[0];
        }
        return null;
    }

}