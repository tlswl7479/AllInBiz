package samjung.allinbiz.service;

public interface MemberService {
    void login(String loginId, String password);
    void signup(String userName, String loginId, String password);
    void findPw(String loginId);
    void deleteMember(String loginId, String password);
}
