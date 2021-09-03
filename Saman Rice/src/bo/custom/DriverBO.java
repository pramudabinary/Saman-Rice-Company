package bo.custom;

import dto.DriverDTO;

import java.util.ArrayList;

public interface DriverBO {
    void saveDriver(DriverDTO dto)throws Exception;
    void updateDriver(DriverDTO dto)throws Exception;
    void deleteDriver(String id)throws Exception;
    void getDriver(String id)throws Exception;
    ArrayList<DriverDTO> getAllAdmins()throws Exception;
}
