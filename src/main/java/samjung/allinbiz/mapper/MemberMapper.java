package samjung.allinbiz.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import samjung.allinbiz.domain.Member;

@Mapper
@Repository
public interface MemberMapper {
    void login(@Param("loginId")String loginId, @Param("password")String password);
    void signup(@Param("userName")String userName, @Param("loginId")String loginId, @Param("password")String password);
    void findPw(@Param("loginId")String loginId);
    void deleteMember(@Param("loginId")String loginId, @Param("password")String password);
    Member findMember(@Param("loginId")String loginId);
}
