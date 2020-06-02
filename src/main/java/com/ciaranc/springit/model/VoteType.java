package com.ciaranc.springit.model;

import com.ciaranc.springit.exceptions.SpringitException;

import java.util.Arrays;

public enum VoteType {
    UPVOTE(1), DOWNVOTE(-1),;
    private int direction;
    VoteType(int direction){ }

    public static VoteType lookup(Integer direction){
        return Arrays.stream(VoteType.values())
                .filter(value -> value.getDirection().equals(direction))
                .findAny()
                .orElseThrow(() -> new SpringitException("Vote not found"));
    }

    private Integer getDirection() {
        return direction;
    }
}
