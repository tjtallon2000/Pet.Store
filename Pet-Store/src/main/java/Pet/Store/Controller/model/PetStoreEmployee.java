package Pet.Store.Controller.model;


import lombok.Data;
import lombok.NoArgsConstructor;
import Pet.Store.Entity.Employee;
import Pet.Store.Entity.PetStore;

@Data
@NoArgsConstructor
public class PetStoreEmployee {
	

	private Long employeeId;
	private String employeeFirstName;
	private String employeeLastName;
	private String employeePhone;
	private String employeeJobTitle;
	private EmployeePetStore petStore;
	
	public PetStoreEmployee (Employee employee) {
		employeeId = employee.getEmployeeId();
		employeeFirstName = employee.getEmployeeFirstName();
		employeeLastName = employee.getEmployeeLastName();
		employeePhone = employee.getEmployeePhone();
		employeeJobTitle = employee.getEmployeeJobTitle();
		petStore = new EmployeePetStore(employee.getPetStore());
	}
	
	@Data
	@NoArgsConstructor
	public static class EmployeePetStore {
		private Long petStoreId;
		private String petStoreName;
		private String petStoreAddress;
		private String petStoreCity;
		private String petStoreState;
		private String petStoreZip;
		private String petStorePhone;
		
		public EmployeePetStore(PetStore petStore) {
			petStoreId = petStore.getPetStoreId();
			petStoreName = petStore.getPetStoreName();
			petStoreAddress = petStore.getPetStoreAddress();
			petStoreCity = petStore.getPetStoreCity();
			petStoreState = petStore.getPetStoreState();
			petStoreZip = petStore.getPetStoreZip();
			petStorePhone = petStore.getPetStorePhone();
		}
	}

}
