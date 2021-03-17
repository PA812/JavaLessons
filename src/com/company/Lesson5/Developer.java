package com.company.Lesson5;

import java.util.Objects;

public class Developer {
    Long id;
    String name;
    String email;

    public Developer(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Developer)) return false;
        Developer developer = (Developer) o;
        return email.equals(developer.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }

    @Override
    public String toString() {
        return "Developer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
