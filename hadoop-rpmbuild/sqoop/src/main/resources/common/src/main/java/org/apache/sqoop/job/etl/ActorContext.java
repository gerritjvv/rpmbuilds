/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.sqoop.job.etl;

import org.apache.sqoop.common.ImmutableContext;

/**
 * Basic context class for each actor containing only the connector/framework
 * context object.
 */
public abstract class ActorContext {

  ImmutableContext context;

  public ActorContext(ImmutableContext context) {
    this.context = context;
  }

  /**
   * Context object associated with the particular actor
   *
   * @return
   */
  public ImmutableContext getContext() {
    return context;
  }

  /**
   * Convenience method that will return value from wrapped context class.
   */
  public String getString(String key) {
    return context.getString(key);
  }

  /**
   * Convenience method that will return value from wrapped context class.
   */
  public String getString(String key, String defaultValue) {
    return context.getString(key, defaultValue);
  }

  /**
   * Convenience method that will return value from wrapped context class.
   */
  public long getLong(String key, long defaultValue) {
    return context.getLong(key, defaultValue);
  }

  /**
   * Convenience method that will return value from wrapped context class.
   */
  public int getInt(String key, int defaultValue) {
    return context.getInt(key, defaultValue);
  }

  /**
   * Convenience method that will return value from wrapped context class.
   */
  public boolean getBoolean(String key, boolean defaultValue) {
    return context.getBoolean(key, defaultValue);
  }
}
