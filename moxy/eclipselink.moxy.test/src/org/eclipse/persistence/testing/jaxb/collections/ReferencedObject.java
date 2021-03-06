/*******************************************************************************
 * Copyright (c) 2012, 2015  Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     Denise Smith - 2.3.3 - initial implementation
 ******************************************************************************/
package org.eclipse.persistence.testing.jaxb.collections;

import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ReferencedObject implements Comparable {

    @XmlID
    public String id;

    public boolean equals(Object obj) {
        if (obj instanceof ReferencedObject) {
            return id.equals(((ReferencedObject) obj).id);
        }
        return false;
    }

    @Override
    public int compareTo(Object o) {
        if (this.equals(o)) {
            return 0;
        }
        return 1;
    }

}
