package com.lavgorush.germes.app.rest.dto.base;

import com.lavgorush.germes.app.model.entity.base.AbstractEntity;

/**
 * Base class for all DTO classes
 *
 * @author lavgo
 */
public class BaseDTO<T extends AbstractEntity> {

	/**
	 * Unique entity identifier
	 */
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void transform(T t) {
		id = t.getId();
	}

	public T unTransform(T t) {
		t.setId(getId());
		return t;
	}

}
