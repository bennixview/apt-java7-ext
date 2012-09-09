package com.example.entity.impl;


import static com.mysema.query.types.PathMetadataFactory.*;
import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QOtherThingBase is a Querydsl query type for OtherThingBase
 */
@Generated("com.mysema.query.codegen.SupertypeSerializer")
public class QOtherThingBase extends EntityPathBase<OtherThingBase> {

    private static final long serialVersionUID = -679600797;

    public static final QOtherThingBase otherThingBase = new QOtherThingBase("otherThingBase");

    public final com.example.fw.entity.QAbstractDomainObject _super = new com.example.fw.entity.QAbstractDomainObject(this);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final SimplePath<Object> key = _super.key;

    public final StringPath name = createString("name");

    public final EnumPath<com.example.entity.view.TestWertevorrat> testWertevorrat = createEnum("testWertevorrat", com.example.entity.view.TestWertevorrat.class);

    public QOtherThingBase(String variable) {
        super(OtherThingBase.class, forVariable(variable));
    }

    public QOtherThingBase(Path<? extends OtherThingBase> path) {
        super(path.getType(), path.getMetadata());
    }

    public QOtherThingBase(PathMetadata<?> metadata) {
        super(OtherThingBase.class, metadata);
    }

}

