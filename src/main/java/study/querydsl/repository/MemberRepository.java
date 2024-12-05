package study.querydsl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import study.querydsl.entity.Member;

import java.util.List;

//Spring Data JPA & Querydsl

public interface MemberRepository extends JpaRepository<Member, Long>, MemberRepositoryCustom, QuerydslPredicateExecutor<Member> {

    //select m from Member m where m.username = ?
    List<Member> findByUsername(String username);//메서드 이름으로 자동으로 JPQL생성
}
