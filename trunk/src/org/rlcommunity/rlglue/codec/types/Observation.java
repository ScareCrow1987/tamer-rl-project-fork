/* 
 * Copyright (C) 2007, Brian Tanner
 * 
http://rl-glue-ext.googlecode.com/
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 *
 *  $Revision: 489 $
 *  $Date: 2009-01-31 14:34:21 -0700 (Sat, 31 Jan 2009) $
 *  $Author: brian@tannerpages.com $
 *  $HeadURL: http://rl-glue-ext.googlecode.com/svn/trunk/projects/codecs/Java/src/org/rlcommunity/rlglue/codec/types/Observation.java $
 *
 */
package org.rlcommunity.rlglue.codec.types;

import java.util.Arrays;

public class Observation extends RL_abstract_type {

    public Observation() {
        this(0, 0, 0);
    }

    /**
     * For backwards compatibility with RL-Glue 2.x
     * @param numInts
     * @param numDoubles
     */
    public Observation(int numInts, int numDoubles) {
        this(numInts, numDoubles, 0);
    }

    public Observation(int numInts, int numDoubles, int numChars) {
        super(numInts, numDoubles, numChars);
    }

    public Observation(RL_abstract_type src) {
        super(src);
    }

    public Observation duplicate() {
        return new Observation(this);
    }
    
//    
//	public boolean equals(Object obj) {
//		if (this == obj) {
//			return true;
//		}
//		if (obj == null) {
//			return false;
//		}
//		if (getClass() != obj.getClass()) {
//			return false;
//		}
//		Observation other = (Observation) obj;
//		if (!Arrays.equals(this.intArray, other.intArray) ||
//				!Arrays.equals(this.doubleArray, other.doubleArray) ||
//				!Arrays.equals(this.charArray, other.charArray)) {
//			return false;
//		}
//		
//		return true;
//	}
}