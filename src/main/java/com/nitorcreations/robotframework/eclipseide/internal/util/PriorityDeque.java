/**
 * Copyright 2012 Nitor Creations Oy
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
package com.nitorcreations.robotframework.eclipseide.internal.util;

import java.util.Deque;

/**
 * Double-ended queue with priority level support. Extends the Deque interface with methods for explicitly specifying
 * priority levels. It is up to implementations of this interface whether to support and how to determine the priority
 * for methods of the Deque interface that do not specify the priority level.
 */
public interface PriorityDeque<T> extends Deque<T> {

    void addFirst(int priority, T e);

    void addLast(int priority, T e);

    boolean add(int priority, T e);

    boolean offerFirst(int priority, T e);

    boolean offerLast(int priority, T e);

    boolean offer(int priority, T e);

    void push(int priority, T e);

    void clear(int priority);

    int getNumberOfPriorityLevels();

}
