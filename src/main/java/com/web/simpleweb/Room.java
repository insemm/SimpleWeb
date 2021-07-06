package com.web.simpleweb;

import javax.persistence.*;

@Entity
@Table(name = "Room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private Integer roomNumber;

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

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Room() {
        super();
    }

    public Room(Integer id, String name, Integer roomNumber) {
        this.id = id;
        this.name = name;
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", roomNumber=" + roomNumber +
                '}';
    }

}
