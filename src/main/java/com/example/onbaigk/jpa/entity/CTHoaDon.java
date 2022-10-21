package com.example.onbaigk.jpa.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Getter
@Setter
@Table(name ="cthoadons")
public class CTHoaDon {
    @EmbeddedId
    private CTHoaDon_PK id = new CTHoaDon_PK();

    @ManyToOne
    @MapsId("maSP")
    @JoinColumn(name="maSP", columnDefinition = "char(10)")
    private SanPham sanPham = new SanPham(getSanPham().getMaSP());


    @ManyToOne
    @MapsId("maHD")
    @JoinColumn(name="maHD", columnDefinition = "char(10)")
    private HoaDon hoaDon = new HoaDon(getHoaDon().getMaHD());
}
