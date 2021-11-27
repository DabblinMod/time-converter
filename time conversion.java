public class TimeConvert{

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
        String substr=s.substring(0, 2);
        int hour=Integer.parseInt(substr);
        String twentyFourFormat="";
         int len=s.length();
        if(s.contains("AM") && hour==12){
            twentyFourFormat+="00";
            twentyFourFormat+=s.substring(2, len-2);
        }
        else if(s.contains("PM") && hour != 12){//if it is past 12, you get 24 hr form
            twentyFourFormat=String.valueOf(hour+12);
            twentyFourFormat+=s.substring(2, len-2);
        }
        else{
            twentyFourFormat=s.substring(0, len-2);
        }
       
        System.out.println("Original hour: " +substr);
        System.out.println("24 hour format: "+hour);
        System.out.println("24 hour time format: "+twentyFourFormat);
        return twentyFourFormat;
    }
}
