package com.api.agencia.cliente;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "cpf")
	private long cpf;
	
	@Column(name = "nascimento")
	private Date nascimento;
	
	@Column(name = "sexo")
	private String sexo;
	
	@Column(name = "tel1")
	private long tel1;
	
	@Column(name = "tel2")
	private long tel2;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "cep")
	private long cep;
	
	@Column(name = "rua")
	private String rua;
	
	@Column(name = "numero")
	private int numero;
	
	@Column(name = "bairro")
	private String bairro;
	
	@Column(name = "cidade")
	private String cidade;
	
	@Column(name = "civil")
	private String civil;
	
	@Column(name = "filho")
	private boolean filho;
	
	@Column(name = "numFilhos")
	private int numFilhos;
	
	@Column(name = "escolaridade")
	private String escolaridade;
	
	@Column(name = "profissao")
	private String profissao;
	
	@Column(name = "pergunta")
	private String pergunta;
	
	public Cliente() {
		
	}

	public Cliente(long id, String nome, long cpf, Date nascimento, String sexo, long tel1, long tel2, String email,
			long cep, String rua, int numero, String bairro, String cidade, String civil, boolean filho, int numFilhos,
			String escolaridade, String profissao, String pergunta) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.nascimento = nascimento;
		this.sexo = sexo;
		this.tel1 = tel1;
		this.tel2 = tel2;
		this.email = email;
		this.cep = cep;
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.civil = civil;
		this.filho = filho;
		this.numFilhos = numFilhos;
		this.escolaridade = escolaridade;
		this.profissao = profissao;
		this.pergunta = pergunta;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public long getTel1() {
		return tel1;
	}

	public void setTel1(long tel1) {
		this.tel1 = tel1;
	}

	public long getTel2() {
		return tel2;
	}

	public void setTel2(long tel2) {
		this.tel2 = tel2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getCep() {
		return cep;
	}

	public void setCep(long cep) {
		this.cep = cep;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCivil() {
		return civil;
	}

	public void setCivil(String civil) {
		this.civil = civil;
	}

	public boolean isFilho() {
		return filho;
	}

	public void setFilho(boolean filho) {
		this.filho = filho;
	}

	public int getNumFilhos() {
		return numFilhos;
	}

	public void setNumFilhos(int numFilhos) {
		this.numFilhos = numFilhos;
	}

	public String getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getPergunta() {
		return pergunta;
	}

	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}
}
