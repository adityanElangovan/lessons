package com.abc.cricket.model.modeldynamic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
@Table(name="FALL_OF_WICKETS")
@Getter @Setter @ToString
public class FallOfWickets {
	
	@Id
	@SequenceGenerator(name="SEQ_PLAYER")
	@Column(name="ID")
	private int id;
	
	@OneToOne
	@JoinColumn(name="BATSMAN_ID")
	private Batsman batsman;
	
	@ManyToOne
	@JoinColumn(name="BOWLER_ID")
	private Bowler bowler;
	
	@ManyToOne
	@JoinColumn(name="ASSISTOR_ID")
	private Player assisstor;
	
	@Column(name="ASSIST_TYPE")
	private String assistType;
	
	//f(total_runs)
		//Batsman no. = f(count_rows_in_FOW_table + 1)
		//f(current_runs_sum)
	
}