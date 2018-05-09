package ke.co.pinnsoft.chatapplication.interfacer;

import java.io.UnsupportedEncodingException;

/**
 * Created by as on 5/9/2018.
 */

public interface Manager {

    //Authenticates user, signing up, passes on messages
    public String getUsername();
    public String sendMessage (String username, String toUsername, String message) throws UnsupportedEncodingException;
    public String authenticateUser (String usernameText, String passwordText) throws UnsupportedEncodingException;
    public void messageReceived (String username, String message);

    public boolean isNetworkConnected();
    public boolean isUserAuthenticated();
    public String getLastRawFriendList();
    public void exit();
    public String signUpUser (String usernameText, String passwordText, String email);
    public String addNewFriendRequest (String friendUsername);
    public String sendFriendReqsResponse (String approvedFriendNames, String discardedFriendNames);

}
