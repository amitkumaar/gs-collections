/*
 * Copyright 2013 Goldman Sachs.
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

package com.gs.collections.impl.stack.immutable.primitive;

import com.gs.collections.impl.test.Verify;
import org.junit.Test;

public class ImmutableShortArrayStackTest
{
    @Test
    public void serializedForm()
    {
        Verify.assertSerializedForm(
                1L,
                "rO0ABXNyAHBjb20uZ3MuY29sbGVjdGlvbnMuaW1wbC5zdGFjay5pbW11dGFibGUucHJpbWl0aXZl\n"
                        + "LkltbXV0YWJsZVNob3J0QXJyYXlTdGFjayRJbW11dGFibGVTaG9ydFN0YWNrU2VyaWFsaXphdGlv\n"
                        + "blByb3h5AAAAAAAAAAEMAAB4cHcKAAAAAwADAAIAAXg=",
                ImmutableShortArrayStack.newStackWith((short) 1, (short) 2, (short) 3));
    }
}
