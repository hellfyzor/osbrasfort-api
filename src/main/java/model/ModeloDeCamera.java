package model;

import javax.persistence.*;

@Entity
@Table(name = "modelo_de_camera", schema = "public")
public class ModeloDeCamera {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "nome")
    private String nome;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "indice_de_protecao")
    private String indiceDeProtecao;

    @Column(name = "codec")
    private String codec;

    @Column(name = "lente")
    private String lente;

    @Column(name = "angulo_de_visão")
    private String anguloDeVisão;

    @Column(name = "alcance_infra_vermelho")
    private String alcanceInfraVermelho;

    @Column(name = "tamanho_hd")
    private String tamanhoHd;

    @Column(name = "voltagem")
    private String voltagem;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getIndiceDeProtecao() {
        return this.indiceDeProtecao;
    }

    public void setIndiceDeProtecao(String indiceDeProtecao) {
        this.indiceDeProtecao = indiceDeProtecao;
    }

    public String getCodec() {
        return this.codec;
    }

    public void setCodec(String codec) {
        this.codec = codec;
    }

    public String getLente() {
        return this.lente;
    }

    public void setLente(String lente) {
        this.lente = lente;
    }

    public String getAnguloDeVisão() {
        return this.anguloDeVisão;
    }

    public void setAnguloDeVisão(String anguloDeVisão) {
        this.anguloDeVisão = anguloDeVisão;
    }

    public String getAlcanceInfraVermelho() {
        return this.alcanceInfraVermelho;
    }

    public void setAlcanceInfraVermelho(String alcanceInfraVermelho) {
        this.alcanceInfraVermelho = alcanceInfraVermelho;
    }

    public String getTamanhoHd() {
        return this.tamanhoHd;
    }

    public void setTamanhoHd(String tamanhoHd) {
        this.tamanhoHd = tamanhoHd;
    }

    public String getVoltagem() {
        return this.voltagem;
    }

    public void setVoltagem(String voltagem) {
        this.voltagem = voltagem;
    }
}
