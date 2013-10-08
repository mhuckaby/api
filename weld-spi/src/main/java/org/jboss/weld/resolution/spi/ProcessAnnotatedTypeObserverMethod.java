/*
 * JBoss, Home of Professional Open Source
 * Copyright 2013, Red Hat, Inc., and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.weld.resolution.spi;

import java.lang.annotation.Annotation;
import java.util.Collection;

import javax.enterprise.inject.spi.ObserverMethod;
import javax.enterprise.inject.spi.ProcessAnnotatedType;
import javax.enterprise.inject.spi.WithAnnotations;

/**
 * Represents an observer method that observer {@link ProcessAnnotatedType}. In addition to {@link ObserverMethod}, implementations of this interface expose
 * information about the required annotations defined using {@link WithAnnotations}.
 *
 * @author Jozef Hartinger
 *
 * @param <T> the event type
 */
public interface ProcessAnnotatedTypeObserverMethod<T> extends ObserverMethod<T> {

    Collection<Class<? extends Annotation>> getRequiredAnnotations();
}
