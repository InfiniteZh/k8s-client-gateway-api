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
import com.zju.models.V1alpha2HTTPRouteStatusParentsInnerConditionsInner;
import com.zju.models.V1alpha2HTTPRouteStatusParentsInnerParentRef;
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
 * RouteParentStatus describes the status of a route with respect to an associated Parent.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-10T06:17:41.022715Z[Etc/UTC]")
public class V1alpha2HTTPRouteStatusParentsInner {
  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<V1alpha2HTTPRouteStatusParentsInnerConditionsInner> conditions;

  public static final String SERIALIZED_NAME_CONTROLLER_NAME = "controllerName";
  @SerializedName(SERIALIZED_NAME_CONTROLLER_NAME)
  private String controllerName;

  public static final String SERIALIZED_NAME_PARENT_REF = "parentRef";
  @SerializedName(SERIALIZED_NAME_PARENT_REF)
  private V1alpha2HTTPRouteStatusParentsInnerParentRef parentRef;

  public V1alpha2HTTPRouteStatusParentsInner() {
  }

  public V1alpha2HTTPRouteStatusParentsInner conditions(List<V1alpha2HTTPRouteStatusParentsInnerConditionsInner> conditions) {
    
    this.conditions = conditions;
    return this;
  }

  public V1alpha2HTTPRouteStatusParentsInner addConditionsItem(V1alpha2HTTPRouteStatusParentsInnerConditionsInner conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Conditions describes the status of the route with respect to the Gateway. Note that the route&#39;s availability is also subject to the Gateway&#39;s own status conditions and listener status.   If the Route&#39;s ParentRef specifies an existing Gateway that supports Routes of this kind AND that Gateway&#39;s controller has sufficient access, then that Gateway&#39;s controller MUST set the \&quot;Accepted\&quot; condition on the Route, to indicate whether the route has been accepted or rejected by the Gateway, and why.   A Route MUST be considered \&quot;Accepted\&quot; if at least one of the Route&#39;s rules is implemented by the Gateway.   There are a number of cases where the \&quot;Accepted\&quot; condition may not be set due to lack of controller visibility, that includes when:   * The Route refers to a non-existent parent. * The Route is of a type that the controller does not support. * The Route is in a namespace the controller does not have access to.
   * @return conditions
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha2HTTPRouteStatusParentsInnerConditionsInner> getConditions() {
    return conditions;
  }


  public void setConditions(List<V1alpha2HTTPRouteStatusParentsInnerConditionsInner> conditions) {
    this.conditions = conditions;
  }


  public V1alpha2HTTPRouteStatusParentsInner controllerName(String controllerName) {
    
    this.controllerName = controllerName;
    return this;
  }

   /**
   * ControllerName is a domain/path string that indicates the name of the controller that wrote this status. This corresponds with the controllerName field on GatewayClass.   Example: \&quot;example.net/gateway-controller\&quot;.   The format of this field is DOMAIN \&quot;/\&quot; PATH, where DOMAIN and PATH are valid Kubernetes names (https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names).   Controllers MUST populate this field when writing status. Controllers should ensure that entries to status populated with their ControllerName are cleaned up when they are no longer necessary.
   * @return controllerName
  **/
  @jakarta.annotation.Nonnull
  public String getControllerName() {
    return controllerName;
  }


  public void setControllerName(String controllerName) {
    this.controllerName = controllerName;
  }


  public V1alpha2HTTPRouteStatusParentsInner parentRef(V1alpha2HTTPRouteStatusParentsInnerParentRef parentRef) {
    
    this.parentRef = parentRef;
    return this;
  }

   /**
   * Get parentRef
   * @return parentRef
  **/
  @jakarta.annotation.Nonnull
  public V1alpha2HTTPRouteStatusParentsInnerParentRef getParentRef() {
    return parentRef;
  }


  public void setParentRef(V1alpha2HTTPRouteStatusParentsInnerParentRef parentRef) {
    this.parentRef = parentRef;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2HTTPRouteStatusParentsInner v1alpha2HTTPRouteStatusParentsInner = (V1alpha2HTTPRouteStatusParentsInner) o;
    return Objects.equals(this.conditions, v1alpha2HTTPRouteStatusParentsInner.conditions) &&
        Objects.equals(this.controllerName, v1alpha2HTTPRouteStatusParentsInner.controllerName) &&
        Objects.equals(this.parentRef, v1alpha2HTTPRouteStatusParentsInner.parentRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, controllerName, parentRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2HTTPRouteStatusParentsInner {\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    controllerName: ").append(toIndentedString(controllerName)).append("\n");
    sb.append("    parentRef: ").append(toIndentedString(parentRef)).append("\n");
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
    openapiFields.add("conditions");
    openapiFields.add("controllerName");
    openapiFields.add("parentRef");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("controllerName");
    openapiRequiredFields.add("parentRef");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V1alpha2HTTPRouteStatusParentsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1alpha2HTTPRouteStatusParentsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha2HTTPRouteStatusParentsInner is not found in the empty JSON string", V1alpha2HTTPRouteStatusParentsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1alpha2HTTPRouteStatusParentsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha2HTTPRouteStatusParentsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha2HTTPRouteStatusParentsInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("conditions") != null && !jsonObj.get("conditions").isJsonNull()) {
        JsonArray jsonArrayconditions = jsonObj.getAsJsonArray("conditions");
        if (jsonArrayconditions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("conditions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `conditions` to be an array in the JSON string but got `%s`", jsonObj.get("conditions").toString()));
          }

          // validate the optional field `conditions` (array)
          for (int i = 0; i < jsonArrayconditions.size(); i++) {
            V1alpha2HTTPRouteStatusParentsInnerConditionsInner.validateJsonElement(jsonArrayconditions.get(i));
          };
        }
      }
      if (!jsonObj.get("controllerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `controllerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("controllerName").toString()));
      }
      // validate the required field `parentRef`
      V1alpha2HTTPRouteStatusParentsInnerParentRef.validateJsonElement(jsonObj.get("parentRef"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha2HTTPRouteStatusParentsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha2HTTPRouteStatusParentsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha2HTTPRouteStatusParentsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha2HTTPRouteStatusParentsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha2HTTPRouteStatusParentsInner>() {
           @Override
           public void write(JsonWriter out, V1alpha2HTTPRouteStatusParentsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha2HTTPRouteStatusParentsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha2HTTPRouteStatusParentsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha2HTTPRouteStatusParentsInner
  * @throws IOException if the JSON string is invalid with respect to V1alpha2HTTPRouteStatusParentsInner
  */
  public static V1alpha2HTTPRouteStatusParentsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha2HTTPRouteStatusParentsInner.class);
  }

 /**
  * Convert an instance of V1alpha2HTTPRouteStatusParentsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
