package Service;

import Dao.BookDao;
import Dao.LoginDao;
import VO.LoginSessionVO;

import java.io.PrintStream;
import java.util.Scanner;

public class DisPlayMenu {
    private PrintStream printStream = new PrintStream(System.out);
    private BookDao bookDao = new BookDao();
    private LoginDao  loginDao=new LoginDao();

    public void defaultMenu(){
        printStream.println("종료라고 입력하시면 첫 화면으로  이동합니다..");
        printStream.println("1.도서검색");
        printStream.println("2.베스트 셀러 목록 보기 ");
        printStream.println("3.도서 구매하기 ");
        selectedDefaultMenu();

    }
    public void selectedDefaultMenu() {

        Scanner scanner = new Scanner(System.in);
        String selectedNum;
        while (true) {
            selectedNum = scanner.nextLine();
            if (selectedNum.equals("1")) {
                System.out.println("도서검색");
            } else if (selectedNum.equals("2")) {
                System.out.println("베스트셀러 목록을 보여주는 함수");
            } else if (selectedNum.equals("3")) {
              /* if( LoginDao.loginSessionVO==null||LoginDao.loginSessionVO.equals("")){
                   loginDao.login();
               }
               else{
                   //System.out.println(LoginDao.loginSessionVO.getId());
                   bookDao.searchBuyBook();
               }*/
              loginDao.login();
            } else if (selectedNum.equals("종료")) {
                defaultMenu();
                //세션 반납 로그아웃

                break;

            }
        }
    }

    private void userSelectedMenu() {
        Scanner scanner = new Scanner(System.in);
        String selectedNum;
        while (true) {
            selectedNum = scanner.nextLine();
            if (selectedNum.equals("1")) {
                System.out.println("도서검색");
            } else if (selectedNum.equals("2")) {
                System.out.println("베스트셀러 목록을 보여주는 함수");
            } else if (selectedNum.equals("3")) {
                System.out.println("로그인 확인 후 구매 화면으로 돌아가기 ");
            } else if (selectedNum.equals("종료")) {
               defaultMenu();
               //세션 반납 로그아웃

               break;

            }
        }
    }

    private void adminLoginMenu() {
        printStream.println("종료라고 첫 화면으로 돌아 갑니다.");
        printStream.println("1.도서 재고 관리");
        printStream.println("2.협력사 등록하기");
        printStream.println("3.협력사 삭제하기");
        adminSelectedMenu();
    }

    private void adminSelectedMenu() {
        Scanner scanner = new Scanner(System.in);
        String selectedNum;
        while (true) {
            selectedNum = scanner.nextLine();
            if (selectedNum.equals("1")) {
                System.out.println("도서 재고 관리");
            } else if (selectedNum.equals("2")) {
                System.out.println("협력사 등록하기 ");
            } else if (selectedNum.equals("3")) {
                System.out.println("협록사 삭제하기  ");
            } else if (selectedNum.equals("종료")) {
                defaultMenu();
                break;

            }
        }
    }

    public void selectedMenu() {//해당함수는 해당 객체에서 메서드 구현후 해당 기능 메서드 호출
        /*1번을 입력했다면 도서등록 기능이 2번을 선택했다면 도서 검색기능이 3번을 선택했다면 도서 대여 기능이 4번이 됬다면 도서 반납기능이 실행됩니다.
         */

    }
}
