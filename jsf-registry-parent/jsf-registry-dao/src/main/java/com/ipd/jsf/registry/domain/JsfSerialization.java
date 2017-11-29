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
package com.ipd.jsf.registry.domain;

import java.util.List;

public class JsfSerialization {
    //序列化列表
    private List<String> list;
    /**
     * @return the list
     */
    public List<String> getList() {
        return list;
    }
    /**
     * @param list the list to set
     */
    public void setList(List<String> list) {
        this.list = list;
    }
    /**
     * @return
     */
    public String getFirstSerialization() {
        return list.get(0);
    }
}
