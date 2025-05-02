package com.Anab.Anab_C122051.Exercise;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@Service
public class StaffService {
    private final Map<Long, Staff> staffMap = new HashMap();
    private long idCounter = 1L;

    public StaffService() {
    }

    public Staff createStaff(Staff staff) {
        staff.setId(Long.valueOf((long)(this.idCounter++)));
        this.staffMap.put(staff.getId(), staff);
        return staff;
    }

    public List<Staff> getAllStaffs() {
        return new ArrayList(this.staffMap.values());
    }

    public Optional<Staff> getStaffById(Long id) {
        return Optional.ofNullable((Staff)this.staffMap.get(id));
    }

    public Optional<Staff> updateStaff(Long id, Staff updatedStaff) {
        if (this.staffMap.containsKey(id)) {
            updatedStaff.setId(id);
            this.staffMap.put(id, updatedStaff);
            return Optional.of(updatedStaff);
        } else {
            return Optional.empty();
        }
    }

    public boolean deleteStaff(Long id) {
        return this.staffMap.remove(id) != null;
    }

}
