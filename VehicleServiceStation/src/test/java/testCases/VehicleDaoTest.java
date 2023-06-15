package testCases;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.project.dao.VehicleDao;
import com.project.entity.Vehicle;

public class VehicleDaoTest {
	@Test
	public void testAdd() {
		VehicleDao vehicleDao;
		try {
			vehicleDao=new VehicleDao();
			vehicleDao.addVehicle(new Vehicle("DUKE", "KTM"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void testGetAllVehicles() {
		VehicleDao vehicleDao;
		try {
			vehicleDao =new VehicleDao();
			List<Vehicle>vehicleList=new ArrayList<>();
			vehicleDao.getAllVehicle(vehicleList);
			vehicleList.forEach(System.out::println);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
