package io.mindspice.schemas.fullnode;

import io.mindspice.enums.ChiaService;
import io.mindspice.enums.endpoints.Endpoint;
import io.mindspice.enums.endpoints.FullNode;
import io.mindspice.schemas.ApiResponse;
import io.mindspice.schemas.Objects.*;


public record SignagePointOrEOS(
        long time_received,
        boolean reverted,
        boolean success,
        String error,
        SignagePoint signage_point,
        SubSlot eos

) implements ApiResponse {


    @Override
    public ChiaService getService() {
        return ChiaService.FULL_NODE;
    }


    @Override
    public ChiaService.SubService getSubService() {
        return ChiaService.SubService.BLOCKS;
    }


    @Override
    public Endpoint getEndPoint() {
        return FullNode.GET_RECENT_SIGNAGE_POINT_OR_EOS;
    }
}
