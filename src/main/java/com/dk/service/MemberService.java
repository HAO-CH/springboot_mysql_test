package com.dk.service;

import com.dk.pojo.Member;
import java.util.List;

public interface MemberService {

    int insert(Member member);

    int save(Member member);

    List<Member> findAll();

    //  有些读操作必须读主数据库
    //  比如，获取微信access_token，因为高峰时期主从同步可能延迟
    //  这种情况下就必须强制从主数据读
    List<Member> getToken(String appId);

    Member findById(Integer id);

    void update(Member member);

    void deleteById(Integer id);
}
