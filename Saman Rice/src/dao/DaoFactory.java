package dao;

import dao.custom.Impl.DriverDAOImpl;
import dao.custom.Impl.VehicleDAOImpl;

public class DaoFactory {
    private static DaoFactory daoFactory;


    private DaoFactory() {
    }

    public static DaoFactory getInstance() {
        return (daoFactory == null) ?
                (daoFactory = new DaoFactory()) : (daoFactory);
    }

    public enum DAOType {
        VEHICLE, DRIVER
    }



    public <T> T getDao(DAOType type) {
        switch (type) {
            case DRIVER:
                return (T) new DriverDAOImpl();
            case VEHICLE:
                return (T) new VehicleDAOImpl();
            default:
                return null;
        }
    }
}
