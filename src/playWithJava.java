
public class playWithJava {
    public static void main(String[] args){

       // int month, day, year;
       // int anniversaryday, anniversarymonth;
        Date birthday = new Date (11, 12, 1987 );
        Date anniversary = new Date( 6, 19, 2015);

//        birthday.day = 11;
//        birthday.month =7;
//        birthday.year = 1989;
        birthday.setMonth(12);
        birthday.setDay(29);
        birthday.setYear(1989);
        System.out.println(anniversary);




    }
}



