package uk.ac.sanger.scgcf.barcodegenerator.persistence.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * BarcodesPayload
 */
@javax.annotation.Generated(value = "class uk.ac.sanger.scgcf.barcodegenerator.codegen.languages.SpringCodegen", date = "2016-11-25T08:23:20.639Z")

/**
 * Define the payload to create a <code>Barcode</code>.
 * 
 * @author ke4
 *
 */
public class BarcodesPayload {
    @JsonProperty("numberOfBarcodes")
    private Integer numberOfBarcodes = null;
    
    @JsonProperty("prefix")
    private String prefix = null;
    
    @JsonProperty("info")
    private String info = null;
    
    public BarcodesPayload numberOfBarcodes(Integer numberOfBarcodes) {
        this.numberOfBarcodes = numberOfBarcodes;
        return this;
    }
    
    /**
     * Get numberOfBarcodes
     * 
     * @return numberOfBarcodes
     **/
    @ApiModelProperty(required = true, value = "")
    public Integer getNumberOfBarcodes() {
        return numberOfBarcodes;
    }
    
    public void setNumberOfBarcodes(Integer numberOfBarcodes) {
        this.numberOfBarcodes = numberOfBarcodes;
    }
    
    public BarcodesPayload prefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    
    /**
     * Get prefix
     * 
     * @return prefix
     **/
    @ApiModelProperty(required = true, value = "")
    public String getPrefix() {
        return prefix;
    }
    
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
    
    public BarcodesPayload info(String info) {
        this.info = info;
        return this;
    }
    
    /**
     * Get info
     * 
     * @return info
     **/
    @ApiModelProperty(required = true, value = "")
    public String getInfo() {
        return info;
    }
    
    public void setInfo(String info) {
        this.info = info;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BarcodesPayload barcodesPayload = (BarcodesPayload) o;
        return Objects.equals(this.numberOfBarcodes, barcodesPayload.numberOfBarcodes)
                && Objects.equals(this.prefix, barcodesPayload.prefix)
                && Objects.equals(this.info, barcodesPayload.info);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(numberOfBarcodes, prefix, info);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BarcodesPayload {\n");
        
        sb.append("    numberOfBarcodes: ").append(toIndentedString(numberOfBarcodes)).append("\n");
        sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
        sb.append("    info: ").append(toIndentedString(info)).append("\n");
        sb.append("}");
        return sb.toString();
    }
    
    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
