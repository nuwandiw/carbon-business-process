/**
 *  Copyright (c) 2015 WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */


package org.wso2.carbon.bpmn.rest.model.form;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "RestFormProperty")
@XmlAccessorType(XmlAccessType.FIELD)
public class RestFormProperty {
    protected String id;
    protected String name;
    protected String type;
    protected String value;
    protected boolean readable;
    protected boolean writable;
    protected boolean required;
    protected String datePattern;
    @XmlElementWrapper(name = "RestEnumFormProperties")
    @XmlElement(name = "RestEnumFormProperty", type = RestEnumFormProperty.class)
    protected List<RestEnumFormProperty> enumValues = new ArrayList<RestEnumFormProperty>();

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    public boolean isReadable() {
        return readable;
    }
    public void setReadable(boolean readable) {
        this.readable = readable;
    }
    public boolean isWritable() {
        return writable;
    }
    public void setWritable(boolean writable) {
        this.writable = writable;
    }
    public boolean isRequired() {
        return required;
    }
    public void setRequired(boolean required) {
        this.required = required;
    }
    public String getDatePattern() {
        return datePattern;
    }
    public void setDatePattern(String datePattern) {
        this.datePattern = datePattern;
    }
    public List<RestEnumFormProperty> getEnumValues() {
        return enumValues;
    }
    public void setEnumValues(List<RestEnumFormProperty> enumValues) {
        this.enumValues = enumValues;
    }
    public void addEnumValue(RestEnumFormProperty enumValue) {
        enumValues.add(enumValue);
    }
}
