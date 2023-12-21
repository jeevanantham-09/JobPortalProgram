package com.JobPortalProgram.Dto;

public class userdto {
    public String username;
    public String dob;
    public String email;
    public String phone;
    public String address;
    public String Education;
    public String preferred_role;
    public String preferred_salary;
    public String job_type;
    public String skills;
    public String profile_summary;
    public String  projects;
    public String languages;

    public userdto(String username, String dob, String email, String phone, String address, String education, String preferred_role, String preferred_salary, String job_type, String skills, String profile_summary, String projects, String languages) {
        this.username = username;
        this.dob = dob;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.Education = education;
        this.preferred_role = preferred_role;
        this.preferred_salary = preferred_salary;
        this.job_type = job_type;
        this.skills = skills;
        this.profile_summary = profile_summary;
        this.projects = projects;
        this.languages = languages;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String education) {
        Education = education;
    }

    public String getPreferred_role() {
        return preferred_role;
    }

    public void setPreferred_role(String preferred_role) {
        this.preferred_role = preferred_role;
    }

    public String getPreferred_salary() {
        return preferred_salary;
    }

    public void setPreferred_salary(String preferred_salary) {
        this.preferred_salary = preferred_salary;
    }

    public String getJob_type() {
        return job_type;
    }

    public void setJob_type(String job_type) {
        this.job_type = job_type;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getProfile_summary() {
        return profile_summary;
    }

    public void setProfile_summary(String profile_summary) {
        this.profile_summary = profile_summary;
    }

    public String getProjects() {
        return projects;
    }

    public void setProjects(String projects) {
        this.projects = projects;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }
}
