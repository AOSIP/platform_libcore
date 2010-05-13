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

import java.util.Calendar;
import java.net.URL;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;

/**
 * An interface for a precompiled SQL Statement.
 * <p>
 * An SQL Statement is put into a {@code PreparedStatement} and is precompiled
 * so that it can be executed efficiently multiple times.
 * <p>
 * Setter methods are supplied in the {@code PreparedStatement} interface for
 * the setting of {@code IN} parameters for the statement. The setter method
 * used for each {@code IN} parameter must match the parameter's type.
 */
public interface PreparedStatement extends Statement {

    /**
     * Add a set of parameters to the {@code PreparedStatement}'s command batch.
     *
     * @throws SQLException
     *             if a database error happens.
     */
    public void addBatch() throws SQLException;

    /**
     * Clear the current parameter values.
     * <p>
     * Typically, parameter values are retained for multiple executions of the
     * {@code Statement}. Setting a parameter value replaces the previous value. This
     * method clears the values for all parameters, releasing all resources used
     * by those parameters.
     *
     * @throws SQLException
     *             if a database error happens.
     */
    public void clearParameters() throws SQLException;

    /**
     * Executes the SQL statement in this {@code PreparedStatement}.
     * <p>
     * A {@code PreparedStatement} may return multiple results. The execute
     * method executes the {@code PreparedStatement} and returns a flag
     * indicating the kind of result produced by the action. The methods
     * {@code getResultSet} or {@code getUpdateCount} are used to retrieve
     * the first result, and the second and subsequent results are
     * retrieved with {@code getMoreResults}.
     *
     * @return {@code true} if the result of the execution is a {@code
     *         ResultSet}, {@code false} if there is no result or if the result
     *         is an update count.
     * @throws SQLException
     *             if a database error happens.
     */
    public boolean execute() throws SQLException;

    /**
     * Executes the SQL query in the {@code PreparedStatement} and returns the
     * {@code ResultSet} generated by the query.
     *
     * @return the {@code ResultSet} generated by the query, never {@code null}.
     * @throws SQLException
     *             if a database error happens or if the SQL statement does not
     *             produce a {@code ResultSet}.
     */
    public ResultSet executeQuery() throws SQLException;

    /**
     * Invokes the SQL command contained within the prepared statement. This
     * must be {@code INSERT}, {@code UPDATE}, {@code DELETE}, or a command that
     * returns nothing.
     *
     * @return the number of affected rows for {@code INSERT}, {@code UPDATE} or {@code
     *         DELETE} statements, {@code 0} for statements that return nothing.
     * @throws SQLException
     *             if a database error happens or if the SQL statement returns a
     *             {@code ResultSet}.
     */
    public int executeUpdate() throws SQLException;

    /**
     * Returns a {@code ResultSetMetaData} describing the {@code
     * ResultSet} that would be produced by execution of the {@code PreparedStatement}.
     * <p>
     * It is possible to know the metadata for the {@code ResultSet} without
     * executing the {@code PreparedStatement}, because the {@code
     * PreparedStatement} is precompiled. As a result the metadata can be
     * queried ahead of time without actually executing the statement.
     *
     * @return a {@code ResultSetMetaData} object with the information about the
     *         columns of the {@code ResultSet}, if the driver can return a
     *         {@code ResultSetMetaData}. {@code null} otherwise.
     * @throws SQLException
     *             if there is a database error.
     */
    public ResultSetMetaData getMetaData() throws SQLException;

    /**
     * Gets information about the parameters of the {@code PreparedStatement}.
     *
     * @return a {@code ParameterMetaData} object which holds information about
     *         the number, type, and properties of the parameters of this {@code
     *         PreparedStatement}.
     * @throws SQLException
     *             if a database error happens.
     */
    public ParameterMetaData getParameterMetaData() throws SQLException;

    /**
     * Sets the value of a specified parameter to the supplied {@code Array}.
     *
     * @param parameterIndex
     *            the parameter number index, where the first parameter has
     *            index 1.
     * @param theArray
     *            a {@code java.sql.Array} giving the new value of the parameter at {@code
     *            parameterIndex}.
     * @throws SQLException
     *             if a database error happens.
     * @see Array
     */
    public void setArray(int parameterIndex, Array theArray)
            throws SQLException;

