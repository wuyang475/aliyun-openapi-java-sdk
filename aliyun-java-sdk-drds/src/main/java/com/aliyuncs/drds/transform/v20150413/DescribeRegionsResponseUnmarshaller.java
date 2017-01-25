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
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.drds.transform.v20150413;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20150413.DescribeRegionsResponse;
import com.aliyuncs.drds.model.v20150413.DescribeRegionsResponse.DrdsRegion;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRegionsResponseUnmarshaller {

	public static DescribeRegionsResponse unmarshall(DescribeRegionsResponse describeRegionsResponse, UnmarshallerContext context) {
		
		describeRegionsResponse.setRequestId(context.stringValue("DescribeRegionsResponse.RequestId"));
		describeRegionsResponse.setSuccess(context.booleanValue("DescribeRegionsResponse.Success"));

		List<DrdsRegion> drdsRegions = new ArrayList<DrdsRegion>();
		for (int i = 0; i < context.lengthValue("DescribeRegionsResponse.DrdsRegions.Length"); i++) {
			DrdsRegion drdsRegion = new DrdsRegion();
			drdsRegion.setRegionId(context.stringValue("DescribeRegionsResponse.DrdsRegions["+ i +"].RegionId"));
			drdsRegion.setRegionName(context.stringValue("DescribeRegionsResponse.DrdsRegions["+ i +"].RegionName"));
			drdsRegion.setZoneId(context.stringValue("DescribeRegionsResponse.DrdsRegions["+ i +"].ZoneId"));
			drdsRegion.setZoneName(context.stringValue("DescribeRegionsResponse.DrdsRegions["+ i +"].ZoneName"));

			drdsRegions.add(drdsRegion);
		}
		describeRegionsResponse.setDrdsRegions(drdsRegions);
	 
	 	return describeRegionsResponse;
	}
}