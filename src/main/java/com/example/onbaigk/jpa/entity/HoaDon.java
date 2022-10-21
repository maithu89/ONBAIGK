package com.example.onbaigk.jpa.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Data
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="hoadons")
public class HoaDon implements Serializable {
    @Id
    @Column(name="mahd", columnDefinition = "char(10)")
    private String maHD;
    private int soLuong;
    private String nxb;
    private int donGia;
    private Date ngayLap;

    @OneToMany(mappedBy = "hoaDon", cascade =  CascadeType.ALL)
    private Collection<CTHoaDon> ctHoaDons = new ArrayList<>();
    public HoaDon(String maHD) {
        this.maHD = maHD;
    }
}
