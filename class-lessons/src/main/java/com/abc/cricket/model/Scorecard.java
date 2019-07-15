package com.abc.cricket.model.modeldynamic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.abc.cricket.model.modelstatic.Team;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Adityan.Elangovan
 **/
@Entity
@Table(name="SCORECARD")
@Getter @Setter @ToString
public class Scorecard {

	@Id
	@SequenceGenerator(name="SEQ_SCORECARD")
	@Column(name="ID")
	private int id;
	
	@OneToOne
	@JoinColumn(name="MATCH_ID")
	private Team matchId;
	
	@OneToOne
	@JoinColumn(name="INNING_1")
	private Inning inning1;
	
	@OneToOne
	@JoinColumn(name="INNING_2")
	private Inning inning2;
	
	
}






	
	