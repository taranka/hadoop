/*
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

package org.apache.hadoop.fs.s3a;

/**
 * Constants for S3A Testing.
 */
public interface S3ATestConstants {

  /**
   * Prefix for any cross-filesystem scale test options.
   */
  String SCALE_TEST = "scale.test.";

  /**
   * Prefix for s3a-specific scale tests.
   */
  String S3A_SCALE_TEST = "fs.s3a.scale.test.";

  /**
   * Prefix for FS s3a tests.
   */
  String TEST_FS_S3A = "test.fs.s3a.";

  /**
   * Name of the test filesystem.
   */
  String TEST_FS_S3A_NAME = TEST_FS_S3A + "name";

  /**
   * Run the encryption tests?
   */
  String KEY_ENCRYPTION_TESTS = TEST_FS_S3A + "encryption.enabled";

  /**
   * Tell tests that they are being executed in parallel: {@value}.
   */
  String KEY_PARALLEL_TEST_EXECUTION = "test.parallel.execution";

  /**
   * A property set to true in maven if scale tests are enabled: {@value}.
   */
  String KEY_SCALE_TESTS_ENABLED = S3A_SCALE_TEST + "enabled";

  /**
   * The number of operations to perform: {@value}.
   */
  String KEY_OPERATION_COUNT = SCALE_TEST + "operation.count";

  /**
   * The number of directory operations to perform: {@value}.
   */
  String KEY_DIRECTORY_COUNT = SCALE_TEST + "directory.count";

  /**
   * The readahead buffer: {@value}.
   */
  String KEY_READ_BUFFER_SIZE = S3A_SCALE_TEST + "read.buffer.size";

  int DEFAULT_READ_BUFFER_SIZE = 16384;

  /**
   * Key for a multi MB test file: {@value}.
   */
  String KEY_CSVTEST_FILE = S3A_SCALE_TEST + "csvfile";

  /**
   * Default path for the multi MB test file: {@value}.
   */
  String DEFAULT_CSVTEST_FILE = "s3a://landsat-pds/scene_list.gz";

  /**
   * Endpoint for the S3 CSV/scale tests. This defaults to
   * being us-east.
   */
  String KEY_CSVTEST_ENDPOINT = S3A_SCALE_TEST + "csvfile.endpoint";

  /**
   * Endpoint for the S3 CSV/scale tests. This defaults to
   * being us-east.
   */
  String DEFAULT_CSVTEST_ENDPOINT = "s3.amazonaws.com";

  /**
   * Name of the property to define the timeout for scale tests: {@value}.
   * Measured in seconds.
   */
  String KEY_TEST_TIMEOUT = S3A_SCALE_TEST + "timeout";

  /**
   * Name of the property to define the file size for the huge file
   * tests: {@value}.
   * Measured in KB; a suffix like "M", or "G" will change the unit.
   */
  String KEY_HUGE_FILESIZE = S3A_SCALE_TEST + "huge.filesize";

  /**
   * Name of the property to define the partition size for the huge file
   * tests: {@value}.
   * Measured in KB; a suffix like "M", or "G" will change the unit.
   */
  String KEY_HUGE_PARTITION_SIZE = S3A_SCALE_TEST + "huge.partitionsize";

  /**
   * The default huge size is small —full 5GB+ scale tests are something
   * to run in long test runs on EC2 VMs. {@value}.
   */
  String DEFAULT_HUGE_FILESIZE = "10M";

  /**
   * The default number of operations to perform: {@value}.
   */
  long DEFAULT_OPERATION_COUNT = 2005;

  /**
   * Default number of directories to create when performing
   * directory performance/scale tests.
   */
  int DEFAULT_DIRECTORY_COUNT = 2;

  /**
   * Default scale test timeout in seconds: {@value}.
   */
  int DEFAULT_TEST_TIMEOUT = 30 * 60;

  /**
   * Default policy on scale tests: {@value}.
   */
  boolean DEFAULT_SCALE_TESTS_ENABLED = false;

}
