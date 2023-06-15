package testCases;

import java.sql.SQLException;

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

}
