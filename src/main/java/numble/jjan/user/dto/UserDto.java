package numble.jjan.user.dto;

import numble.jjan.user.entity.User;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDto {

    private Long id;
    private String email;
    private String password;
    private String name;
    private String phone;
    private String userName;
    private String address;
    private Boolean status;

    // 엔티티를 Dto로 변환
    public UserDto(User entity) {
        this.id = entity.getId();
        this.email = entity.getEmail();
        this.password = entity.getPassword();
        this.name = entity.getName();
        this.phone = entity.getPhone();
        this.userName = entity.getUserName();
        this.address = entity.getAddress();
        this.status = entity.isStatus();
    }

    // Dto를 엔티티로 변환
    public User toEntity() {
        return User.builder()
                .id(id)
                .email(email)
                .password(password)
                .name(name)
                .phone(phone)
                .userName(userName)
                .address(address)
                .status(status)
                .build();
    }
}
