/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lucy
 */
@Entity
@Table(name = "ventacarros")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ventacarros.findAll", query = "SELECT v FROM Ventacarros v")
    , @NamedQuery(name = "Ventacarros.findByCarroId", query = "SELECT v FROM Ventacarros v WHERE v.carroId = :carroId")
    , @NamedQuery(name = "Ventacarros.findByModelo", query = "SELECT v FROM Ventacarros v WHERE v.modelo = :modelo")
    , @NamedQuery(name = "Ventacarros.findByMarca", query = "SELECT v FROM Ventacarros v WHERE v.marca = :marca")
    , @NamedQuery(name = "Ventacarros.findByKilometraje", query = "SELECT v FROM Ventacarros v WHERE v.kilometraje = :kilometraje")
    , @NamedQuery(name = "Ventacarros.findByPrecio", query = "SELECT v FROM Ventacarros v WHERE v.precio = :precio")
    , @NamedQuery(name = "Ventacarros.findByStatus", query = "SELECT v FROM Ventacarros v WHERE v.status = :status")})
public class Ventacarros implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "carro_id")
    private Integer carroId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "modelo")
    private String modelo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "marca")
    private String marca;
    @Basic(optional = false)
    @NotNull
    @Column(name = "kilometraje")
    private int kilometraje;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio")
    private int precio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "status")
    private String status;

    public Ventacarros() {
    }

    public Ventacarros(Integer carroId) {
        this.carroId = carroId;
    }

    public Ventacarros(Integer carroId, String modelo, String marca, int kilometraje, int precio, String status) {
        this.carroId = carroId;
        this.modelo = modelo;
        this.marca = marca;
        this.kilometraje = kilometraje;
        this.precio = precio;
        this.status = status;
    }

    public Integer getCarroId() {
        return carroId;
    }

    public void setCarroId(Integer carroId) {
        this.carroId = carroId;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (carroId != null ? carroId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ventacarros)) {
            return false;
        }
        Ventacarros other = (Ventacarros) object;
        if ((this.carroId == null && other.carroId != null) || (this.carroId != null && !this.carroId.equals(other.carroId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Ventacarros[ carroId=" + carroId + " ]";
    }
    
}
