/**
 * Copyright 2012-2013 Nitor Creations Oy
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.nitorcreations.robotframework.eclipseide.internal.assistant.proposalgenerator;

import java.util.ArrayList;
import java.util.List;

public class RobotCompletionProposalSet {

    private final List<RobotCompletionProposal> proposals = new ArrayList<RobotCompletionProposal>();
    private Boolean basedOnInput;
    private boolean priorityProposal;

    public List<RobotCompletionProposal> getProposals() {
        return proposals;
    }

    public boolean isBasedOnInput() {
        if (basedOnInput == null) {
            throw new IllegalStateException("basedOnInput not set");
        }
        return basedOnInput;
    }

    public void setBasedOnInput(boolean basedOnInput) {
        this.basedOnInput = basedOnInput;
    }

    public boolean isPriorityProposal() {
        return priorityProposal;
    }

    public void setPriorityProposal() {
        priorityProposal = true;
    }
}