/*
 * Copyright (C) 2014 University of Washington
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.opendatakit.database;

public class DatabaseConsts {
	public static final String DATABASE_SERVICE_PACKAGE = "org.opendatakit.services";
	public static final String DATABASE_SERVICE_CLASS = "org.opendatakit.database.service.OdkDatabaseService";

	// The size of data chunks to pass across the AIDL wire.
	public static final int PARCEL_SIZE = 946176; // 100 KB shy of 1 MB, the max size

}