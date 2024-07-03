package com.example.vendor.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.vendor.controller.EmployeeVendorController;
import com.example.vendor.model.Vendor;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class VendorService {
//	@PersistenceContext(unitName = "sql")
//	private EntityManager em;
	
	
	
	
	public void saveVendor(Vendor vendor) {
		try {
			com.example.vendor.entities.Vendor vendor1 = new com.example.vendor.entities.Vendor();
			vendor1.setName(vendor.getName());
			vendor1.setEmail(vendor.getEmail());
			vendor1.setUpi(vendor.getUpi());
//			em.persist(vendor1);
//			em.flush();	
		}
		catch (Exception e) {
			log.error("Getting Error while saving vendors "+e.getMessage(),e);
		}
	}
	
	
	
	
	
	
//	public Collection<Vendor> getAllVendors() {
//	    	try {
//		        List<com.example.vendor.entities.Vendor> vendor = 
//		        		em.createQuery("from Vendor order by name asc")	
//	                .setHint("org.hibernate.readOnly", true)
//	                .getResultList();
//			        
//		        Collection<Vendor> vendordata = new ArrayList<>();
//		        for (com.example.vendor.entities.Vendor entityvendor : vendor) {
//		        	 Vendor dataVendor = new Vendor();
//		        	 dataVendor.setEmail(entityvendor.getEmail());
//		        	 dataVendor.setName(entityvendor.getName());
//		        	 dataVendor.setUpi(entityvendor.getUpi());
//		        	 vendordata.add(dataVendor);	
//		        }
//			} catch (Exception e) {
//				log.error("Error while fetching vendors ",e.getMessage(),e);
//			}
//
//	    }
	
	
	private static final List<Vendor> mockVendors = new ArrayList<>();

    static {
        mockVendors.add(new Vendor("Vendor 1", "vendor1@example.com","abc@ybl"));
        mockVendors.add(new Vendor("Vendor 2", "vendor2@example.com","def@ybl"));
        mockVendors.add(new Vendor("Vendor 3", "vendor3@example.com","fgh@ybl"));
        mockVendors.add(new Vendor("Vendor 4", "vendor4@example.com","ddd@ybl"));
        mockVendors.add(new Vendor("Vendor 5", "vendor5@example.com","dd@ybl"));
        mockVendors.add(new Vendor("Vendor 6", "vendor6@example.com","ffd@ybl"));
        mockVendors.add(new Vendor("Vendor 7", "vendor7@example.com","ddf@ybl"));
        mockVendors.add(new Vendor("Vendor 8", "vendor8@example.com","dd@ybl"));
        mockVendors.add(new Vendor("Vendor 9", "vendor9@example.com","df@ybl"));
    }

    // Method to return all vendors
    public Collection<Vendor> getAllVendors() {
        return mockVendors;
    }
	
	

}
