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
import com.zju.models.V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestHeaderModifierAddInner;
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
 * RequestHeaderModifier defines a schema for a filter that modifies request headers.   Support: Core
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-10T06:17:41.022715Z[Etc/UTC]")
public class V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestHeaderModifier {
  public static final String SERIALIZED_NAME_ADD = "add";
  @SerializedName(SERIALIZED_NAME_ADD)
  private List<V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestHeaderModifierAddInner> add;

  public static final String SERIALIZED_NAME_REMOVE = "remove";
  @SerializedName(SERIALIZED_NAME_REMOVE)
  private List<String> remove;

  public static final String SERIALIZED_NAME_SET = "set";
  @SerializedName(SERIALIZED_NAME_SET)
  private List<V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestHeaderModifierAddInner> set;

  public V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestHeaderModifier() {
  }

  public V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestHeaderModifier add(List<V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestHeaderModifierAddInner> add) {
    
    this.add = add;
    return this;
  }

  public V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestHeaderModifier addAddItem(V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestHeaderModifierAddInner addItem) {
    if (this.add == null) {
      this.add = new ArrayList<>();
    }
    this.add.add(addItem);
    return this;
  }

   /**
   * Add adds the given header(s) (name, value) to the request before the action. It appends to any existing values associated with the header name.   Input: GET /foo HTTP/1.1 my-header: foo   Config: add: - name: \&quot;my-header\&quot; value: \&quot;bar,baz\&quot;   Output: GET /foo HTTP/1.1 my-header: foo,bar,baz
   * @return add
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestHeaderModifierAddInner> getAdd() {
    return add;
  }


  public void setAdd(List<V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestHeaderModifierAddInner> add) {
    this.add = add;
  }


  public V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestHeaderModifier remove(List<String> remove) {
    
    this.remove = remove;
    return this;
  }

  public V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestHeaderModifier addRemoveItem(String removeItem) {
    if (this.remove == null) {
      this.remove = new ArrayList<>();
    }
    this.remove.add(removeItem);
    return this;
  }

   /**
   * Remove the given header(s) from the HTTP request before the action. The value of Remove is a list of HTTP header names. Note that the header names are case-insensitive (see https://datatracker.ietf.org/doc/html/rfc2616#section-4.2).   Input: GET /foo HTTP/1.1 my-header1: foo my-header2: bar my-header3: baz   Config: remove: [\&quot;my-header1\&quot;, \&quot;my-header3\&quot;]   Output: GET /foo HTTP/1.1 my-header2: bar
   * @return remove
  **/
  @jakarta.annotation.Nullable
  public List<String> getRemove() {
    return remove;
  }


  public void setRemove(List<String> remove) {
    this.remove = remove;
  }


  public V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestHeaderModifier set(List<V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestHeaderModifierAddInner> set) {
    
    this.set = set;
    return this;
  }

  public V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestHeaderModifier addSetItem(V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestHeaderModifierAddInner setItem) {
    if (this.set == null) {
      this.set = new ArrayList<>();
    }
    this.set.add(setItem);
    return this;
  }

   /**
   * Set overwrites the request with the given header (name, value) before the action.   Input: GET /foo HTTP/1.1 my-header: foo   Config: set: - name: \&quot;my-header\&quot; value: \&quot;bar\&quot;   Output: GET /foo HTTP/1.1 my-header: bar
   * @return set
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestHeaderModifierAddInner> getSet() {
    return set;
  }


  public void setSet(List<V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestHeaderModifierAddInner> set) {
    this.set = set;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestHeaderModifier v1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestHeaderModifier = (V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestHeaderModifier) o;
    return Objects.equals(this.add, v1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestHeaderModifier.add) &&
        Objects.equals(this.remove, v1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestHeaderModifier.remove) &&
        Objects.equals(this.set, v1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestHeaderModifier.set);
  }

  @Override
  public int hashCode() {
    return Objects.hash(add, remove, set);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestHeaderModifier {\n");
    sb.append("    add: ").append(toIndentedString(add)).append("\n");
    sb.append("    remove: ").append(toIndentedString(remove)).append("\n");
    sb.append("    set: ").append(toIndentedString(set)).append("\n");
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
    openapiFields.add("add");
    openapiFields.add("remove");
    openapiFields.add("set");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestHeaderModifier
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestHeaderModifier.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestHeaderModifier is not found in the empty JSON string", V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestHeaderModifier.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestHeaderModifier.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestHeaderModifier` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("add") != null && !jsonObj.get("add").isJsonNull()) {
        JsonArray jsonArrayadd = jsonObj.getAsJsonArray("add");
        if (jsonArrayadd != null) {
          // ensure the json data is an array
          if (!jsonObj.get("add").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `add` to be an array in the JSON string but got `%s`", jsonObj.get("add").toString()));
          }

          // validate the optional field `add` (array)
          for (int i = 0; i < jsonArrayadd.size(); i++) {
            V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestHeaderModifierAddInner.validateJsonElement(jsonArrayadd.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("remove") != null && !jsonObj.get("remove").isJsonNull() && !jsonObj.get("remove").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `remove` to be an array in the JSON string but got `%s`", jsonObj.get("remove").toString()));
      }
      if (jsonObj.get("set") != null && !jsonObj.get("set").isJsonNull()) {
        JsonArray jsonArrayset = jsonObj.getAsJsonArray("set");
        if (jsonArrayset != null) {
          // ensure the json data is an array
          if (!jsonObj.get("set").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `set` to be an array in the JSON string but got `%s`", jsonObj.get("set").toString()));
          }

          // validate the optional field `set` (array)
          for (int i = 0; i < jsonArrayset.size(); i++) {
            V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestHeaderModifierAddInner.validateJsonElement(jsonArrayset.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestHeaderModifier.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestHeaderModifier' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestHeaderModifier> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestHeaderModifier.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestHeaderModifier>() {
           @Override
           public void write(JsonWriter out, V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestHeaderModifier value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestHeaderModifier read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestHeaderModifier given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestHeaderModifier
  * @throws IOException if the JSON string is invalid with respect to V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestHeaderModifier
  */
  public static V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestHeaderModifier fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestHeaderModifier.class);
  }

 /**
  * Convert an instance of V1alpha2HTTPRouteSpecRulesInnerBackendRefsInnerFiltersInnerRequestHeaderModifier to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

