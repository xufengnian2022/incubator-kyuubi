/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.kyuubi.server.api.v1.dto;

import java.io.Serializable;
import java.util.Objects;

public class SessionOpenedCount implements Serializable {

  private int openSessionCount;

  public SessionOpenedCount() {
  }

  public int getOpenSessionCount() {
    return openSessionCount;
  }

  public void setOpenSessionCount(int openSessionCount) {
    this.openSessionCount = openSessionCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof SessionOpenedCount)) {
      return false;
    }
    SessionOpenedCount that = (SessionOpenedCount) o;
    return openSessionCount == that.getOpenSessionCount();
  }

  @Override
  public int hashCode() {
    return Objects.hash(openSessionCount);
  }
}