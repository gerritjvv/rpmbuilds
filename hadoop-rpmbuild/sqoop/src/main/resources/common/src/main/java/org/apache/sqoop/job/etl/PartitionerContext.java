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
 * Context implementation for Partitioner.
 *
 * This class is also wrapping number of maximal allowed partitions.
 */
public class PartitionerContext extends ActorContext {

  private long maxPartitions;

  public PartitionerContext(ImmutableContext context, long maxPartitions) {
    super(context);
    this.maxPartitions = maxPartitions;
  }

  /**
   * Return maximal number of partitions.
   *
   * Framework will ensure that number of returned partitions is not bigger
   * than this number.
   *
   * @return
   */
  public long getMaxPartitions() {
    return maxPartitions;
  }
}
