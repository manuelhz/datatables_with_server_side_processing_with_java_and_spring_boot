package com.datatables.demo.config;

import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.datatables.demo.model.Customer;
import com.datatables.demo.service.CustomerService;
import com.opencsv.CSVReader;

@Component
public class SeedData implements CommandLineRunner {

    @Autowired
    CustomerService customerService;

    @Override
    public void run(String... args) throws Exception {

        // path of the csv file client.csv
        String file 
        = "/home/yoda/spring-boot-projects/blog/datatables_with_server_side_processing_with_java_and_spring_boot/demo_2/customers.csv";
        
        try {
            // create object of Filereader
            FileReader fileReader = new FileReader(file);

            // create csvReader object passing fileReader object
            CSVReader csvReader= new CSVReader(fileReader);
            String[] nextRecord;
            // readig each line of the csv
            while((nextRecord = csvReader.readNext()) != null) {
                for (String cell : nextRecord) {

                    // split each column into a separate index
                    String[] temArr = cell.split(";");

                    // create a new customer feeding it with an array
                    Customer customer = new Customer(temArr);
                    customerService.save(customer); 
                }
            }
            // closing the fileReader and the csvReader
            fileReader.close();
            csvReader.close();  
        } catch (Exception e) {
            e.printStackTrace();
        }
          
    }
    
}