package com.lavgorush.germes.app.infra.util;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Contains utility functions of the general purpose
 *
 * @author admin
 */
public class CommonUtil {

	private CommonUtil() {
	}

	/**
	 * Returns not-null unmodifiable copy of source set
	 *
	 * @param source
	 * @return
	 */
	public static <T> Set<T> getSafeSet(Set<T> source) {
		return Collections
			.unmodifiableSet(Optional.ofNullable(source).orElse(Collections.emptySet()));
	}

	/**
	 * Returns not-null unmodifiable copy of source list
	 *
	 * @param source
	 * @return
	 */
	public static <T> List<T> getSafeList(List<T> source) {
		return Collections
			.unmodifiableList(Optional.ofNullable(source).orElse(Collections.emptyList()));
	}

	public static String toString(Object param) {
		return ReflectionToStringBuilder.toString(param, ToStringStyle.SHORT_PREFIX_STYLE);
	}

}
