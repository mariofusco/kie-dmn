/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kie.dmn.backend.unmarshalling.v1_1.xstream;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import org.kie.dmn.feel.model.v1_1.InformationItem;
import org.kie.dmn.feel.model.v1_1.InputData;

public class InputDataConverter
        extends DRGElementConverter {

    private static final String VARIABLE = "variable";

    public InputDataConverter(XStream xstream) {
        super( xstream );
    }

    public boolean canConvert(Class clazz) {
        return clazz.equals( InputData.class );
    }

    @Override
    protected void assignChildElement(Object parent, String nodeName, Object child) {
        InputData id = (InputData) parent;
        if ( VARIABLE.equals( nodeName ) ) {
            id.setVariable( (InformationItem) child );
        } else {
            super.assignChildElement( parent, nodeName, child );
        }
    }

    @Override
    protected void assignAttributes(HierarchicalStreamReader reader, Object parent) {
        super.assignAttributes( reader, parent );
    }

    @Override
    protected Object createModelObject() {
        return new InputData();
    }

}