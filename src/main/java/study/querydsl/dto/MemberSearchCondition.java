package study.querydsl.dto;

import lombok.Data;

//순수 JPA & Querydsl - Builder 사용을 위한 검색조건(filtering) 생성

@Data
public class MemberSearchCondition {
    //회원명, 팀명, 나이(ageGoe, ageLoe)

    private String username;
    private String teamName;
    private Integer ageGoe;
    private Integer ageLoe;

}
