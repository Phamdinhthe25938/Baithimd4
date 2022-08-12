package com.example.baithimd4.service;

import com.example.baithimd4.model.Staff;

import java.util.List;

public interface IStaffService {

    List<Staff> staffs();

    void save(Staff staff);

    void  update(Staff staff);

    void delete(int codeStaff);

    Staff staff(int idStaff);

}
