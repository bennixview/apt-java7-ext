package com.example.entity.impl;

import com.example.entity.model.OtherThing;
import com.example.entity.view.TestWertevorrat;
import com.example.entity.view.TestWertevorratWertevorrat;
import com.example.fw.entity.AbstractDomainObject;

import javax.persistence.Column;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;


@MappedSuperclass
public abstract class OtherThingBase extends AbstractDomainObject implements OtherThing {

    @Id
    @SequenceGenerator(name = "S_XXXP_OTTI", allocationSize = 1, sequenceName = "iso_owner.S_XXXP_OTTI", schema = "iso_owner")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "S_XXXP_OTTI")
    @Column(name = "OTTI_ID")
    private Long id;

    @Column(name = "OTTI_NAME", nullable = false, length = 500)
    private String name;

    @Column(name = "OTTI_TEST_WERTEVORRAT", nullable = false)
    @Enumerated(javax.persistence.EnumType.STRING)
    private TestWertevorrat testWertevorrat;

    @Override
    public Long getId() {
        return id;
    }

    /**
     * The id is not intended to be changed or assigned manually, but
     * for test purpose it is allowed to assign the id.
     */
    protected void setId(Long id) {
        if ((this.id != null) && !this.id.equals(id)) {
            throw new IllegalArgumentException(
                "Not allowed to change the id property.");
        }
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }


    @Override
    public void setName(String name) {
        Object oldValue = getName();
        this.name = name;
    }


    /**
     * Wertevorrat
     */
    @Override
    public TestWertevorratWertevorrat getTestWertevorrat() {
        return testWertevorrat;
    }

    /**
     * Wertevorrat
     */
    @Override
    public void setTestWertevorrat(TestWertevorratWertevorrat testWertevorrat) {
        Object oldValue = getTestWertevorrat();

        this.testWertevorrat = (testWertevorrat == null) ? null
                                                         : testWertevorrat.getTestWertevorrat();
    }
}
