package Dao;

import VO.UserVO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserDao {
public static List<UserVO> userList=new ArrayList<>();
    static {
        UserVO admin=new UserVO();
        //관리자 아이디 admin 추가
        admin.setId("admin");  
        admin.setPassword("admin");
        admin.setRoll("admin"); //유저와 구분짓기 위한 키
        userList.add(admin); //유저 리스트에 어드민 추가

    }

    public void insertUser(UserVO vo) {
    	//List 숫자만큼 반복
        for(int i=0;i<userList.size();i++){
        	
        	//만약에 파라미터로 받은 id가 유저 리스트에 있는 아이디면 "이미 가입된 계정" 출력하고 종료
            if(userList.get(i).getId().equals(vo.getId())){
                System.out.println("이미 가입된 계정입니다.");
                break;
            }
            else{
            }
        }
    }

    public void login() {
    }

}
