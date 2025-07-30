package samjung.allinbiz.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Member {

    private int id;
    private String userName;
    private String loginId;
    private String password;

}
