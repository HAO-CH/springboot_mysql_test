package com.dk.controller;

import com.dk.pojo.Member;
import com.dk.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("memberController")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @RequestMapping("find")
    public String find() {
        return "member/list";
    }

    @RequestMapping("getMemberAll")
    @ResponseBody
    public List<Member> getMemberAll() {
        List<Member> list = memberService.findAll();
        return list;
    }

    @RequestMapping("toAdd")
    public String toAdd() {
        return "member/save";
    }

    @RequestMapping("addMember")
    @ResponseBody
    public boolean addMember(Member member) {
        int i = memberService.insert(member);
        return i > 0;
    }

    @RequestMapping("toUpdate/{id}")
    public String toUpdate(@PathVariable("id") Integer id, Model model) {
        Member member = memberService.findById(id);
        model.addAttribute("m", member);
        return "member/update";
    }

    @RequestMapping("update")
    @ResponseBody
    public boolean update(Member member) {
        memberService.update(member);
        return true;
    }

    @RequestMapping("deleteById/{id}")
    @ResponseBody
    public boolean deleteById(@PathVariable("id") Integer id) {
        memberService.deleteById(id);
        return true;
    }
}
