package io.mindspice.schemas.fullnode;

import io.mindspice.enums.ChiaService;
import io.mindspice.enums.ResponseType;
import io.mindspice.enums.endpoints.Endpoint;
import io.mindspice.enums.endpoints.FullNode;
import io.mindspice.schemas.ApiResponse;
import io.mindspice.schemas.components.CoinRecord;

import java.util.List;


public record AdditionsAndRemovals(
        List<CoinRecord> additions,
        List<CoinRecord> removals,
        boolean success,
        String error
) implements ApiResponse {


    @Override
    public ChiaService getService() {
        return ChiaService.FULL_NODE;
    }


    @Override
    public ChiaService.SubService getSubService() {
        return ChiaService.SubService.COINS;
    }


    @Override
    public ResponseType getResponseType() {
        return ResponseType.COIN_RECORD;
    }
}