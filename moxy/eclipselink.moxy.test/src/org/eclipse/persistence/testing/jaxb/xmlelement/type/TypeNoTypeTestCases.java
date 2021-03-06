/*******************************************************************************
 * Copyright (c) 1998, 2015 Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     Denise Smith - May 3013
 ******************************************************************************/
package org.eclipse.persistence.testing.jaxb.xmlelement.type;

/*******************************************************************************
 * Copyright (c) 1998, 2012 Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     Denise Smith - May 2013
 ******************************************************************************/
import java.math.BigDecimal;

import org.eclipse.persistence.testing.jaxb.JAXBWithJSONTestCases;

public class TypeNoTypeTestCases extends JAXBWithJSONTestCases{

    private final static String XML_RESOURCE = "org/eclipse/persistence/testing/jaxb/xmlelement/type/notype.xml";
    private final static String JSON_RESOURCE = "org/eclipse/persistence/testing/jaxb/xmlelement/type/notype.json";


    public TypeNoTypeTestCases(String name) throws Exception {
        super(name);
        setControlDocument(XML_RESOURCE);
        setControlJSON(JSON_RESOURCE);
        Class[] classes = new Class[]{Foo.class, Bar.class, BarXmlValue.class};
        setClasses(classes);
    }

     protected Object getControlObject() {
         Foo f = new Foo();
         f.field = new BigDecimal("10");
         return f;
     }

}
