/**
 * Copyright 2004-2048 .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ipd.jsf.worker.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.ipd.jsf.worker.domain.UserResource;

@Repository
public interface UserResourceDao {
	
	void batchInsert(List<UserResource> resources);
	List<String> findAuthErps(@Param("resId")Integer resId, @Param("resType")Integer resType);
	public int isExists(@Param("pin")String pin,
						@Param("resId")Integer resId,
						@Param("resType")Integer resType,
						@Param("roleId")Integer roleId,
						@Param("pcType")Integer pcType);
}