    /**
     * Sets the value of a specified parameter to the content of a supplied
     * {@code InputStream}, which has a specified number of bytes.
     * <p>
     * This is a good method for setting an SQL {@code LONGVARCHAR} parameter
     * where the length of the data is large. Data is read from the {@code
     * InputStream} until end-of-file is reached or the specified number of
     * bytes is copied.
     *
     * @param parameterIndex
     *            the parameter number index, where the first parameter has
     *            index 1.
     * @param theInputStream
     *            the ASCII {@code InputStream} carrying the data to which the
     *            parameter at {@code parameterIndex} is set.
     * @param length
     *            the number of bytes in the {@code InputStream} to copy to the
     *            parameter.
     * @throws SQLException
     *             if a database error happens.
     */
    public void setAsciiStream(int parameterIndex, InputStream theInputStream,
            int length) throws SQLException;

    /**
     * Sets the value of a specified parameter to a supplied {@code
     * java.math.BigDecimal} value.
     *
     * @param parameterIndex
     *            the parameter number index, where the first parameter has
     *            index 1.
     * @param theBigDecimal
     *            the value to which the parameter at {@code parameterIndex} is
     *            set.
     * @throws SQLException
     *             if a database error happens.
     * @see java.math.BigDecimal
     */
    public void setBigDecimal(int parameterIndex, BigDecimal theBigDecimal)
            throws SQLException;

    /**
     * Sets the value of a specified parameter to the content of a supplied
     * binary {@code InputStream}, which has a specified number of bytes.
     * <p>
     * Use this method when a large amount of data needs to be set into a
     * {@code LONGVARBINARY} parameter.
     *
     * @param parameterIndex
     *            the parameter number index, where the first parameter has
     *            index 1.
     * @param theInputStream
     *            the binary {@code InputStream} carrying the data to update the
     *            parameter.
     * @param length
     *            the number of bytes in the {@code InputStream} to copy to the
     *            parameter.
     * @throws SQLException
     *             if a database error happens.
     */
    public void setBinaryStream(int parameterIndex, InputStream theInputStream,
            int length) throws SQLException;

    /**
     * Sets the value of a specified parameter to the given {@code Blob} object.
     *
     * @param parameterIndex
     *            the parameter number index, where the first parameter has
     *            index 1.
     * @param theBlob
     *            the {@code java.sql.Blob} to which the parameter at {@code
     *            parameterIndex} is set.
     * @throws SQLException
     *             if a database error happens.
     * @see Blob
     */
    public void setBlob(int parameterIndex, Blob theBlob) throws SQLException;

    /**
     * Sets the value of a specified parameter to a supplied {@code boolean}
     * value.
     *
     * @param parameterIndex
     *            the parameter number index, where the first parameter has
     *            index 1.
     * @param theBoolean
     *            the boolean value to which the parameter at {@code
     *            parameterIndex} is set.
     * @throws SQLException
     *             if a database error happens.
     */
    public void setBoolean(int parameterIndex, boolean theBoolean)
            throws SQLException;

    /**
     * Sets the value of a specified parameter to a supplied {@code byte} value.
     *
     * @param parameterIndex
     *            the parameter number index, where the first parameter has
     *            index 1.
     * @param theByte
     *            the byte value to which the parameter at {@code
     *            parameterIndex} is set.
     * @throws SQLException
     *             if a database error happens.
     */
    public void setByte(int parameterIndex, byte theByte) throws SQLException;

    /**
     * Sets the value of a specified parameter to a supplied array of bytes. The
     * array is mapped to a {@code VARBINARY} or {@code LONGVARBINARY} in the
     * database.
     *
     * @param parameterIndex
     *            the parameter number index, where the first parameter has
     *            index 1.
     * @param theBytes
     *            the array of bytes to which the parameter at {@code
     *            parameterIndex} is set.
     * @throws SQLException
     *             if a database error happens.
     */
    public void setBytes(int parameterIndex, byte[] theBytes)
            throws SQLException;

    /**
     * Sets the value of a specified parameter to the character content of a
     * {@code Reader} object, with the specified length of character data.
     * <p>
     * Data is read from the {@code
     * Reader} until end-of-file is reached or the specified number of
     * characters are copied.
     *
     * @param parameterIndex
     *            the parameter number index, where the first parameter has
     *            index 1
     * @param reader
     *            the {@code java.io.Reader} containing the character data.
     * @param length
     *            the number of characters to be read.
     * @throws SQLException
     *             if a database error happens.
     */
    public void setCharacterStream(int parameterIndex, Reader reader, int length)
            throws SQLException;

