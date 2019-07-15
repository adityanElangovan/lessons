package com.abc.cricket.model.modeldynamic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name="INNING")
@Getter @Setter @ToString
public class Inning {
	
	@Id
	@SequenceGenerator(name="SEQ_PLAYER")
	@Column(name="ID")
	private int id;
	
	@ManyToOne
	@JoinColumn(name="BAT_TEAM_ID")
	private Team batTeam;
	
	@ManyToOne
	@JoinColumn(name="BOWL_TEAM_ID")
	private Team bowlTeam;	
	
	//f(runs)
	//f(wickets)
	//f(run_rate)
	
	//Create a view for EXTRAS instead of a seperate table.
}
