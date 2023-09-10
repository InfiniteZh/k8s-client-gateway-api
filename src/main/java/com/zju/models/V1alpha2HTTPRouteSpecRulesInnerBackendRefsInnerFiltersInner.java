/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.21.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.zju.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.zju.models.V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerExtensionRef;
import com.zju.models.V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestHeaderModifier;
import com.zju.models.V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestMirror;
import com.zju.models.V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestRedirect;
import com.zju.models.V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerResponseHeaderModifier;
import com.zju.models.V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerUrlRewrite;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * HTTPRouteFilter defines processing steps that must be completed during the request or response lifecycle. HTTPRouteFilters are meant as an extension point to express processing that may be done in Gateway implementations. Some examples include request or response modification, implementing authentication strategies, rate-limiting, and traffic shaping. API guarantee/conformance is defined based on the type of the filter.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-10T06:17:41.022715Z[Etc/UTC]")
public class V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInner {
  public static final String SERIALIZED_NAME_EXTENSION_REF = "extensionRef";
  @SerializedName(SERIALIZED_NAME_EXTENSION_REF)
  private V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerExtensionRef extensionRef;

  public static final String SERIALIZED_NAME_REQUEST_HEADER_MODIFIER = "requestHeaderModifier";
  @SerializedName(SERIALIZED_NAME_REQUEST_HEADER_MODIFIER)
  private V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestHeaderModifier requestHeaderModifier;

  public static final String SERIALIZED_NAME_REQUEST_MIRROR = "requestMirror";
  @SerializedName(SERIALIZED_NAME_REQUEST_MIRROR)
  private V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestMirror requestMirror;

  public static final String SERIALIZED_NAME_REQUEST_REDIRECT = "requestRedirect";
  @SerializedName(SERIALIZED_NAME_REQUEST_REDIRECT)
  private V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestRedirect requestRedirect;

  public static final String SERIALIZED_NAME_RESPONSE_HEADER_MODIFIER = "responseHeaderModifier";
  @SerializedName(SERIALIZED_NAME_RESPONSE_HEADER_MODIFIER)
  private V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerResponseHeaderModifier responseHeaderModifier;

  /**
   * Type identifies the type of filter to apply. As with other API fields, types are classified into three conformance levels:   - Core: Filter types and their corresponding configuration defined by \&quot;Support: Core\&quot; in this package, e.g. \&quot;RequestHeaderModifier\&quot;. All implementations must support core filters.   - Extended: Filter types and their corresponding configuration defined by \&quot;Support: Extended\&quot; in this package, e.g. \&quot;RequestMirror\&quot;. Implementers are encouraged to support extended filters.   - Implementation-specific: Filters that are defined and supported by specific vendors. In the future, filters showing convergence in behavior across multiple implementations will be considered for inclusion in extended or core conformance levels. Filter-specific configuration for such filters is specified using the ExtensionRef field. &#x60;Type&#x60; should be set to \&quot;ExtensionRef\&quot; for custom filters.   Implementers are encouraged to define custom implementation types to extend the core API with implementation-specific behavior.   If a reference to a custom filter type cannot be resolved, the filter MUST NOT be skipped. Instead, requests that would have been processed by that filter MUST receive a HTTP error response.   Note that values may be added to this enum, implementations must ensure that unknown values will not cause a crash.   Unknown values here must result in the implementation setting the Accepted Condition for the Route to &#x60;status: False&#x60;, with a Reason of &#x60;UnsupportedValue&#x60;.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    REQUESTHEADERMODIFIER("RequestHeaderModifier"),
    
    RESPONSEHEADERMODIFIER("ResponseHeaderModifier"),
    
    REQUESTMIRROR("RequestMirror"),
    
    REQUESTREDIRECT("RequestRedirect"),
    
    URLREWRITE("URLRewrite"),
    
    EXTENSIONREF("ExtensionRef");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_URL_REWRITE = "urlRewrite";
  @SerializedName(SERIALIZED_NAME_URL_REWRITE)
  private V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerUrlRewrite urlRewrite;

  public V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInner() {
  }

  public V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInner extensionRef(V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerExtensionRef extensionRef) {
    
    this.extensionRef = extensionRef;
    return this;
  }

   /**
   * Get extensionRef
   * @return extensionRef
  **/
  @jakarta.annotation.Nullable
  public V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerExtensionRef getExtensionRef() {
    return extensionRef;
  }


