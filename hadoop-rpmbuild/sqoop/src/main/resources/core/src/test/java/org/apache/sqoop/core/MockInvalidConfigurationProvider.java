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
package org.apache.sqoop.core;

import java.io.File;
import java.util.Map;
import java.util.Properties;

public class MockInvalidConfigurationProvider implements ConfigurationProvider {

  public MockInvalidConfigurationProvider() {
    throw new RuntimeException("Cannot instantiate");
  }

  @Override
  public void initialize(File configDir, Properties bootstrapCongiruation) {
    // TODO Auto-generated method stub

  }

  @Override
  public void registerListener(ConfigurationListener listener) {
    // TODO Auto-generated method stub

  }

  @Override
  public Map<String, String> getConfiguration() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void destroy() {
    // TODO Auto-generated method stub

  }

}
