package com.dbstore.storemanagement;

import com.dbstore.storemanagement.entity.StoreInformation;
import com.dbstore.storemanagement.repository.StoreInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreManagementApplication implements CommandLineRunner {
    @Autowired
    StoreInformationRepository storeInformationRepository;

    public static void main(String[] args) {
        SpringApplication.run(StoreManagementApplication.class, args);
    }

    @Override
    public void run(String... args) {
        StoreInformation storeInformationOne = new StoreInformation("Hardware",
                "All hardware accessories", "078443273");

        StoreInformation storeInformationTwo = new StoreInformation("LG Center",
                "All TVs in all sizes", "0700789325");
        StoreInformation storeInformationThree = new StoreInformation("Mac PC",
                "We hava both laptops and desktops", "078003273");
        StoreInformation storeInformationFour = new StoreInformation("Videography",
                "All cameras are available in our store ", "078673273");
        StoreInformation storeInformationFive = new StoreInformation("Excitations",
                "All cables are available in our store ", "070673273");
        StoreInformation storeInformationSix = new StoreInformation("Videos",
                "All cds are available in our store ", "078673277");
        StoreInformation storeInformationEight = new StoreInformation("Google",
                "All updated information are found on google", "1234515273");
        StoreInformation storeInformationNine = new StoreInformation("Hp computers",
                "All specifications", "123456789034");

        storeInformationRepository.save(storeInformationOne);
        storeInformationRepository.save(storeInformationTwo);
        storeInformationRepository.save(storeInformationThree);
        storeInformationRepository.save(storeInformationFour);
        storeInformationRepository.save(storeInformationFive);
        storeInformationRepository.save(storeInformationSix);
        storeInformationRepository.save(storeInformationEight);
        storeInformationRepository.save(storeInformationNine);

        storeInformationRepository.findByStoreName("hardware").forEach(val -> System.out.println(val));

        storeInformationRepository.findByStoreDetails("LG Center").forEach(val -> System.out.println(val));

        storeInformationRepository.findByStorePhoneNumber("078003273").forEach(val -> System.out.println(val));

        storeInformationRepository.findByStoreName("Videography").forEach(val -> System.out.println(val));

        storeInformationRepository.findById(2).ifPresent(val -> System.out.println());

        System.out.println(storeInformationRepository.count());

        storeInformationRepository.deleteById(7);




    }


}
