package samjung.allinbiz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import samjung.allinbiz.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberMapper memberMapper;

    @Override
    public void login(String loginId, String password) {
        memberMapper.login(loginId, password);
    }

    @Override
    public void signup(String userName, String loginId, String password) {
        memberMapper.signup(userName, loginId, password);
    }

    @Override
    public void findPw(String loginId) {
        memberMapper.findPw(loginId);
    }

    @Override
    public void deleteMember(String loginId, String password) {
        memberMapper.deleteMember(loginId, password);
    }
}
