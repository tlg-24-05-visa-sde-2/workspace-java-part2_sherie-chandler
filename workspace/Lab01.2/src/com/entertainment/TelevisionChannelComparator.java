package com.entertainment;

public class TelevisionChannelComparator implements <Television>{

    @Override
            public int compare(Television tv1, Television tv2) {
        return Integer.compare(tv1.getCurrentChannel(), tv2.getCurrentChannel());
    }
}
