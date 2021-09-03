package bo.custom;

import dto.DriverDTO;
import dto.VehicleDTO;

import java.util.ArrayList;

public interface VehicleBO {
    void saveVehicle(VehicleDTO dto)throws Exception;
    void updateVehicle(VehicleDTO dto)throws Exception;
    void deleteVehicle(String id)throws Exception;
    void getVehicle(String id)throws Exception;
    ArrayList<VehicleDTO> getAllAdmins()throws Exception;
}
