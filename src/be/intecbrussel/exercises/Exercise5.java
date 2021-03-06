package be.intecbrussel.exercises;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class Exercise5 {
    public static void main(String[] args) {
        ZoneId currentPlace = ZoneId.of("Europe/Brussels");
        ZonedDateTime currentPlaceTime = ZonedDateTime.now(currentPlace);
        System.out.println("Current place: " + currentPlaceTime);

        ZoneId londonZone = ZoneId.of("Europe/London");
        ZonedDateTime londonZoneTime = ZonedDateTime.now(londonZone);
        System.out.println(londonZoneTime);

        ZoneId timezone = ZoneId.of("UTC-4");
        ZonedDateTime timezoneTime = ZonedDateTime.now(timezone);
        System.out.println("UTC-4 " + timezoneTime);
    }
}
