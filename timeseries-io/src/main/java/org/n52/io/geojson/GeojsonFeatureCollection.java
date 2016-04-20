/**
 * Copyright (C) 2013-2016 52°North Initiative for Geospatial Open Source
 * Software GmbH
 *
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License version 2 as publishedby the Free
 * Software Foundation.
 *
 * If the program is linked with libraries which are licensed under one of the
 * following licenses, the combination of the program with the linked library is
 * not considered a "derivative work" of the program:
 *
 *     - Apache License, version 2.0
 *     - Apache Software License, version 1.0
 *     - GNU Lesser General Public License, version 3
 *     - Mozilla Public License, versions 1.0, 1.1 and 2.0
 *     - Common Development and Distribution License (CDDL), version 1.0
 *
 * Therefore the distribution of the program linked with libraries licensed under
 * the aforementioned licenses, is permitted by the copyright holders if the
 * distribution is compliant with both the GNU General Public License version 2
 * and the aforementioned licenses.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE. See the GNU General Public License for more details.
 */
package org.n52.io.geojson;

import java.util.Collection;

import org.n52.io.Utils;

public final class GeojsonFeatureCollection {

    private GeojsonFeature[] features;
    
    public static GeojsonFeatureCollection create(Collection<? extends GeojsonFeature> features) {
        GeojsonFeatureCollection collection = new GeojsonFeatureCollection();
        collection.setFeatures(features.toArray(new GeojsonFeature[0]));
        return collection;
    }
    
    public static <T extends GeojsonFeature> GeojsonFeatureCollection create(T[] features) {
        GeojsonFeatureCollection collection = new GeojsonFeatureCollection();
        collection.setFeatures(features);
        return collection;
    }
    
    private GeojsonFeatureCollection() {
        // for serialization
    }

    public GeojsonFeature[] getFeatures() {
        return Utils.copy(features);
    }

    public void setFeatures(GeojsonFeature[] features) {
        this.features = Utils.copy(features);
    }
    
}