/*
 * Copyright (C) 2012 Wayne Meissner
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

package jnr.ffi.provider.jffi;

import jnr.ffi.mapper.FromNativeContext;
import jnr.ffi.mapper.ToNativeContext;

import java.lang.annotation.Annotation;
import java.util.Collection;

public class SimpleNativeContext implements ToNativeContext, FromNativeContext {
    private final jnr.ffi.Runtime runtime;
    private final Collection<Annotation> annotations;

    SimpleNativeContext(jnr.ffi.Runtime runtime, Collection<Annotation> annotations) {
        this.runtime = runtime;
        this.annotations = annotations;
    }

    public Collection<Annotation> getAnnotations() {
        return annotations;
    }

    public final jnr.ffi.Runtime getRuntime() {
        return runtime;
    }
}
