package testCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.project.entity.Parts;
import com.project.services.PartService;

class PartsTest {

	@Test
	public void addPart() {
	PartService.addParts();
	}

	@Test
	public void getAllParts() {
		PartService.getAllParts();
	}
	
	@Test
	public void updateParts() {
		PartService.updateParts();
	}
	@Test
	public void deleteParts() {
		PartService.deleteParts();
	}
}
