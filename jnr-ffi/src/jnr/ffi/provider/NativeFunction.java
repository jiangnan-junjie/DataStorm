/*
 * Copyright (C) 2013 Wayne Meissner
 *
 * This file is part of the JNR project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package jnr.ffi.provider;

import jnr.ffi.CallingConvention;
import jnr.ffi.annotations.IgnoreError;
import jnr.ffi.annotations.SaveError;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public final class NativeFunction {
    private final Method method;
    private final Collection<Annotation> annotations;
    private final boolean saveError;
    private final boolean ignoreError;
    private final CallingConvention callingConvention;

    public NativeFunction(Method method, CallingConvention callingConvention) {
        this.method = method;
        this.annotations = Collections.unmodifiableCollection(Arrays.asList(method.getAnnotations()));

        this.saveError = hasSaveError(method);
        this.ignoreError = hasIgnoreError(method);

        this.callingConvention = callingConvention;
    }

    public Collection<Annotation> annotations() {
        return annotations;
    }
    
    public CallingConvention convention() {
        return callingConvention;
    }
    
    public String name() {
        return method.getName();
    }
    
    public boolean isErrnoRequired() {
        return !ignoreError || saveError;
    }

    public boolean hasSaveError() {
        return saveError;
    }

    public boolean hasIgnoreError() {
        return ignoreError;
    }

    public Method getMethod() {
        return method;
    }

    public static boolean hasSaveError(Method method) {
        return method.getAnnotation(SaveError.class) != null;
    }

    public static boolean hasIgnoreError(Method method) {
        return method.getAnnotation(IgnoreError.class) != null;
    }
}
