package com.ace.project.UserInfoPortal.model;

import java.util.Base64;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_info")
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "password")
    private String password;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "project_link")
    private String projectLink;
    
    @Column(name = "description")
    private String description;
    
    @Lob
    @Column(name = "photo")
    private byte[] photo;

    public UserInfo(Integer id, String name, String password, String email, String projectLink, String description,
			byte[] photo) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.projectLink = projectLink;
		this.description = description;
		this.photo = photo;
	}

	public UserInfo() {}

    public UserInfo(String name, String password, String email, String projectLink, String description, byte[] photoBytes) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.projectLink = projectLink;
        this.description = description;
        this.photo = photoBytes;
    }
    

    // Getters and setters...

    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProjectLink() {
		return projectLink;
	}

	public void setProjectLink(String projectLink) {
		this.projectLink = projectLink;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public String getBase64Photo() {
        return Base64.getEncoder().encodeToString(this.photo);
    }

    @Override
    public String toString() {
        return "UserInfo [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + ", projectLink=" + projectLink + ", description=" + description + "]";
    }
}