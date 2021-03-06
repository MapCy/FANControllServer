package com.moon.service;

import com.moon.common.pojo.MoonResult;
import com.moon.pojo.TbContact;

public interface ContactService {

	MoonResult getAllContact();
	MoonResult addContact(TbContact contact);
	void delContact(String number); //根据number(员工编号)删除记录
	void updateContact(TbContact contact);
	
	TbContact selectByNumber(String number); //根据number(员工编号)查看员工详情
}
