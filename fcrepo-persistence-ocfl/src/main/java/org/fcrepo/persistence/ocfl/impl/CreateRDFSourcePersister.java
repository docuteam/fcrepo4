/*
 * Licensed to DuraSpace under one or more contributor license agreements.
 * See the NOTICE file distributed with this work for additional information
 * regarding copyright ownership.
 *
 * DuraSpace licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.fcrepo.persistence.ocfl.impl;

import org.fcrepo.kernel.api.operations.NonRdfSourceOperation;
import org.fcrepo.persistence.ocfl.api.OCFLObjectSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.fcrepo.kernel.api.operations.ResourceOperationType.CREATE;

/**
 * This class implements the persistence of a new RDFSource
 *
 * @author dbernstein
 * @since 6.0.0
 */
public class CreateRDFSourcePersister extends AbstractPersister<NonRdfSourceOperation> {

    private static final Logger log = LoggerFactory.getLogger(CreateRDFSourcePersister.class);

    /**
     * Constructor
     */
    public CreateRDFSourcePersister() {
        super(CREATE);
    }

    @Override
    public void persist(final OCFLObjectSession session, final NonRdfSourceOperation operation,
                        final FedoraOCFLMapping mapping) {
        log.warn("Persisting of {} not implemented yet!", operation.getClass());
    }
}