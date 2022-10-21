package com.example.onbaigk.jpa.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;


@Data
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="sanphams")
public class SanPham implements Serializable {
    @Id
    @Column(name="masp", columnDefinition = "char(10)")
    private String maSP;
    private String tenSP;
    private String nxb;
    private int giaTien;

    @OneToMany(mappedBy = "sanPham", cascade =  CascadeType.ALL)
    private Collection<CTHoaDon> ctHoaDons = new ArrayList<>();
    public SanPham(String maSP) {
        this.maSP = maSP;
    }
}
