package numble.jjan.user.entity;

import numble.jjan.util.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class User extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    private String password;

    private String name;

    private String phone;

    private String userName;

    private String address;

    private boolean status;

    @Builder
    public User(Long id, String email, String password, String name, String phone, String userName, String address, boolean status) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;
        this.phone = phone;
        this.userName = userName;
        this.address = address;
        this.status = status;
    }
}
