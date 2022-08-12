package com.example.baithimd4.service.impl;

import com.example.baithimd4.model.Staff;
import com.example.baithimd4.repository.StaffRepo;
import com.example.baithimd4.service.IStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService implements IStaffService {
    @Autowired
    StaffRepo staffRepo;

    @Override
    public List<Staff> staffs() {
        return (List<Staff>) staffRepo.findAll();
    }

    @Override
    public void save(Staff staff) {
        staffRepo.save(staff);
    }

    @Override
    public void update(Staff staff) {
        staffRepo.save(staff);
    }

    @Override
    public void delete(int codeStaff) {
           staffRepo.deleteById(codeStaff);
    }

    @Override
    public Staff staff(int idStaff) {
        return staffRepo.findById(idStaff).get();
    }
}
