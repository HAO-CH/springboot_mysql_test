package com.dk.test;

import com.alibaba.fastjson.JSONObject;
import com.dk.pojo.Member;
import com.dk.service.MemberService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class DatasourceDemo {
    @Autowired
    private MemberService memberService;

    @Test
    public void testWrite() {
        Member member = new Member();
        member.setName("李四");
        memberService.insert(member);
    }

    @Test
    public void testRead() {
        System.out.println(JSONObject.toJSONString(memberService.findAll()));
    }

    @Test
    public void testSave() {
        Member member = new Member();
        member.setName("wangwu");
        memberService.save(member);
    }

    @Test
    public void testReadFromMaster() {
        memberService.getToken("1234");
    }


}
