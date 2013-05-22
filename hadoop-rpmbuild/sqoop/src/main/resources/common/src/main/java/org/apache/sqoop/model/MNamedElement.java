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
package org.apache.sqoop.model;

/**
 * Represents an element of metadata used by the connector.
 */
public abstract class MNamedElement extends MPersistableEntity {
  private static final String LABEL_KEY_SUFFIX = ".label";
  private static final String HELP_KEY_SUFFIX = ".help";

  private final String name;
  private final String labelKey;
  private final String helpKey;

  protected MNamedElement(String name) {
    this.name = name;

    labelKey = name + LABEL_KEY_SUFFIX;
    helpKey = name + HELP_KEY_SUFFIX;
  }

  /**
   * @return the name of this parameter
   */
  public String getName() {
    return name;
  }

  /**
   * @return the label key to be used for this parameter
   */
  public String getLabelKey() {
    return labelKey;
  }

  /**
   * @return the help key to be used for this parameter
   */
  public String getHelpKey() {
    return helpKey;
  }

  public abstract String toString();
}
