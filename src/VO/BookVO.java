package VO;

public class BookVO {

    private String name;//책이름
    private String authorName;//작가이름
    private String categoryName;//카테고리

    private boolean isRentaled;//대여여부
    private String regDate;//책등록일자
    private String startRenDate;//대여시작일
    private String endRenDate;//대여 끝난일
    private static int management=0;
    private int countOfbook=0;
    



    public BookVO() {
        this.isRentaled=false;
        management++;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public boolean isRentaled() {
        return isRentaled;
    }

    public void setRentaled(boolean rentaled) {
        isRentaled = rentaled;
    }

    public String getRegDate() {

        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getStartRenDate() {
        return startRenDate;
    }

    public void setStartRenDate(String startRenDate) {
        this.startRenDate = startRenDate;
    }

    public String getEndRenDate() {
        return endRenDate;
    }

    public void setEndRenDate(String endRenDate) {
        this.endRenDate = endRenDate;
    }

    public static int getManagement() {
        return management;
    }

    public static void setManagement(int management) {
        BookVO.management = management;
    }

    public int getCountOfbook() {
        return countOfbook;
    }

    public void setCountOfbook(int countOfbook) {
        this.countOfbook = countOfbook;
    }
}
