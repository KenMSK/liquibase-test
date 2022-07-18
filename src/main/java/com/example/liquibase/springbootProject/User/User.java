package com.example.liquibase.springbootProject.User;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  private String remarks;

  public User() {
  }

  public User(Long id, String name, String username) {
    this.id = id;
    this.name = name;
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getRemark() {
    return this.remarks;
  }

  public void setRemark(String Remark) {
    this.remarks = Remark;
  }

}
