package dev.dxmingues.RegisterDevs.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "tb_developers")
public class DeveloperEntity {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID developerId;
    private String name;
    private String roleTitle;
    private String stack;
    private boolean isWorking;
    private String companyName;
    private int yearsExperience;
    private String githubProfileLink;
    private String linkedInProfileLink;

    public DeveloperEntity() {
    }

    public DeveloperEntity(UUID developerId, String name, String roleTitle, String stack, boolean isWorking, String companyName, int yearsExperience, String githubProfileLink, String linkedInProfileLink) {
        this.developerId = developerId;
        this.name = name;
        this.roleTitle = roleTitle;
        this.stack = stack;
        this.isWorking = isWorking;
        this.companyName = companyName;
        this.yearsExperience = yearsExperience;
        this.githubProfileLink = githubProfileLink;
        this.linkedInProfileLink = linkedInProfileLink;
    }

    public UUID getDeveloperId() {
        return developerId;
    }

    public void setDeveloperId(UUID developerId) {
        this.developerId = developerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoleTitle() {
        return roleTitle;
    }

    public void setRoleTitle(String roleTitle) {
        this.roleTitle = roleTitle;
    }

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getYearsExperience() {
        return yearsExperience;
    }

    public void setYearsExperience(int yearsExperience) {
        this.yearsExperience = yearsExperience;
    }

    public String getGithubProfileLink() {
        return githubProfileLink;
    }

    public void setGithubProfileLink(String githubProfileLink) {
        this.githubProfileLink = githubProfileLink;
    }

    public String getLinkedInProfileLink() {
        return linkedInProfileLink;
    }

    public void setLinkedInProfileLink(String linkedInProfileLink) {
        this.linkedInProfileLink = linkedInProfileLink;
    }
}
