package ss.week2;

/**
 * ThreeWayLamp class, the user will be able to make a lamp object and choose the setting for it.
 */
public class ThreeWayLamp {

    private LampSetting setting;

    /**
     * Method is called when a user constructs a ThreeWayLamp object, and the setting is automatically set to off.
     */
    public ThreeWayLamp() {
        setting = LampSetting.OFF;
    }

    /**
     * Sets the lamp to the given setting.
     *
     * @param set is the setting set by the user.
     */
    public void changeSetting(LampSetting set) {
        setting = set;
    }

    /**
     * Returns the current setting of the lamp.
     *
     * @return the current setting
     */
    public LampSetting getCurrentSetting() {
        return setting;
    }

    /**
     * Switches the setting of the current state of the lamp to next in the order, off → low → medium → high → off
     */
    public void switchSetting() {
        switch (setting) {
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
            default:
                throw new IllegalStateException("Unexpected value: " + setting);
        }
    }

    /**
     * the enum identifies the four states of the lamp.
     */
    public enum LampSetting {
        OFF, LOW, MEDIUM, HIGH;
    }
}
