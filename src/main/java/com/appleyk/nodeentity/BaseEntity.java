package com.appleyk.nodeentity;

import org.neo4j.ogm.annotation.GraphId;
 
/**
 * 抽取共同的属性字段
 * @author yukun24@126.com
 * @blob   http://blog.csdn.net/appleyk
 * @date   2018年1月19日-下午4:35:25
 */
public abstract class BaseEntity {
 
	/**
	 * Neo4j会分配的ID（节点唯一标识 当前类中有效）
	 */
	@GraphId
	private Long id;
	
	private String name;
 
	public Long getId() {
		return id;
	}
 
	public void setId(Long id) {
		this.id = id;
	}
 
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
}
