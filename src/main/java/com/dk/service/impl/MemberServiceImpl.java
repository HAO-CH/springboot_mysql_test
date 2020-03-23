package com.dk.service.impl;

import com.dk.mapper.MemberMapper;
import com.dk.pojo.Member;
import com.dk.pojo.MemberExample;
import com.dk.service.MemberService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class MemberServiceImpl implements MemberService {

    @Resource
    private MemberMapper memberMapper;

    @Override
//    @Transactional(readOnly = true)
    public List<Member> findAll() {
        return memberMapper.selectByExample(new MemberExample());
    }

    @Override
    public List<Member> getToken(String appId) {
        return null;
    }

    @Override
    public Member findById(Integer id) {
        return null;
    }

    @Override
    public void update(Member member) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public int insert(Member member) {
        return 0;
    }

    @Override
    public int save(Member member) {
        return 0;
    }
}