    /**
     * Sets the value of a specified parameter to the given {@code Clob} object.
     *
     * @param parameterIndex
     *            the parameter number index, where the first parameter has
     *            index 1.
     * @param theClob
     *            a {@code java.sql.Clob} holding the data to which the
     *            parameter at {@code parameterIndex} is set.
     * @throws SQLException
     *             if a database error happens.
     */
    public void setClob(int parameterIndex, Clob theClob) throws SQLException;

    /**
     * Sets the value of a specified parameter to a supplied {@code
     * java.sql.Date} value.
     *
     * @param parameterIndex
     *            the parameter number index, where the first parameter has
     *            index 1.
     * @param theDate
     *            a {@code java.sql.Date} to which the parameter at {@code
     *            parameterIndex} is set.
     * @throws SQLException
     *             if a database error happens.
     */
    public void setDate(int parameterIndex, Date theDate) throws SQLException;

    /**
     * Sets the value of a specified parameter to a supplied {@code
     * java.sql.Date} value, using a supplied {@code Calendar} to map the Date.
     * The {@code Calendar} allows the application to control the timezone used
     * to compute the SQL {@code DATE} in the database - without the supplied
     * {@code Calendar}, the driver uses the default timezone of the Java
     * virtual machine.
     *
     * @param parameterIndex
     *            the parameter number index, where the first parameter has
     *            index 1.
     * @param theDate
     *            a {@code java.sql.Date} to which the parameter at {@code
     *            parameterIndex} is set.
     * @param cal
     *            a {@code Calendar} to use to construct the SQL {@code DATE}
     *            value.
     * @throws SQLException
     *             if a database error happens.
     * @see Date
     * @see java.util.Calendar
     */
    public void setDate(int parameterIndex, Date theDate, Calendar cal)
            throws SQLException;

    /**
     * Sets the value of a specified parameter to a supplied {@code double}
     * value.
     *
     * @param parameterIndex
     *            the parameter number index, where the first parameter has
     *            index 1.
     * @param theDouble
     *            the {@code double} value to which the parameter at {@code
     *            parameterIndex} is set.
     * @throws SQLException
     *             if a database error happens.
     */
    public void setDouble(int parameterIndex, double theDouble)
            throws SQLException;

    /**
     * Sets the value of a specified parameter to to a supplied {@code float}
     * value.
     *
     * @param parameterIndex
     *            the parameter number index, where the first parameter has
     *            index 1.
     * @param theFloat
     *            the {@code float} value to update the parameter.
     * @throws SQLException
     *             if a database error happens.
     */
    public void setFloat(int parameterIndex, float theFloat)
            throws SQLException;

    /**
     * Sets the value of a specified parameter to a supplied {@code int} value.
     *
     * @param parameterIndex
     *            the parameter number index, where the first parameter has
     *            index 1.
     * @param theInt
     *            the {@code int} value to which the parameter at {@code
     *            parameterIndex} is set.
     * @throws SQLException
     *             if a database error happens.
     */
    public void setInt(int parameterIndex, int theInt) throws SQLException;

    /**
     * Sets the value of a specified parameter to a supplied {@code long} value.
     *
     * @param parameterIndex
     *            the parameter number index, where the first parameter has
     *            index 1.
     * @param theLong
     *            the {@code long} value to which the parameter at {@code
     *            parameterIndex} is set.
     * @throws SQLException
     *             if a database error happens.
     */
    public void setLong(int parameterIndex, long theLong) throws SQLException;

    /**
     * Sets the value of a specified parameter to SQL {@code NULL}. Don't use
     * this version of {@code setNull} for <i>User Defined Types</i> (UDT) or
     * for REF type parameters.
     *
     * @param parameterIndex
     *            the parameter number index, where the first parameter has
     *            index 1.
     * @param sqlType
     *            the SQL type of the parameter, as defined in {@code
     *            java.sql.Types}.
     * @throws SQLException
     *             if a database error happens.
     */
    public void setNull(int parameterIndex, int sqlType) throws SQLException;

    /**
     * Sets the value of a specified parameter to SQL {@code NULL}. This version
     * of {@code setNull} should be used for <i>User Defined Types</i> (UDTs)
     * and also REF types. UDTs can be {@code STRUCT}, {@code DISTINCT}, {@code
     * JAVA_OBJECT} and named array types.
     * <p>
     * Applications must provide the SQL type code and also a fully qualified
     * SQL type name when supplying a {@code NULL} UDT or REF. For a UDT, the
     * type name is the type name of the parameter itself, but for a REF
     * parameter the type name is the type name of the referenced type.
     *
     * @param paramIndex
     *            the parameter number index, where the first parameter has
     *            index 1.
     * @param sqlType
     *            the SQL type of the parameter, as defined in {@code
     *            java.sql.Types}.
     * @param typeName
     *            the fully qualified name of a UDT or REF type - ignored if the
     *            parameter is not a UDT.
     * @throws SQLException
     *             if a database error happens.
     * @see Types
     */
    public void setNull(int paramIndex, int sqlType, String typeName)
            throws SQLException;

