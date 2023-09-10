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
import com.zju.models.V1alpha2HTTPRouteSpecParentRefsInner;
import com.zju.models.V1alpha2HTTPRouteSpecRulesInner;
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
 * Spec defines the desired state of HTTPRoute.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-10T06:17:41.022715Z[Etc/UTC]")
public class V1alpha2HTTPRouteSpec {
  public static final String SERIALIZED_NAME_HOSTNAMES = "hostnames";
  @SerializedName(SERIALIZED_NAME_HOSTNAMES)
  private List<String> hostnames;

  public static final String SERIALIZED_NAME_PARENT_REFS = "parentRefs";
  @SerializedName(SERIALIZED_NAME_PARENT_REFS)
  private List<V1alpha2HTTPRouteSpecParentRefsInner> parentRefs;

  public static final String SERIALIZED_NAME_RULES = "rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  private List<V1alpha2HTTPRouteSpecRulesInner> rules;

  public V1alpha2HTTPRouteSpec() {
  }

  public V1alpha2HTTPRouteSpec hostnames(List<String> hostnames) {
    
    this.hostnames = hostnames;
    return this;
  }

  public V1alpha2HTTPRouteSpec addHostnamesItem(String hostnamesItem) {
    if (this.hostnames == null) {
      this.hostnames = new ArrayList<>();
    }
    this.hostnames.add(hostnamesItem);
    return this;
  }

   /**
   * Hostnames defines a set of hostname that should match against the HTTP Host header to select a HTTPRoute used to process the request. Implementations MUST ignore any port value specified in the HTTP Host header while performing a match.   Valid values for Hostnames are determined by RFC 1123 definition of a hostname with 2 notable exceptions:   1. IPs are not allowed. 2. A hostname may be prefixed with a wildcard label (&#x60;*.&#x60;). The wildcard label must appear by itself as the first label.   If a hostname is specified by both the Listener and HTTPRoute, there must be at least one intersecting hostname for the HTTPRoute to be attached to the Listener. For example:   * A Listener with &#x60;test.example.com&#x60; as the hostname matches HTTPRoutes that have either not specified any hostnames, or have specified at least one of &#x60;test.example.com&#x60; or &#x60;*.example.com&#x60;. * A Listener with &#x60;*.example.com&#x60; as the hostname matches HTTPRoutes that have either not specified any hostnames or have specified at least one hostname that matches the Listener hostname. For example, &#x60;*.example.com&#x60;, &#x60;test.example.com&#x60;, and &#x60;foo.test.example.com&#x60; would all match. On the other hand, &#x60;example.com&#x60; and &#x60;test.example.net&#x60; would not match.   Hostnames that are prefixed with a wildcard label (&#x60;*.&#x60;) are interpreted as a suffix match. That means that a match for &#x60;*.example.com&#x60; would match both &#x60;test.example.com&#x60;, and &#x60;foo.test.example.com&#x60;, but not &#x60;example.com&#x60;.   If both the Listener and HTTPRoute have specified hostnames, any HTTPRoute hostnames that do not match the Listener hostname MUST be ignored. For example, if a Listener specified &#x60;*.example.com&#x60;, and the HTTPRoute specified &#x60;test.example.com&#x60; and &#x60;test.example.net&#x60;, &#x60;test.example.net&#x60; must not be considered for a match.   If both the Listener and HTTPRoute have specified hostnames, and none match with the criteria above, then the HTTPRoute is not accepted. The implementation must raise an &#39;Accepted&#39; Condition with a status of &#x60;False&#x60; in the corresponding RouteParentStatus.   In the event that multiple HTTPRoutes specify intersecting hostnames (e.g. overlapping wildcard matching and exact matching hostnames), precedence must be given to rules from the HTTPRoute with the largest number of:   * Characters in a matching non-wildcard hostname. * Characters in a matching hostname.   If ties exist across multiple Routes, the matching precedence rules for HTTPRouteMatches takes over.   Support: Core
   * @return hostnames
  **/
  @jakarta.annotation.Nullable
  public List<String> getHostnames() {
    return hostnames;
  }


  public void setHostnames(List<String> hostnames) {
    this.hostnames = hostnames;
  }


  public V1alpha2HTTPRouteSpec parentRefs(List<V1alpha2HTTPRouteSpecParentRefsInner> parentRefs) {
    
    this.parentRefs = parentRefs;
    return this;
  }

  public V1alpha2HTTPRouteSpec addParentRefsItem(V1alpha2HTTPRouteSpecParentRefsInner parentRefsItem) {
    if (this.parentRefs == null) {
      this.parentRefs = new ArrayList<>();
    }
    this.parentRefs.add(parentRefsItem);
    return this;
  }

