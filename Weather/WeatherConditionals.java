
/**
 * Write a description of class WeatherConditionals here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WeatherConditionals
{
  public static String getWeatherAdvice(int temperature, String description){
      boolean windy = false;
      boolean snow = false;
      boolean sunny = false;
      if (description.equals("windy"))
        windy = true;
        if (description.equals("snow"))
            snow = true;
      if (temperature <= 32)
        if (windy || snow)
            return "Too windy or cold! Enjoy watching the weather through the window.";
      if (description.equals("sunny"))
        sunny = true;
      if (temperature > 32 && temperature < 100)
        if (sunny || snow)
            return "It's safe to go outside, " + temperature + " and " + description + ".";
      if (temperature >= 100)
        if (snow)
            return "Nani? You high or something bruh? It can't be that hot and snowing.";      
      return "end";
    }
    
  public static String getHikingAdvice(int temperature,
        int windchill, int humidity, String description){
            boolean showers = false;
            boolean fair = false;
            boolean snow = false;
            
            if (description.equals("showers"))
                showers = true;
            if (description.equals("fair"))
                fair = true;
            if (description.equals("snow"))
                snow = true;
                
                
            if (temperature <= 32)
                if (showers || snow)
                    return "It's cold outside and there is " + description + "! With " + humidity + "% humidity.";
                else 
                    return "It's cold outside at " + temperature + " but it is fair with " + humidity + "% humidity.";
            if (temperature >= 32)
                return "It's not too bad outside at " + temperature + " and " + description + " with " + humidity + "% humidity.";
            if (temperature > 70)
                return "It's pretty warm outside, at" + temperature + " and " + description + " with "  + humidity + "% humidity.";
            return "end 2";
  }
}
