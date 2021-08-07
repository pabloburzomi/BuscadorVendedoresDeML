
package com.pabloburzomi.MLARest.DTO;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "struct",
    "source"
})
@Generated("jsonschema2pojo")
public class Value {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("struct")
    private Struct struct;
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

    @JsonProperty("struct")
    public Struct getStruct() {
        return struct;
    }

    @JsonProperty("struct")
    public void setStruct(Struct struct) {
        this.struct = struct;
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
		return "Value [id=" + id + ", name=" + name + ", struct=" + struct + ", source=" + source + "]";
	}
    
    

}
