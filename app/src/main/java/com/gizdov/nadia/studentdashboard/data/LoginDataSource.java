package com.gizdov.nadia.studentdashboard.data;

import com.gizdov.nadia.studentdashboard.data.model.LoggedInUser;

import java.io.IOException;

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
public class LoginDataSource {

    public Result<LoggedInUser> login(String username, String password) {

        try {
            // TODO: handle loggedInUser authentication

            LoggedInUser authenticatedUser = new LoggedInUser(java.util.UUID.randomUUID().toString(),"Nadia Gizdova");
            return new Result.Success<>(authenticatedUser);
        }
        catch (Exception e)
        {
            return new Result.Error(new IOException("User could not be authenticated. Check your info and try again!", e));
        }
    }

    public void logout() {
        // TODO: revoke authentication
    }
}