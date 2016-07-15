package vn.com.mr.duyhung.fooballnews.config;

/**
 * Created by Mr.Bean on 10-Jul-16.
 */
public class WebServiceConfig {
    public static String DONAME_WEB = "https://sportnews.firebaseio.com";
    public static String API_TOURNAMENTS = DONAME_WEB + "/football";
    public static String API_PREMIMERLEAGUE = API_TOURNAMENTS + "/0/premierLeague";
    public static String API_BUNDESLIGA = API_TOURNAMENTS + "/1/bundesliga";
    public static String API_LALIGA = API_TOURNAMENTS + "/2/LaLiga";
    public static String API_SERIEA = API_TOURNAMENTS + "/3/serieA";
    public static String API_JLEAGUE = API_TOURNAMENTS + "/4/jLeague";
    public static String API_LIGUE1 = API_TOURNAMENTS + "/5/Ligue1";
    public static String API_CHAMPION_HISTORY = API_TOURNAMENTS + "/6/championHistory";
    public static String API_TEAMS = API_TOURNAMENTS + "/7/Teams";
    public static String API_PLAYER = API_TOURNAMENTS + "/8/Player";
}