    /**
     * Sets the value of a specified parameter using a supplied object.
     * <p>
     * There is a standard mapping from Java types to SQL types, defined in the
     * JDBC specification. The passed object is then transformed into the
     * appropriate SQL type, and then transferred to the database. {@code
     * setObject} can be used to pass abstract data types unique to the
     * database, by using a JDBC driver specific Java type. If the object's
     * class implements the interface {@code SQLData}, the JDBC driver calls
     * {@code SQLData.writeSQL} to write it to the SQL data stream. If the
     * object's class implements {@code Ref}, {@code Blob}, {@code Clob},
     * {@code Struct}, or {@code Array}, the driver passes it to the database as
     * a value of the corresponding SQL type.
     *
     * @param parameterIndex
     *            the parameter number index, where the first parameter has
     *            index 1.
     * @param theObject
     *            the object containing the value to which the parameter at
     *            {@code parameterIndex} is set.
     * @throws SQLException
     *             if a database error happens.
     */
    public void setObject(int parameterIndex, Object theObject)
            throws SQLException;

    /**
     * Sets the value of a specified parameter using a supplied object.
     * <p>
     * The object is converted to the given {@code targetSqlType} before it is
     * sent to the database. If the object has a custom mapping (its class
     * implements the interface {@code SQLData}), the JDBC driver will call the method
     * {@code SQLData.writeSQL} to write it to the SQL data stream. If the
     * object's class implements {@code Ref}, {@code Blob}, {@code Clob},
     * {@code Struct}, or {@code Array}, the driver will pass it to the database
     * in the form of the relevant SQL type.
     *
     * @param parameterIndex
     *            the parameter index, where the first parameter has index 1.
     * @param theObject
     *            the Object containing the value to which the parameter at
     *            {@code parameterIndex} is set.
     * @param targetSqlType
     *            the SQL type to send to the database, as defined in {@code
     *            java.sql.Types}.
     * @throws SQLException
     *             if a database error happens.
     */
    public void setObject(int parameterIndex, Object theObject,
            int targetSqlType) throws SQLException;

    /**
     * Sets the value of a specified parameter using a supplied object.
     * <p>
     * The object is converted to the given {@code targetSqlType} before it is
     * sent to the database. If the object has a custom mapping (its class
     * implements the interface {@code SQLData}), the JDBC driver will call the method
     * {@code SQLData.writeSQL} to write it to the SQL data stream. If the
     * object's class implements {@code Ref}, {@code Blob}, {@code Clob},
     * {@code Struct}, or {@code Array}, the driver will pass it to the database
     * in the form of the relevant SQL type.
     *
     * @param parameterIndex
     *            the parameter index, where the first parameter has index 1.
     * @param theObject
     *            the Object containing the value to which the parameter at
     *            {@code parameterIndex} is set.
     * @param targetSqlType
     *            the SQL type to send to the database, as defined in {@code
     *            java.sql.Types}.
     * @param scale
     *            the number of digits after the decimal point - only applies to
     *            the types {@code java.sql.Types.DECIMAL} and {@code
     *            java.sql.Types.NUMERIC} - ignored for all other types.
     * @throws SQLException
     *             if a database error happens.
     */
    public void setObject(int parameterIndex, Object theObject,
            int targetSqlType, int scale) throws SQLException;

    /**
     * Sets the value of a specified parameter to a supplied {@code
     * REF(<structured-type>)} value. This is stored as an SQL {@code REF}.
     *
     * @param parameterIndex
     *            the parameter number index, where the first parameter has
     *            index 1.
     * @param theRef
     *            a {@code java.sql.Ref} value to which the parameter at {@code
     *            parameterIndex} is set.
     * @throws SQLException
     *             if a database error happens.
     * @see Ref
     */
    public void setRef(int parameterIndex, Ref theRef) throws SQLException;

    /**
     * Sets the value of a specified parameter to a supplied {@code short}
     * value.
     *
     * @param parameterIndex
     *            the parameter number index, where the first parameter has
     *            index 1.
     * @param theShort
     *            a {@code short} value to which the parameter at {@code
     *            parameterIndex} is set.
     * @throws SQLException
     *             if a database error happens.
     */
    public void setShort(int parameterIndex, short theShort)
            throws SQLException;

