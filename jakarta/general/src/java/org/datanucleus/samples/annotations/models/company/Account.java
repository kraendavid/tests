/**********************************************************************
Copyright (c) 2004 Andy Jefferson and others. All rights reserved.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.


Contributors :
 ...
***********************************************************************/
package org.datanucleus.samples.annotations.models.company;

import java.io.Serializable;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.TableGenerator;

/**
 * User account for a person.
 *
 * @version $Revision: 1.2 $
 */
@Entity
@Table(name="JPA_AN_ACCOUNT")
@TableGenerator(name="AccountGenerator")
public class Account implements Serializable
{
    private static final long serialVersionUID = -1883261101079091951L;

    @Id
    @GeneratedValue(strategy=GenerationType.TABLE, generator="AccountGenerator")
    private long id; // PK if app id

    @Basic
    @Column(name="USERNAME")
    private String username;

    @Basic
    @Column(name="ACTIVE")
    private boolean enabled;

    public Account()
    {
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public long getId()
    {
        return id;
    }

    public boolean getEnabled()
    {
        return enabled;
    }

    public void setEnabled(boolean b)
    {
        enabled = b;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String s)
    {
        username = s;
    }
}