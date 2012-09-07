package com.example.fw.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 */
public abstract class AbstractDomainObject implements Serializable {
    public AbstractDomainObject() {
        super(); // TODO ...
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();

    }

    protected Object getKey() {
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        if (getKey() == null) {
            return super.equals(obj);
        }
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!this.getClass().isAssignableFrom(obj.getClass())) {
            return false;
        }

        AbstractDomainObject other = (AbstractDomainObject) obj;

        Object key = getKey();
        if (key instanceof BigDecimal) {
            return ((BigDecimal) key).compareTo((BigDecimal) other.getKey()) == 0;
        }

        return key.equals(other.getKey());
    }

    @Override
    public int hashCode() {
        if (getKey() == null) {
            return super.hashCode();
        }
        return getKey().hashCode();
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            // this shouldn't happen, since we are Cloneable
            throw new InternalError();
        }
    }
}
