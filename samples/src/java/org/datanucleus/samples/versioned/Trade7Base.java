/**********************************************************************
Copyright (c) 2013 Andy Jefferson and others. All rights reserved.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

Contributors:
    ...
**********************************************************************/
package org.datanucleus.samples.versioned;

import java.util.Date;

/**
 * Base object storing the version in a field in an inheritance tree.
 */
public abstract class Trade7Base
{
    long id; // Can be used for PK
    String person;
    double value;
    Date date;
    Long version;

    public Trade7Base(long id, String person, double value, Date date)
    {
        this.id = id;
        this.person = person;
        this.value = value;
        this.date = date;
    }

    public void setPerson(String pers)
    {
        this.person = pers;
    }
    
    public Long getVersion()
    {
        return version;
    }
}