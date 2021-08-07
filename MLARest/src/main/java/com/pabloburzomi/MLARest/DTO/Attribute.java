
package com.pabloburzomi.MLARest.DTO;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "value_name",
    "values",
    "attribute_group_id",
    "attribute_group_name",
    "value_id",
    "value_struct",
    "source"
})
@Generated("jsonschema2pojo")
public class Attribute {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("value_name")
    private String valueName;
    @JsonProperty("values")
    private List<Value> values = new ArrayList<Value>();
    @JsonProperty("attribute_group_id")
    private String attributeGroupId;
    @JsonProperty("attribute_group_name")
    private String attributeGroupName;
    @JsonProperty("value_id")
    private String valueId;
    @JsonProperty("value_struct")
    private ValueStruct valueStruct;
    @JsonProperty("source")
    private Long source;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("value_name")
    public String getValueName() {
        return valueName;
    }

    @JsonProperty("value_name")
    public void setValueName(String valueName) {
        this.valueName = valueName;
    }

    @JsonProperty("values")
    public List<Value> getValues() {
        return values;
    }

    @JsonProperty("values")
    public void setValues(List<Value> values) {
        this.values = values;
    }

    @JsonProperty("attribute_group_id")
    public String getAttributeGroupId() {
        return attributeGroupId;
    }

    @JsonProperty("attribute_group_id")
    public void setAttributeGroupId(String attributeGroupId) {
        this.attributeGroupId = attributeGroupId;
    }

    @JsonProperty("attribute_group_name")
    public String getAttributeGroupName() {
        return attributeGroupName;
    }

    @JsonProperty("attribute_group_name")
    public void setAttributeGroupName(String attributeGroupName) {
        this.attributeGroupName = attributeGroupName;
    }

    @JsonProperty("value_id")
    public String getValueId() {
        return valueId;
    }

    @JsonProperty("value_id")
    public void setValueId(String valueId) {
        this.valueId = valueId;
    }

    @JsonProperty("value_struct")
    public ValueStruct getValueStruct() {
        return valueStruct;
    }

    @JsonProperty("value_struct")
    public void setValueStruct(ValueStruct valueStruct) {
        this.valueStruct = valueStruct;
    }

    @JsonProperty("source")
    public Long getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(Long source) {
        this.source = source;
    }

	@Override
	public String toString() {
		return "Attribute [id=" + id + ", name=" + name + ", valueName=" + valueName + ", values=" + values
				+ ", attributeGroupId=" + attributeGroupId + ", attributeGroupName=" + attributeGroupName + ", valueId="
				+ valueId + ", valueStruct=" + valueStruct + ", source=" + source + "]";
	}
    
    

}
