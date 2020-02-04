package com.hanymichaels.backend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Component
public class DbPopulator implements CommandLineRunner {
    private ProductRepository productRepository;

    public DbPopulator(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    

    @Override
    public void run(String... strings) throws Exception {
        Product vcenter01 = new Product(
                "vCenter Cairo Datacenter",
                "vcenter",
                "vcenter01.core.hypervizor.com",
                "administrator@vsphere.local",
                "VMware1!",
                true, 
                new Date());

        Product nsxtmgr = new Product(
                "NSX-T Cairo Datacenter",
                "nsxt",
                "nsxtmgr.core.hypervizor.com",
                "admin",
                "VMware1!",
                true,
                new Date());
        
        Product pks = new Product(
                "Enterprise PKS",
                "entpks",
                "pks.core.hypervizor.com",
                "hany",
                "VMware1!",
                true,
                new Date());
        
        // Checking if the DB exists and have entries. If not, will populate with the demo data above.
        if (this.productRepository.count() > 0) {
        	System.out.println("[ AppLog ] ====> Found [" + this.productRepository.count() + "] entries in the databse.");
        } else {
        	System.out.println("[ AppLog ] ====> Did not find any entries in the Database. Populating it with demo entries.");
        	List<Product> products = Arrays.asList(vcenter01, nsxtmgr, pks);
        	this.productRepository.saveAll(products);
        }
    }
}