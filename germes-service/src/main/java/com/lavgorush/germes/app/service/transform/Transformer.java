package com.lavgorush.germes.app.service.transform;

import com.lavgorush.germes.app.model.entity.base.AbstractEntity;
import com.lavgorush.germes.app.rest.dto.base.BaseDTO;

/**
 * Represent transformation engine to convert business entities
 * into DTO objects
 * @author lavgo
 */
public interface Transformer {

	/**
	 * Convert business entity into DTO object
	 *
	 * @param entity
	 * @param clz
	 * @return
	 */
	<T extends AbstractEntity, P extends BaseDTO<T>> P transform(T entity, Class<P> clz);

	/**
	 * Convert DTO object into business object
	 *
	 * @param dto
	 * @param clz
	 * @return
	 */
	<T extends AbstractEntity, P extends BaseDTO<T>> T unTransform(P dto, Class<T> clz);

}
