package com.example.demo.model;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity

@Table(name = "TouristDetails1")

public class model {

@Id

private int sno;
private String places;
private String state;
private float ratings;

public int getSno() {
return sno;

}

public void setSno(int sno) {

this.sno = sno;

}

public String getPlaces() {

return places;

}

public void setPlaces(String places) {

this.places = places;

}

public String getState() {

return state;

}

public void setState(String state) {

this.state = state;

}

public float getRatings() {

return ratings;

}

public void setRatings(float ratings) {

this.ratings = ratings;

}

public model() {


}


public model(int sno, String places, String state, float ratings) {

super();

this.sno = sno;

this.places = places;

this.state = state;

this.ratings = ratings;

}

public String toString() {

return "sno="+sno+"places="+places+"state="+state+"ratings="+ratings;

}

}