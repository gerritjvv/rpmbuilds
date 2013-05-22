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

/**
 * This specifies classes that perform connector-defined steps
 * within export execution:
 * Initializer
 * -> (framework-defined steps)
 * -> Loader
 * -> Destroyer
 */
public class Exporter extends CallbackBase {

  private Class<? extends Loader> loader;

  public Exporter(
      Class<? extends Initializer> initializer,
      Class<? extends Loader> loader,
      Class<? extends Destroyer> destroyer
      ) {
    super(initializer, destroyer);
    this.loader = loader;
  }

  public Class<? extends Loader> getLoader() {
    return loader;
  }

  @Override
  public String toString() {
    return "Exporter{" + super.toString() +
      ", loader=" + loader +
      '}';
  }
}
