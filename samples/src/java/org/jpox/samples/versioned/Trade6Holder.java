/**********************************************************************
Copyright (c) 2006 Andy Jefferson and others. All rights reserved.
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
package org.jpox.samples.versioned;

import java.util.HashSet;
import java.util.Set;

/**
 * Block of trades in a financial system.
 * @version $Revision: 1.1 $
 */
public class Trade6Holder
{
    long id; // Can be used for PK
    String name = null;
    Set<Trade6> trades = new HashSet<>();

    public Trade6Holder(String name)
    {
        this.name = name;
    }

    public long getId()
    {
        return id;
    }

    public Set<Trade6> getTrades()
    {
        return trades;
    }

    public void setTrades(Set<Trade6> trades)
    {
        this.trades = trades;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void addTrade(Trade6 trade)
    {
        trades.add(trade);
    }

    public void clearTrades()
    {
        trades.clear();
    }
}