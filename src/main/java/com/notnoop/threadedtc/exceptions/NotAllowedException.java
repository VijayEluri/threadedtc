/*
 * Copyright 2009 Mahmood Ali
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
package com.notnoop.threadedtc.exceptions;

public class NotAllowedException extends RuntimeException {
    private static final long serialVersionUID = -213146190434136482L;

    public NotAllowedException() { super(); }
    public NotAllowedException(String s) { super(s); }
    public NotAllowedException(String s, Throwable cause) { super(s, cause); }
}
