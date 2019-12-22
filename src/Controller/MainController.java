package Controller;

import Dao.BookDao;
import Dao.UserDao;
import Service.DisPlayMenu;
import VO.BookVO;
import VO.UserVO;

public class MainController {

    public static void main(String[] args) {
    	
    	
        DisPlayMenu disPlayMenu = new DisPlayMenu();
        disPlayMenu.defaultMenu();
        for (BookVO temp :BookDao.BookList) {
            System.out.println(temp.getName()+" "+ temp.getCountOfbook());
        }
        for(UserVO temp: UserDao.userList){
            System.out.println(temp.getId());
        }


    }
}
