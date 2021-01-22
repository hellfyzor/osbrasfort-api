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
//import javax.persistence.*;
//import java.io.Serializable;
//import java.util.UUID;
//
///**
// *
// * @author daniel.gonzalez
// */
//@Entity
//@Table(schema = "public", name = "modelo_de_camera")
//@Converter(name = "uuidConverter", converterClass = UUIDConverter.class)
////@NamedQueries({
////        @NamedQuery(name = "Produtos.findAll", query = "SELECT p FROM Produtos p"),
////        @NamedQuery(name = "Produtos.findByDescricao", query = "SELECT p FROM Produtos p WHERE p.descricao = :descricao"),
////        @NamedQuery(name = "Produtos.findByModelo", query = "SELECT p FROM Produtos p WHERE p.modelo = :modelo"),
////        @NamedQuery(name = "Produtos.findByIndiceProtecao", query = "SELECT p FROM Produtos p WHERE p.indiceProtecao = :indiceProtecao"),
////        @NamedQuery(name = "Produtos.findByCodec", query = "SELECT p FROM Produtos p WHERE p.codec = :codec"),
////        @NamedQuery(name = "Produtos.findByAnguloLente", query = "SELECT p FROM Produtos p WHERE p.anguloLente = :anguloLente"),
////        @NamedQuery(name = "Produtos.findByAlcanceInfravermelho", query = "SELECT p FROM Produtos p WHERE p.alcanceInfravermelho = :alcanceInfravermelho"),
////        @NamedQuery(name = "Produtos.findByResolucao", query = "SELECT p FROM Produtos p WHERE p.resolucao = :resolucao"),
////        @NamedQuery(name = "Produtos.findByTamanhoArmazenamento", query = "SELECT p FROM Produtos p WHERE p.tamanhoArmazenamento = :tamanhoArmazenamento"),
////        @NamedQuery(name = "Produtos.findByVoltagem", query = "SELECT p FROM Produtos p WHERE p.voltagem = :voltagem")})
//public class Produtos implements Serializable {
//
//    private static final long serialVersionUID = 1L;
//    @Id
//    @Column(name = "id")
//    @Convert("uuidConverter")
//    private UUID id;
//    @Basic(optional = false)
//    @Column(name = "nome")
//    private String nome;
//    @Column(name = "modelo")
//    private String modelo;
//    @Column(name = "indice_protecao")
//    private String indiceProtecao;
//    @Column(name = "codec")
//    private String codec;
//    @Column(name = "angulo_lente")
//    private String anguloLente;
//    @Column(name = "alcance_infravermelho")
//    private String alcanceInfravermelho;
//    @Column(name = "resolucao")
//    private String resolucao;
//    @Column(name = "tamanho_armazenamento")
//    private String tamanhoArmazenamento;
//    @Column(name = "voltagem")
//    private String voltagem;
//    public Produtos() {
//    }
//
//    public Produtos(UUID id) {
//        this.id = id;
//    }
//
//    public Produtos(UUID id, String nome) {
//        this.id = id;
//        this.nome = nome;
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
//    public String getNome() {
//        return nome;
//    }
//
//    public void setDescricao(String descricao) {
//        this.descricao = descricao;
//    }
//
//    public String getModelo() {
//        return modelo;
//    }
//
//    public void setModelo(String modelo) {
//        this.modelo = modelo;
//    }
//
//    public String getIndiceProtecao() {
//        return indiceProtecao;
//    }
//
//    public void setIndiceProtecao(String indiceProtecao) {
//        this.indiceProtecao = indiceProtecao;
//    }
//
//    public String getCodec() {
//        return codec;
//    }
//
//    public void setCodec(String codec) {
//        this.codec = codec;
//    }
//
//    public String getAnguloLente() {
//        return anguloLente;
//    }
//
//    public void setAnguloLente(String anguloLente) {
//        this.anguloLente = anguloLente;
//    }
//
//    public String getAlcanceInfravermelho() {
//        return alcanceInfravermelho;
//    }
//
//    public void setAlcanceInfravermelho(String alcanceInfravermelho) {
//        this.alcanceInfravermelho = alcanceInfravermelho;
//    }
//
//    public String getResolucao() {
//        return resolucao;
//    }
//
//    public void setResolucao(String resolucao) {
//        this.resolucao = resolucao;
//    }
//
//    public String getTamanhoArmazenamento() {
//        return tamanhoArmazenamento;
//    }
//
//    public void setTamanhoArmazenamento(String tamanhoArmazenamento) {
//        this.tamanhoArmazenamento = tamanhoArmazenamento;
//    }
//
//    public String getVoltagem() {
//        return voltagem;
//    }
//
//    public void setVoltagem(String voltagem) {
//        this.voltagem = voltagem;
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
//    public SubGrupo getIdSubGrupo() {
//        return idSubGrupo;
//    }
//
//    public void setIdSubGrupo(SubGrupo idSubGrupo) {
//        this.idSubGrupo = idSubGrupo;
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
//        if (!(object instanceof Produtos)) {
//            return false;
//        }
//        Produtos other = (Produtos) object;
//        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "com.brasfort.osbrasfort.model.Produtos[ id=" + id + " ]";
//    }
//
//}
