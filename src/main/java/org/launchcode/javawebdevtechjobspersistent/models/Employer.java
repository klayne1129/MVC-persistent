package org.launchcode.javawebdevtechjobspersistent.models;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
@Entity
public class Employer extends AbstractEntity {

    @ManyToOne
    @NotBlank(message = "location is required")
    @Size(min = 3, max = 50, message = "Location must be between 3 and 150 characters")
    private String location;

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
