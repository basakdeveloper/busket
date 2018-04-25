package com.basak.busket.utils.dtomapper;

import java.util.HashMap;
import java.util.Map;

import org.mapstruct.BeforeMapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.TargetType;

public class CycleAvoidingMappingContext {
	
	private Map<String, Object> knownInstances = new HashMap<String, Object>();

    @BeforeMapping
    public <T> T getMappedInstance(Object source, @TargetType Class<T> targetType) {
    		String key = targetType.getName();
    	
    		return (T) knownInstances.get( key );
    }

    @BeforeMapping
    public <T> void storeMappedInstance(Object source, @MappingTarget Object target, @TargetType Class<T> targetType) {
    		String key = targetType.getName();
    		
        knownInstances.put( key, target );
    }

}
