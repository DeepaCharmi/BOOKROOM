package com.stm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book {
@Id
@Column(name="id")
private int id;
@Column(name="roomno")
private String roomno;
@Column(name="guestname")
private String gname;
@Column(name="mobileno")
private String mobno;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getRoomno() {
	return roomno;
}
public void setRoomno(String roomno) {
	this.roomno = roomno;
}
public String getGname() {
	return gname;
}
public void setGname(String gname) {
	this.gname = gname;
}
public String getMobno() {
	return mobno;
}
public void setMobno(String mobno) {
	this.mobno = mobno;
}


}
