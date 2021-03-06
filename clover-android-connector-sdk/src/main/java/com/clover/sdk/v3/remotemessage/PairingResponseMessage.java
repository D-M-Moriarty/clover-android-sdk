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

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getPairingState pairingState}</li>
 * <li>{@link #getMillis millis}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class PairingResponseMessage extends com.clover.sdk.v3.remotemessage.PairingRequestMessage {

  /**
   * The state of the pairing flow
   */
  public com.clover.sdk.v3.remotemessage.PairingState getPairingState() {
    return genClient.cacheGet(CacheKey.pairingState);
  }

  /**
   * A timestamp of when the authentication token was obtained
   */
  public java.lang.Long getMillis() {
    return genClient.cacheGet(CacheKey.millis);
  }

  /**
   * The peripheral sends a pairing request containing the peripheral name
   */
  @Override
  public java.lang.String getName() {
    return genClient.cacheGet(CacheKey.name);
  }

  /**
   * The peripheral serial number
   */
  @Override
  public java.lang.String getSerialNumber() {
    return genClient.cacheGet(CacheKey.serialNumber);
  }

  /**
   * The name of the application the peripheral is associated with. This is the "resourceDescriptor" in the handshake
   */
  @Override
  public java.lang.String getApplicationName() {
    return genClient.cacheGet(CacheKey.applicationName);
  }

  /**
   * The token, recognized by the specific device.
   */
  @Override
  public java.lang.String getAuthenticationToken() {
    return genClient.cacheGet(CacheKey.authenticationToken);
  }

  /**
   * The list of message types
   */
  @Override
  public com.clover.sdk.v3.remotemessage.Method getMethod() {
    return genClient.cacheGet(CacheKey.method);
  }

  /**
   * The version of this message
   */
  @Override
  public java.lang.Integer getVersion() {
    return genClient.cacheGet(CacheKey.version);
  }




  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<PairingResponseMessage> {
    pairingState {
      @Override
      public Object extractValue(PairingResponseMessage instance) {
        return instance.genClient.extractEnum("pairingState", com.clover.sdk.v3.remotemessage.PairingState.class);
      }
    },
    millis {
      @Override
      public Object extractValue(PairingResponseMessage instance) {
        return instance.genClient.extractOther("millis", java.lang.Long.class);
      }
    },
    name {
      @Override
      public Object extractValue(PairingResponseMessage instance) {
        return instance.genClient.extractOther("name", java.lang.String.class);
      }
    },
    serialNumber {
      @Override
      public Object extractValue(PairingResponseMessage instance) {
        return instance.genClient.extractOther("serialNumber", java.lang.String.class);
      }
    },
    applicationName {
      @Override
      public Object extractValue(PairingResponseMessage instance) {
        return instance.genClient.extractOther("applicationName", java.lang.String.class);
      }
    },
    authenticationToken {
      @Override
      public Object extractValue(PairingResponseMessage instance) {
        return instance.genClient.extractOther("authenticationToken", java.lang.String.class);
      }
    },
    method {
      @Override
      public Object extractValue(PairingResponseMessage instance) {
        return instance.genClient.extractEnum("method", com.clover.sdk.v3.remotemessage.Method.class);
      }
    },
    version {
      @Override
      public Object extractValue(PairingResponseMessage instance) {
        return instance.genClient.extractOther("version", java.lang.Integer.class);
      }
    },
      ;
  }

  private GenericClient<PairingResponseMessage> genClient;

  /**
  * Constructs a new empty instance.
  */
  public PairingResponseMessage() {
    super(false);
    genClient = new GenericClient<PairingResponseMessage>(this);
    this.setMethod(com.clover.sdk.v3.remotemessage.Method.PAIRING_RESPONSE);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
  * Constructs a new empty instance.
  */
  protected PairingResponseMessage(boolean noInit) {
    super(false);
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public PairingResponseMessage(String json) throws IllegalArgumentException {
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
  public PairingResponseMessage(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public PairingResponseMessage(PairingResponseMessage src) {
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

  /** Checks whether the 'pairingState' field is set and is not null */
  public boolean isNotNullPairingState() {
    return genClient.cacheValueIsNotNull(CacheKey.pairingState);
  }

  /** Checks whether the 'millis' field is set and is not null */
  public boolean isNotNullMillis() {
    return genClient.cacheValueIsNotNull(CacheKey.millis);
  }

  /** Checks whether the 'name' field is set and is not null */
  @Override
  public boolean isNotNullName() {
    return genClient.cacheValueIsNotNull(CacheKey.name);
  }

  /** Checks whether the 'serialNumber' field is set and is not null */
  @Override
  public boolean isNotNullSerialNumber() {
    return genClient.cacheValueIsNotNull(CacheKey.serialNumber);
  }

  /** Checks whether the 'applicationName' field is set and is not null */
  @Override
  public boolean isNotNullApplicationName() {
    return genClient.cacheValueIsNotNull(CacheKey.applicationName);
  }

  /** Checks whether the 'authenticationToken' field is set and is not null */
  @Override
  public boolean isNotNullAuthenticationToken() {
    return genClient.cacheValueIsNotNull(CacheKey.authenticationToken);
  }

  /** Checks whether the 'method' field is set and is not null */
  @Override
  public boolean isNotNullMethod() {
    return genClient.cacheValueIsNotNull(CacheKey.method);
  }

  /** Checks whether the 'version' field is set and is not null */
  @Override
  public boolean isNotNullVersion() {
    return genClient.cacheValueIsNotNull(CacheKey.version);
  }



  /** Checks whether the 'pairingState' field has been set, however the value could be null */
  public boolean hasPairingState() {
    return genClient.cacheHasKey(CacheKey.pairingState);
  }

  /** Checks whether the 'millis' field has been set, however the value could be null */
  public boolean hasMillis() {
    return genClient.cacheHasKey(CacheKey.millis);
  }

  /** Checks whether the 'name' field has been set, however the value could be null */
  @Override
  public boolean hasName() {
    return genClient.cacheHasKey(CacheKey.name);
  }

  /** Checks whether the 'serialNumber' field has been set, however the value could be null */
  @Override
  public boolean hasSerialNumber() {
    return genClient.cacheHasKey(CacheKey.serialNumber);
  }

  /** Checks whether the 'applicationName' field has been set, however the value could be null */
  @Override
  public boolean hasApplicationName() {
    return genClient.cacheHasKey(CacheKey.applicationName);
  }

  /** Checks whether the 'authenticationToken' field has been set, however the value could be null */
  @Override
  public boolean hasAuthenticationToken() {
    return genClient.cacheHasKey(CacheKey.authenticationToken);
  }

  /** Checks whether the 'method' field has been set, however the value could be null */
  @Override
  public boolean hasMethod() {
    return genClient.cacheHasKey(CacheKey.method);
  }

  /** Checks whether the 'version' field has been set, however the value could be null */
  @Override
  public boolean hasVersion() {
    return genClient.cacheHasKey(CacheKey.version);
  }


  /**
   * Sets the field 'pairingState'.
   */
  public PairingResponseMessage setPairingState(com.clover.sdk.v3.remotemessage.PairingState pairingState) {
    return genClient.setOther(pairingState, CacheKey.pairingState);
  }

  /**
   * Sets the field 'millis'.
   */
  public PairingResponseMessage setMillis(java.lang.Long millis) {
    return genClient.setOther(millis, CacheKey.millis);
  }

  /**
   * Sets the field 'name'.
   */
  @Override
  public PairingRequestMessage setName(java.lang.String name) {
    return genClient.setOther(name, CacheKey.name);
  }

  /**
   * Sets the field 'serialNumber'.
   */
  @Override
  public PairingRequestMessage setSerialNumber(java.lang.String serialNumber) {
    return genClient.setOther(serialNumber, CacheKey.serialNumber);
  }

  /**
   * Sets the field 'applicationName'.
   */
  @Override
  public PairingRequestMessage setApplicationName(java.lang.String applicationName) {
    return genClient.setOther(applicationName, CacheKey.applicationName);
  }

  /**
   * Sets the field 'authenticationToken'.
   */
  @Override
  public PairingRequestMessage setAuthenticationToken(java.lang.String authenticationToken) {
    return genClient.setOther(authenticationToken, CacheKey.authenticationToken);
  }

  /**
   * Sets the field 'method'.
   */
  @Override
  public Message setMethod(com.clover.sdk.v3.remotemessage.Method method) {
    return genClient.setOther(method, CacheKey.method);
  }

  /**
   * Sets the field 'version'.
   */
  @Override
  public Message setVersion(java.lang.Integer version) {
    return genClient.setOther(version, CacheKey.version);
  }


  /** Clears the 'pairingState' field, the 'has' method for this field will now return false */
  public void clearPairingState() {
    genClient.clear(CacheKey.pairingState);
  }
  /** Clears the 'millis' field, the 'has' method for this field will now return false */
  public void clearMillis() {
    genClient.clear(CacheKey.millis);
  }
  /** Clears the 'name' field, the 'has' method for this field will now return false */
  @Override
  public void clearName() {
    genClient.clear(CacheKey.name);
  }
  /** Clears the 'serialNumber' field, the 'has' method for this field will now return false */
  @Override
  public void clearSerialNumber() {
    genClient.clear(CacheKey.serialNumber);
  }
  /** Clears the 'applicationName' field, the 'has' method for this field will now return false */
  @Override
  public void clearApplicationName() {
    genClient.clear(CacheKey.applicationName);
  }
  /** Clears the 'authenticationToken' field, the 'has' method for this field will now return false */
  @Override
  public void clearAuthenticationToken() {
    genClient.clear(CacheKey.authenticationToken);
  }
  /** Clears the 'method' field, the 'has' method for this field will now return false */
  @Override
  public void clearMethod() {
    genClient.clear(CacheKey.method);
  }
  /** Clears the 'version' field, the 'has' method for this field will now return false */
  @Override
  public void clearVersion() {
    genClient.clear(CacheKey.version);
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
  public PairingResponseMessage copyChanges() {
    PairingResponseMessage copy = new PairingResponseMessage();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(PairingResponseMessage src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new PairingResponseMessage(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<PairingResponseMessage> CREATOR = new android.os.Parcelable.Creator<PairingResponseMessage>() {
    @Override
    public PairingResponseMessage createFromParcel(android.os.Parcel in) {
      PairingResponseMessage instance = new PairingResponseMessage(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public PairingResponseMessage[] newArray(int size) {
      return new PairingResponseMessage[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<PairingResponseMessage> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<PairingResponseMessage>() {
    @Override
    public PairingResponseMessage create(org.json.JSONObject jsonObject) {
      return new PairingResponseMessage(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean PAIRINGSTATE_IS_REQUIRED = false;
    public static final boolean MILLIS_IS_REQUIRED = false;
    public static final boolean NAME_IS_REQUIRED = false;
    public static final boolean SERIALNUMBER_IS_REQUIRED = false;
    public static final boolean APPLICATIONNAME_IS_REQUIRED = false;
    public static final boolean AUTHENTICATIONTOKEN_IS_REQUIRED = false;
    public static final boolean METHOD_IS_REQUIRED = false;
    public static final boolean VERSION_IS_REQUIRED = false;

  }

}
