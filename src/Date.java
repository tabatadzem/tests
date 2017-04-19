/**
 * Created by Maestro on 18.04.2017.
 */
   public class Date {
   private int month,  day, year;
   public Date (int m, int d, int y){

       month = m;
       day = d;
       year = y;
   }


   public int getMonth () {
      return month;
   }
   public int getDay (){
       return day;

}
    public int getYear() {
    return year;

}
    public void setMonth(int m) {
       if ((m >= 1) && (m <= 12)){
        month = m;
       }
    }
    public void setDay(int d){
    if (d >= 1 && d<=31 ){
        day = d;
    }

    }
    public void setYear(int y) {
       year = y;

    }
    public String toString (){
        String result;
        result = month + "/" + day + "/" +year;
        return result;

    }

}
