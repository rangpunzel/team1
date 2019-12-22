package Dao;

import VO.LoginSessionVO;
import VO.UserVO;

import java.util.Scanner;

public class LoginDao {
	
    public static LoginSessionVO loginSessionVO=new LoginSessionVO(); //로그인 세션
    
    public void login (){

        String id;
        String password;
        Scanner scanner=new Scanner(System.in);
        
        while(true) {
        	
        	//아이디와 패스워드를 입력받음
            System.out.print("아이디를 입력해주세요");
            id = scanner.nextLine();
            System.out.print("비밀번호를 입력해주세요");
            password = scanner.nextLine();
            
            // 입력된 아이디와 패스워드를 vo에 저장
            UserVO vo = new UserVO();
            vo.setId(id);
            vo.setPassword(password);
            
            //loginCheck에 유저 정보를 넘김
            boolean isLogin = loginCheck(vo);
            
            if(isLogin)   //????????????
                break;
        }//isLogin이 true로 리턴 받으면 while문 종료
    }
    
    
    
    public boolean loginCheck(UserVO vo) {
    	
    	//유저 리스트수만큼 반복
        for(int i=0;i<UserDao.userList.size();i++){
        	
        	//UserDao>userList에 있는 아이디가 사용자가 입력한 아이디와 같고
            if(UserDao.userList.get(i).getId().equals(vo.getId())){

            	//UserDao>userList에 있는 패스워드가 사용자가 입력한패스워드와 같고
                if(UserDao.userList.get(i).getPassword().equals(vo.getPassword())) {
                	
                	//UserDao>userList에 있는 roll이 유저인지 관리자인지 체크
                    if (UserDao.userList.get(i).getRoll().equals("user")) {
                    	//유저이면 세션의 아이디와 타입을 vo에 저장된 정보로 저장
                        LoginDao.loginSessionVO.setId(vo.getId());
                        LoginDao.loginSessionVO.setId(vo.getRoll());
                        return true;  //isLogin을 true로 리턴
                    } else if (UserDao.userList.get(i).getRoll().equals("admin")) {
                    	//관리자면 유저 리스트에 있는 관리자 정보를 세션에 저장
                        loginSessionVO.setId((UserDao.userList.get(i).getId()));
                        return true;  //isLogin을 true로 리턴
                    }
                }
                //아이디는 같은데 패스워드가 다르면 오류 메시지 출력
                else{
                    System.out.println("비밀번호 오류 입니다. 로그인을 다시 한번 시도 해주세요");
                    return false;
                }
            }
        }
        return false;
    }
}
