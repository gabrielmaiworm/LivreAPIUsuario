package com.biomob.livre.domain;

import com.biomob.livre.domain.enumeration.Lesao;
import com.biomob.livre.domain.enumeration.Situacao;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A Usuario.
 */
@Entity
@Table(name = "usuario")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email")
    private String email;

    @Column(name = "nascimento")
    private LocalDate nascimento;

    @Column(name = "documento")
    private String documento;

    @Enumerated(EnumType.STRING)
    @Column(name = "lesao")
    private Lesao lesao;

    @Enumerated(EnumType.STRING)
    @Column(name = "situacao")
    private Situacao situacao;

    @Column(name = "uso_proprio")
    private Boolean usoProprio;

    @Column(name = "nome_dependente")
    private String nomeDependente;

    @Column(name = "nascimento_dependente")
    private LocalDate nascimentoDependente;

    @Column(name = "facebook")
    private String facebook;

    @Column(name = "instagram")
    private String instagram;

    @Column(name = "termo")
    private Boolean termo;

    @Column(name = "treinamento")
    private Boolean treinamento;

    @Lob
    @Column(name = "foto_doc")
    private byte[] fotoDoc;

    @Column(name = "foto_doc_content_type")
    private String fotoDocContentType;

    @Lob
    @Column(name = "foto_com_doc")
    private byte[] fotoComDoc;

    @Column(name = "foto_com_doc_content_type")
    private String fotoComDocContentType;

    @JsonIgnoreProperties(value = { "usuario" }, allowSetters = true)
    @OneToOne
    @JoinColumn(unique = true)
    private Endereco endereco;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public Usuario id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public Usuario nome(String nome) {
        this.setNome(nome);
        return this;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public Usuario email(String email) {
        this.setEmail(email);
        return this;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getNascimento() {
        return this.nascimento;
    }

    public Usuario nascimento(LocalDate nascimento) {
        this.setNascimento(nascimento);
        return this;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getDocumento() {
        return this.documento;
    }

    public Usuario documento(String documento) {
        this.setDocumento(documento);
        return this;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Lesao getLesao() {
        return this.lesao;
    }

    public Usuario lesao(Lesao lesao) {
        this.setLesao(lesao);
        return this;
    }

    public void setLesao(Lesao lesao) {
        this.lesao = lesao;
    }

    public Situacao getSituacao() {
        return this.situacao;
    }

    public Usuario situacao(Situacao situacao) {
        this.setSituacao(situacao);
        return this;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public Boolean getUsoProprio() {
        return this.usoProprio;
    }

    public Usuario usoProprio(Boolean usoProprio) {
        this.setUsoProprio(usoProprio);
        return this;
    }

    public void setUsoProprio(Boolean usoProprio) {
        this.usoProprio = usoProprio;
    }

    public String getNomeDependente() {
        return this.nomeDependente;
    }

    public Usuario nomeDependente(String nomeDependente) {
        this.setNomeDependente(nomeDependente);
        return this;
    }

    public void setNomeDependente(String nomeDependente) {
        this.nomeDependente = nomeDependente;
    }

    public LocalDate getNascimentoDependente() {
        return this.nascimentoDependente;
    }

    public Usuario nascimentoDependente(LocalDate nascimentoDependente) {
        this.setNascimentoDependente(nascimentoDependente);
        return this;
    }

    public void setNascimentoDependente(LocalDate nascimentoDependente) {
        this.nascimentoDependente = nascimentoDependente;
    }

    public String getFacebook() {
        return this.facebook;
    }

    public Usuario facebook(String facebook) {
        this.setFacebook(facebook);
        return this;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getInstagram() {
        return this.instagram;
    }

    public Usuario instagram(String instagram) {
        this.setInstagram(instagram);
        return this;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public Boolean getTermo() {
        return this.termo;
    }

    public Usuario termo(Boolean termo) {
        this.setTermo(termo);
        return this;
    }

    public void setTermo(Boolean termo) {
        this.termo = termo;
    }

    public Boolean getTreinamento() {
        return this.treinamento;
    }

    public Usuario treinamento(Boolean treinamento) {
        this.setTreinamento(treinamento);
        return this;
    }

    public void setTreinamento(Boolean treinamento) {
        this.treinamento = treinamento;
    }

    public byte[] getFotoDoc() {
        return this.fotoDoc;
    }

    public Usuario fotoDoc(byte[] fotoDoc) {
        this.setFotoDoc(fotoDoc);
        return this;
    }

    public void setFotoDoc(byte[] fotoDoc) {
        this.fotoDoc = fotoDoc;
    }

    public String getFotoDocContentType() {
        return this.fotoDocContentType;
    }

    public Usuario fotoDocContentType(String fotoDocContentType) {
        this.fotoDocContentType = fotoDocContentType;
        return this;
    }

    public void setFotoDocContentType(String fotoDocContentType) {
        this.fotoDocContentType = fotoDocContentType;
    }

    public byte[] getFotoComDoc() {
        return this.fotoComDoc;
    }

    public Usuario fotoComDoc(byte[] fotoComDoc) {
        this.setFotoComDoc(fotoComDoc);
        return this;
    }

    public void setFotoComDoc(byte[] fotoComDoc) {
        this.fotoComDoc = fotoComDoc;
    }

    public String getFotoComDocContentType() {
        return this.fotoComDocContentType;
    }

    public Usuario fotoComDocContentType(String fotoComDocContentType) {
        this.fotoComDocContentType = fotoComDocContentType;
        return this;
    }

    public void setFotoComDocContentType(String fotoComDocContentType) {
        this.fotoComDocContentType = fotoComDocContentType;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Usuario endereco(Endereco endereco) {
        this.setEndereco(endereco);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Usuario)) {
            return false;
        }
        return id != null && id.equals(((Usuario) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Usuario{" +
            "id=" + getId() +
            ", nome='" + getNome() + "'" +
            ", email='" + getEmail() + "'" +
            ", nascimento='" + getNascimento() + "'" +
            ", documento='" + getDocumento() + "'" +
            ", lesao='" + getLesao() + "'" +
            ", situacao='" + getSituacao() + "'" +
            ", usoProprio='" + getUsoProprio() + "'" +
            ", nomeDependente='" + getNomeDependente() + "'" +
            ", nascimentoDependente='" + getNascimentoDependente() + "'" +
            ", facebook='" + getFacebook() + "'" +
            ", instagram='" + getInstagram() + "'" +
            ", termo='" + getTermo() + "'" +
            ", treinamento='" + getTreinamento() + "'" +
            ", fotoDoc='" + getFotoDoc() + "'" +
            ", fotoDocContentType='" + getFotoDocContentType() + "'" +
            ", fotoComDoc='" + getFotoComDoc() + "'" +
            ", fotoComDocContentType='" + getFotoComDocContentType() + "'" +
            "}";
    }
}
