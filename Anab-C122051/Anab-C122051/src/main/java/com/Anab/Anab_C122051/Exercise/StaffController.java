package com.Anab.Anab_C122051.Exercise;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/staffs")
public class StaffController {
    private final StaffService staffService;

    public StaffController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping({"/all"})
    public List<Staff> getAllStaffs() {
        return this.staffService.getAllStaffs();
    }

    @GetMapping({"/{id}"})
    public ResponseEntity<Staff> getStaff(@PathVariable Long id) {
        return (ResponseEntity)this.staffService.getStaffById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping({"/insert"})
    public ResponseEntity<Staff> createStaff(@RequestBody Staff staff) {
        Staff created = this.staffService.createStaff(staff);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping({"/{id}"})
    public ResponseEntity<Staff> updateStaff(@PathVariable Long id, @RequestBody Staff staff) {
        return (ResponseEntity)this.staffService.updateStaff(id, staff).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping({"/{id}"})
    public ResponseEntity<Void> deleteStaff(@PathVariable Long id) {
        return this.staffService.deleteStaff(id) ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }


}
