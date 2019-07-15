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
@Table(name="BATSMAN")
@Getter @Setter @ToString
public class Batsman {
	
	@Id
	@SequenceGenerator(name="SEQ_PLAYER")
	@Column(name="ID")
	private int id;
	
	@ManyToOne
	@JoinColumn(name="PLAYER_ID")
	private Player player;
	
	@ManyToOne
	@JoinColumn(name="INNINGS_ID")
	private Inning inning;
	
	@Column(name="RUNS")
	private int runs;
	
	@Column(name="BALLS")
	private int balls;
	
	@Column(name="FOURS")
	private int fours;
	
	@Column(name="SIXES")
	private int sixes;
	
	//f(name)
    //f(strike_rate)
	
}
