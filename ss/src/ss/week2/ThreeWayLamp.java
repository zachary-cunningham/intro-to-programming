package ss.week2;
/**
 * ThreeWayLamp class, an object of this class will be able to choose the setting for their lamp and turn it off.
 */
public class ThreeWayLamp {

    private LampSetting setting;
    public ThreeWayLamp(){
        setting = LampSetting.OFF;
    }
    /**
     * Sets the lamp to the given setting.
     * @param set is the setting set by the user.
     */
    public void changeSetting(LampSetting set){
        setting = set;
    }

    /**
     * Returns the current setting of the lamp.
     * @return the current setting
     */
    public LampSetting getCurrentSetting(){
        return setting;
    }

    /**
     * Switches the setting of the current state of the lamp to next in the order mentioned
     */
    public void switchSetting(){
        switch (setting){
            case LampSetting.OFF:
                setting = LampSetting.LOW;
                break;
            case LampSetting.LOW:
                setting = LampSetting.MEDIUM;
                break;
            case LampSetting.MEDIUM:
                setting = LampSetting.HIGH;
                break;
                case LampSetting.HIGH:
                setting = LampSetting.OFF;
                break;
        }
    }

    /**
     * the enum identifies the four states of the lamp.
     */
    public enum LampSetting {
        OFF, LOW, MEDIUM, HIGH;
    }
}
