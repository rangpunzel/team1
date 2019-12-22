import java.util.Calendar;

public class Utill {
    //이외에 필요한 메서드가 있다면 public static 자료형 형식을 지켜서 만들어 주세요. 다른클래스에서도 필요한 공용함수들을
    //메서드로 만드시면 됩니다
    public static String todayToCalender(){

        Calendar calendar=Calendar.getInstance();
        int year=calendar.get(Calendar.YEAR);
        int month=calendar.get(Calendar.MONTH)+1;
        int date=calendar.get(Calendar.DATE);
        int dayOfWeek=calendar.get(Calendar.DAY_OF_WEEK);
        int hour=calendar.get(Calendar.HOUR);
        int minute=calendar.get(Calendar.MINUTE);
        int second=calendar.get(Calendar.SECOND);
        String korDayOfWeek="";
        switch (dayOfWeek){
            case 1:
                korDayOfWeek="일";
                break;
            case 2:
                korDayOfWeek="월";
                break;
            case 3:
                korDayOfWeek="화";
                break;
            case 4:
                korDayOfWeek="수";
                break;
            case 5:
                korDayOfWeek="목";
                break;
            case 6:
                korDayOfWeek="금";
                break;
            case 7:
                korDayOfWeek="토";
                break;
        }
        // String currentDay=""+year+"-"+month+"-"+korDayOfWeek+"-"+hour+":"+minute+":"+second+"";
        String currentDay=""+year+"-"+month+"-"+date+"-"+hour+":"+minute+":"+second+"";
        return currentDay;
    }
}
