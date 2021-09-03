package dao.custom.Impl;

import dao.custom.DriverDAO;
import entity.Driver;

import java.util.List;

public class DriverDAOImpl implements DriverDAO {
    @Override
    public boolean save(Driver driver) throws Exception {
        return false;
    }

    @Override
    public boolean update(Driver driver) throws Exception {
        return false;
    }

    @Override
    public boolean delete(String s) throws Exception {
        return false;
    }

    @Override
    public Driver get(String s) throws Exception {
        return null;
    }

    @Override
    public List<Driver> getAll() throws Exception {
        return null;
    }
}
