package com.appleyk.nodeentity;


import java.util.List;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
 
import com.fasterxml.jackson.annotation.JsonProperty;
 
/**
 * Neo4j的节点实体类：Coder
 * 
 * @author yukun24@126.com
 * @blob http://blog.csdn.net/appleyk
 * @date 2018年1月18日-下午12:06:17
 */
 
@NodeEntity
public class Coder extends BaseEntity {
	@GraphId
	private String sex;
	private String hobby;
 
	@Relationship(type = "Like")
	@JsonProperty("喜欢")
	private List<Player> players;
 
	@Relationship(type = "Have")
	@JsonProperty("拥有")
	private List<Cat> cats;
 
	public Coder() {
 
	}
	public Coder(String s,String h) {
		 this.sex=s;
		 this.hobby=h;
	}
 
	public String getSex() {
		return sex;
	}
 
	public void setSex(String sex) {
		this.sex = sex;
	}
 
	public String getHobby() {
		return hobby;
	}
 
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
 
	public List<Player> getPlayers() {
		return players;
	}
 
	public void setPlayers(List<Player> players) {
		this.players = players;
	}
 
	public List<Cat> getCats() {
		return cats;
	}
 
	public void setCats(List<Cat> cats) {
		this.cats = cats;
	}
 
}
