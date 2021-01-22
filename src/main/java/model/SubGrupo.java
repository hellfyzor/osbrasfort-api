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
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.Lob;
//import javax.persistence.ManyToOne;
//import javax.persistence.NamedQueries;
//import javax.persistence.NamedQuery;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//
///**
// *
// * @author daniel.gonzalez
// */
//@Entity
//@Table(schema = "public", name = "sub_grupo")
//@Converter(name = "uuidConverter", converterClass = UUIDConverter.class)
//@NamedQueries({
//    @NamedQuery(name = "SubGrupo.findAll", query = "SELECT s FROM SubGrupo s"),
//    @NamedQuery(name = "SubGrupo.findByDescricao", query = "SELECT s FROM SubGrupo s WHERE s.descricao = :descricao")})
//public class SubGrupo implements Serializable {
//
//    private static final long serialVersionUID = 1L;
//    @Id
//    @Column(name = "id")
//    @Convert("uuidConverter")
//    private UUID id = UUID.randomUUID();
//    @Basic(optional = false)
//    @Column(name = "descricao")
//    private String descricao;
//    @OneToMany(mappedBy = "idSubGrupo", fetch = FetchType.LAZY)
//    private Collection<Produtos> produtosCollection;
//    @JoinColumn(name = "id_grupo", referencedColumnName = "id")
//    @ManyToOne(optional = false, fetch = FetchType.LAZY)
//    private Grupo idGrupo;
//
//    public SubGrupo() {
//    }
//
//    public SubGrupo(UUID id) {
//        this.id = id;
//    }
//
//    public SubGrupo(UUID id, String descricao) {
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
//    public Grupo getIdGrupo() {
//        return idGrupo;
//    }
//
//    public void setIdGrupo(Grupo idGrupo) {
//        this.idGrupo = idGrupo;
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
//        if (!(object instanceof SubGrupo)) {
//            return false;
//        }
//        SubGrupo other = (SubGrupo) object;
//        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "com.brasfort.osbrasfort.model.SubGrupo[ id=" + id + " ]";
//    }
//
//}
