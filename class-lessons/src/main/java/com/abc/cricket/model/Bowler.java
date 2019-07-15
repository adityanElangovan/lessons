package com.abc.cricket.model.modeldynamic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.abc.cricket.model.modelstatic.Player;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Adityan.Elangovan
 **/
@Entity
@Table(name="BOWLER")
@Getter @Setter @ToString
public class Bowler {
	
	@Id
	@SequenceGenerator(name="SEQ_PLAYER")
	@Column(name="ID")
	private int id;
	
	@ManyToOne
	@JoinColumn(name="PLAYER_ID")
	private Player playerId;
	
	@ManyToOne
	@JoinColumn(name="INNINGS_ID")
	private Inning inningsId;
	
	@Column(name="OVERS")
	private int overs;	
	
	@Column(name="MAIDENS")
	private int maidens;
	
	@Column(name="RUNS")
	private int runs;
	
	@Column(name="WICKETS")
	private int wickets;
	
	@Column(name="NOBALLS")
	private int noballs;
	
	@Column(name="WIDES")
	private int wides;
	
	@Column(name="BYES")
	private int byes;
	
	@Column(name="LEGBYES")
	private int legbyes;
	
	@Column(name="PENALTIES")
	private int penalties;
	
	//f(name)
	//f(eco)
}
