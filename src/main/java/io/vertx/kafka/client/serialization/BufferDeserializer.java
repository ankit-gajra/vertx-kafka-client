/*
 * Copyright 2016 Red Hat Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.vertx.kafka.client.serialization;

import io.vertx.core.buffer.Buffer;
import org.apache.kafka.common.serialization.Deserializer;

import java.util.Map;

/**
 * Kafka deserializer for raw bytes in a buffer
 */
public class BufferDeserializer implements Deserializer<Buffer> {

  @Override
  public void configure(Map<String, ?> configs, boolean isKey) {
  }

  @Override
  public Buffer deserialize(String topic, byte[] data) {
    if (data == null)
      return null;

    return Buffer.buffer(data);
  }

  @Override
  public void close() {
  }
}