   /**
   * ParentRefs references the resources (usually Gateways) that a Route wants to be attached to. Note that the referenced parent resource needs to allow this for the attachment to be complete. For Gateways, that means the Gateway needs to allow attachment from Routes of this kind and namespace.   The only kind of parent resource with \&quot;Core\&quot; support is Gateway. This API may be extended in the future to support additional kinds of parent resources such as one of the route kinds.   It is invalid to reference an identical parent more than once. It is valid to reference multiple distinct sections within the same parent resource, such as 2 Listeners within a Gateway.   It is possible to separately reference multiple distinct objects that may be collapsed by an implementation. For example, some implementations may choose to merge compatible Gateway Listeners together. If that is the case, the list of routes attached to those resources should also be merged.   Note that for ParentRefs that cross namespace boundaries, there are specific rules. Cross-namespace references are only valid if they are explicitly allowed by something in the namespace they are referring to. For example, Gateway has the AllowedRoutes field, and ReferenceGrant provides a generic way to enable any other kind of cross-namespace reference.
   * @return parentRefs
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha2HTTPRouteSpecParentRefsInner> getParentRefs() {
    return parentRefs;
  }


  public void setParentRefs(List<V1alpha2HTTPRouteSpecParentRefsInner> parentRefs) {
    this.parentRefs = parentRefs;
  }


  public V1alpha2HTTPRouteSpec rules(List<V1alpha2HTTPRouteSpecRulesInner> rules) {
    
    this.rules = rules;
    return this;
  }

  public V1alpha2HTTPRouteSpec addRulesItem(V1alpha2HTTPRouteSpecRulesInner rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Rules are a list of HTTP matchers, filters and actions.
   * @return rules
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha2HTTPRouteSpecRulesInner> getRules() {
    return rules;
  }


  public void setRules(List<V1alpha2HTTPRouteSpecRulesInner> rules) {
    this.rules = rules;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2HTTPRouteSpec v1alpha2HTTPRouteSpec = (V1alpha2HTTPRouteSpec) o;
    return Objects.equals(this.hostnames, v1alpha2HTTPRouteSpec.hostnames) &&
        Objects.equals(this.parentRefs, v1alpha2HTTPRouteSpec.parentRefs) &&
        Objects.equals(this.rules, v1alpha2HTTPRouteSpec.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostnames, parentRefs, rules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2HTTPRouteSpec {\n");
    sb.append("    hostnames: ").append(toIndentedString(hostnames)).append("\n");
    sb.append("    parentRefs: ").append(toIndentedString(parentRefs)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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
    openapiFields.add("hostnames");
    openapiFields.add("parentRefs");
    openapiFields.add("rules");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V1alpha2HTTPRouteSpec
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1alpha2HTTPRouteSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha2HTTPRouteSpec is not found in the empty JSON string", V1alpha2HTTPRouteSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1alpha2HTTPRouteSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha2HTTPRouteSpec` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("hostnames") != null && !jsonObj.get("hostnames").isJsonNull() && !jsonObj.get("hostnames").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `hostnames` to be an array in the JSON string but got `%s`", jsonObj.get("hostnames").toString()));
      }
      if (jsonObj.get("parentRefs") != null && !jsonObj.get("parentRefs").isJsonNull()) {
        JsonArray jsonArrayparentRefs = jsonObj.getAsJsonArray("parentRefs");
        if (jsonArrayparentRefs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("parentRefs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `parentRefs` to be an array in the JSON string but got `%s`", jsonObj.get("parentRefs").toString()));
          }

          // validate the optional field `parentRefs` (array)
          for (int i = 0; i < jsonArrayparentRefs.size(); i++) {
            V1alpha2HTTPRouteSpecParentRefsInner.validateJsonElement(jsonArrayparentRefs.get(i));
          };
        }
      }
      if (jsonObj.get("rules") != null && !jsonObj.get("rules").isJsonNull()) {
        JsonArray jsonArrayrules = jsonObj.getAsJsonArray("rules");
        if (jsonArrayrules != null) {
          // ensure the json data is an array
          if (!jsonObj.get("rules").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `rules` to be an array in the JSON string but got `%s`", jsonObj.get("rules").toString()));
          }

          // validate the optional field `rules` (array)
          for (int i = 0; i < jsonArrayrules.size(); i++) {
            V1alpha2HTTPRouteSpecRulesInner.validateJsonElement(jsonArrayrules.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha2HTTPRouteSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha2HTTPRouteSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha2HTTPRouteSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha2HTTPRouteSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha2HTTPRouteSpec>() {
           @Override
           public void write(JsonWriter out, V1alpha2HTTPRouteSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha2HTTPRouteSpec read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha2HTTPRouteSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha2HTTPRouteSpec
  * @throws IOException if the JSON string is invalid with respect to V1alpha2HTTPRouteSpec
  */
  public static V1alpha2HTTPRouteSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha2HTTPRouteSpec.class);
  }

 /**
  * Convert an instance of V1alpha2HTTPRouteSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

