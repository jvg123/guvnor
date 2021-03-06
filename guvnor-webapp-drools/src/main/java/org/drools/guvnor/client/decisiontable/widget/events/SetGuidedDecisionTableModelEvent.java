/*
 * Copyright 2011 JBoss Inc
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package org.drools.guvnor.client.decisiontable.widget.events;

import org.drools.guvnor.client.widgets.drools.decoratedgrid.events.SetModelEvent;
import org.drools.ide.common.client.modeldriven.dt52.GuidedDecisionTable52;

/**
 * An event to set the underlying Guided Decision Table model in the table
 */
public class SetGuidedDecisionTableModelEvent extends SetModelEvent<GuidedDecisionTable52> {

    public SetGuidedDecisionTableModelEvent(GuidedDecisionTable52 model) {
        super( model );
    }

    public static Type<SetModelEvent.Handler<GuidedDecisionTable52>> TYPE = new Type<SetModelEvent.Handler<GuidedDecisionTable52>>();

    @Override
    public Type<SetModelEvent.Handler<GuidedDecisionTable52>> getAssociatedType() {
        return TYPE;
    }

}
