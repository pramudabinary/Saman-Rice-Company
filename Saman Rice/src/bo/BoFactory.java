package bo;

import bo.custom.Impl.DriverBOImpl;
import bo.custom.Impl.VehicleBOImpl;

public class BoFactory {
    private static BoFactory boFactory;

    private BoFactory() {
    }

    public static BoFactory getInstance() {
        return (boFactory == null) ?
                (boFactory = new BoFactory()) : (boFactory);
    }
    public enum BOType {
        DRIVER, VEHICLE
    }

    public <T> T getBo(BOType type) {
        switch (type) {
            case DRIVER:
                return (T) new DriverBOImpl();
            case VEHICLE:
                return (T) new VehicleBOImpl();
            default:
                return null;
        }
    }
}
