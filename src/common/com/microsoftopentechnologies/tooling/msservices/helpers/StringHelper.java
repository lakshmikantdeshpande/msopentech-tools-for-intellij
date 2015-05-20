/**
 * Copyright 2014 Microsoft Open Technologies Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.microsoftopentechnologies.tooling.msservices.helpers;

public class StringHelper {
    public static boolean isNullOrWhiteSpace(String str) {
        if(str == null) {
            return true;
        }

        int len = str.length();
        for(int i = 0; i < len; ++i) {
            if(!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }

        return true;
    }
}