package samjung.allinbiz.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import samjung.allinbiz.domain.Member;
import samjung.allinbiz.mapper.MemberMapper;
import samjung.allinbiz.service.MemberService;

@Slf4j
@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    private final MemberMapper memberMapper;

    @GetMapping("/")
    public String loginForm() {
        return "login";
    }

    @GetMapping("/signup")
    public String signupForm() {
        return "signup";
    }

    @PostMapping("/login")
    public void login(String loginId, String password) {

        //----TEST LOG----
        log.info("TEST LOGINID = " + loginId + "!!!!");
        log.info("TEST PW = " + password + "!!!!");

        memberService.login(loginId, password);
    }

    @PostMapping("/signup")
    public String signup(Model model, String userName, String loginId, String password) {

        //----TEST LOG----
        log.info("LOGINID_TEST= " + loginId + "!!!!");

        Member member = memberMapper.findMember(loginId);
        if (member == null) {
            log.info("NULL_TEST= " + member);
            memberService.signup(userName, loginId, password);
            return "redirect:/";
        } else {
            log.info("이미 존재하는 회원입니다.");
            return "redirect:/";
        }
    }

    @PostMapping("/findPw")
    public void findPw(String loginId) {
        memberService.findPw(loginId);
    }

    @GetMapping("/delete")
    public void deleteMember(String loginId, String password) {
        memberService.deleteMember(loginId, password);
    }


    //----캘린더 테스트----
    @GetMapping("/calendar")
    public String calendar() {
        return "calendar";
    }

}
