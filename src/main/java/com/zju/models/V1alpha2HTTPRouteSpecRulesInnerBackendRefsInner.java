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
import com.zju.models.V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * HTTPBackendRef defines how a HTTPRoute should forward an HTTP request.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-10T06:17:41.022715Z[Etc/UTC]")
public class V1alpha2HTTPRouteSpecRulesInnerBackendRefsInner {
  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private List<V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInner> filters;

  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private String group;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;

  public static final String SERIALIZED_NAME_WEIGHT = "weight";
  @SerializedName(SERIALIZED_NAME_WEIGHT)
  private Integer weight;

  public V1alpha2HTTPRouteSpecRulesInnerBackendRefsInner() {
  }

  public V1alpha2HTTPRouteSpecRulesInnerBackendRefsInner filters(List<V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInner> filters) {
    
    this.filters = filters;
    return this;
  }

  public V1alpha2HTTPRouteSpecRulesInnerBackendRefsInner addFiltersItem(V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInner filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * Filters defined at this level should be executed if and only if the request is being forwarded to the backend defined here.   Support: Implementation-specific (For broader support of filters, use the Filters field in HTTPRouteRule.)
   * @return filters
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInner> getFilters() {
    return filters;
  }


  public void setFilters(List<V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInner> filters) {
    this.filters = filters;
  }


  public V1alpha2HTTPRouteSpecRulesInnerBackendRefsInner group(String group) {
    
    this.group = group;
    return this;
  }

   /**
   * Group is the group of the referent. For example, \&quot;gateway.networking.k8s.io\&quot;. When unspecified or empty string, core API group is inferred.
   * @return group
  **/
  @jakarta.annotation.Nullable
  public String getGroup() {
    return group;
  }


  public void setGroup(String group) {
    this.group = group;
  }


  public V1alpha2HTTPRouteSpecRulesInnerBackendRefsInner kind(String kind) {
    
    this.kind = kind;
    return this;
  }

   /**
   * Kind is the Kubernetes resource kind of the referent. For example \&quot;Service\&quot;.   Defaults to \&quot;Service\&quot; when not specified.   ExternalName services can refer to CNAME DNS records that may live outside of the cluster and as such are difficult to reason about in terms of conformance. They also may not be safe to forward to (see CVE-2021-25740 for more information). Implementations SHOULD NOT support ExternalName Services.   Support: Core (Services with a type other than ExternalName)   Support: Implementation-specific (Services with type ExternalName)
   * @return kind
  **/
  @jakarta.annotation.Nullable
  public String getKind() {
    return kind;
  }


  public void setKind(String kind) {
    this.kind = kind;
  }


  public V1alpha2HTTPRouteSpecRulesInnerBackendRefsInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name is the name of the referent.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1alpha2HTTPRouteSpecRulesInnerBackendRefsInner namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * Namespace is the namespace of the backend. When unspecified, the local namespace is inferred.   Note that when a namespace different than the local namespace is specified, a ReferenceGrant object is required in the referent namespace to allow that namespace&#39;s owner to accept the reference. See the ReferenceGrant documentation for details.   Support: Core
   * @return namespace
  **/
  @jakarta.annotation.Nullable
  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public V1alpha2HTTPRouteSpecRulesInnerBackendRefsInner port(Integer port) {
    
    this.port = port;
    return this;
  }

   /**
   * Port specifies the destination port number to use for this resource. Port is required when the referent is a Kubernetes Service. In this case, the port number is the service port number, not the target port. For other resources, destination port might be derived from the referent resource or this field.
   * minimum: 1
   * maximum: 65535
   * @return port
  **/
  @jakarta.annotation.Nullable
  public Integer getPort() {
    return port;
  }


  public void setPort(Integer port) {
    this.port = port;
  }


  public V1alpha2HTTPRouteSpecRulesInnerBackendRefsInner weight(Integer weight) {
    
    this.weight = weight;
    return this;
  }

   /**
   * Weight specifies the proportion of requests forwarded to the referenced backend. This is computed as weight/(sum of all weights in this BackendRefs list). For non-zero values, there may be some epsilon from the exact proportion defined here depending on the precision an implementation supports. Weight is not a percentage and the sum of weights does not need to equal 100.   If only one backend is specified and it has a weight greater than 0, 100% of the traffic is forwarded to that backend. If weight is set to 0, no traffic should be forwarded for this entry. If unspecified, weight defaults to 1.   Support for this field varies based on the context where used.
   * minimum: 0
   * maximum: 1000000
   * @return weight
  **/
  @jakarta.annotation.Nullable
  public Integer getWeight() {
    return weight;
  }


  public void setWeight(Integer weight) {
    this.weight = weight;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2HTTPRouteSpecRulesInnerBackendRefsInner v1alpha2HTTPRouteSpecRulesInnerBackendRefsInner = (V1alpha2HTTPRouteSpecRulesInnerBackendRefsInner) o;
    return Objects.equals(this.filters, v1alpha2HTTPRouteSpecRulesInnerBackendRefsInner.filters) &&
        Objects.equals(this.group, v1alpha2HTTPRouteSpecRulesInnerBackendRefsInner.group) &&
        Objects.equals(this.kind, v1alpha2HTTPRouteSpecRulesInnerBackendRefsInner.kind) &&
        Objects.equals(this.name, v1alpha2HTTPRouteSpecRulesInnerBackendRefsInner.name) &&
        Objects.equals(this.namespace, v1alpha2HTTPRouteSpecRulesInnerBackendRefsInner.namespace) &&
        Objects.equals(this.port, v1alpha2HTTPRouteSpecRulesInnerBackendRefsInner.port) &&
        Objects.equals(this.weight, v1alpha2HTTPRouteSpecRulesInnerBackendRefsInner.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filters, group, kind, name, namespace, port, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2HTTPRouteSpecRulesInnerBackendRefsInner {\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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
    openapiFields.add("filters");
    openapiFields.add("group");
    openapiFields.add("kind");
    openapiFields.add("name");
    openapiFields.add("namespace");
    openapiFields.add("port");
    openapiFields.add("weight");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V1alpha2HTTPRouteSpecRulesInnerBackendRefsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1alpha2HTTPRouteSpecRulesInnerBackendRefsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha2HTTPRouteSpecRulesInnerBackendRefsInner is not found in the empty JSON string", V1alpha2HTTPRouteSpecRulesInnerBackendRefsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1alpha2HTTPRouteSpecRulesInnerBackendRefsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha2HTTPRouteSpecRulesInnerBackendRefsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha2HTTPRouteSpecRulesInnerBackendRefsInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("filters") != null && !jsonObj.get("filters").isJsonNull()) {
        JsonArray jsonArrayfilters = jsonObj.getAsJsonArray("filters");
        if (jsonArrayfilters != null) {
          // ensure the json data is an array
          if (!jsonObj.get("filters").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `filters` to be an array in the JSON string but got `%s`", jsonObj.get("filters").toString()));
          }

          // validate the optional field `filters` (array)
          for (int i = 0; i < jsonArrayfilters.size(); i++) {
            V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInner.validateJsonElement(jsonArrayfilters.get(i));
          };
        }
      }
      if ((jsonObj.get("group") != null && !jsonObj.get("group").isJsonNull()) && !jsonObj.get("group").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `group` to be a primitive type in the JSON string but got `%s`", jsonObj.get("group").toString()));
      }
      if ((jsonObj.get("kind") != null && !jsonObj.get("kind").isJsonNull()) && !jsonObj.get("kind").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kind` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kind").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("namespace") != null && !jsonObj.get("namespace").isJsonNull()) && !jsonObj.get("namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha2HTTPRouteSpecRulesInnerBackendRefsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha2HTTPRouteSpecRulesInnerBackendRefsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha2HTTPRouteSpecRulesInnerBackendRefsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha2HTTPRouteSpecRulesInnerBackendRefsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha2HTTPRouteSpecRulesInnerBackendRefsInner>() {
           @Override
           public void write(JsonWriter out, V1alpha2HTTPRouteSpecRulesInnerBackendRefsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha2HTTPRouteSpecRulesInnerBackendRefsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha2HTTPRouteSpecRulesInnerBackendRefsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha2HTTPRouteSpecRulesInnerBackendRefsInner
  * @throws IOException if the JSON string is invalid with respect to V1alpha2HTTPRouteSpecRulesInnerBackendRefsInner
  */
  public static V1alpha2HTTPRouteSpecRulesInnerBackendRefsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha2HTTPRouteSpecRulesInnerBackendRefsInner.class);
  }

 /**
  * Convert an instance of V1alpha2HTTPRouteSpecRulesInnerBackendRefsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

