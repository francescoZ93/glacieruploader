package de.kopis.glacier;

/*-
 * #%L
 * glacieruploader-impl
 * %%
 * Copyright (C) 2012 - 2017 Carsten Ringe
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */

import com.amazonaws.regions.Regions;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GlacierUploaderTest {
    @Test
    public void canRunGlacierUploader() {
        final String[] args = {"--help", "--endpoint", "eu-central-1", "--credentials", "foo.txt"};
        GlacierUploader.main(args);
    }

    @Test
    public void supportsRegion() {
        // make sure we support a specific (new) region - fixes #67
        Regions r = Regions.fromName("eu-west-3");
        assertEquals(Regions.EU_WEST_3, r);
    }
}
