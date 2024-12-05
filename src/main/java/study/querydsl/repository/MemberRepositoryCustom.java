package study.querydsl.repository;

//Spring Data JPA & Querydsl을 이용해 만든 사용자 정의 Repository

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import study.querydsl.dto.MemberSearchCondition;
import study.querydsl.dto.MemberTeamDto;

import java.util.List;

public interface MemberRepositoryCustom {

    List<MemberTeamDto> search(MemberSearchCondition condition);

    //단순한 페이징 쿼리  //count 쿼리와 아닌걸 구분해서 별도로 보내는 페이징 쿼리
    Page<MemberTeamDto> searchPageSimple(MemberSearchCondition condition, Pageable pageable);
}
