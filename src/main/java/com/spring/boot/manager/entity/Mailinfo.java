package com.spring.boot.manager.entity;

import javax.persistence.*;

@Entity
public class Mailinfo{
        private static final long serialVersionUID = 1L;

        @Id
        @Column(name = "id", nullable = false)
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        @Basic
        @Column(name = "firstname")
        private String firstname;
        @Basic
        @Column(name = "lastname")
        private String lastname;
        @Basic
        @Column(name = "email")
        private String email;
        @Basic
        @Column(name = "country")
        private String country;
        @Basic
        @Column(name = "state")
        private String state;
        @Basic
        @Column(name = "city")
        private String city;
        @Basic
        @Column(name = "address")
        private String address;
        @Basic
        @Column(name = "zip")
        private String zip;
        @Basic
        @Column(name = "phone")
        private String phone;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getZip() {
            return zip;
        }

        public void setZip(String zip) {
            this.zip = zip;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }
}
