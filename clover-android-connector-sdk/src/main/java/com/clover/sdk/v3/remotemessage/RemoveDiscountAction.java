/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */


/*
 * Copyright (C) 2016 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.clover.sdk.v3.remotemessage;

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getDiscountId discountId}</li>
 * <li>{@link #getLineItemId lineItemId}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class RemoveDiscountAction extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  public java.lang.String getDiscountId() {
    return genClient.cacheGet(CacheKey.discountId);
  }

  public java.lang.String getLineItemId() {
    return genClient.cacheGet(CacheKey.lineItemId);
  }




  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<RemoveDiscountAction> {
    discountId {
      @Override
      public Object extractValue(RemoveDiscountAction instance) {
        return instance.genClient.extractOther("discountId", java.lang.String.class);
      }
    },
    lineItemId {
      @Override
      public Object extractValue(RemoveDiscountAction instance) {
        return instance.genClient.extractOther("lineItemId", java.lang.String.class);
      }
    },
      ;
  }

  private GenericClient<RemoveDiscountAction> genClient;

  /**
  * Constructs a new empty instance.
  */
  public RemoveDiscountAction() {
    genClient = new GenericClient<RemoveDiscountAction>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
  * Constructs a new empty instance.
  */
  protected RemoveDiscountAction(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public RemoveDiscountAction(String json) throws IllegalArgumentException {
    this();
    try {
      genClient.setJsonObject(new org.json.JSONObject(json));
    } catch (org.json.JSONException e) {
      throw new IllegalArgumentException("invalid json", e);
    }
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public RemoveDiscountAction(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public RemoveDiscountAction(RemoveDiscountAction src) {
    this();
    if (src.genClient.getJsonObject() != null) {
      genClient.setJsonObject(com.clover.sdk.v3.JsonHelper.deepCopy(src.genClient.getJSONObject()));
    }
  }

  /**
   * Returns the internal JSONObject backing this instance, the return value is not a copy so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public org.json.JSONObject getJSONObject() {
    return genClient.getJSONObject();
  }

  @Override
  public void validate() {
  }

  /** Checks whether the 'discountId' field is set and is not null */
  public boolean isNotNullDiscountId() {
    return genClient.cacheValueIsNotNull(CacheKey.discountId);
  }

  /** Checks whether the 'lineItemId' field is set and is not null */
  public boolean isNotNullLineItemId() {
    return genClient.cacheValueIsNotNull(CacheKey.lineItemId);
  }



  /** Checks whether the 'discountId' field has been set, however the value could be null */
  public boolean hasDiscountId() {
    return genClient.cacheHasKey(CacheKey.discountId);
  }

  /** Checks whether the 'lineItemId' field has been set, however the value could be null */
  public boolean hasLineItemId() {
    return genClient.cacheHasKey(CacheKey.lineItemId);
  }


  /**
   * Sets the field 'discountId'.
   */
  public RemoveDiscountAction setDiscountId(java.lang.String discountId) {
    return genClient.setOther(discountId, CacheKey.discountId);
  }

  /**
   * Sets the field 'lineItemId'.
   */
  public RemoveDiscountAction setLineItemId(java.lang.String lineItemId) {
    return genClient.setOther(lineItemId, CacheKey.lineItemId);
  }


  /** Clears the 'discountId' field, the 'has' method for this field will now return false */
  public void clearDiscountId() {
    genClient.clear(CacheKey.discountId);
  }
  /** Clears the 'lineItemId' field, the 'has' method for this field will now return false */
  public void clearLineItemId() {
    genClient.clear(CacheKey.lineItemId);
  }


  /**
   * Returns true if this instance has any changes.
   */
  public boolean containsChanges() {
    return genClient.containsChanges();
  }

  /**
   * Reset the log of changes made to this instance, calling copyChanges() after this would return an empty instance.
   */
  public void resetChangeLog() {
    genClient.resetChangeLog();
  }

  /**
   * Create a copy of this instance that contains only fields that were set after the constructor was called.
   */
  public RemoveDiscountAction copyChanges() {
    RemoveDiscountAction copy = new RemoveDiscountAction();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(RemoveDiscountAction src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new RemoveDiscountAction(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<RemoveDiscountAction> CREATOR = new android.os.Parcelable.Creator<RemoveDiscountAction>() {
    @Override
    public RemoveDiscountAction createFromParcel(android.os.Parcel in) {
      RemoveDiscountAction instance = new RemoveDiscountAction(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public RemoveDiscountAction[] newArray(int size) {
      return new RemoveDiscountAction[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<RemoveDiscountAction> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<RemoveDiscountAction>() {
    @Override
    public RemoveDiscountAction create(org.json.JSONObject jsonObject) {
      return new RemoveDiscountAction(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean DISCOUNTID_IS_REQUIRED = false;
    public static final boolean LINEITEMID_IS_REQUIRED = false;

  }

}