  public void setExtensionRef(V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerExtensionRef extensionRef) {
    this.extensionRef = extensionRef;
  }


  public V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInner requestHeaderModifier(V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestHeaderModifier requestHeaderModifier) {
    
    this.requestHeaderModifier = requestHeaderModifier;
    return this;
  }

   /**
   * Get requestHeaderModifier
   * @return requestHeaderModifier
  **/
  @jakarta.annotation.Nullable
  public V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestHeaderModifier getRequestHeaderModifier() {
    return requestHeaderModifier;
  }


  public void setRequestHeaderModifier(V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestHeaderModifier requestHeaderModifier) {
    this.requestHeaderModifier = requestHeaderModifier;
  }


  public V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInner requestMirror(V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestMirror requestMirror) {
    
    this.requestMirror = requestMirror;
    return this;
  }

   /**
   * Get requestMirror
   * @return requestMirror
  **/
  @jakarta.annotation.Nullable
  public V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestMirror getRequestMirror() {
    return requestMirror;
  }


  public void setRequestMirror(V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestMirror requestMirror) {
    this.requestMirror = requestMirror;
  }


  public V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInner requestRedirect(V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestRedirect requestRedirect) {
    
    this.requestRedirect = requestRedirect;
    return this;
  }

   /**
   * Get requestRedirect
   * @return requestRedirect
  **/
  @jakarta.annotation.Nullable
  public V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestRedirect getRequestRedirect() {
    return requestRedirect;
  }


  public void setRequestRedirect(V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestRedirect requestRedirect) {
    this.requestRedirect = requestRedirect;
  }


  public V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInner responseHeaderModifier(V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerResponseHeaderModifier responseHeaderModifier) {
    
    this.responseHeaderModifier = responseHeaderModifier;
    return this;
  }

   /**
   * Get responseHeaderModifier
   * @return responseHeaderModifier
  **/
  @jakarta.annotation.Nullable
  public V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerResponseHeaderModifier getResponseHeaderModifier() {
    return responseHeaderModifier;
  }


  public void setResponseHeaderModifier(V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerResponseHeaderModifier responseHeaderModifier) {
    this.responseHeaderModifier = responseHeaderModifier;
  }


  public V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInner type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type identifies the type of filter to apply. As with other API fields, types are classified into three conformance levels:   - Core: Filter types and their corresponding configuration defined by \&quot;Support: Core\&quot; in this package, e.g. \&quot;RequestHeaderModifier\&quot;. All implementations must support core filters.   - Extended: Filter types and their corresponding configuration defined by \&quot;Support: Extended\&quot; in this package, e.g. \&quot;RequestMirror\&quot;. Implementers are encouraged to support extended filters.   - Implementation-specific: Filters that are defined and supported by specific vendors. In the future, filters showing convergence in behavior across multiple implementations will be considered for inclusion in extended or core conformance levels. Filter-specific configuration for such filters is specified using the ExtensionRef field. &#x60;Type&#x60; should be set to \&quot;ExtensionRef\&quot; for custom filters.   Implementers are encouraged to define custom implementation types to extend the core API with implementation-specific behavior.   If a reference to a custom filter type cannot be resolved, the filter MUST NOT be skipped. Instead, requests that would have been processed by that filter MUST receive a HTTP error response.   Note that values may be added to this enum, implementations must ensure that unknown values will not cause a crash.   Unknown values here must result in the implementation setting the Accepted Condition for the Route to &#x60;status: False&#x60;, with a Reason of &#x60;UnsupportedValue&#x60;.
   * @return type
  **/
  @jakarta.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInner urlRewrite(V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerUrlRewrite urlRewrite) {
    
    this.urlRewrite = urlRewrite;
    return this;
  }

