package com.ang.model;

// Generated Oct 11, 2015 10:35:56 AM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Genre generated by hbm2java
 */
@Entity
@Table(name = "genre", catalog = "angular_db")
public class Genre implements java.io.Serializable {

	private Integer id;
	private String genre;
	private Set<AngbooksGenre> angbooksGenres = new HashSet<AngbooksGenre>(0);

	public Genre() {
	}

	public Genre(String genre) {
		this.genre = genre;
	}

	public Genre(String genre, Set<AngbooksGenre> angbooksGenres) {
		this.genre = genre;
		this.angbooksGenres = angbooksGenres;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "genre", nullable = false, length = 2500)
	public String getGenre() {
		return this.genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "genre")
	public Set<AngbooksGenre> getAngbooksGenres() {
		return this.angbooksGenres;
	}

	public void setAngbooksGenres(Set<AngbooksGenre> angbooksGenres) {
		this.angbooksGenres = angbooksGenres;
	}

}