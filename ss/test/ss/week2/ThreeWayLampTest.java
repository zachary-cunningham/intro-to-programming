package ss.week2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ThreeWayLampTest {

    private ThreeWayLamp lamp;

    @BeforeEach
    public void setUp(){
        lamp = new ThreeWayLamp();
    }

    @Test
    void isOff(){
        Assertions.assertEquals(ThreeWayLamp.LampSetting.OFF, lamp.getCurrentSetting());
    }

    @Test
    void switches(){
        lamp.switchSetting();
        Assertions.assertEquals(ThreeWayLamp.LampSetting.LOW, lamp.getCurrentSetting());
        lamp.switchSetting();
        Assertions.assertEquals(ThreeWayLamp.LampSetting.MEDIUM, lamp.getCurrentSetting());
        lamp.switchSetting();
        Assertions.assertEquals(ThreeWayLamp.LampSetting.HIGH, lamp.getCurrentSetting());
        lamp.switchSetting();
        Assertions.assertEquals(ThreeWayLamp.LampSetting.OFF, lamp.getCurrentSetting());

    }

    @Test
    void setTest(){
        lamp.changeSetting(ThreeWayLamp.LampSetting.LOW);
        Assertions.assertEquals(ThreeWayLamp.LampSetting.LOW, lamp.getCurrentSetting());
        lamp.changeSetting(ThreeWayLamp.LampSetting.MEDIUM);
        Assertions.assertEquals(ThreeWayLamp.LampSetting.MEDIUM, lamp.getCurrentSetting());
        lamp.changeSetting(ThreeWayLamp.LampSetting.HIGH);
        Assertions.assertEquals(ThreeWayLamp.LampSetting.HIGH, lamp.getCurrentSetting());
        lamp.changeSetting(ThreeWayLamp.LampSetting.OFF);
        Assertions.assertEquals(ThreeWayLamp.LampSetting.OFF, lamp.getCurrentSetting());


    }


}
