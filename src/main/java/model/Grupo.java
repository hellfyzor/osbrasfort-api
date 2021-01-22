///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package model;
//
//import converter.UUIDConverter;
//import org.eclipse.persistence.annotations.Convert;
//import org.eclipse.persistence.annotations.Converter;
//
//import java.io.Serializable;
//import java.util.Collection;
//import java.util.UUID;
//import javax.persistence.Basic;
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.Id;
//import javax.persistence.Lob;
//import javax.persistence.NamedQueries;
//import javax.persistence.NamedQuery;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
///**
// *
// * @author daniel.gonzalez
// */
//@Entity
//@Table(schema = "public", name = "grupo")
//@Converter(name = "uuidConverter", converterClass = UUIDConverter.class)
//@NamedQueries({
//    @NamedQuery(name = "Grupo.findAll", query = "SELECT g FROM Grupo g"),
//    @NamedQuery(name = "Grupo.findByDescricao", query = "SELECT g FROM Grupo g WHERE g.descricao = :descricao")})
//public class Grupo implements Serializable {
//
//    private static final long serialVersionUID = 1L;
//    @Id
//    @Column(name = "id")
//    @Convert("uuidConverter")
//    private UUID id = UUID.randomUUID();
//    @Basic(optional = false)
//    @Column(name = "descricao")
//    private String descricao;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idGrupo", fetch = FetchType.LAZY)
//    private Collection<Produtos> produtosCollection;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idGrupo", fetch = FetchType.LAZY)
//    private Collection<SubGrupo> subGrupoCollection;
//
//    public Grupo() {
//    }
//
//    public Grupo(UUID id) {
//        this.id = id;
//    }
//
//    public Grupo(UUID id, String descricao) {
//        this.id = id;
//        this.descricao = descricao;
//    }
//
//    public UUID getId() {
//        return id;
//    }
//
//    public void setId(UUID id) {
//        this.id = id;
//    }
//
//    public String getDescricao() {
//        return descricao;
//    }
//
//    public void setDescricao(String descricao) {
//        this.descricao = descricao;
//    }
//
//    public Collection<Produtos> getProdutosCollection() {
//        return produtosCollection;
//    }
//
//    public void setProdutosCollection(Collection<Produtos> produtosCollection) {
//        this.produtosCollection = produtosCollection;
//    }
//
//    public Collection<SubGrupo> getSubGrupoCollection() {
//        return subGrupoCollection;
//    }
//
//    public void setSubGrupoCollection(Collection<SubGrupo> subGrupoCollection) {
//        this.subGrupoCollection = subGrupoCollection;
//    }
//
//    @Override
//    public int hashCode() {
//        int hash = 0;
//        hash += (id != null ? id.hashCode() : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof Grupo)) {
//            return false;
//        }
//        Grupo other = (Grupo) object;
//        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "com.brasfort.osbrasfort.model.Grupo[ id=" + id + " ]";
//    }
//
//}