   /**
   * Get urlRewrite
   * @return urlRewrite
  **/
  @jakarta.annotation.Nullable
  public V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerUrlRewrite getUrlRewrite() {
    return urlRewrite;
  }


  public void setUrlRewrite(V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerUrlRewrite urlRewrite) {
    this.urlRewrite = urlRewrite;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInner v1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInner = (V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInner) o;
    return Objects.equals(this.extensionRef, v1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInner.extensionRef) &&
        Objects.equals(this.requestHeaderModifier, v1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInner.requestHeaderModifier) &&
        Objects.equals(this.requestMirror, v1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInner.requestMirror) &&
        Objects.equals(this.requestRedirect, v1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInner.requestRedirect) &&
        Objects.equals(this.responseHeaderModifier, v1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInner.responseHeaderModifier) &&
        Objects.equals(this.type, v1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInner.type) &&
        Objects.equals(this.urlRewrite, v1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInner.urlRewrite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extensionRef, requestHeaderModifier, requestMirror, requestRedirect, responseHeaderModifier, type, urlRewrite);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInner {\n");
    sb.append("    extensionRef: ").append(toIndentedString(extensionRef)).append("\n");
    sb.append("    requestHeaderModifier: ").append(toIndentedString(requestHeaderModifier)).append("\n");
    sb.append("    requestMirror: ").append(toIndentedString(requestMirror)).append("\n");
    sb.append("    requestRedirect: ").append(toIndentedString(requestRedirect)).append("\n");
    sb.append("    responseHeaderModifier: ").append(toIndentedString(responseHeaderModifier)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    urlRewrite: ").append(toIndentedString(urlRewrite)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("extensionRef");
    openapiFields.add("requestHeaderModifier");
    openapiFields.add("requestMirror");
    openapiFields.add("requestRedirect");
    openapiFields.add("responseHeaderModifier");
    openapiFields.add("type");
    openapiFields.add("urlRewrite");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInner is not found in the empty JSON string", V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `extensionRef`
      if (jsonObj.get("extensionRef") != null && !jsonObj.get("extensionRef").isJsonNull()) {
        V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerExtensionRef.validateJsonElement(jsonObj.get("extensionRef"));
      }
      // validate the optional field `requestHeaderModifier`
      if (jsonObj.get("requestHeaderModifier") != null && !jsonObj.get("requestHeaderModifier").isJsonNull()) {
        V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestHeaderModifier.validateJsonElement(jsonObj.get("requestHeaderModifier"));
      }
      // validate the optional field `requestMirror`
      if (jsonObj.get("requestMirror") != null && !jsonObj.get("requestMirror").isJsonNull()) {
        V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestMirror.validateJsonElement(jsonObj.get("requestMirror"));
      }
      // validate the optional field `requestRedirect`
      if (jsonObj.get("requestRedirect") != null && !jsonObj.get("requestRedirect").isJsonNull()) {
        V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestRedirect.validateJsonElement(jsonObj.get("requestRedirect"));
      }
      // validate the optional field `responseHeaderModifier`
      if (jsonObj.get("responseHeaderModifier") != null && !jsonObj.get("responseHeaderModifier").isJsonNull()) {
        V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerResponseHeaderModifier.validateJsonElement(jsonObj.get("responseHeaderModifier"));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `urlRewrite`
      if (jsonObj.get("urlRewrite") != null && !jsonObj.get("urlRewrite").isJsonNull()) {
        V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerUrlRewrite.validateJsonElement(jsonObj.get("urlRewrite"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInner>() {
           @Override
           public void write(JsonWriter out, V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInner
  * @throws IOException if the JSON string is invalid with respect to V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInner
  */
  public static V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInner.class);
  }

 /**
  * Convert an instance of V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
