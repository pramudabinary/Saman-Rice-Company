package dao.custom.Impl;

import dao.custom.VehicleDAO;
import entity.Vehicle;

import java.util.List;

public class VehicleDAOImpl implements VehicleDAO {
    @Override
    public boolean save(Vehicle vehicle) throws Exception {
        return false;
    }

    @Override
    public boolean update(Vehicle vehicle) throws Exception {
        return false;
    }

    @Override
    public boolean delete(String s) throws Exception {
        return false;
    }

    @Override
    public Vehicle get(String s) throws Exception {
        return null;
    }

    @Override
    public List<Vehicle> getAll() throws Exception {
        return null;
    }
}
