package com.example.baithimd4.controller;

import com.example.baithimd4.model.Staff;
import com.example.baithimd4.service.impl.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/staff")
@CrossOrigin("*")
@RestController
public class ApiStaff {
    @Autowired
    StaffService staffService;

    @GetMapping("/staffs")
    public List<Staff> staffList(){
      return   staffService.staffs();
    }
    @PostMapping("/addStaff")
    public void  save(@RequestBody Staff staff){
        staffService.save(staff);
    }
    @GetMapping("findStaff/{idStaff}")
    public Staff staff(@PathVariable int idStaff){
       return staffService.staff(idStaff);
    }
    @PutMapping("/updateStaff")
    public void update(Staff staff){
        staffService.update(staff);
    }
    @DeleteMapping("/deleteStaff/{idStaff}")
    public void delete(@PathVariable int idStaff){
        staffService.delete(idStaff);
    }
}
