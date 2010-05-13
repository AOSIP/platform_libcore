/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package java.sql;

import java.io.Serializable;

/**
 * An exception class that holds information about Database access warnings.
 */
public class SQLWarning extends SQLException implements Serializable {

    private static final long serialVersionUID = 3917336774604784856L;

    /**
     * Creates an {@code SQLWarning} object. The reason string is set to {@code
     * null}, the {@code SQLState} string is set to {@code null} and the error
     * code is set to 0.
     */
    public SQLWarning() {
        super();
    }

    /**
     * Creates an {@code SQLWarning} object. The reason string is set to the
     * given reason string, the {@code SQLState} string is set to {@code null}
     * and the error code is set to 0.
     *
     * @param theReason
     *            the reason why this warning is issued.
     */
    public SQLWarning(String theReason) {
        super(theReason);
    }

    /**
     * Creates an {@code SQLWarning} object. The reason string is set to the
     * given reason string, the {@code SQLState} string is set to the given
     * {@code SQLState} string and the error code is set to 0.
     *
     * @param theReason
     *            the reason why this warning is issued.
     * @param theSQLState
     *            the string to use as the {@code SQLState} string.
     */
    public SQLWarning(String theReason, String theSQLState) {
        super(theReason, theSQLState);
    }

    /**
     * Creates an {@code SQLWarning} object. The reason string is set to the
     * given reason string, the {@code SQLState} string is set to the given
     * {@code SQLState} string and the error code is set to the given error code
     * value.
     *
     * @param theReason
     *            the reason why this warning is issued.
     * @param theSQLState
     *            the X/Open standard specifc error code.
     * @param theErrorCode
     *            a vendor specific error code.
     */
    public SQLWarning(String theReason, String theSQLState, int theErrorCode) {
        super(theReason, theSQLState, theErrorCode);
    }

    /**
     * Gets the next {@code SQLWarning} chained to this {@code SQLWarning} object.
     *
     * @return the {@code SQLWarning} chained to this {@code SQLWarning}.
     *         {@code null} if no {@code SQLWarning} is chained to this {@code
     *         SQLWarning}.
     */
    public SQLWarning getNextWarning() {
        SQLException next = super.getNextException();
        if (next == null) {
            return null;
        }
        if (next instanceof SQLWarning) {
            return (SQLWarning) next;
        }
        throw new Error("SQLWarning chain holds value that is not a SQLWarning");
    }

    /**
     * Chains a supplied {@code SQLWarning} to this {@code SQLWarning}.
     *
     * @param w
     *            the {@code SQLWarning} linked to this {@code SQLWarning}.
     */
    public void setNextWarning(SQLWarning w) {
        super.setNextException(w);
    }
}
