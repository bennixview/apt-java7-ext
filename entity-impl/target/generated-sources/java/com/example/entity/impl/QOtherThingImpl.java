package com.example.entity.impl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QOtherThingImpl is a Querydsl query type for OtherThingImpl
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QOtherThingImpl extends EntityPathBase<OtherThingImpl> {

    private static final long serialVersionUID = -679380814;

    public static final QOtherThingImpl otherThingImpl = new QOtherThingImpl("otherThingImpl");

    public final QOtherThingBase _super = new QOtherThingBase(this);

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final SimplePath<Object> key = _super.key;

    //inherited
    public final StringPath name = _super.name;

    //inherited
    public final EnumPath<com.example.entity.view.TestWertevorrat> testWertevorrat = _super.testWertevorrat;

    public QOtherThingImpl(String variable) {
        super(OtherThingImpl.class, forVariable(variable));
    }

    public QOtherThingImpl(Path<? extends OtherThingImpl> path) {
        super(path.getType(), path.getMetadata());
    }

    public QOtherThingImpl(PathMetadata<?> metadata) {
        super(OtherThingImpl.class, metadata);
    }

}

