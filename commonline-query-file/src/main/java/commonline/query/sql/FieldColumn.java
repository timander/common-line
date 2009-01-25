/**
 * Copyright 2008-2009 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at:
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 */
package commonline.query.sql;


public class FieldColumn {
    private String fieldName;
    private String columnName;
    private SqlType type;
    private int length;

    public FieldColumn(String fieldName, String columnName, SqlType type) {
        this(fieldName, columnName, type, -1);
    }

    public FieldColumn(String fieldName, String columnName, SqlType type, int length) {
        this.fieldName = fieldName;
        this.columnName = columnName;
        this.type = type;
        this.length = length;

        // TODO - do some validation here to not allow a <= 0 VARCHAR
    }

    public String getFieldName() {
        return fieldName;
    }

    public String getColumnName() {
        return columnName;
    }

    public SqlType getType() {
        return type;
    }

    public int getLength() {
        return length;
    }
}