package com.bq.corbel.lib.mongo;

/**
 * @author Alexander De Leon
 * 
 */
public interface IdGenerator<E> {

	String generateId(E entity);

}