    /**
     * Sets the value of a specified parameter to a supplied string.
     *
     * @param parameterIndex
     *            the parameter number index, where the first parameter has
     *            index 1.
     * @param theString
     *            the value to which the parameter at {@code parameterIndex} is
     *            set.
     * @throws SQLException
     *             if a database error happens.
     */
    public void setString(int parameterIndex, String theString)
            throws SQLException;

    /**
     * Sets the value of a specified parameter to a supplied {@code
     * java.sql.Time} value.
     *
     * @param parameterIndex
     *            the parameter number index, where the first parameter has
     *            index 1.
     * @param theTime
     *            a {@code java.sql.Time} value to which the parameter at
     *            {@code parameterIndex} is set.
     * @throws SQLException
     *             if a database error happens.
     */
    public void setTime(int parameterIndex, Time theTime) throws SQLException;

    /**
     * Sets the value of a specified parameter to a supplied {@code
     * java.sql.Time} value, using a supplied {@code Calendar}.
     * <p>
     * The driver uses the supplied {@code Calendar} to create the SQL {@code
     * TIME} value, which allows it to use a custom timezone - otherwise the
     * driver uses the default timezone of the Java virtual machine.
     *
     * @param parameterIndex
     *            the parameter number index, where the first parameter has
     *            index 1.
     * @param theTime
     *            a {@code java.sql.Time} value to which the parameter at
     *            {@code parameterIndex} is set.
     * @param cal
     *            a {@code Calendar} to use to construct the SQL {@code TIME}
     *            value.
     * @throws SQLException
     *             if a database error happens.
     * @see Time
     * @see java.util.Calendar
     */
    public void setTime(int parameterIndex, Time theTime, Calendar cal)
            throws SQLException;

    /**
     * Sets the value of a specified parameter to a supplied java.sql.Timestamp
     * value.
     *
     * @param parameterIndex
     *            the parameter number index, where the first parameter has
     *            index 1.
     * @param theTimestamp
     *            the java.sql.Timestamp value to which the parameter at {@code
     *            parameterIndex} is set.
     * @throws SQLException
     *             if a database error happens.
     */
    public void setTimestamp(int parameterIndex, Timestamp theTimestamp)
            throws SQLException;

    /**
     * Sets the value of a specified parameter to a supplied {@code
     * java.sql.Timestamp} value, using the supplied {@code Calendar}.
     * <p>
     * The driver uses the supplied {@code Calendar} to create the SQL {@code
     * TIMESTAMP} value, which allows it to use a custom timezone - otherwise
     * the driver uses the default timezone of the Java virtual machine.
     *
     * @param parameterIndex
     *            the parameter number index, where the first parameter has
     *            index 1.
     * @param theTimestamp
     *            the {@code java.sql.Timestamp} value to which the parameter at
     *            {@code parameterIndex} is set.
     * @param cal
     *            a {@code Calendar} to use to construct the SQL {@code
     *            TIMESTAMP} value
     * @throws SQLException
     *             if a database error happens.
     * @see Timestamp
     * @see java.util.Calendar
     */
    public void setTimestamp(int parameterIndex, Timestamp theTimestamp,
            Calendar cal) throws SQLException;

    /**
     * Sets the value of a specified parameter to the characters from a supplied
     * {@code InputStream}, with a specified number of bytes.
     *
     * @deprecated Use {@link #setCharacterStream(int, Reader, int)}
     * @param parameterIndex
     *            the parameter number index, where the first parameter has
     *            index 1.
     * @param theInputStream
     *            the {@code InputStream} with the character data to which the
     *            parameter at {@code parameterIndex} is set.
     * @param length
     *            the number of bytes to read from the {@code InputStream}.
     * @throws SQLException
     *             if a database error happens.
     */
    @Deprecated
    public void setUnicodeStream(int parameterIndex,
            InputStream theInputStream, int length) throws SQLException;

    /**
     * Sets the value of a specified parameter to a supplied {@code
     * java.net.URL}.
     *
     * @param parameterIndex
     *            the parameter number index, where the first parameter has
     *            index 1.
     * @param theURL
     *            the {@code URL} to which the parameter at {@code
     *            parameterIndex} is set.
     * @throws SQLException
     *             if a database error happens.
     * @see URL
     */
    public void setURL(int parameterIndex, URL theURL) throws SQLException;
}
