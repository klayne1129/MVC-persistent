package org.launchcode.javawebdevtechjobspersistent.models;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {


    @NotNull(message = "location is required")
    @Size(min = 3, max = 50, message = "Location must be between 2 and 150 characters")
    private String location;

    @OneToMany
    @JoinColumn
    private List<Job> jobs = new ArrayList<>();

    public Employer(@NotBlank(message = "location is required") @Size(min = 3, max = 50, message = "Location must be between 3 and 150 characters") String location) {
        this.location = location;
    }

    public Employer() {
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
