package com.example.fw.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QAbstractDomainObject is a Querydsl query type for AbstractDomainObject
 */
@Generated("com.mysema.query.codegen.EmbeddableSerializer")
public class QAbstractDomainObject extends BeanPath<AbstractDomainObject> {

    private static final long serialVersionUID = -1348468188;

    public static final QAbstractDomainObject abstractDomainObject = new QAbstractDomainObject("abstractDomainObject");

    public final SimplePath<Object> key = createSimple("key", Object.class);

    public QAbstractDomainObject(String variable) {
        super(AbstractDomainObject.class, forVariable(variable));
    }

    public QAbstractDomainObject(Path<? extends AbstractDomainObject> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAbstractDomainObject(PathMetadata<?> metadata) {
        super(AbstractDomainObject.class, metadata);
    }

}

