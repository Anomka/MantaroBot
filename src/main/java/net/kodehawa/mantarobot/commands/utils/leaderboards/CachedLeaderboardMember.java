/*
 * Copyright (C) 2016-2020 David Rubio Escares / Kodehawa
 *
 *  Mantaro is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  Mantaro is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Mantaro.  If not, see http://www.gnu.org/licenses/
 */

package net.kodehawa.mantarobot.commands.utils.leaderboards;

import java.util.concurrent.TimeUnit;

public class CachedLeaderboardMember {
    private long id;
    private String name;
    private String tag;
    private String disriminator;

    private long lastCachedAt;

    public CachedLeaderboardMember(long id, String name, String discriminator, long lastCachedAt) {
        this.id = id;
        this.name = name;
        this.disriminator = discriminator;
        this.tag = name + discriminator;
        this.lastCachedAt = lastCachedAt;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTag() {
        return tag;
    }

    public String getDiscriminator() {
        return disriminator;
    }

    public long getLastCachedAt() {
        return lastCachedAt;
    }

    public long getLastCachedAtHours() {
        return TimeUnit.MILLISECONDS.toHours(System.currentTimeMillis() - lastCachedAt);
    }
}
