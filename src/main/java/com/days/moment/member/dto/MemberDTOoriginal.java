//package com.days.moment.member.dto;
//
//import com.days.moment.member.domain.Member;
//import com.days.moment.member.domain.MemberRole;
//import lombok.*;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//
//import java.time.LocalDateTime;
//import java.util.Collection;
//import java.util.Locale;
//import java.util.stream.Collectors;
//
//
//@Getter
//@Setter
//public class MemberDTOoriginal extends User{
////extends User
//    private String memId;
//    private String memPwd;
//    private String memNick;
//    private String memName;
//    private LocalDateTime memBirthday;
//    private LocalDateTime memAnniversary;
//    private boolean enabled;
//    private boolean memEmailCert;
//    private int memSex;//null=0,남=1,여=2
//    private LocalDateTime lastLogin;
//    private LocalDateTime memRegister;
//    private boolean memDormant;
//    private boolean memDenied;
//
//
//    public Member getDomain(){
//
//        Member member = Member.builder()
//                .memId(memId)
//                .memPwd(memPwd)
//                .memName(memName)
//                .enabled(enabled)
//                .memNick(memNick)
//                .memBirthday(memBirthday)
//                .memAnniversary(memAnniversary)
//                .memEmailCert(memEmailCert)
//                .memSex(memSex)
//                .lastLogin(lastLogin)
//                .memRegister(memRegister)
//                .memDormant(memDormant)
//                .memDenied(memDenied)
//                .build();
//
//        return member;
//
//
//    }
//
//
//    public MemberDTOoriginal(Member member){
//        super(member.getMemId(),
//                member.getMemPwd(),
//                member.getRoleList().stream()
//                        .map(memberRole ->
//                                new SimpleGrantedAuthority(memberRole.getRole())).collect(Collectors.toList()));
//
//        this.memId = member.getMemId();
//        this.memPwd = member.getMemPwd();
//        this.memName = member.getMemName();
//        this.enabled = member.isEnabled();
//        this.memNick = member.getMemNick();
//        this.memBirthday = member.getMemBirthday();
//        this.memAnniversary = member.getMemAnniversary();
//        this.memEmailCert = member.isMemEmailCert();
//        this.memSex = member.getMemSex();
//        this.lastLogin = member.getLastLogin();
//        this.memRegister = member.getMemRegister();
//        this.memDormant = member.isMemDormant();
//        this.memDenied = member.isMemDenied();
//
//
//
//    }
//
//
//    public MemberRole getRole(String memID){
//
//        MemberRole memberRole = MemberRole.builder()
//                .memId(memId)
//                .role("ROLE_MEMBER")
//                .build();
//
//        return memberRole;
//
//    }
//
//}
