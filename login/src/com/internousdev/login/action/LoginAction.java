package com.internousdev.login.action;

import java.sql.SQLException;

import com.internousdev.login.dao.LoginDAO;
import com.internousdev.login.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	//JSPから受け取る値＊必ずJSPと同じ
	private String name;
	private String password;

	public String execute()throws SQLException{
		//ﾒｿｯﾄﾞの戻り値「ret」を定義、初期値をERRORを代入
		String ret = ERROR;

		LoginDAO dao = new LoginDAO();
		LoginDTO dto = new LoginDTO();

		//JSPから送られたnameとpassを引数としてDAOｸﾗｽのselectﾒｿｯﾄﾞを呼び出す
		//DAOで取得した結果をDTOに代入をする
		dto = dao.select(name,password);
		
		//(dto.getName())と(dto.getPassword())に一致するか確認をする
		if(name.equals(dto.getName())){
			if(password.equals(dto.getPassword())){
				ret = SUCCESS; //if文の条件を満たしたら[ret]の内容をSUCCESSに書き換える
			}
		}return ret;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password = password;
	}
}