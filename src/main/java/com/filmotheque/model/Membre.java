package com.filmotheque.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Membre {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String nom;

	private String prenom;

	private String login;

	private String motDePasse;

	private boolean isAdmin;

	/**
	 * 
	 */
	public Membre() {
		super();
	}

	/**
	 * @param nom
	 * @param prenom
	 * @param login
	 * @param motDePasse
	 * @param isAdmin
	 */
	public Membre(String nom, String prenom, String login, String motDePasse, boolean isAdmin) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.motDePasse = motDePasse;
		this.isAdmin = isAdmin;
	}

	/**
	 * @param id
	 * @param nom
	 * @param prenom
	 * @param login
	 * @param motDePasse
	 * @param isAdmin
	 */
	public Membre(Long id, String nom, String prenom, String login, String motDePasse, boolean isAdmin) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.motDePasse = motDePasse;
		this.isAdmin = isAdmin;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

}
