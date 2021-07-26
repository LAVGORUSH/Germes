package com.lavgorush.germes.app.service.transform.impl;

import com.lavgorush.germes.app.infra.util.Checks;
import com.lavgorush.germes.app.infra.util.ReflectionUtil;
import com.lavgorush.germes.app.model.entity.base.AbstractEntity;
import com.lavgorush.germes.app.rest.dto.base.BaseDTO;
import com.lavgorush.germes.app.service.transform.Transformer;

/**
 * Default transformation engine that uses reflection to transform objects
 *
 * @author lavgo
 */
public class SimpleDTOTransformer implements Transformer {

	@Override
	public <T extends AbstractEntity, P extends BaseDTO<T>> P transform(T entity, Class<P> clz) {
		checkParams(entity, clz);
		P dto = ReflectionUtil.createInstance(clz);
		// Now just copy similar fields
		ReflectionUtil
			.copyFields(entity, dto, ReflectionUtil.findSimilarFields(entity.getClass(), clz));
		dto.transform(entity);
		return dto;
	}

	private void checkParams(final Object param, final Class<?> clz) {
		Checks.checkParameter(param != null,"Source transformation object is not initialized");
		Checks.checkParameter(clz != null,"No class is defined for transformation");
	}

	@Override
	public <T extends AbstractEntity, P extends BaseDTO<T>> T unTransform(P dto, Class<T> clz) {
		checkParams(dto, clz);
		T entity = ReflectionUtil.createInstance(clz);
		ReflectionUtil
			.copyFields(dto, entity, ReflectionUtil.findSimilarFields(dto.getClass(), clz));
		dto.unTransform(entity);
		return entity;
	}

}
