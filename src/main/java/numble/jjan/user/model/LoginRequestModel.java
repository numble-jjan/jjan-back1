package numble.jjan.user.model;

import lombok.Data;

@Data
public class LoginRequestModel {

    private String email;
    private String password;
    private Boolean status;
    private String accessToken;
}
