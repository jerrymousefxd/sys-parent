package com.eaju.core.serialize;

import java.util.Collection;

import com.alibaba.dubbo.common.serialize.support.SerializationOptimizer;

/**
 * Created by ljdo on 2016/4/9.
 * kryo序列化
 */
public class SerializationOptimizerImpl implements SerializationOptimizer{

	@Override
	public Collection<Class> getSerializableClasses() {
		// TODO Auto-generated method stub
		return null;
	}
   /* public Collection<Class> getSerializableClasses() {
        List<Class> classes = new LinkedList<Class>();
        //这里可以把所有需要进行序列化的类进行添加
        classes.add(User.class);
        return classes;
    }*/
}
