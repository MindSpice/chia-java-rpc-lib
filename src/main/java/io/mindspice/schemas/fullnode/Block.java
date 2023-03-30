package io.mindspice.schemas.fullnode;


import io.mindspice.enums.ChiaService;
import io.mindspice.enums.ResponseType;
import io.mindspice.enums.endpoints.Endpoint;
import io.mindspice.enums.endpoints.FullNode;
import io.mindspice.schemas.ApiResponse;
import io.mindspice.schemas.components.*;

import java.util.List;


public record Block(
        String challenge_block_info_hash,
        Output challenge_vdf_output,
        int deficit,
        String farmer_puzzle_hash,
        long fees,
        List<String> finished_challenge_slot_hashes,
        List<String> finished_infused_challenge_slot_hashes,
        List<String> finished_reward_slot_hashes,
        String header_hash,
        int height,
        Output infused_challenge_vdf_output,
        boolean overflow,
        String pool_puzzle_hash,
        String prev_hash,
        String prev_transaction_block_hash,
        int prev_transaction_block_height,
        long required_iters,
        List<Coin> reward_claims_incorporated,
        String reward_infusion_new_challenge,
        int signage_point_index,
        boolean sub_epoch_summary_included,
        long sub_slot_iters,
        int timestamp,
        long total_iters,
        long weight
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
    public ResponseType getResponseType() {
        return ResponseType.BLOCK;
    }

}









