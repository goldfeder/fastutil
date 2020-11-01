package it.unimi.dsi.fastutil.ints;

/*
 * Copyright (C) 2017-2020 Sebastiano Vigna
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

import java.util.Collections;
import java.util.EnumSet;
import java.util.function.Supplier;

import org.junit.runners.Parameterized.Parameters;

public class Int2ObjectMapGenericRBTest extends Int2ObjectMapGenericTest<Int2ObjectRBTreeMap<Integer>> {
	@Parameters
	public static Iterable<Object[]> data() {
		return Collections.singletonList(new Object[] {(Supplier<Int2ObjectRBTreeMap<Integer>>) Int2ObjectRBTreeMap::new, EnumSet.allOf(Capability.class)});
	}
}